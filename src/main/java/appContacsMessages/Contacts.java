package appContacsMessages;
import java.util.ArrayList;

    public class Contacts {
        private String name;
        private String number;
        private String email;
        //to save diff messages for every contact in ArrayList
        private ArrayList <Message> message;

        // we are creating 2 constructors- becuz wn we create new contact it has no messages, for that we are creating anoth constructor which
        //will not accept an arraylist of different messages
        //Ist constructor for messages will be null
        public Contacts(String name, String number, String email, ArrayList <Message>message) {
            this.name = name;
            this.number = number;
            this.email = email;
            this.message= message;
        }
        //IInd constructor will save messages as arraylist
        public Contacts(String name, String number, String email) {
            this.name = name;
            this.number = number;
            this.email = email;
            //wn creating new ontact- save array mess as empy list
            this.message= new ArrayList<>();
        }
// this will be printed as summary of all actions on console
public  void getDetails(){
    System.out.println("Name: " + this.name + " " +
            "Number: " + this.number+ " " +
            "Email: " + this.email);

}
        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getNumber() {
            return number;
        }

        public void setNumber(String number) {
            this.number = number;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public ArrayList<Message> getMessage() {
            return message;
        }

        public void setMessage(ArrayList<Message> message) {
            this.message = message;
        }


    }



