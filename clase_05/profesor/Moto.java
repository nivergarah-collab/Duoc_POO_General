package clase_05.profesor;

public class Moto extends Vehiculo implements TocableBocina
{
    private boolean tieneParabrisas;
    public Moto(String marca, String modelo, int
            velocidadMaxima, boolean tieneParabrisas) {
        super(marca, modelo, velocidadMaxima);
        this.tieneParabrisas = tieneParabrisas;
    }
    public boolean isTieneParabrisas() {
        return tieneParabrisas;
    }
    public void hacerCaballito() {
        System.out.println("La moto está haciendo un caballito");
    }
    @Override
    public void desplazarse() {
        System.out.println("La moto se desplaza entre calles y avenidas");
    }
    @Override
    public void tocarBocina() {
        System.out.println("Bocina de la moto: bip bip.");
    }
}