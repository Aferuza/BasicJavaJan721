package Math_RandomMethods;

import java.util.Random;

// 1.use Random class, util package, nextInt(10);0-9
//2. use Math class
//3. RandomStringUtils-Apache

public class RandomClassEx {
    public static void main(String[] args) {
        Random random = new Random();
        Random rString = new Random();
        int num = random.nextInt(10);// starts from 0 and ends at 9 - cretaes random int
        random.nextBoolean();// cretaes random boolean
        random.nextFloat();// cretaes random float
        random.nextLong();// cretaes random long

        //ex1 // nextGaussian() - double i generated with a mean of 0 and Stand deviation of 1.0;
        random.nextGaussian();
        System.out.println("Generated random numb is " + num);

        //ex2 // result will not be below 5, netw 5 and 20
        int n3 = random.nextInt(20 - 1) + 5;
        System.out.println("Numb is betw 5 and 20 is " + n3);

        //ex3//generate random number between 10 and 15 and iterate 10 iterations
        int n = 10;
        for (int counter = 1; counter <= 10; counter++) {
            n = random.nextInt(6+1)+10;
            System.out.println("Rand numb is " + n);
        }


       //ex4//generate random Strings
        String strValues = "ABCDEHKLHKHGHJKL";
        String randString = "";
        //create obj with constritor
        //get new var length:
        int length = 5;

        //create empty array of char which holds 5 values
        char[] arrayText = new char[length];
        //for loop add char to index - rand numb
        for (int o = 0; o < length; o++) {
            arrayText[o] = strValues.charAt(random.nextInt(strValues.length()));
        }


        //ex5//anoth way-
        int length1 = rString.nextInt(15);/*   DK
                                                    DKK
                                                    DKKL
                                                    DKKLK*/

        int rndindex = random.nextInt(strValues.length());
        char rChar = strValues.charAt(rndindex);
        for (int j = 0; j < rndindex; j++) {
            System.out.println(rndindex);
        }

        //ex6//crete another for loop to turn indexes into one string:

        for (int k = 0; k < arrayText.length; k++) {
            randString += arrayText[k];


        //ex7// String to random Strings
            String stringArray ="YJFRTYUIUOOGJFHJKABCDEF";
            int lenthS = random.nextInt(stringArray.length());

            char chArStr = stringArray.charAt(lenthS);
            System.out.println("Here are random letters "+ chArStr);
            System.out.println(randString);
        }
         //1000-9999- not beloow 1000
//        int n4 = 1000 + random.nextInt(1000 - 1000);
//        System.out.println(n4);

//        int n5 = rndRange(1, 3);
//        System.out.println(n5);
    }

//    public static int rndRange(int start, int finish) {
//        Random random1 = new Random();
//        int rndInt = random1.nextInt(finish + 1 - start) + start;
//        return rndInt;
}


//    public static int rndRangeShortWay(int start, int finish) {
//        return {
//                new Random().nextInt(finish + 1 - start)+ start
//        };
//        public static int rndRange1(int finish) {
//          return   rndRange(1,finish);'











