package WhiteBoardJava;


import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class StringExAndMethods {
    public static void main(String[] args) {

        String asString = "abcdefg";
        asString.charAt(2); //prints the index letter that we specify
        System.out.println(asString.charAt(2));
        System.out.println("\t, \b, \n, \r, \', \", \\ ");


        //ex1   //convert from int to Srting
        Integer integer = 1;
        integer.toString();
        System.out.println(integer.toString());//1
       //print int
        System.out.println(integer);
//ex 2
        int value= 1234;
        String string = String.valueOf(value);
        System.out.println(string); // 1234

//ex 3 convert from Str to Integer
        String string1 ="123";
        Integer fromStrToint= Integer.parseInt(string1);
        System.out.println(fromStrToint);


     //from Str to Int /float = valueOf()
//ex4
      String inttoStr = String.valueOf(2);

 //ex5     //convert from Str to Array
     char arrayfromDtr [] = string1.toCharArray();
        System.out.println(arrayfromDtr);//123

        // ex6 from String to char array
        char [] cArray = {4, 9, 8};
        assertThat("498".toCharArray(),is(cArray));

        System.out.println(string1.getBytes());

        //we can create new string and assert
        String empty = new String();
        assertThat(empty.length(), is(0));
        assertThat(empty.isEmpty(), is(true));

        //we can create new string  with argumnts from char
        char [] ch = {'2','3'};
        ch.toString();
        assertThat(new String(ch), is("23"));

        //compareTo methods of Strings
        String str2 = "Hello";
        assertThat(str2.compareTo("Hello"), is(0));
        assertThat(str2.compareTo("Hello")<0, is(true));
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

    //    str2.regionMatches(2, 2)
        //indexOf
assertThat(str2.indexOf("1"), is(2));
assertThat(str2.lastIndexOf("1"), is(9));






    }

    }
