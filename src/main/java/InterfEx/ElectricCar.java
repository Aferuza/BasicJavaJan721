package InterfEx;

public class ElectricCar implements CarInterf{
private String name;

    //constructor created
    public ElectricCar(String name) {
        this.name = name;
    }

    //getters and setters created
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void printName(String name) {

    }


    //body in class and the signature is in inteface
    @Override
    public void start() {
        System.out.println(this);
        System.out.println("Electicity flow started...");

    }

    @Override
    public void move(int speed) {
        System.out.println(this.getName()+ " is moving at " + speed  + " mph");

    }
}
