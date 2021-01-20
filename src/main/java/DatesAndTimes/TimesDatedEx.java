package DatesAndTimes;

import org.junit.Test;

public class TimesDatedEx {

      @Test
    public void currentTimeMillis(){
          long startTime = System.currentTimeMillis();

          for(int x=0; x<1; x++){
              System.out.println("Current time " + System.currentTimeMillis());
          }

          long endTime = System.currentTimeMillis();
          System.out.println("Total Time " +(endTime-startTime));
    }

    @Test
    public void nanoTime(){
          long startTime1 = System.currentTimeMillis();
          //more accurate calcu;ation for quick duration of activity
          long stTime = System.nanoTime();
    }
}
