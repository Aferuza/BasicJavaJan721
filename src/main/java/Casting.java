import java.text.NumberFormat;

public class Casting {
    //devision of 2 whole numb in jave - gives a whole number]
    public static void main(String[] args) {
        int devsResult = 5 / 2;
        //to get a result with decimal- casting


        double devsResultF = ((double) 5 / (double) 2);
        System.out.println(devsResult);
        System.out.println(devsResultF);

        //augmented assignment operators
        int x = 1;
        x = x + 2;
        x += 2;
        System.out.println(x);

        //implicit auto casting automatically
        //byte, short, int, long
        short x1 = 1;
        int y1 = x + 2;
        //any value stored in short can be storedn in int.
        //java takes short and copies its value into an anonymous variable of type int
        //and adds 2int values together
        System.out.println(y1);


        //floating point values
        //explicit casting can happen between compatible types

        double x2 = 1.1;
        int y2 = (int) (x2 + 2);
        System.out.println(y2);

        // we cannot cast a string to a number
        String castStr = "2";
        //to cast sting to int - use wrapper class INteger
//takes a String and returns an int
        int y3 = Integer.parseInt(castStr);
        Short.parseShort(castStr);
        Float.parseFloat(castStr);
        System.out.println(y3);


        //Math class
        int result = Math.round(2.89F);
        System.out.println(result);
        //cast as int
        int result1 =(int) Math.ceil(2.89F);
        int result3 = Math.max(2, 6);
        System.out.println(result3);
        int result4 = Math.min(2, 6);
        System.out.println(result4);
        // to get a number between 1 and 100
        double result5 = Math.random() * 100;
        System.out.println(result5);
        //to return a round random value- but it will have still a ffraction
        double result6 = Math.round(Math.random() * 100);
        // to have a whole number we shd cast to int
        // we have a case wn we have a value of double- 8 bytes, and we cannot store it in int 4 bytes, thats why cast to int
       int result7 = (int)Math.round(Math.random() * 100);
       int result8 = (int)Math.round(Math.random() * 100);
        System.out.println(result6);
        System.out.println(result7);

        //format numbers
        //its an abstract class, we cannot create an instance- so instead of creating an instance-
        //we can call a method
//        NumberFormat currency = new NumberFormat() {
//
//            }
        //factory method- creats an instance
      NumberFormat currency =  NumberFormat.getCurrencyInstance();
     //method to format values and return as a currency representation
     String resultOfFormat = currency.format(1234567.89);
        System.out.println(resultOfFormat);

        /// format a number as a percent
        //method chaining
        String resultPercent = NumberFormat.getPercentInstance().format(0.1);
        System.out.println(resultPercent);



        }
    }


