package WhiteBoardJava;

import java.util.Scanner;

public class kl {
public static void main(String[]args) {
    String pali;
    Scanner scn = new Scanner(System.in);
    System.out.println("Enter");
    pali = scn.nextLine();
    isPal2(pali);
}

        public static Boolean isPal2(String pali) {
        for (int i = 0; i < pali.length() / 2; i++) {
            if (pali.charAt(i) == pali.charAt(pali.length() - i - 1)) {
                System.out.println("Yess PALI");
                return true;
            }
        }
        System.out.println("Not PALI");
        return false;

    }



}
