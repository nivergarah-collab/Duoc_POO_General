package clase_02.Guia1_1_4.Caso01;

public class main {

    static void main (){

        Libro nuevoLibro = new Libro("Narnia",
                "Lewis",
                11,
                "101.011");
        System.out.println(nuevoLibro.getName());
        System.out.println(nuevoLibro.canRetire());

        // transaccion prestamo

         Prestamo nuevoPrestamo = new Prestamo(
                "Juan",
                nuevoLibro,
                "22/02/25",
                "22/03/25"
         );

        System.out.println(nuevoPrestamo);


    }

}
