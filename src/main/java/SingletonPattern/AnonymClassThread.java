package SingletonPattern;

public class AnonymClassThread {
    public static void main(String[] args){
    Runnable runnable = new Runnable() {
        @Override
        public void run() {
            System.out.println("Runnable running");
            System.out.println("Runnable finishes");
        }
    };

    Thread thread = new Thread(runnable);
    thread.start();

}
}
