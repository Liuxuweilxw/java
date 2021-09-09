package cn.itcast.demo01;

public class TestStudent {
    public static void main(String[] args){
        Student s1=new Student();
        s1.setStudentId(1001);
        s1.setName("liu");
        s1.setAge(19);
        s1.setSex("male");
        s1.setLesson1(60);
        s1.setLesson2(70);
        s1.setLesson3(80);

        Student s2=new Student();
        s2.setStudentId(1002);
        s2.setName("guo");
        s2.setAge(18);
        s2.setSex("female");
        s2.setLesson1(62);
        s2.setLesson2(71);
        s2.setLesson3(85);

        Student s3=new Student();
        s3.setStudentId(1003);
        s3.setName("wang");
        s3.setAge(21);
        s3.setSex("male");
        s3.setLesson1(66);
        s3.setLesson2(77);
        s3.setLesson3(87);

        Student s4=new Student();
        s4.setStudentId(1004);
        s4.setName("han");
        s4.setAge(17);
        s4.setSex("male");
        s4.setLesson1(66);
        s4.setLesson2(74);
        s4.setLesson3(82);

        Student s5=new Student();
        s5.setStudentId(1005);
        s5.setName("xue");
        s5.setAge(22);
        s5.setSex("female");
        s5.setLesson1(68);
        s5.setLesson2(71);
        s5.setLesson3(80);

        int lesson1_avg=(s1.getLesson1()+s2.getLesson1()+s3.getLesson1()+s4.getLesson1()+s5.getLesson1())/5;
        int lesson2_avg=(s1.getLesson2()+s2.getLesson2()+s3.getLesson2()+s4.getLesson2()+s5.getLesson2())/5;
        int lesson3_avg=(s1.getLesson3()+s2.getLesson3()+s3.getLesson3()+s4.getLesson3()+s5.getLesson3())/5;

        int lesson1_max=0;
        if (lesson1_max<s1.getLesson1()){
            lesson1_max=s1.getLesson1();
        }
        if (lesson1_max<s2.getLesson1()){
            lesson1_max=s2.getLesson1();
        }
        if (lesson1_max<s3.getLesson1()){
            lesson1_max=s3.getLesson1();
        }
        if (lesson1_max<s4.getLesson1()){
            lesson1_max=s4.getLesson1();
        }
        if (lesson1_max<s5.getLesson1()){
            lesson1_max=s5.getLesson1();
        }
        int lesson1_min=100;
        if (lesson1_min>s1.getLesson1()){
            lesson1_min=s1.getLesson1();
        }
        if (lesson1_min>s2.getLesson1()){
            lesson1_min=s2.getLesson1();
        }
        if (lesson1_min>s3.getLesson1()){
            lesson1_min=s3.getLesson1();
        }
        if (lesson1_min>s4.getLesson1()){
            lesson1_min=s4.getLesson1();
        }
        if (lesson1_min>s5.getLesson1()){
            lesson1_min=s5.getLesson1();
        }

        int lesson2_max=0;
        if (lesson2_max<s1.getLesson2()){
            lesson2_max=s1.getLesson2();
        }
        if (lesson2_max<s2.getLesson2()){
            lesson2_max=s2.getLesson2();
        }
        if (lesson2_max<s3.getLesson2()){
            lesson2_max=s3.getLesson2();
        }
        if (lesson2_max<s4.getLesson2()){
            lesson2_max=s4.getLesson2();
        }
        if (lesson2_max<s5.getLesson2()){
            lesson2_max=s5.getLesson2();
        }

        int lesson2_min=100;
        if (lesson2_min>s1.getLesson2()){
            lesson2_min=s1.getLesson2();
        }
        if (lesson2_min>s2.getLesson2()){
            lesson2_min=s2.getLesson2();
        }
        if (lesson2_min>s3.getLesson2()){
            lesson2_min=s3.getLesson2();
        }
        if (lesson2_min>s4.getLesson2()){
            lesson2_min=s4.getLesson2();
        }
        if (lesson2_min>s5.getLesson2()){
            lesson2_min=s5.getLesson2();
        }

        int lesson3_max=0;
        if (lesson3_max<s1.getLesson3()){
            lesson3_max=s1.getLesson3();
        }
        if (lesson3_max<s2.getLesson3()){
            lesson3_max=s2.getLesson3();
        }
        if (lesson3_max<s3.getLesson3()){
            lesson3_max=s3.getLesson3();
        }
        if (lesson3_max<s4.getLesson3()){
            lesson3_max=s4.getLesson3();
        }
        if (lesson3_max<s5.getLesson3()){
            lesson3_max=s5.getLesson3();
        }
        int lesson3_min=100;
        if (lesson3_min>s1.getLesson3()){
            lesson3_min=s1.getLesson3();
        }
        if (lesson3_min>s2.getLesson3()){
            lesson3_min=s2.getLesson3();
        }
        if (lesson3_min>s3.getLesson3()){
            lesson3_min=s3.getLesson3();
        }
        if (lesson3_min>s4.getLesson3()){
            lesson3_min=s4.getLesson3();
        }
        if (lesson3_min>s5.getLesson3()){
            lesson3_min=s5.getLesson3();
        }

        System.out.println(s1.getStudentId() + " " +s1.getName()+" "+s1.getAge()+" "+s1.getSex()+" "+s1.getLesson1()+ " "+s1.getLesson2()+" "+s1.getLesson3());
        System.out.println(s2.getStudentId() + " " +s2.getName()+" "+s2.getAge()+" "+s2.getSex()+" "+s2.getLesson1()+ " "+s2.getLesson2()+" "+s2.getLesson3());
        System.out.println(s3.getStudentId() + " " +s3.getName()+" "+s3.getAge()+" "+s3.getSex()+" "+s3.getLesson1()+ " "+s3.getLesson2()+" "+s3.getLesson3());
        System.out.println(s4.getStudentId() + " " +s4.getName()+" "+s4.getAge()+" "+s4.getSex()+" "+s4.getLesson1()+ " "+s4.getLesson2()+" "+s4.getLesson3());
        System.out.println(s5.getStudentId() + " " +s5.getName()+" "+s5.getAge()+" "+s5.getSex()+" "+s5.getLesson1()+ " "+s5.getLesson2()+" "+s5.getLesson3());
        System.out.println("lesson1_max is :" +lesson1_max);
        System.out.println("lesson2_max is :" +lesson3_max);
        System.out.println("lesson3_max is :" +lesson3_max);

        System.out.println("lesson1_min is :" +lesson1_min);
        System.out.println("lesson2_min is :" +lesson3_min);
        System.out.println("lesson3_min is :" +lesson3_min);

        System.out.println("lesson1_avg is :" +lesson1_avg);
        System.out.println("lesson2_avg is :" +lesson3_avg);
        System.out.println("lesson3_avg is :" +lesson3_avg);






    }
}
