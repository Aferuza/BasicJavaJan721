import org.junit.Assert;
import org.junit.Test;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import static org.junit.Assert.*;

class ArrayClass{
    public static void main(String[]args){


        //uninitialized array
        int[] unitializedArray;

    //fixed size array created
    int [] array = new int[5];
    int [] inst1to10 = {1,2,3,4,5,6,7,8,9,10};
    String [] strArray = new String[10];

    //declare empty array
        int [] zeroLength = {};
        int [] zeroAlso = new int[0];

   // create and initialize array
    int[] intArray = new int[]{2,3,5};

        // ragged array
        int[][] ragged= {{1,2,3,4},{5,6},{7,8}};

    //3 dimentional array
    int [][][]multi3d = new int[3][5][7] ;
    int [][] mutiArray = {{1,2,3}, {4,5,6}};

//    The syntax for declaring an array is:
//    datatype[] arrayName;


//initialized array
//    datatype [ ] arrayName = new datatype [size];
      int [ ] arrayName = new int [5];
//multidementional
    int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
      //Iterate thru array
      String[] workdays = {"Monday", "Tuesday", "Wednesday"};
    String days="";
//    for(String anywday : workdays){
//        days= days + "|" + anywday;
//arrays of arrays
    int [][] multi = new int[4][4] ;
    int [][] multi1 = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println("Multi array " + multi1);

//Printing the elements of array
    int[] array2 = {11,12,13,14,15};
        for (int i =0;i < 5; i++)
    {
        System.out.println(array[i]);
    }
        String [] numb012={"zero", "one", "two"};
        for(String anyNumb:numb012){
            System.out.println("Print zero "+ anyNumb);
        }
        assertEquals("zero", numb012[0]);
        assertEquals("two", numb012[1]);
    }


    public static class TestArray {

        public static void main(String[] args) {
            double[] myList = {1.9, 2.9, 3.4, 3.5};

            // Print all the array elements
            for (int i = 0; i < myList.length; i++) {
                System.out.println("My list is " + myList[i] + " ");
            }

            // Summing all elements
            double total = 0;
            for (int i = 0; i < myList.length; i++) {
                total += myList[i];
            }
            System.out.println("Total is " + total);

            // Finding the largest element
            double max = myList[0];
            for (int i = 1; i < myList.length; i++) {
                if (myList[i] > max) max = myList[i];
            }
            System.out.println("Max is " + max);

            //sort array
            String [] companies = {"Google", "Fb", "Sony"};
            Arrays.sort(companies);
            System.out.println("Sorted " + Arrays.toString(companies));

            //sort in reverse order
            Arrays.sort(companies, Collections.reverseOrder());
            System.out.println("Reverse sort" + Arrays.toString(companies));

            //

        }


        }
    }

