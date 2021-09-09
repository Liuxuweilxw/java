import java.util.ArrayList;
public class ArrayListDemo {
    public static void main(String[] args){
        ArrayList<String> array=new ArrayList<String>();
        array.add("abcdefg");
        array.add("iphone");
        System.out.println(array.size());
        System.out.println(array.get(1));
        for(int i=0;i<array.size();i++){
            System.out.println(array.get(i));
        }

        /*
        add(int index ,元素)
        set(int index, 元素)
        remove(int index)
        clear() 清空集合中的元素
        */

    }
}