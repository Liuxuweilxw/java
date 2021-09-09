package cn.itcast.demo02;

import java.util.ArrayList;
import java.util.Random;

public class CallName {
    public static void main(String[] args){
        ArrayList<Student> arr=new ArrayList<Student>();
        addStudent(arr);
        printStudent(arr);
        randomNum(arr);

    }
    public static void addStudent(ArrayList<Student> arr){
        Student s1=new Student();
        s1.setAge(12);
        s1.setName("lisi");

        Student s2=new Student();
        s2.setAge(13);
        s2.setName("li");

        Student s3=new Student();
        s3.setAge(14);
        s3.setName("si");

        Student s4=new Student();
        s4.setAge(15);
        s4.setName("lsi");

        arr.add(s1);
        arr.add(s2);
        arr.add(s3);
        arr.add(s4);
    }

    public static void printStudent(ArrayList<Student> arr){
        Student stu=new Student();
        for(int i=0;i<arr.size();i++){
            stu=arr.get(i);
            System.out.println(stu.getName()+"  "+stu.getAge() );
        }
    }

    public static void randomNum(ArrayList<Student> arr){
        Random ran=new Random();
        int index=ran.nextInt(arr.size());
        Student s=arr.get(index);
        System.out.println(s.getName());
    }
}
