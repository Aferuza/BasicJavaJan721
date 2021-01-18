package Polymorphism;


// create 1 method that will take any type of param as animal
public class MainPolym {
    public static void main (String[]args){
        //create animal objects, subclasses
        DogPolym dog =  new DogPolym();
        CatPolym bird =  new  CatPolym();
        BirdPolym cat =  new  BirdPolym();
// prints all animals' sounds

        // since for all animals Animal class is superclass- array
        AnimalPolym [] pets= { dog, bird, cat};
//        //loop thru animals
        for(int i = 0; i<pets.length; i++){
            pets[i].speak();
        }


        //another ex of polhymorphsm - I dont have to overload methods with parameters of dog, cat, bird



       //depending on the tuype of animal different sound is made
            eat(dog);
            eat(bird);
            eat(cat);

    }

    public static void eat(AnimalPolym x){
        System.out.println("The animal ate and said");
        x.speak();
    }

}
