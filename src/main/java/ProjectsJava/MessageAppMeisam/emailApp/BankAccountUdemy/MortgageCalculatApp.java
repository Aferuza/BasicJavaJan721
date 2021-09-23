package ProjectsJava.MessageAppMeisam.emailApp.BankAccountUdemy;

import java.text.NumberFormat;
import java.util.Scanner;

public class MortgageCalculatApp {

    public static void main(String[] args){

        final  byte MONTHS_IN_YEAR = 12;
        final byte PERCENT = 100;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Principal ");
        int principal = scanner.nextInt();

        System.out.println("Annual INterest Rate: ");
        float annuallIntRate = scanner.nextFloat();
        float monthlyInterest = annuallIntRate/PERCENT/MONTHS_IN_YEAR;

        System.out.println("Periods in Years ");
        byte years = scanner.nextByte();

// find the number of payments
        int numberOfPayments = MONTHS_IN_YEAR * years;

        double mortgage = principal
                * (monthlyInterest * Math.pow ( 1+ monthlyInterest, numberOfPayments)
                / (Math.pow(1+ monthlyInterest, numberOfPayments) -1));

        String mortgageFormated = NumberFormat.getCurrencyInstance().format(principal);
        System.out.println("Mortgage: " + mortgageFormated);


    }
}
