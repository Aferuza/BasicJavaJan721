package Scanner;

import java.util.Scanner;

class ScannerInput {

    private String name;

    void inputName() {
        Scanner scan = new Scanner(System.in);
        //String input = in.nextLine();

        System.out.println("Age: ");
        System.out.println("Name: ");
        byte age = scan.nextByte();
        String name = scan.nextLine();

        byte age1 = (byte) scan.nextInt();

        //java autoconverts this byte var into String
        System.out.println("You are " + age);
        System.out.println("You are " + age);

        // this.name = scanner.nextLine();
    }


}
