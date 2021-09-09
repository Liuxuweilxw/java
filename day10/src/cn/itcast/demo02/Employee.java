package cn.itcast.demo02;

/**
 * @version 1.0
 */
public abstract class Employee {
    /**
     *
     */
    private String name;
    private String  ID;
    public void setName(String name){
        this.name=name;
    }
    public String  getName(){
        return name;
    }
    public void setID(String ID){
        this.ID=ID;
    }
    public String  getID(){
        return ID;
    }
    public abstract void work();

}
