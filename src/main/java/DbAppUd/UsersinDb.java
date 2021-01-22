package DbAppUd;

import java.util.Scanner;

public class UsersinDb {
    private String studFirstName;
    private String studLasttName;
    private String studGradeYear;
    private int numbOfStudents;
    private double yealOfEntry;
    // not for specific object but for all objects of the class
    private static int id = 1000;
    private String studentId;
    private static String coursesNames;
    private int courseCost = 600;
    private double tuitionBalance = 0;

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
        generateId();
        courseEnroll();
        System.out.println(studFirstName + " " + studLasttName + " " + studGradeYear + " " + studentId);
    }

    //generate random static student shd have 5 digit unique id; first name- is their grade level
    //ev time we create new student-   will increment id by 1; thats the use of static, 2 stud will have id 1001, 2 - 1002, etc
    //grade level + static id
    // not int, buts tring
    private void generateId() {
        id++;
        //cast stud as string
        this.studentId = studGradeYear + " " + id;
    }

    //enroll in courses
    void courseEnroll() {
      // do {
          //get inside loop,
          System.out.println("Enter course number to enroll (0 to quit): ");
          Scanner in = new Scanner(System.in);
          String course = in.nextLine();
          if (coursesNames != "Q") {
             coursesNames = coursesNames + "\n" + course;
             // ev time we add course- we need to increase tuition balance by the cost of the course
             tuitionBalance = tuitionBalance + courseCost;
//          } else break;
//       }while (1!=0);
               System.out.println("Enrolled in : " + course);
        System.out.println("Tuition balance: " + tuitionBalance);

    }}}




