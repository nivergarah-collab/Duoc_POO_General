package clase_04;

public class Auto {

    private String modelo;
    private String marca;
    private Integer ano;
    private Double km;
    private String tipo;
    private Conductor conductor;

    public Auto(String modelo, String marca, Integer ano, Double km, String tipo, Conductor conductor) {
        this.modelo = modelo;
        this.marca = marca;
        this.ano = ano;
        this.km = km;
        this.tipo = tipo;
        this.conductor = conductor;
    }


    @Override
    public String toString() {
        return  "\nmodelo: " + modelo +
                "\nmarca: " + marca +
                "\nano: " + ano +
                "\nkm: " + km +
                "\ntipo: " + tipo;
    }

    //agregar setters

    public void avanzar(double distancia){
        if (distancia > 0 ) {
            this.km = this.km + distancia;
            System.out.println("Recorrio disstancia que no he impreso ");
        }
    }
    private void retroceder(Double distancia){
        if (km - distancia < 0) {
            System.out.println("No se puede retroceder tanto");
        } else {
            this.km -= distancia;
        }
    }
}
