public class ChuShi extends Employee implements VIP {
    public ChuShi(){
        super();
    }
    public ChuShi(String name,String id){
        super(name,id);
    }
    public void work(){
        System.out.println("厨师在炒菜");
    }
    public void Service(){
        System.out.println("加菜");
    }
}
