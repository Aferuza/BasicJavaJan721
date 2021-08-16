package ArrayArrayList;

public class charArray {
    public static void main(String[] args) {

        //char to string
        char[] char1 = {'2', 'n', 'y'};
//    String contos= Character.toString();
//    System.out.println(contos);
        String conv = String.valueOf(char1);
        System.out.println(conv);

        // //char to string
        char[] exCh= {'d','s','v'};
        String toStr = new String(exCh);
        System.out.println("char to string using toString "  + toStr);

        //Character.
        char ch = 'Z';
        String str = Character.toString(ch);
        System.out.println("String after conversion is: " + str);


        //!!!!!! //String to Char
        String text = "Sun and Moon";
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            System.out.println( c);
        }

        // String to Char using toCharArray()
        String text2 = "Saratoga";
        char[]saratChA = text2.toCharArray();
        for (char c: saratChA){
            System.out.println("String to Char using toCharArray()" + c);
        }

        //!!! char to int with parseInt
        char ch2 = '3';
        System.out.println("char value: " + ch);
        // Converting the character to it's int value
        int a = Integer.parseInt(String.valueOf(ch2));
        System.out.println("int value: " + a);


    //  char to int - Converting the Character to it's int value
    int a1 = Character.getNumericValue(ch);
        System.out.println("int value: " + a);


        // int to char
        int value_int ='1';
        char value_char= (char)value_int;
        System.out.println("value_char" + value_char );

// int to char using to string
        int value_int1 = 1;
        char value_char2 = Integer.toString(value_int).charAt(0);
        System.out.println("Integer.toString"+ value_char );


//int to char 2 with forDigit
        int radix = 10;
        int value_in = 6;
        char value_char1 = Character.forDigit(value_int , radix);
        System.out.println(value_char );


    char c='1';
        int a2=Character.getNumericValue(c);
        System.out.println("getNumericValue of char"+ a2);

        int chtoInt= Integer.parseInt(String.valueOf(char1));
        int chtoInt1= Integer.parseInt("3");
        System.out.println("char to int" + chtoInt);

    }}



