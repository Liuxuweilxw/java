public class FuWuYuan extends Employee implements VIP {
    public FuWuYuan(){
        super();
    }
    public FuWuYuan(String name,String id){
        super(name,id);
    }
    public void work(){
        System.out.println("送菜");
    }
    public void Service() {
        System.out.println("倒酒");
    }
}
