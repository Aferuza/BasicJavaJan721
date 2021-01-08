package WhiteBoardJava;

public class Fibonacci {
    public static  void main(String[]args){
        int k, a=1,b=1;
        k=0;
        System.out.print("");

        while (k<= 50)
        {
            k = a + b;
            System.out.print(k +  " ");
            a=b;
            b=k;
        }
    }
}

