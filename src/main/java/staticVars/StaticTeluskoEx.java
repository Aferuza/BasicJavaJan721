package staticVars;

public class StaticTeluskoEx {
    int eid;
    int salary;
    static String ceo;


/*to initialize static vars- we use static block
    and it will be executed whne we load a class
    no matter how many obj we create- class will be loaded only once

 */
    static {ceo ="Larry";
    System.out.println("in static block");}

    //to initialize nonstatic- use constructor
    /*cons gets executed wn I create an object*/

    public StaticTeluskoEx(){
        eid = 1;
        salary = 3000;
        System.out.println("in constructor");

    }

    public static void main(String[] args) {


    }
}