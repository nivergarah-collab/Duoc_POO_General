package clase_04.guia_1_2_4.transcription;

    public class Auto_tr {
        private String modelo;
        private String marca;
        private String color;
        private int anio;
        private double km;
        private String tipo;

        public Auto_tr(String modelo, String marca, String color, int anio, double km, String tipo) {
            this.modelo = modelo;
            this.marca = marca;
            this.color = color;
            this.anio = anio;
            this.km = km;
            this.tipo = tipo;
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
    }

