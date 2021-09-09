public class Manger extends Employee{
    private double money;
    public Manger(){
        super();
    }
    public Manger(String name,String id,double money){
        super(name,id);
    }
    public void work(){
        System.out.println("管理");
    }
}
