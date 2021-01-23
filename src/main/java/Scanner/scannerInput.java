package Scanner;

import java.util.Scanner;

class ScannerInput {

    private String name;

    void inputName(){
        Scanner in = new Scanner(System.in);
        //String input = in.nextLine();
        System.out.println("Whts yr name ");
        this.name = in.nextLine();

    }


}
