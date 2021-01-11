package StringBuilder;

import org.junit.Test;

public class ReverseStringEx {

    public static void main(String[]args){
        //with strings
        String palindrome = "I saw Todd";
        //create int len to get length info
        int len = palindrome.length();
        //
        char [] tempCharArray = new char[len];
        char[]charArray = new char[len];

        //put original String into array of Chars
        for (int i =0; i<len; i++){
            tempCharArray[i]=palindrome.charAt(i);
        }

        //reverse array of chars

        for (int j =0; j<len; j++){
            charArray[j]= tempCharArray[len-1-j];
        }
        String reversePalindrome = new String( charArray);
        System.out.println(reversePalindrome);


        //with StringBuilder
        String palindrome1 = "I saw Mike";
        StringBuilder stringBuilder1 = new StringBuilder(palindrome1);
        stringBuilder1.reverse();
        System.out.println(stringBuilder1);

    }
}
