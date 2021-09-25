package DataTypes;

import java.awt.*;
import java.util.Date;

class DataTypes {
    private static Object x;

    public static void main(String[] args) {
        int age = 10;
        //reassign a to anoth value
        age = 30;
        int herAge = age;

        int ageM;
        char c = 'a';
        System.out.println((int) c);

        float a = (float) 2.3;
        double b = 2.2;
        //int is small, long also, but we can add L and it reloves,
        //java doesnt think its an int anymore
        long viewCounts = 3_123_456_789L;

        //with decimal point- double taked 8 bytes too large
        // so lets use float
        double price = 10.99;
        //java sees this number as double, so add F
        float price1 = 10.99F;

        char letter = 'f';
        boolean isElligible = true;

        //reference types/ java.util package
        //for reference types- type new to allocate memory

        // new Date is instance of class Date
        Date now = new Date();
        // have memvers with dot operator
        now.getTime();
        //shows current time on my machine
        System.out.println(now);
        //Point class

        Point point1 = new Point(1, 2);
        //reference to the var. dont store actual values, but
        //reference to the value ij the mem
        Point point2 = point1;

        //if I update point1, 2 will also be updated
        point1.x = 2;
        System.out.println(point1);

//Strings are refer types
        String myStr = new String(" Message " + "is printed!!");
        System.out.println(myStr);
        //access all String methods
        //check if string ends with a char or sequence of chars and it returns true or false

        System.out.println(myStr.endsWith("!!"));
        System.out.println(myStr.length());
        //returns the index of the char that we pass here
        System.out.println(myStr.indexOf("s"));
        System.out.println(myStr.replace("!!", "**"));
        // this method doesnt mogify original srting coz in java strings are immutable
        // if mehod modifies string- it will return new string object
        System.out.println(myStr);
        System.out.println(myStr.toCharArray());
        System.out.println(myStr.toLowerCase());


        //to remove uneeded white spaces users inserred use trim
        System.out.println(myStr.trim());


        //to use double quotes
        String mes = "Hello \"Everyone\"";
        System.out.println(mes);
//to use windows mach backslask
        //c:\WIndows\
        String windows = "c:\\Windows\\...";
        //backslash n
        String windows1 = "c:\nWindows\\...";
        String windows2 = "c:\tWindows\\...";
        System.out.println(windows1);


        //boolean true/false is retuned
        int x = 1;
        int y = 1;
        System.out.println(x == y);
        System.out.println(x != y);
        System.out.println(x <= y);


    }


}


