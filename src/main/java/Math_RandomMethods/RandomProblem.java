package Math_RandomMethods;
import java.util.Random;
public class RandomProblem {
    public static void main(String[]args){
    int max = 50;
    int min = 10;

    Random rand = new Random();


    int range = rand.nextInt((max - min + 1) + min);
    for(int i=range; i<40; range++){


        System.out.println(i);
}
}}
