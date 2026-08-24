package clase_04;

import java.util.ArrayList;
import java.util.List;

public class Main {


    public static void main(String[] args) {
        List<String> licencias = new ArrayList<>();
        Conductor miConductor = new Conductor("Juan", 22, "19874745-9", true, licencias );
        //Auto miAuto = new Auto("v3", "Toyota", 1998, 23.0, "familiar", miConductor);
        Reparto miRepartidor = new Reparto("v3", "Toyota", 1998, 23.0, "familiar", miConductor, true, 10 );
        System.out.println(miRepartidor);


    }

}
