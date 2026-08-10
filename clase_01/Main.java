package clase_01;

public class Main {
    public static void main(String[] args) {
        User user = new User("Felo", "Cabezas");

        System.out.println(
            user.getName() + " Nuevo texto " + user.getLastName()
        );
    }
}
