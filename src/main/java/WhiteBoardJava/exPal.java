package WhiteBoardJava;

public class exPal {
    //ex: 141- 141; 454, 98565689
    public static void main(String[] args) {
        int numb = 1396985651;
        int temp = numb;
        int rev = 0;

        while (numb > 0) {
            rev = rev * 10;
            rev = rev + numb % 10;
            numb = numb / 10;

        }
        if (temp == rev) {
            System.out.println("Yes it is");
        } else {
            System.out.println("No it's not");
        }
    }
}

