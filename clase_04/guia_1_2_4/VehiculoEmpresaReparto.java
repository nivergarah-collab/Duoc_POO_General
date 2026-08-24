package clase_04.guia_1_2_4;

public class VehiculoEmpresaReparto extends Auto {
    private boolean enReccorrido;
    private Integer pedidos;


    public VehiculoEmpresaReparto(String modelo, String marca, String color, int anio, double km, String tipo, boolean enReccorrido, Integer pedidos) {
        super(modelo, marca, color, anio, km, tipo);
        this.enReccorrido = enReccorrido;
        this.pedidos = pedidos;
    }

    public void entregaPedido(){

        if(pedidos - 1 > 0 ){
          pedidos -= 1;
        }else {
            System.out.println("Entrega invalida. No existen pedidos suficientes");
        };

    }


    @Override
    public String toString() {
        String texto = super.toString()
                +"\nEn recorido: " + enReccorrido
                +"\nPedidos actuales: " + pedidos
                +"\n---------------------------------------";
        return texto;
    }

    public boolean isEnReccorrido() {
        return enReccorrido;
    }

    public void setEnReccorrido(boolean enReccorrido) {
        this.enReccorrido = enReccorrido;
    }

    public Integer getPedidos() {
        return pedidos;
    }

    public void setPedidos(Integer pedidos) {
        this.pedidos = pedidos;
    }
}
