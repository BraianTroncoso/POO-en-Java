package logica;

public class Human extends Shinobi implements ITaijutsu{
    public Human() {
    }

    @Override
    protected void ataqueKunai() {
        System.out.println("Humano Ataque kunai");
    }


    public void ataqueSorpresa() {
        System.out.println("Humano Ataque sorpresa");

    }

    @Override
    protected void ataqueCuerpoaCuerpo() {
        System.out.println("Humano Ataque cuerpo a cuerpo");

    }

    @Override
    public void superPatada() {
        System.out.println("Ataque patada");
    }

    @Override
    public void sietePuertas() {
        System.out.println("Ataque siete puertas");
    }
}
