package cn.itcast.demo01;

public class TestEmployee {
    public static void  main(String[] args)
    {
        employee em1=new employee();
        em1.setID("10001");
        em1.setName("Guozijing");

        System.out.println("Employee's ID is :"+ em1.getID());
        System.out.println("Employee's Name is :"+ em1.getName());
    }
}
