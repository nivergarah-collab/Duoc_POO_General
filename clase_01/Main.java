package clase_01;

public class Main {
    public static void main(String[] args) {
        Owner owner = new Owner("Felo", "Cabezas");

        System.out.println(
            owner.getName() + " " + owner.getLastName()
        );
    }
}
