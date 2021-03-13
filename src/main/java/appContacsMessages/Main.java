package appContacsMessages;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    //we write logic for app here
    //define our arrayList , Scanneras field
    //as methods i am going to use are stuatic- i need static fieds also, will initialize contacts inside the main method
    private static ArrayList <Contacts> contactsArrayList;
    private static Scanner scanner;
    private static int id = 0;

    public static void main(String[] args) {
        //initialize contacts ArrayList
        contactsArrayList = new ArrayList<>();
        System.out.println("Welcome to programming world!");
        //show t3 options
        showInitOptions();
    }
    private static void showInitOptions() {
        //initialize scanner
        scanner = new Scanner(System.in);
        System.out.println("Please enter your name: ");
       String name = scanner.next();
                System.out.println(name +","+ "Please select one: " +
                "\n\t1. Manage Contacts" +
                "\n\t2. Messages" +
                "\n\t3. Quit");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                manageContacts();
                break;
            case 2:
                manageMessages();
                break;
            case 3:
                searchForContact();
                break;
            case 4:
                deleteContact();
                break;
            case 5:
                showInitOptions();
                break;
        }
    }
    private static void manageContacts() {
        System.out.println("Please select one: " +
                "\n\t1. Select all contacts" +
                "\n\t2. Add a contact" +
                "\n\t3. Search for a contact");
        //we need users input, use scanner, we are not initalizing it here as we have already done that in show initial options method
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                showAllContacts();
                break;
            case 2:
                addNewContact();
                break;
            case 3:
                searchForContact();
                break;
            case 4:
                deleteContact();
                break;
            case 5:
                showInitOptions();
            default:
                showInitOptions();
                break;
        }
    }
    private static void showAllContacts() {
        //for c inside our"contacts" array list
        for (Contacts contIterator : contactsArrayList) {
            contIterator.getDetails();
        }
        showInitOptions();
        System.out.println("************");
    }
    private static void deleteContact() {
        System.out.println("Please enter cont name");
        String name = scanner.next();
        if (name.equals("")) {
            System.out.println("Please enter the name");
            deleteContact();
        } else {
            boolean doesExist = false;
            //looks in contactsArray list
            for (Contacts c : contactsArrayList) {
                if (c.getName().equals(name)) {
                    //if the name we entered the same we have
                    doesExist = true;
                    //and remove contact from contact list the itaration obj
                    contactsArrayList.remove(c);
                }
            }
            if (!doesExist) {
                System.out.println("There is no such contact");
            }
        }
        showInitOptions();
    }
    private static void searchForContact() {
        System.out.println("Please enter contact's name");
        String name = scanner.next();
        if (name.equals("")) {
            System.out.println("Please enter the name");
            searchForContact();
        } else {
            boolean doesExist = false;
            //search for this contact in contacts array list
            for (Contacts c : contactsArrayList) {
                //if cont name is the same name which we just received-
                if (c.getName().equals(name)) {
                    doesExist = true;
                    c.getDetails();
                }
            }
            if (!doesExist) {
                System.out.println("There is no such contact in your contact list");
            }
        }
        showInitOptions();
    }
    //will receive user input in this method
    private static void addNewContact() {
        System.out.println("Add a new contact " + "\nPlease enter the contact's name: ");
        String name = scanner.next();
        //to get contacts number
        System.out.println("Enter contact's number");
        String number = scanner.next();
        System.out.println("Please enter the contact's email: ");
        String email = scanner.next();
        //to ensure user doesn't enter empty strings
        if (name.equals("") || (number.equals("") || (email.equals("")))) {
            System.out.println("Please enter all the information");
            //recall the method itself again- recursive call, starting from start, in else case we create contact object
            addNewContact();
        } else {
            //create new Contact object and pass params
            Contacts singleContact = new Contacts(name, number, email);
            //array list - we add a single contact
            contactsArrayList.add(singleContact);
        }
        showInitOptions(); // we will quit is user tells us
        //System.out.println(name + " added successfully! ");
    }
    private static void manageMessages() {
        System.out.println("Please select one: " + "\n\t1. Show all messages" + "\n\t2. Send a new message" +
                "\n\t3. Go Back");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                showAllMessages();
                break;
            case 2:
                sendaNewMessage();
                break;
            default:
                showInitOptions();
                break;
        }
    }
    private static void showAllMessages() {
        //save all of the messages from all the contacts into an Array list
        ArrayList<Message> allMessages = new ArrayList<>();
// for contac c inside my contacs array list
        for (Contacts c : contactsArrayList) {
            //using add  all message - we are adding all of the messages of 1 contact to our AllMessages ArrayLIst
            allMessages.addAll(c.getMessage());
        }
//check if size of allMesages is 0 or not
        if (allMessages.size() > 0) {
            //for message m inside our allMessages arrayList
            for (Message m : allMessages) {
                m.getDetails();
                System.out.println("*******");
            }
        } else {
            System.out.println("You don't have any messages");
        }
        showInitOptions();
    }

    private static void sendaNewMessage() {
        System.out.println("Who are y going to send the message?");
        String name = scanner.next();
        if (name.equals("")) {
            System.out.println("Please enter the contacts' name");
            sendaNewMessage();
        } else {
            boolean doesExist = false;
            for (Contacts c : contactsArrayList) {
                if (c.getName().equals(name)) {
                    doesExist = true;
                }
            }
            if (doesExist) {
                System.out.println("What are you going to say?");
                String text = scanner.next();
                //to make sure if this text is empty or not
                if (text.equals("")) {
                    System.out.println("Please enter some message");
                    sendaNewMessage();
                }
                //since id is a static- its value will be unique ev time we use it for ev message
                else {
                    id++;
                    //create out message onject
                    Message newMessageObj = new Message(text, name, id);
                    for (Contacts c : contactsArrayList) {
                        if (c.getName().equals(name)) {
                            //new arraylist
                            ArrayList <Message> newMessages = c.getMessage();
                            //add this message to newMes arraay list
                            newMessages.add(newMessageObj);
                            //save the current contacts, as later on we will remove this contactfrom our contactsaray list
                            //and update array list of mesages, and then we 'll add it once again to contacts arraylist
                            Contacts currentContactVar = c;
                            //passing new mess araylist
                            currentContactVar.setMessage(newMessages);
                            //remove c onj from our array list
                            contactsArrayList.remove(c);
                            //we added the new Contact and updated DoubleToIntFunction contacts ArrayList
                            contactsArrayList.add(currentContactVar);
                        }
                    }
                }
            } else {
                System.out.println("There is no such contact");
            }
        }
        showInitOptions();
    }


}


