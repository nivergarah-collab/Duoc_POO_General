package clase_05.profesor;

    public abstract class Vehiculo {
        protected String marca;
        protected String modelo;
        protected int velocidadMaxima;

        public Vehiculo(String marca, String modelo, int
                velocidadMaxima) {
            this.marca = marca;
            this.modelo = modelo;
            this.velocidadMaxima = velocidadMaxima;
        }

        public String getMarca() {
            return marca;
        }

        public String getModelo() {
            return modelo;
        }

        public int getVelocidadMaxima() {
            return velocidadMaxima;
        }
        public abstract void desplazarse();

        public void mostrarDatos() {
            System.out.println("Marca: " + marca);
            System.out.println("Modelo: " + modelo);
            System.out.println("Velocidad máxima: " +
                    velocidadMaxima);
        }

    }
