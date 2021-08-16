package BankAccountUdemy;

public class Savings extends Account {
    //List common properties for savings abd checking account
    private  int safetyDepositBoxId;
    private  int safetyDepositBoxKey;

    //Constructor to set base properties and initialize the account
    public Savings(String name, String sSn, double initDeposit) {
        super(name, name, initDeposit);
        accountNumber = "1" + accountNumber;
        System.out.println("New savings acc: " + this.accountNumber);
        setDepositBox();

    }

    //implement abstract method

        @Override
        public void setRate(){
            rate = getBaseRate()-.25;
            System.out.println("Rate is: " + rate);
    }

    //generate 3 numb box id and 4 digit key
    private void setDepositBox() {
        safetyDepositBoxId = (int) (Math.random() * Math.pow(10, 3));
        System.out.println(safetyDepositBoxId);
        //4 digit number
        safetyDepositBoxKey = (int) (Math.random() * Math.pow(10, 4));
    }
//list common methods
    public void deposit(double amount){
        balance = balance + amount;
        System.out.println("Depositing " + amount);
        printBalance();
    }

    public void showInfo() {
        System.out.println("Savings Accont:" + "saf dep box id " + safetyDepositBoxId +" saf dep key "+ safetyDepositBoxKey );
        super.showInfo();

    }


}
