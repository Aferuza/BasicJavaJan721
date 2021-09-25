package Polymorphism;

public class OverrideMethodAndConstructor {
    int i;
    int j;

    public void add(int i,  int j){
        System.out.println(i+j);
    }
    // but wht if I have, not 2 params but 3?
    //copy add method and add another 3d param to it


    public void add(int i,  int j, int z){
        System.out.println(i+j);
    }
    public static void main (String[]args){
        OverrideMethodAndConstructor obj = new OverrideMethodAndConstructor();
        obj.add(4, 7);
        obj.add(2, 4, 5);
        OverrideMethodAndConstructor objCons = new OverrideMethodAndConstructor(2, 45);
        OverrideMethodAndConstructor objCons1 = new OverrideMethodAndConstructor(2, 4, 78);
    }

    // same for cnstructor overloading

    public OverrideMethodAndConstructor(int i,  int j){
         int num1= i;
         int num2 = j;
    }

    public OverrideMethodAndConstructor(int i,  int j, int k){
        int num1= i;
        int num2 = j;



    }

}
