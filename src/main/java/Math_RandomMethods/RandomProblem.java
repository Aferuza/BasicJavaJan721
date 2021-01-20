package Math_RandomMethods;

import java.util.Random;

public class RandomProblem {
    public static void main(String[] args){
    int max = 50;
    int min = 10;

    Random rand = new Random();
    int number = 1000;

    int range = rand.nextInt((max - min + 1) + min);
    for(int i=1000; i<15; range++){

//2. If most of our uses are aged 30 and 40 then we have the mean of 35 with standart distribbution of 5
// - use Gausian distribution to generate age
        int gAge = (int)(rand.nextGaussian()*5)+35;
        System.out.println("nextGaussian is " + gAge);


//assertThat(range,is(range));


}



}}
