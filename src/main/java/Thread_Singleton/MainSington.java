package Thread_Singleton;

public class MainSington {
    public static void main(String[] args) {

        SingletonDb objSing = SingletonDb.getInstance("George");
        //make package private- we can access, otherwise we need constructor in Sigl class to be public
        //this way I restrict ppl from usin my constructor
        // SingletonDb onf = new SingletonDb("Lee");
        System.out.println(objSing.toString());

        //smb can create instances of our class from multiple threads- to make our class threadsafe, add syncronized

    }
}
