package abstractClasses_InterfEx;

public class FossilCar implements CarInterf{
    private String numPlate;
    private int speed;
    private String name;


    public FossilCar(String numPlate, int speed, String name ) {
        this.numPlate = numPlate;
        this.speed = speed;
        this.name = name;
    }


    public String getNumPlate() {
        return numPlate;
    }

    public void setNumPlate(String numPlate) {
        this.numPlate = numPlate;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void printName(String name) {

    }

    @Override
    public void start() {
        System.out.println("Starting " + getSpeed()+ " now ");
    }

    @Override
    public void move(int speed) {
        System.out.println(this.name + this.numPlate + " PPP");
    }
}
