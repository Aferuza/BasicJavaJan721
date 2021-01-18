package StringBuilder;

public class SBuilderEx {
    public static void main(String[] args) {

        StringBuilder sbd = new StringBuilder("Feruza");
        sbd.append("Hoja");
        sbd.insert(0, 2);
        sbd.reverse();
        sbd.replace(0, 3, "Askar");
        System.out.println();
        System.out.println(sbd);
        System.out.println(sbd);
    }
}