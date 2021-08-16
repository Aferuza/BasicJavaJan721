package ArrayArrayList;

import Inheritance.Person;

public class ArrayOfObj {

    public static void main(String []args){

        Person p1 = new Person();
        Person p2 = new Person();
        Person p3= new Person();
        Person p4 = new Person();

        Person [] person = {p1,p2,p3, p4};
        for(Person i: person){
            //int temp = person[i];
            System.out.println("Persons are " + person);

        }

    }
}
