package Scanner;

import java.util.Scanner;

public class ScanPracticeAlex {
    public static void main(String [] args){
        Scanner scanner =  new Scanner(System.in);
        System.out.println("What's yr name ? ");
        String input = scanner.nextLine();
        System.out.println("Hi "+ input);
    }
}
