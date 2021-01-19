
package Inheritance;

import org.junit.Test;

public class Person {
    private String name;
   private int age;


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

    public Person() {
//            this.age = age;
//            this.name = name;
        name = "unkn";
        age = 0;

    }

    public void display() {
        System.out.println(" Name is " + name + ", and age is " + age);
    }

}


