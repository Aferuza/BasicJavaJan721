package Inheritance;

//derived and base classes
public class Main {
    public static void main(String[] args) {

        Person pObj = new Person();
        pObj.setName("Mary");
        pObj.setAge(25);


        Student sObj = new Student("Vic", 5);

//setname and setage methods availble for student obj too as it eextends person class

        sObj.setName("Bob");
        sObj.setAge(30);
        // if is a field from Student class and it can be done only to student obj

        // gived error pObj.setStudentID(10);
        //sObj.setStudentID(10);
        System.out.println(pObj.getName() + "  is  " + pObj.getAge() + " years old  ");
       // System.out.println(sObj.getStudentID() + "  is  my id  ");
        System.out.println(sObj.getStudentID());

        //pObj.display();

        //overwritten method from Personn class
        sObj.display();

        // equals
        if (sObj.equals(pObj))
            System.out.println("They are eq");
        else
            System.out.println("They are not eq");
    }

}

