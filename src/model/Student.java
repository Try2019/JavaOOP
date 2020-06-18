package model;

public class Student {
    private String name;
    private int age;
    private char gender;
    private String ID;
    public Student(String name,int age,char gender,String ID){
        this.name=name;
        this.age=age;
        this.gender=gender;
        this.ID=ID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public String getID() {
        return ID;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

}
