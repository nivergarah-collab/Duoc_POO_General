package clase_02.Guia1_1_4;



public class caso02_Product {
    private String name;
    private String code;
    private Integer stock;
    private String last_update;

    public caso02_Product(String name, String code, Integer stock, String last_update) {
        this.name = name;
        this.code = code;
        this.stock = stock;
        this.last_update = last_update;
    }



    public void venta(Integer units){
        if (stock - units > 0){
            stock -= units;
            System.out.println("Operacion exitosa");
            //Agregar el last update aca
        } else {
            System.out.println("Operacion fallida. No hay stock suficiente");
        }
    }

    public  void addStock(Integer newUnits){
        if (newUnits < 1){
            System.out.println("Stock no actualizado. El valor no puede ser menor a una nueva unidad");
        } else {
            stock = +newUnits;
            //Agregar el last update aca
        }
    }

    @Override
    public String toString() {
        return code + "\n" + name + "\nStock: " + stock;
    }

    public String getCode() {
        return code;
    }

    public void setLast_update(String last_update) {
        this.last_update = last_update;
    }
}
