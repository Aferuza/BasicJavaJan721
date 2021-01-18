import javax.naming.PartialResultException;

public class reversStrEx {
    public static void main (String[]args){

        String palind = "Kate was away";
        int len = palind.length();

        char []temp = new char[len];
        char[]temp1 = new char[len];

        for (int i =0; i<len; i++){
            temp [i]= palind.charAt(i);
        }

        for (int k=0; k<len;k++){
            temp1[k] = temp[len-1-k];

            String reverse = new String(temp1);
            System.out.println(reverse);

String rev= "Hello";
int length = rev.length();
char[] t= new char[len];
char []t1 = new char[len];

for (int i =0; i<length;i++){
    //convert string into char array
    temp[i] = rev.charAt(i);

    for (int j=0;j<len;j++){
        temp1[j] = temp[len-1-j];
    }
    String rever= new String(t);
    System.out.println(rever);


    String s = "Cold day";
    char[]sc = s.toCharArray();// Cold day
char []tempo = new char[len];
    for(int l =0; l<10; l++) {                            //Cold day
        temp[l]  = s.charAt(len);
    }
    System.out.println(sc);

}

        }


    }
}
