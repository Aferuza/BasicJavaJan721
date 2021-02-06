
package abstractClasses_InterfEx;

interface WatterBottleInterface {
    String color ="Blue";
    void fillUp();

}


    public class InterfaceExample implements WatterBottleInterface{
public static void main (String[]args){
    System.out.println(color);
    InterfaceExample ex = new InterfaceExample();
ex.fillUp();

}


        public void fillUp() {
            System.out.println("Its filled!" );
        }
    }

