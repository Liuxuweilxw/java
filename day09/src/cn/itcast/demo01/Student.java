package cn.itcast.demo01;

public class Student {
    int studentId;
    String name;
    String sex;
    int age;
    int lesson1;
    int lesson2;
    int lesson3;

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setLesson1(int lesson1) {
        this.lesson1 = lesson1;
    }

    public void setLesson2(int lesson2) {
        this.lesson2 = lesson2;
    }

    public void setLesson3(int lesson3) {
        this.lesson3 = lesson3;
    }

    public int getStudentId() {
        return studentId;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getSex() {
        return sex;
    }

    public int getLesson1() {
        return lesson1;
    }

    public int getLesson2() {
        return lesson2;
    }

    public int getLesson3() {
        return lesson3;
    }
}
