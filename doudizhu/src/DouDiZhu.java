import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;

public class DouDiZhu {
    public static void main(String[] args){
        HashMap<Integer,String> pooker=new HashMap<Integer,String>();
        ArrayList<Integer> pookerindex=new ArrayList<Integer>();

        String[] number={"2","A","K","J","10","9","8","7","6","5","4","3"};
        String[] color={"♠","♥","♣","♦"};

        int index=2;
        for(String str:number){
            for(String str1:color){
                pooker.put(index,str+str1);
                pookerindex.add(index);
                index++;
            }
        }
        pooker.put(0,"大王");
        pookerindex.add(0);
        pooker.put(1,"小王");
        pookerindex.add(1);

        //洗牌
        Collections.shuffle(pookerindex);
        System.out.println(pookerindex);

        //发牌

        ArrayList<Integer> player1=new ArrayList<Integer>();
        ArrayList<Integer> player2=new ArrayList<Integer>();
        ArrayList<Integer> player3=new ArrayList<Integer>();
        ArrayList<Integer> bottom=new ArrayList<Integer>();

        for(int i=0;i<pookerindex.size();i++){
            if(i<3){
                bottom.add(pookerindex.get(i));
            }else if(i%3==0){
                player1.add(pookerindex.get(i));
            }else if(i%3==1){
                player2.add(pookerindex.get(i));
            }else if(i%3==2){
                player3.add(pookerindex.get(i));
            }
        }

        Collections.sort(player1);
        Collections.sort(player2);
        Collections.sort(player3);
        Collections.sort(bottom);

        look("1",player1,pooker);
        look("2",player2,pooker);
        look("3",player3,pooker);
        look("4",bottom,pooker);





    }
    //看牌
    public static void look(String name,ArrayList<Integer> player, HashMap<Integer,String> pooker){
        System.out.print(name+"     ");
        for(Integer key :player){
            String value=pooker.get(key);
            System.out.print(value+" ");
        }
        System.out.println();
    }
}
