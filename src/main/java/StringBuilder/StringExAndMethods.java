package StringBuilder;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class StringExAndMethods {
    public static void main(String[] args) {

//        String asString = "abcdefg";
//        asString.charAt(2); //prints the index letter that we specify
        //System.out.println(asString.charAt(2));
        //System.out.println("\t, \b, \n, \r, \', \", \\ ");

        //ex1   //convert from int to Srting
        Integer integer = 1;
        integer.toString();

        System.out.println("To string "+ Integer.parseInt("2"));//1
        //print int
        System.out.println(integer);
        
//ex 2 from int to Srting
        int value = 1234;
        String string = String.valueOf(value);
        System.out.println(string); // 1234

//ex 3 convert from Str to Integer
        String string1 = "123";
        Integer fromStrToint = Integer.parseInt(string1);
        System.out.println(fromStrToint);

        //ex4//from Str to Int /float = valueOf()

        String inttoStr = String.valueOf(2);
        inttoStr.toCharArray();
        System.out.println("To char array " + inttoStr);

        //ex5 //convert from String to Array
        char arrayfromDtr[] = string1.toCharArray();
        System.out.println(arrayfromDtr);//123

        // ex6 from String to char array
        char[] cArray = {4, 9, 8};
       // assertThat("498".toCharArray(), is(cArray));
        cArray.toString();

        System.out.println(string1.getBytes());

        //we can create new string and assert
        String empty = new String();
        assertThat(empty.length(), is(0));
        assertThat(empty.isEmpty(), is(true));

        //we can create new string  with argumnts from char
        char[] ch = {'2', '3'};
        ch.toString();
        assertThat(new String(ch), is("23"));

        //compareTo methods of Strings
        String str2 = "Hello";
        assertThat(str2.compareTo("Hello"), is(0));
        assertThat(str2.compareTo("Hello") < 0, is(true));
        assertThat(str2.compareToIgnoreCase("Hello"), is(0));

        //case is important wh using contains
        assertThat(str2.contains("H"), is(true));
        //contentEquals retuns true if String has same parameter as

        assertThat(str2.contentEquals("Hello"), is(true));
        //endsWith compares then end of the Strinf witht he parameter
        assertThat(str2.endsWith("Hello"), is(true));

        // empty
        // regionMatches allows to compare part of string with part of another string
        // regionMatches(boolean)
//regionMatches(int toOffset, String )



//    str2.regionMatches(2, 2)
            //indexOf
            assertThat(str2.indexOf("1"), is(2));
            assertThat(str2.lastIndexOf("1"), is(9));
            //substring
            assertThat(str2.substring(2), is("1"));
            //replace
            str2.replace("e", "l");
            //replaceFisrt
            //toUpperCase
            System.out.println(str2.toUpperCase());

            System.out.println(str2.indexOf(2));


            //trim
            String padded = "       trim me  ";
            String trimmed = padded.trim();
            assertThat(padded.length(), is(15));
            assertThat(trimmed, is("trim me"));
            str2.trim();


            //substring
            String digit = "123456789";
            assertThat(digit.substring(2), is("5678"));


            //format- to construc strings
        //format
        //instead of % name will be printed
        String name = "Caleb";
        System.out.println(String.format("Hello %s", name));
        assertThat("Hello %s", is("Hello Caleb"));


        int value1 = 4;
            String output = "The value " + value + " was used";
            assertThat(output, is("The value 4 was used"));

            String template = "The value %d was used";
            String formatted = String.format(template, value1);
            assertThat(String.format(str2, "Bod", "ran", 5, "circles"),is("Hello") );
            assertThat(formatted, is("The value 4 was used"));

            //placeholders
            String use = "%s %s towards %d large %s";
            assertThat(String.format(use, "Bob", "ran", 6, "onions"), is("Bob ran towards 6 large onions"));
            System.out.println("Format:" + use);

//splt - converst string into array

        String splitNum = "123547895";
        String[]result = splitNum.split("");
        assertThat(result[0], is("0"));
        assertThat(result.length, is(10));



        }

        @Test
        public void regionMatches () {
/* Parameters
Here is the detail of parameters −
toffset − the starting offset of the subregion in this string.
other − the string argument.
ooffset − the starting offset of the subregion in the string argument.
len − the number of characters to compare.*/


//        String Str1 = new String("Welcome to Tutorialspoint.com");
//        String Str2 = new String("Tutorials");
//        String Str3 = new String("TUTORIALS");
//
//        System.out.print("Return Value :" );
//        System.out.println(Str1.regionMatches(11, Str2, 0, 9));
//
//        System.out.print("Return Value :" );
//        System.out.println(Str1.regionMatches(11, Str3, 0, 9));


            String x = "Hello";
            String y = "Jello";
            System.out.println(x.regionMatches(2, y, 2, 2));

        }
    }





