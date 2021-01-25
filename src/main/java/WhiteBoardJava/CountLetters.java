package WhiteBoardJava;

import org.junit.jupiter.api.DynamicTest;
import org.testng.annotations.Test;

import static java.util.stream.LongStream.iterate;

        //1. swap numbers
        //2. count letters in string
        public class CountLetters {

        public void count1() {
            String text = "SAnta Clara, California";
            char letter1 = 'a';
            int counter = 0;
            char[] array = text.toCharArray();
            for (char each : array) {
                if (each == letter1) counter++;
            }
            System.out.println(counter);
        }

        //3. iterate thru array
        @Test
        public void ar2(){
            int []ar22 ={222222,5,8,22,559,71};
            printAllArrMem(ar22);

        }

        @Test
        public void ar(){
            int[] ar1 = {1, 2, 88558, 4756, 5};
//      for(int i: ar1)
//       System.out.println(i);}
            for (int i = 0; i < ar1.length; i++) {
                int tem = ar1[i];
                //System.out.println(i + ")" + "here is ar2 ");
                printAll(ar1);
                //System.out.println(tem);

            }}

        //4. pass param into printAllemlementsof array
        @Test
        public void printAll(int []param ){
            for (int i = 0; i < param.length; i++) {
                int t1 = param[i];
                System.out.println( t1);
            }
        }

        @Test
        public void countLet() {
            String string = "My name is Feruza";
            char letter = 'a';
            int counter = 0;
            char[] charsA = string.toCharArray();
            for (char each : charsA) {
                if (each == letter) counter++;

            }
            System.out.println(counter);

        }

        @Test
        public void printArray() {
            int[] ar = {2, 3, 5, 8, 7};
            printAllArrMem(ar);
        }

        @Test
        public void setArray() {
            int[] array = {22, 28, 1};
            printAllArrMem(array);
        }


        public void printAllArrMem(int[] arParam) {
            for (int i = 0; i < arParam.length; i++) {
                int placeholder = arParam[i];
                System.out.println(placeholder);
            }
        }

        @Test
        public void swapA() {
            int[] swapAr = {2, 3, 4};
            int left = 0;
            int right = 1;
            printAllArrMem(swapAr);
            swapSignature(swapAr, left, right);
        }

        private void swapSignature(int[] swapAr, int left, int right) {
            int tempo = 0;
            tempo = swapAr[right];
            swapAr[left] = swapAr[right];
            swapAr[right] = tempo;
        }


    }

}
