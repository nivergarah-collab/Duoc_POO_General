package clase_04.guia_1_2_4;

public class Auto {

    private String modelo;
    private String marca;
    private String color;
    private int anio;
    private double km;
    private String tipo;
    private String estado;

    public Auto(String modelo, String marca, String color, int anio, double km, String tipo) {
        this.modelo = modelo;
        this.marca = marca;
        this.color = color;
        this.anio = anio;
        this.km = km;
        this.tipo = tipo;
        this.estado = "Detenido";
    }

    public String getModelo() {
        return modelo;
    }

    public String getMarca() {
        return marca;
    }

    public String getColor() {
        return color;
    }

    public int getAnio() {
        return anio;
    }

    public double getKm() {
        return km;
    }

    public String getTipo() {
        return tipo;
    }

    public void setModelo(String nuevoModelo) {
        this.modelo = nuevoModelo;
    }

    public void avanzar(double distancia) {
        km = km + distancia;
        System.out.println("Avanzando: " + distancia + " km. Km totales: " + km);
    }

    public void retroceder(double distancia) {
        km = km - distancia;
        System.out.println("Retrocediendo: " + distancia + " km. Km totales: " + km);
    }

    @Override
    public String toString() {

        String texto ="---------------------------------------"
                +"Vehiculo modelo: " + modelo
                +"Marca: " + marca
                +"Anio: " + anio
                +"Km: " + km
                +"Tipo: " + tipo
                +"---------------------------------------";
        return texto;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public void setKm(double km) {
        this.km = km;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
