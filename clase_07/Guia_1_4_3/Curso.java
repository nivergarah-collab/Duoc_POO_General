package clase_07.Guia_1_4_3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Curso {
    private String nombre;
    private ArrayList<String> estudiantes;
    private HashSet<String> correosRegistrados;
    private HashMap<String, String> correoPorEstudiante;

    public Curso(String nombre) {
        this.nombre = nombre;
        this.estudiantes = new ArrayList<>();
        this.correosRegistrados = new HashSet<>();
        this.correoPorEstudiante = new HashMap<>();
    }

    public void agregarEstudiante(String estudiante) {
        estudiantes.add(estudiante);
    }

    public void mostrarEstudiantes() {
        for (String estudiante : estudiantes) {
            System.out.println(estudiante);
        }
    }

    public void agregarCorreo(String nombre, String correo) {
        correosRegistrados.add(correo);
        correoPorEstudiante.put(nombre, correo);
    }



    public String obtenerEstudiante(int indice) {
        try {
            return estudiantes.get(indice);
        } catch (IndexOutOfBoundsException e) {
            return "Índice fuera de rango";
        }
    }

    public void agregarNota(double nota) {
        if (nota < 1.0 || nota > 7.0) {
            throw new IllegalArgumentException("La nota debe estar entre 1.0 y 7.0");
        }
        System.out.println("Nota registrada: " + nota);
    }
}
