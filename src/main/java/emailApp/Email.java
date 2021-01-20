package emailApp;

import java.util.Scanner;
public class Email {
    private String firstName;
    private String lastName;
    private String password;
    private String departm;
    private String email;
    private String companySuffix = "aeycompany.com";
    private int getMailBoxCapacity = 500;
    private int defaultPasswordLength;
    private int mailBoxCapacity;
    private String alternateEmail;


    //constructor to receive first and lastname
    public Email(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        System.out.println("Email created for:" + this.firstName + " " + this.lastName);

        //call a method asking for the dept - return the deptartment
        this.departm = setDepartment();
        ///  System.out.println("Department " + this.departm);

        //call a method that returns a random password
        this.password = randomPassword(defaultPasswordLength);
        System.out.println("Your password is  " + this.password);

        //combine elements to generate email
        email = firstName.toLowerCase() + lastName.toLowerCase() + "@" + departm + "." + companySuffix;
        System.out.println("Your email is : " + email);
    }

    //ask for the department
    private String setDepartment() {
        System.out.println("Department codes:\n1 for Sales\n2 for Accounting\n3 for Business\n0 for none\nEnter department codes: ");
        Scanner in = new Scanner(System.in);
        int deptChoice = in.nextInt();
        if (deptChoice == 1) {
            return "sales";
        } else if (deptChoice == 3) {
            return "acct";
        } else if (deptChoice == 2) {
            return "dev";
        } else if (deptChoice == 3) {
            return "acct";
        } else {
            return " ";
        }
    }

    //generate random password
    private String randomPassword(int length) {
        String passwordSet = "ABCDEGHIJKLMNOPQRSTXYZ#$%^&#@><?";
        char[] password = new char[length];// not hardcoded, can change lenth any time
        for (int i = 0; i < length; i++) {
            int rand = (int) (Math.random() * passwordSet.length());
            password[i] = passwordSet.charAt(rand);
            System.out.println(rand);
            System.out.println(passwordSet.charAt(rand));
        }
        return new String(password);
    }

    //set mailbox capacity
    public void setGetMailBoxCapacity(int capacity) {
        this.mailBoxCapacity = capacity;
    }

    //set alternate email
    public void setAlternateEmail() {
        this.alternateEmail = alternateEmail;

    }

    //change password
    public void changePassword() {
        this.password = password;
    }


}

