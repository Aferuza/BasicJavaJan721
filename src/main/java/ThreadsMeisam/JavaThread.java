package ThreadsMeisam;

class ThreadsJava {
        public static void main(String[] args) throws InterruptedException {
            //
            Thread thread = new Thread(new Runnable() {

                @Override
                //run methods runsin the background, deadlogs, deadproofs, services, work manager, scheduler
                public void run() {
                    for (int i = 0; i < 5; i++) {
                        System.out.println("Printing " + i + " in a worker thread");
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            });
            //to start run method
            thread.start();
            for (int i = 0; i < 5; i++) {
                System.out.println("Printing " + i + " in a main thread");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();


                }
            }

        }}








