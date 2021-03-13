package Hack_Rank;

public class IterationOfMathPower {
    public static void main(String[]args){
        int a =  5;
        int b= 3;
        int n =10;

        for (int i=0; i<n; i++){
            a= a+ (int)Math.pow(2, i) * b;
            System.out.println(a + " ");
        }
    }
}
