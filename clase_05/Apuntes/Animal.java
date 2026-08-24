package clase_05.Apuntes;

public class Animal {
    private String name;
    private int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void hablar(){
        System.out.println("El animal intento hablar pero no sabe quien es");

    }

    public void caminar(){
        System.out.println("El animal esta camiando");
    }




}
