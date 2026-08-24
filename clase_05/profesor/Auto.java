package clase_05.profesor;

    public class Auto extends Vehiculo implements TocableBocina {
        private int cantidadPuertas;
        public Auto(String marca, String modelo, int velocidadMaxima, int cantidadPuertas) {
            super(marca, modelo, velocidadMaxima);
            this.cantidadPuertas = cantidadPuertas;
        }


    public int getCantidadPuertas() {
        return cantidadPuertas;
    }
    public void abrirMaletero() {
        System.out.println("El maletero del auto está abierto");
    }
    @Override
    public void desplazarse() {
        System.out.println("El auto se desplaza por la carretera");
    }
    @Override
    public void tocarBocina() {
        System.out.println("Bocina del auto: pi pi.");
    }
}

