package Inheritance;

public class Student extends Person {
    //we can add new code to student which belongs only to student and doesnt belong to person
    // new field
    private int studentID;
    public Student(String name, int age) {

        //super calls super class constructor with empty parenthesis
        super();
        studentID= 12345;
    }
    //when we create constructor for derived class- we need to call super class methods with super()

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }
//over
    @Override
    public void display(){
        super.display();
        System.out.println("My id is " + getStudentID());
    }

}

