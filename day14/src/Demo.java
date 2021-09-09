import java.util.ArrayList;

public class Demo {
    public static void main(String[] args){
        ArrayList<Integer> array=new ArrayList<Integer>();
        array.add(123);
        array.add(456);
        Integer[] i=new Integer[array.size()];

        array.toArray(i);

        for(Integer k:i){
            System.out.println(k);
        }
        for(int o=0;o<i.length;o++){
            System.out.println(i[o]);
        }

    }
}
