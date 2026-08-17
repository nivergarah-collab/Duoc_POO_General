package clase_02.Guia1_1_4.Caso04_Gestion_Academica;
//Ejercicio 05
public class Estudiante {

    private String first_name;
    private double notas_matematicas;
    private double notas_historia;
    private double notas_lenguaje;
    private double notas_ingles;
    private double promedio;
    private String email;


    public Estudiante(String first_name, double notas_matematicas, double notas_historia, double notas_lenguaje, double notas_ingles, String email) {
        this.first_name = first_name;
        this.notas_matematicas = notas_matematicas;
        this.notas_historia = notas_historia;
        this.notas_lenguaje = notas_lenguaje;
        this.notas_ingles = notas_ingles;
        this.email = email;

        double suma = notas_historia + notas_matematicas + notas_lenguaje + notas_ingles;
        double promedioInicial = suma / 4.0f;
        this.promedio = Math.round(promedioInicial * 100.0f) / 100.0f;
    }

    public void calcularPromedio() {
        double suma = notas_historia + notas_matematicas + notas_lenguaje + notas_ingles;
        double promedioInicial = suma / 4.0f;
        this.promedio = Math.round(promedioInicial * 100.0f) / 100.0f;
    }

    public void setNotas_matematicas(double notas_matematicas) {
        this.notas_matematicas = notas_matematicas;
        calcularPromedio();
    }

    public void setNotas_historia(double notas_historia) {
        this.notas_historia = notas_historia;
        calcularPromedio();
    }

    public void setNotas_lenguaje(double notas_lenguaje) {
        this.notas_lenguaje = notas_lenguaje;
        calcularPromedio();
    }

    public void setNotas_ingles(double notas_ingles) {
        this.notas_ingles = notas_ingles;
        calcularPromedio();
    }

    public String getFirst_name() {
        return first_name;
    }

    public double getPromedio() {
        return promedio;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {return first_name + "Promedio: " + promedio + "\n";}

}
