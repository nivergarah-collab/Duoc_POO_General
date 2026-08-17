package clase_02.Guia1_1_4.Caso04_Gestion_Academica;
import java.util.ArrayList;
import java.util.List;

//Ejercicio 06
public class Curso {
    private String name;
    private String teacher;
    private List<Estudiante> estudiantes;
    private Integer cupos;


    public Curso(String name, String teacher, Integer cupos) {
        this.name = name;
        this.teacher = teacher;
        this.estudiantes = new ArrayList<>();
        this.cupos = cupos;
    }

    public void agregarEstudiante(Estudiante estudiante) {
        if (estudiante == null) {
            System.out.println("ERROR: estudiante no puede ser nulo!");
            return;
        }
        if (estudiantes.size() >= cupos){
            System.out.println("ERROR: No existen cupos suficientes");
            return;
        }

        if (estudiantes.contains(estudiante)){
            System.out.println("ERROR: Estudiante ya regristado");
            return;
        }

        this.estudiantes.add(estudiante);

    }

    public void eliminarEstudiante(Estudiante estudiante){
        if (estudiante == null) {
            System.out.println("ERROR: estudiante no puede ser nulo!");
            return;
        }
        if (!estudiantes.contains(estudiante)){
            System.out.println("ERROR: Estudiante no registrado");
            return;
        }

        this.estudiantes.remove(estudiante);
    }

    public Integer cuposDisponibles(){
        return cupos - estudiantes.size();
    }

    public String getName() {
        return name;
    }

    public String getTeacher() {
        return teacher;
    }

    public List<Estudiante> getEstudiantes() {
        return estudiantes;
    }

    public Integer getCupos() {
        return cupos;
    }
}
