package clase_03;
//Directo guia 1.2.4
//Clase guia 1.2.5
public class Auto {

    private String modelo;
    private String marca;
    private String color;
    private Integer ano;
    private Integer km;
    private String tipo;

    public Auto(String modelo, String marca, String color, Integer ano, Integer km, String tipo) {
        this.modelo = modelo;
        this.marca = marca;
        this.color = color;
        this.ano = ano;
        this.km = km;
        this.tipo = tipo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getAno() {
        return ano;
    }

    public void setAno(Integer ano) {
        this.ano = ano;
    }

    public Integer getKm() {
        return km;
    }

    public void setKm(Integer km) {
        this.km = km;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
