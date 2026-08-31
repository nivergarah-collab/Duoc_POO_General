package clase_07.Guia_1_4_3;

public class Main {
    public static void main(String[] args) {
        Curso curso = new Curso("Programación");
        curso.agregarEstudiante("Ana");
        curso.agregarEstudiante("Luis");
        curso.mostrarEstudiantes();
        System.out.println(curso.obtenerEstudiante(5));
    }
}
