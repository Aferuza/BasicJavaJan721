package DbAppUd;

import java.util.Scanner;

public class UsersinDb {
    private String studFirstName;
    private String studLasttName;
    private String studGradeYear;
    private int numbOfStudents;
    private double yealOfEntry;
    // not for specific object but for all objects of the class
    private static int id5DigitN = 1000;
    //this id is unique
    private String studentId;
    private static String coursesNames = null;
    private int courseCost = 600;
    private double tuitionBalance;
    private int payment;

    //use constructor
    //prompted to enter first name using Scanner class
    public void enterFnAme() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter st first name ");
        this.studFirstName = in.nextLine();

//prompted to enter last name
        System.out.println("Enter st last name ");
        this.studLasttName = in.nextLine();
//prompted to enter year
        System.out.print("1 - Freshman\n2 - Sophomore\n3 - Junior\n4 - Senior\nEnter stud class level: ");
        this.studGradeYear = in.nextLine();
        setStudentId();
        //courseEnroll();
        System.out.println(studFirstName + " " + studLasttName + " " + studGradeYear + " " + studentId);
    }

    //generate random static student shd have 5 digit unique id; first name- is their grade level
    //ev time we create new student-   will increment id by 1; thats the use of static, 2 stud will have id 1001, 2 - 1002, etc
    //grade level + static id
    // not int, buts tring
    private void setStudentId() {
        id5DigitN++;
        //cast stud as string
        this.studentId = studGradeYear + " " + id5DigitN;
    }

    //enroll in courses
     public void courseEnroll() {

        do {
            System.out.println("Enter course number to enroll (Q to quit): ");
            Scanner in = new Scanner(System.in);
            String varForScan = in.nextLine();
            if (!varForScan.equals("Q")) {
                coursesNames = coursesNames + "\n" + varForScan;
            } else if (varForScan.equals("Q")){
                break;
            }
        }
        while (1 != 0);
        System.out.println("Enrolled in : " + coursesNames);
        System.out.println("Tuition balance is $: " + tuitionBalance);
    }

    //view balance
    public void viewBalance() {
        tuitionBalance = tuitionBalance + courseCost;
        System.out.println("Your balance is " + tuitionBalance);
    }

    ////pay tuition
    public void payTuit() {
        System.out.println("Enter yr payment ");
        Scanner in = new Scanner(System.in);
        int payment = in.nextInt();
        tuitionBalance = tuitionBalance - payment;
        System.out.println("thank you for your payment of " + payment);
        viewBalance();
    }

    //shoe\winfo

    public String showInfotoString(){
        return "Name: " + studFirstName +" " + studLasttName+
                "\nCourses Enrolled: " + coursesNames +
                "\nBalance: " + tuitionBalance+
                "\nGrade Info: " + studGradeYear;
    }
}





