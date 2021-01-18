package Override;

import java.util.SortedMap;

public class Student {

   private String name;
    private int age;


    Student(){
        name = "Lilac";
        age= 20;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = "";
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = 2;
    }

    public void display(){
        System.out.println("My age is  "+ getAge());
    }

}

