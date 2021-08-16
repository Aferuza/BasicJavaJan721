package BankAccountUdemy;
public abstract class Account implements IBaseRate {
    //List common properties for savings and checking accounts
    private String name;
    private String sSN;
    protected String accountNumber;
    double balance;
    protected double rate;
    private static int index = 10000;

    //constructor to set base properties and initialize the account
    public Account(String sSn, String name, double initDeposit) {
        this.name = name;
        this.sSN = sSn;
        balance = initDeposit + 100;
        System.out.println("Name " + name + " SSN: " + " Balance: $" + balance);
        setRate();

        // set account number
        index++;
        this.accountNumber = setAccountNumber();
    }

    //general outline, implemented in subclasses,
    public abstract void setRate();

    private String setAccountNumber() {
        String lastTwoOfSsn = sSN.substring(sSN.length() - 2, sSN.length());
        int uniqueId = index;
        int randomNumber = (int) (Math.random() * Math.pow(10, 3));
        return lastTwoOfSsn + uniqueId + randomNumber;
    }

    public void withdraw(double amount) {
        balance = balance - amount;
        System.out.println("Withdrawing " + amount);
        printBalance();
    }

    public void transfere(String toWhere, double amount) {
        balance = balance - amount;
        System.out.println("Transfering $" + amount + "to " + toWhere);
        printBalance();
    }


    public void printBalance() {
        System.out.println("Your balance is now $: " + balance);
    }

    //implement compound interest
    public void compound() {
        double accruedInterest = balance * (rate / 100);
        balance = balance + accruedInterest;
        System.out.println("Accrued Interest: " + accruedInterest);
        printBalance();
    }

    //list common methods
    public void showInfo() {
        System.out.println("Nane: " + name + "\nAccount number:" + accountNumber + "rate " + rate + "%");
    }
}


