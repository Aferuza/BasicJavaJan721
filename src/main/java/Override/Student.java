package Override;

public class Student {

   private String name;
    private int age;

    Student(){
        name = "Lilac";
        age= 20;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = "Feruza Askar";
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = 2;
    }

    public void display(){
        System.out.println("My age is  "+ getAge());}

        @Override
        public String toString(){
            return "Get full name: " + getName();

        }
    }



