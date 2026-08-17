package clase_02.Guia1_1_4;
//Ejercicio 07
public class caso05_Mascota {
    private String name;
    private String tipe;
    private String owner;
    private Integer age;
    private String lastVacum;
    private String nextControl;


    public caso05_Mascota(String name, String tipe, String owner, Integer age) {
        this.name = name;
        this.tipe = tipe;
        this.owner = owner;
        this.age = age;
    }







    // getters y setters basicos. No se me ocurrio que crear aca.

    public String getName() {
        return name;
    }

    public String getTipe() {
        return tipe;
    }

    public String getOwner() {
        return owner;
    }

    public Integer getAge() {
        return age;
    }

    public String getLastVacum() {
        return lastVacum;
    }

    public String getNextControl() {
        return nextControl;
    }

    public void setLastVacum(String lastVacum) {
        this.lastVacum = lastVacum;
    }

    public void setNextControl(String nextControl) {
        this.nextControl = nextControl;
    }
}
