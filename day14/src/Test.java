public class Test {
    public static void main(String[] args){
        Manger m=new Manger("ddd","0001",123);
        m.work();

        FuWuYuan f1=new FuWuYuan("sdf","222");
        FuWuYuan f2=new FuWuYuan("err","453");

        ChuShi c1=new ChuShi("rrrr","444");
        ChuShi c2=new ChuShi("ttt","666");

        f1.work();
        f1.Service();

        c1.work();
        c2.Service();
        System.out.println(f1.getName());
    }
}
