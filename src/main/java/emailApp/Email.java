package emailApp;

import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private String password;
    private String departm;
    private String email;
    private String companySuffix = "anycompany.com";
    private int setMailboxCapacity = 500;
    private int getMailBoxCapacity = 20;
    private int defaultPasswordLength = 10;
    private int mailBoxCapacity = 500;
    ;
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
        email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + departm + "." + companySuffix;
        System.out.println("Your email is : " + this.email);
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

    //!!!  generate random password
    private String randomPassword(int length) {
        String passwordSet = "ABCDEGHIJKLMNOPQRSTXYZ#$%^&#@><?";
        //look at the set as at a collection of characters with length as size
        char[] passwordAsChar = new char[length];
        //inside length - grab a value inside the array,
        // grab a char and pass it into our array one ata atime
        for (int i = 0; i < length; i++) {
            //return int = mutiply 0 or 1 by the size of the passworSet
            int randomPasw = (int) (Math.random() * passwordSet.length());

            passwordAsChar[i] = passwordSet.charAt(randomPasw);
            System.out.println(randomPasw);
            System.out.println(passwordSet.charAt(randomPasw));
            //System.out.println(passwordSet.charAt(rand));
        }
        return new String(password);
    }

    //set mailbox capacity
    public void setMailBoxCapacity(int capacity) {
        this.mailBoxCapacity = capacity;
    }

    //set alternate email
    public void setAlternateEmail(String altEmail) {
        this.alternateEmail = altEmail;

    }
//public methods that will access the property
    //instead of accesing the properties directly,
    // will access them via these public methods(encapsulation /data binding, hiding

    //change password
    public void changePassword(String passwordParam) {
        this.password = passwordParam;

    }

    //get mailbox capacity
    public int getGetMailBoxCapacity() {
        return mailBoxCapacity;
    }

    //get
    public String getAlternateEmail() {
        return alternateEmail;
    }

    public String getPassword() {
        return password;
    }

//method which prints info

    public String showInfo() {
        return "Dispay name: " + firstName + " " + lastName +
                "Company email: " + companySuffix +
                "Email " + email +
                "Mailbox Capacity: " + mailBoxCapacity + "mb";
    }


}

