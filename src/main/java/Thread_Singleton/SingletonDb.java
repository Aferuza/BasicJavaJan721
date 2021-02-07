    package Thread_Singleton;

    public class SingletonDb {
    private String name;
    private static SingletonDb instance;


    //instead of constructor- use instance class,
   //to get a single instance of class in entire app,
    // syncronized- makes class threadsafe

        public static synchronized SingletonDb getInstance(String name) {
        //if our instance of a class is null will are willing to create another instance- we create a single instance of
        //
        if (null == instance) {
            instance = new SingletonDb(name);
        }
        return instance;
    }

    //if i change it to private- in main method nobody can access this constructor
    private SingletonDb(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

        @Override
        public String toString() {
            //return super.toString();
            String text ="Using to String method print the Db class\n" +
                    "Name: " + this.name;
            return text;
        }
    }
