package practice;

public class ThreadsPract extends Thread{
    public void run(){
        System.out.println("Run thresd");
    }

    public static void main (String []args){
        ThreadsPract pract =  new ThreadsPract();
        pract.start();


    }

}
