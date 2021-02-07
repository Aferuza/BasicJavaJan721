package InterfEx;

public interface CarInterf {
    String name = null;
    //provide signature of the IMethodInstance, byt no implementation
    //we dont know wht the name is
    //abstract methods- hides functionality of the
    //we define a contract of this method
    // mofifier public is redundant for intercace methods, so we can delete public
    // as all abstract methods inside interface are public, no private, protected
    //i can have sevelar intefaces implemented at declaaration o fmy clsasd


    void printName(String name);

    void start();

    void move(int speed);


}