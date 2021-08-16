package WhiteBoardJava;

public class LoopPatterns {

    public static void main(String[]args){
        int d;//row
        int r;//column

         for (d=1; d<=5; d++){
         for (r=1; r<=5; r++){

             System.out.print(d+r);}

             System.out.println("");


  }
             //System.out.println();

        //for each looppu

        int []loopArray= {1,3,9,6};


         int []loopArray1= {1,3,9,6};
         for (int i : loopArray){
             System.out.println(i);

         }


         // for loop
        int[]forLoop = {52, 45,25};
         for( int k=0; k< forLoop.length; k++){
             System.out.println(forLoop[k]);
         }


         // switch case break
        int day = 4;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
  }

    int row;
        int column;
        for (row=1; row <=20; row++){
            for (column=1; column<=row; column++){
                System.out.print(column + " ");
            }
            System.out.println(" ");
        }
    }}






