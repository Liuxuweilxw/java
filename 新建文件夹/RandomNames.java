import java.util.Random;
public class RandomNames {
    public static void main(String[] args){
        String[] names=new String[4];
        addNames(names);
        printNames(names);
        System.out.println(random(names));
    }
    public static void addNames(String[] names){
        names[0]="li";
        names[1]="wang";
        names[2]="xaio";
        names[3]="hu";

    }
    public static void printNames(String[] names){
        for(int i=0;i<names.length;i++){
            System.out.print(names[i]+" ");
        }
        System.out.println();
    }
    public static String random(String[] names){
        Random ran=new Random();
        int i=ran.nextInt(4);
        return names[i];
    }
}