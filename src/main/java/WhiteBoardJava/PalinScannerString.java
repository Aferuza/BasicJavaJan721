package WhiteBoardJava;

import java.util.Scanner;

public class PalinScannerString {
    public static void main(String[] args) {
        String string;
        Scanner scn = new Scanner(System.in);
       //get user input
        System.out.println("Enter a name");
        string = scn.nextLine();
        //invoke isPal method below
        isPal(string);
    }
    //


    public static Boolean isPal(String string) {
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) != string.charAt(string.length() - i - 1)) {
                System.out.println("this is not");
                return false;
            }

    } System.out.println("This is");
        return true;

}}