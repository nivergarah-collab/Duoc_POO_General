package clase_04.guia_1_2_4;


public class Main {

     static void main(String[] args) {
        Auto auto1 = new Auto("Yaris", "Toyota", "Rojo", 2020, 35000, "Sedan");

        System.out.println(auto1);

        System.out.println("\n--- Simulación de movimiento ---");

        auto1.avanzar(120);

        auto1.retroceder(20);

        auto1.setModelo("Corolla");
       // System.out.println("\nNuevo modelo: " + auto1.getModelo());

        VehiculoEmpresaReparto auto2 = new VehiculoEmpresaReparto("Yaris", "Toyota", "Rojo", 2020, 35000, "Sedan", false, 10);
        auto2.entregaPedido();
        auto2.entregaPedido();
        System.out.println(auto2.getPedidos());
        System.out.println(auto2);

     }






}
