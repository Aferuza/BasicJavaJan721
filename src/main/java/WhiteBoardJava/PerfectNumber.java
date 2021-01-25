package WhiteBoardJava;
//6= 1+2+3=6
//20=1+2+4+7+14=28
public class PerfectNumber {
    public static void main(String[] args) {
        int n = 28;
        boolean b = isPerfect(n);
        if (b) {
            System.out.println("Perfect num");
        } else
            System.out.println("Its not perfect");
    }

    private static boolean isPerfect(int n) {
        int sum =0;
        for(int i=1; i<n; i++){
            if((n%i==0)){
                sum = sum+i;
                //sum=sum+int;
                }
        if (n==sum)
        return true;
    }
return false;
}}


