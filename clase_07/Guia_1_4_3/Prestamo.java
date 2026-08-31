package clase_07.Guia_1_4_3;

import java.util.HashMap;
import java.util.HashSet;

public class Prestamo {
    private HashMap<String, String> Estudiantes;
    private HashSet<String> Libros;

    public Prestamo(HashMap<String, String> estudiantes, HashSet<String> libros) {
        Estudiantes = estudiantes;
        Libros = libros;
    }

}
