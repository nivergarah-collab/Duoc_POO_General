package clase_06.Guia_1_3_5;

public class Main {
    public static void main(String[] args) {
        Auto v1 = new Auto("Toyota", "Corolla", 180, 4);
        Moto v2 = new Moto("Yamaha", "FZ", 140, true);


        //System.out.println(v1.mostrarMarca1());
        System.out.println(v1.mostrarMarca2());

        v1.mostrarDatos();
        v1.desplazarse();
        v2.mostrarDatos();
        v2.desplazarse();
    }
}
