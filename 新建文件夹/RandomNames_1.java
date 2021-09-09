import java.util.ArrayList;
import java.util.Random;
public class RandomNames_1 {
    public static void main(String[] args){
        ArrayList<StudentNames> nam=new ArrayList<StudentNames>();
        add(nam);
        for(int i=0;i<nam.size();i++){
            StudentNames stu=nam.get(i);
            System.out.println(stu.age+"  "+stu.name);
        }

        randomStudentNames(nam);



    }
    public static void add(ArrayList<StudentNames> nam){
        StudentNames stu1=new StudentNames();
        StudentNames stu2=new StudentNames();
        StudentNames stu3=new StudentNames();
        stu1.name="zhangsan";
        stu1.age=11;
        stu2.name="lisi";
        stu2.age=12;
        stu3.name="wang";
        stu3.age=14;

        nam.add(stu1);
        nam.add(stu2);
        nam.add(stu3);

    }
    public static void randomStudentNames(ArrayList<StudentNames> nam){
        Random ran=new Random();
        int i=ran.nextInt(nam.size());
        StudentNames stu=new StudentNames();
        stu=nam.get(i);
        System.out.println(stu.name+"  "+stu.age);

    }
}