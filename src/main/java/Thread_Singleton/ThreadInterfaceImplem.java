package Thread_Singleton;

public class ThreadInterfaceImplem {
    public static class MyRunnable implements Runnable{

        @Override
        public void run() {
            System.out.println("My runnable running");
            System.out.println("My runnable finished");
        }
    }

    public static void main(String[] args){

        //Thread myThread = new Thread(new MyRunnable() );
        //myThread.start();
    }
}
