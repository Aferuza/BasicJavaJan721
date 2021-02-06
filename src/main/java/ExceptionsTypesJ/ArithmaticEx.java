package ExceptionsTypesJ;

public class ArithmaticEx {
    public static void main(String []args) {
        int a = 2;
        int b = 0;
try {
        System.out.println(a / b);
    }

//or we can pass Exception- a;; types of exceptions
catch (ArithmeticException e){
    System.out.println("B was 0");
}
//null pointers exception
String name = null;
try {
    name.equals("Aziza");}
catch (NullPointerException e){
    e.printStackTrace();
    System.out.println("Name was null");
}

//interapeed ex
        //input output, cast, out cast ex
        //print e.printStackTrace()- prints in console while deguging;
}}
