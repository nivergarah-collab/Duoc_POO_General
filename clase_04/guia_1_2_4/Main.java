package clase_04.guia_1_2_4;


public class Main {

     static void main(String[] args) {
        Auto auto1 = new Auto("Yaris", "Toyota", "Rojo", 2020, 35000, "Sedan");

        System.out.println("Modelo: " + auto1.getModelo());
        System.out.println("Marca: " + auto1.getMarca());
        System.out.println("Color: " + auto1.getColor());
        System.out.println("Año: " + auto1.getAnio());
        System.out.println("Kilometraje inicial: " + auto1.getKm() + " km");
        System.out.println("Tipo: " + auto1.getTipo());

        System.out.println("\n--- Simulación de movimiento ---");

        auto1.avanzar(120);

        auto1.retroceder(20);

        auto1.setModelo("Corolla");
        System.out.println("\nNuevo modelo: " + auto1.getModelo());
    }

}
