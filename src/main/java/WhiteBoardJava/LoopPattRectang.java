package WhiteBoardJava;

//print rectagle with stars
public class LoopPattRectang {
    public static void main(String[] args) {
        int anInt = 5;
        for (int r =1; r <=anInt; r++){
            for (int c = 1; c<=anInt; c++){
                System.out.print("*  ");
            }
            System.out.println();

        }

        //triangle asending
        int n = 5;
        for (int r =1; r <=n; r++){
            for (int c = 1; c<=r; c++){
                System.out.print("*  ");
            }
            System.out.println();

        }
// triangle desending

        for (int r = 1; r <= n; r++){
            for (int d = r; d<=n; d++){
                System.out.print("* ");
            }
            System.out.println();
    }
}}