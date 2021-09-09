package cn.itcast.demo01;

public abstract class Employee {
    private String name;
    private int age;
    private String ID;

    public Employee(String name, int age, String ID) {
        this.name = name;
        this.age = age;
        this.ID = ID;
    }

    public abstract void work();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }
}
