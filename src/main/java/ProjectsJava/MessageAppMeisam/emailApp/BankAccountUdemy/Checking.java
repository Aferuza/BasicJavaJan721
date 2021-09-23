package ProjectsJava.MessageAppMeisam.emailApp.BankAccountUdemy;


public class Checking extends Account {
    //List common properties for savings abd checking account
    private  int debitCardNumb;
    private  int debitCardPin;

    //Constructor to set base properties and initialize the account
    public Checking(String sSn, String name, double initDeposit) {
        super(name, sSn, initDeposit);
        accountNumber = "2" + accountNumber;
        System.out.println("New checkings account number : " + this.accountNumber);
        setDebitCard();
    }
    //implement the abstratc method of Account class

    @Override
    public void setRate(){
      rate = getBaseRate()*.15;
    }
    //List common methodspub



    private void setDebitCard() {
        debitCardNumb = (int) (Math.random() * Math.pow(10, 12));
        debitCardPin = (int) (Math.random() * Math.pow(10, 12));
        System.out.println("Debit Card Num: " + this.debitCardNumb);
        System.out.println("Debit Card Pin: " + this.debitCardPin);
        }


    public void showInfo() {
        super.showInfo();
        System.out.println("Ch" );
    }
}

