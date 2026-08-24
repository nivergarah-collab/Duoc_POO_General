package clase_04;

public class Reparto extends Auto {
    private boolean enReccorrido;
    private Integer pedidos;

    public Reparto(String modelo, String marca, Integer ano, Double km, String tipo, Conductor conductor, boolean enReccorrido, Integer pedidos) {
        super(modelo, marca, ano, km, tipo, conductor);
        this.enReccorrido = enReccorrido;
        this.pedidos = pedidos;
    }








}
