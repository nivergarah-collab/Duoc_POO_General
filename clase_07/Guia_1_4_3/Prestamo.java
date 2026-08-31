package clase_07.Guia_1_4_3;

import java.util.HashMap;
import java.util.HashSet;

public class Prestamo {
    private HashMap<String, String> estudiantes;
    private HashSet<String> libros;

    public Prestamo() {
        this.estudiantes = new HashMap<>();
        this.libros = new HashSet<>();
    }

    public HashMap<String, String> getEstudiantes() {
        return estudiantes;
    }

    public void setEstudiantes(HashMap<String, String> estudiantes) {
        this.estudiantes = estudiantes;
    }

    public HashSet<String> getLibros() {
        return libros;
    }

    public void setLibros(HashSet<String> libros) {
        this.libros = libros;
    }

    // crear metodo agregar estudiante
    // crear metodo agregar libro



}
