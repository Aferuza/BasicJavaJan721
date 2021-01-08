

    import java.util.Arrays;
import java.util.List;

    class Main {
        public static void main(String[] args)
        {
            // define the Array
            int numArr[] = { 23,43,26,65,35,16,74,27,98 };
            //sort the array first
            Arrays.sort(numArr);
            System.out.println("Input array:" + Arrays.toString(numArr));


            // asList
            String[]months= {"Jan", "Feb", "Mar", "Apt"};
            System.out.println();
            List <String>monthList = Arrays.asList(months);
            System.out.println("As List" + Arrays.asList(months));

            //

            int numArr1[] = { 23,43,26,65,35,16,74,27,98 }; // define the Array
            Arrays.sort(numArr);
//binary search
            System.out.println("Binary search " + Arrays.binarySearch(numArr, 2));
            //Arrays.compare(10, numArr);


//copy of-?
            System.out.println("Copy Of" + Arrays.copyOf(months, 15));
            // Copy of range
            System.out.println("Copy of range" + Arrays.copyOfRange(numArr, 2, 5));
            //Sorted array
            System.out.println("Sorted array" + Arrays.toString(numArr1));

            int key = 35;
            //call binarySearch function to search a given key
            System.out.println("Key " + key + " found at index = " + Arrays
                    .binarySearch(numArr, key));


            int numArr2[] = { 23,43,26,65,35,16,74,27,98 }; // define the Array
            int numArr3[] = {2,3,8,5,4,2,8,6,9};

            Arrays.sort(numArr); //sort the array first
            System.out.println("Sorted " + numArr) ;
            System.out.println("Input array:" + Arrays.toString(numArr));
            int key1 = 35;
            //call binarySearch function to search a given key
            System.out.println("Key " + key + " found at index = " + Arrays
                    .binarySearch(numArr,3,7, key));
            //equals - Equalsfalse
            System.out.println("Equals" + Arrays.equals(numArr, numArr3));

            //to String
            System.out.println("toString"+ Arrays.toString(numArr));

            //hashCode -returns hashcode of this array 32 bit number signed int

            System.out.println("Hashcode"+ Arrays.hashCode(numArr));


        }
    }





