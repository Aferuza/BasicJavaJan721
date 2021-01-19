package Math_RandomMethods;

import java.util.Random;

public class RandomClassEx {
    public static void main(String[] args) {
        Random random = new Random();
        int num = random.nextInt(10);// starts from 0 and ends at 9 - cretaes random int
        random.nextBoolean();// cretaes random n
        random.nextFloat();// cretaes random n
        random.nextLong();// cretaes random n
        System.out.println("Generated random numb is " + num);
// from 0 to 20
        int n2 = random.nextInt(20);
// result will not be below 5
        int n3 = random.nextInt(20 - 5) + 5;
        System.out.println(n3);


        //1000-9999- not beloow 1000
        int n4 = 1000 + random.nextInt(1000 - 1000);
        System.out.println(n4);

        int n5 = rndRange(1, 3);
        System.out.println(n5);
    }

    public static int rndRange(int start, int finish) {
        Random random1 = new Random();
        int rndInt = random1.nextInt(finish + 1 - start) + start;
        return rndInt;





    }}

    //    public static int rndRangeShortWay(int start, int finish) {
//        return {
//                new Random().nextInt(finish + 1 - start)+ start
//        };
//        public static int rndRange1(int finish) {
//          return   rndRange(1,finish);'











