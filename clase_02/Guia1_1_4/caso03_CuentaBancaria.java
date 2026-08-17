package clase_02.Guia1_1_4;
//ejercicio 04
public class caso03_CuentaBancaria {
    private String full_name;
    private String rut;
    private Float balance;
    private String email;

    public caso03_CuentaBancaria(String full_name, String rut, String email) {
        this.full_name = full_name;
        this.rut = rut;
        this.balance = 0.0f;
        this.email = email;
    }

    public void retirar(Integer valor) {
        if (valor < 1 ) {
            System.out.println("ERROR numero no puede ser negativo");
        } else if (balance - valor < 0) {
            System.out.println("Lo sentimos. No dispone de saldo suficiente");
        } else {
            balance -= valor;
            System.out.println("Valor retirado: " + valor + "\nNuevo saldo: " + balance );
        }
    }



    public void ingresar(Integer valor) {
            if (valor < 1 ) {
                System.out.println("ERROR numero no puede ser negativo");
            } else {
                balance += valor;
                System.out.println("Valor ingresado: " + valor + "\nNuevo saldo: " + balance );
            }
    }

    public void mostrarSaldo() {
        System.out.println("\nSaldo: $" + balance);

    }


   public String getFull_name() {return full_name;}

   public String getEmail() {return email;}

    public Float getBalance() {
        return balance;
    }
}







