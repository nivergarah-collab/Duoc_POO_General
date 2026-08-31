package clase_06.Guia_1_3_4;

public class Main {
    public static void main(String[] args) {
        Vehiculo v1 = new Auto("Toyota", "Corolla", 180, 4);
        Vehiculo v2 = new Moto("Yamaha", "FZ", 140, true);
        v1.mostrarDatos();
        v1.desplazarse();
        v2.mostrarDatos();
        v2.desplazarse();
    }
}
