package DbAppUd;

import java.util.Scanner;

public class DbMain {
    public static void main(String[] args) {
        // put this stud onjects into array
        //ask how many students to add
        System.out.println("Enter the numb of students to enroll: ");
        Scanner in = new Scanner(System.in);
        int numbOfStudents = in.nextInt();

        UsersinDb[] students = new UsersinDb[numbOfStudents];
        //create a numb of new students
        for (int n = 0; n < numbOfStudents; n++) {
            students[n] = new UsersinDb();
            students[n].courseEnroll();

            students[n].setStudentId();
            students[n].viewBalance();
            students[n].viewBalance();
            students[n].payTuit();
            students[n].showInfotoString();


            System.out.println(students[0].toString());


        }


    }


}

