package Override;

public class OverrideMain {

    public static void main(String[]args){
        Student sObj= new Student();

        //overriden methods
        System.out.println(sObj);
        System.out.println(sObj.getAge());
        System.out.println(sObj.getName());
        sObj.display();


    }
}
