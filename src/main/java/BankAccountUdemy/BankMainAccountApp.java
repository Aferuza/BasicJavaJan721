package BankAccountUdemy;

import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.List;

public class BankMainAccountApp {
    public static void main(String[] args) throws FileNotFoundException {

        List<Account> accounts = new LinkedList<Account>();

        String file = "C:/Users/Feruza/Desktop/NewBankAccounts.csv";

//        Checking chAcc1 = new Checking("Tim", "32", 2.2);
//        Savings sav1 = new Savings("Lowe", "333", 9.4);
//        //Read csv file then create new accounts based on that data
//
//        sav1.showInfo();
//        chAcc1.showInfo();
//        sav1.deposit(5000);
//        sav1.withdraw(2000);
//        sav1.transfere("Brok", 400);
//        sav1.compound();
//        System.out.println("*********");

        //read csv file
        List<String[]> newAccountHolder = utilities.CSV.read(file);
        for (String[] accountHolder : newAccountHolder) {
            System.out.println("New account");
            String name = accountHolder[0];
            String sSN = accountHolder[1];
            String accountType = accountHolder[2];
            double initDeposit = Double.parseDouble(accountHolder[3]);
            System.out.println(name + " " + sSN + " " + accountType + " " + "$ " + initDeposit);


            if (accountType.equals("Savings")) {
                System.out.println("OPen sav acc");
                accounts.add(new Savings(name, sSN, initDeposit));

            } else if (accountType.equals("Checking")) {
                System.out.println("Open check account");
                accounts.add(new Checking(name, sSN, initDeposit));
            } else {
                System.out.println("Error reading account Type");
            }
            //show info for the fifth obj ijn the list
            accounts.get(0).showInfo();

            for (Account acc : accounts) {
                System.out.println("\n*******");
                acc.showInfo();
            }

            System.out.println(accountHolder[0]);
            System.out.println(accountHolder[0]);
            System.out.println();
        }

    }
}
