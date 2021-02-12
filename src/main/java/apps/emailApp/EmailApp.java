package apps.emailApp;

public class EmailApp {
    public static void main(String[] args) {
        Email emailObj = new Email(" Ann", "Jones");
//        emailObj.setMailBoxCapacity(100);
//        emailObj.changePassword("HHH");
        //use getters and setters
        System.out.print(emailObj.showInfo());
//        emailObj.setAlternateEmail("js@gmail.com");
//        System.out.println(emailObj.getAlternateEmail());

    }
}