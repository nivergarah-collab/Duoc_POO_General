package clase_02.Guia1_1_4.Caso04_Gestion_Academica;

public class main {


    public static void main(String[] args){
        Curso cursoJava = new Curso("Curso JAVA", "Roberto", 3);
        Estudiante est1 = new Estudiante("Ana", 8.0, 7.5, 9.0, 8.5, "ana@gmail.com");
        Estudiante est2 = new Estudiante("Carlos", 9.0, 8.5, 7.0, 9.5, "carlos@gmail.com");
        Estudiante est3 = new Estudiante("María", 7.5, 8.0, 8.5, 7.0, "maria@gmail.com");
        Estudiante est4 = new Estudiante("Luis", 9.5, 9.0, 8.5, 9.0, "luis@gmail.com");

        cursoJava.agregarEstudiante(est1);
        cursoJava.agregarEstudiante(est2);
        cursoJava.agregarEstudiante(est3);
        cursoJava.agregarEstudiante(est4);

        System.out.println(cursoJava.getEstudiantes());

        cursoJava.eliminarEstudiante(est4);
        cursoJava.eliminarEstudiante(est3);
        cursoJava.agregarEstudiante(est4);

        System.out.println(cursoJava.getEstudiantes());




    }
}
