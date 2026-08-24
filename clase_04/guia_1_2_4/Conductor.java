package clase_04.guia_1_2_4;
import java.util.List;

public class Conductor {
    private String nombre;
    private int edad;
    private String rut;
    private boolean habilitado;
    private List<String> licencias;

    public Conductor(String nombre, int edad, String rut, boolean habilitado, List<String> licencias) {
        this.nombre = nombre;
        this.edad = edad;
        this.rut = rut;
        this.habilitado = habilitado;
        this.licencias = licencias;
    }

    public void agregarLicencia(String licencia) {
        this.licencias.add(licencia);
    }

    @Override
    public String toString() {
        return "Conductor{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", rut='" + rut + '\'' +
                ", habilitado=" + habilitado +
                ", licencias=" + licencias +
                '}';
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public boolean isHabilitado() {
        return habilitado;
    }

    public void setHabilitado(boolean habilitado) {
        this.habilitado = habilitado;
    }

    public List<String> getLicencias() {
        return licencias;
    }

    public void setLicencias(List<String> licencias) {
        this.licencias = licencias;
    }
}
