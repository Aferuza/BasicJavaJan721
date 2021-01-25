package WhiteBoardJava;

class PalindromeNumberSimSmplSnpts {

    public static void main(String[]args){
        int num = 121;
        int rev = 0;
        int temp = num ;

//we dont know number of
// iterations required and therefore we do not use for loop
        while (num > 0){
            rev= rev *10;//0//0
            rev= rev+num%10;//12/2
            num = num/10;//2//
        }
        if(temp==rev){
            System.out.println("Yes P");
        }else {
            System.out.println("Not P");
        }
    }
}
