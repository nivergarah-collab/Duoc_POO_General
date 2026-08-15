package clase_02.Guia1_1_4.Caso01;

public class Libro {
    private String name;
    private String author;
    private Integer stock;
    private String SUK_code;
    //private String unity_code;   // quiza un array autoincremental para que un libro tenga varias unidades ?


    public Libro(String name, String author, Integer stock, String SUK_code) {
        this.name = name;
        this.author = author;
        this.stock = stock;
        this.SUK_code = SUK_code; // codigo por unidad o codigo por copia
        //this.unity_code = unity_code;
    }

    public Integer getStock() {
        return stock;
    }

    public String getSUK_code() {
        return SUK_code;
    }

    public String getAuthor() {
        return author;
    }

    public String getName() {
        return name;
    }

    public boolean canRetire(){return stock > 0;}

    public void setStock(Integer valor) {
        if (valor > 0) {
            stock += valor;
            System.out.println("Ejemplares agregados con exito");
        } else if ( valor == 0 ) {
            System.out.println("No se agregaron ni restaron ejemplares");
        } else {
            if (stock - valor < 0) {
                System.out.println("No hay suficientes unidades para el retiro");
            } else {
                stock -= valor;
                System.out.println("Retiro exitoso");
            }
        }
    }
}
