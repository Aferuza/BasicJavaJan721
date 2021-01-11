import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class StringBuilderEx {

    public void main(String[] args){
    StringBuilder builder = new StringBuilder();
    StringBuilder builder2 = new StringBuilder(574);
    StringBuilder builder1 = new StringBuilder("Hi");
    // by default capacity of S Builder is 16 if no argument given
        // capacity method
    assertThat(builder.capacity(), is(16));
    assertThat(builder2.capacity(), is(574));

    System.out.println("Contents of StringBuilder.StringBuilder :" + builder);

    // to size StringBuilder.StringBuilder's capacity after construction use ensureCapacity()
    builder.ensureCapacity(600);
    //trimToSize()
    builder.trimToSize();
    //append
        builder.append(1);
        assertThat(builder.toString(),is("1"));

        //to insert
        builder.insert(1, 2);//wn inserting char - specify index, offset of char arry, and numb of charecters to copy from char array


        char[] characAr ={'.','a','b','c'};
        StringBuilder builderChar = new StringBuilder("abcd");
        builder.insert(2, characAr,3,4);

        assertThat(builder.toString(), is("abcd"));
        //delete- start index and end index

        builder.delete(2, 4);
        //delete- a specif character
        builder.deleteCharAt(2);


        builder.replace(0, 4, "12356");
        assertThat(builder.toString(), is("12578"));

        //replace individul characters using setCharAt using

        StringBuilder builder3 = new StringBuilder("48");
        builder.setCharAt(4, 'g');
        assertThat(builder.toString(), is("bkglb;l"));

        //reverse strings

        assertThat(builder.reverse().toString(),is("87541"));

        //substrings - returns A String from a start index to an end index

        assertThat(builder.substring(3,7), is("34567"));
        //from a start index to the end of the string
        assertThat(builder.substring(3), is("3456"));

        
}
}
