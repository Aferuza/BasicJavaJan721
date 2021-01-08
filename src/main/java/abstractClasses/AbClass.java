package abstractClasses;

abstract class AbstractDog{
    String breed;
    public void bark(){
        System.out.println("Bark!!");
    }



        //dog.bark();
   //will not work

    }

class Kolly extends AbstractDog{

        public static void main(String[]args){
            Kolly koly = new Kolly();
            koly.bark();
        }
}




