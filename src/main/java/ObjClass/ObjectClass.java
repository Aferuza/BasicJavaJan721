

package ObjClass;

public class ObjectClass {


    private double salary;
    private String name;
    private Integer id;

    ObjectClass(Integer id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public ObjectClass() {
        super();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }


    public static void main(String[] args) {
        ObjectClass oC = new ObjectClass();
        oC.hashCode();
        oC.toString();
        System.out.println(oC);
    }

}


