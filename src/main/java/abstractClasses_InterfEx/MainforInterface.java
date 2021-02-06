package abstractClasses_InterfEx;

public class MainforInterface {
    public static void main(String[]args){
        CarInterf carInterfObj = new ElectricCar("Tesla");
        carInterfObj.start();
        carInterfObj.move(60);


        CarInterf carFossil = new FossilCar("2323",125, "BMW");
        carFossil.start();
        carFossil.move(120);



    }

}
