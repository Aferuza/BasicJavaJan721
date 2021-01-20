package DatesAndTimes;

import java.util.Date;

public class DateEx {
    public static void main(String[]args){
        Date date = new Date();
        date.after(date); // true if parameter date is after the Date object
        date.before(date);// true if parameter date is before the Date object
        date.compareTo(date);
        date.equals(date);// true if paaream of date obj represents same  time and date

        date.setTime(23);//set the time rep by Date obj to spec-c millisecond value
        date.getTime();//retuns numb of milliseconds after moidnight Jan 1 1970
        date.toInstant();
        System.out.println(date.toString());


        //equal statements
        Date equivd1= new Date();
        Date eqiuvD2 = new Date(System.currentTimeMillis());




    }

}
