package logica;

public class Uzumaki extends Shinobi implements INinjutsu {

    public Uzumaki() {
    }

    @Override
    protected void ataqueKunai() {
        System.out.println("Uzumaki Ataque kunai");
    }

    @Override
    protected void ataqueSorpresa() {
        System.out.println("Uzumaki Ataque sorpresa");

    }

    @Override
    protected void ataqueCuerpoaCuerpo() {
        System.out.println("Uzumaki Ataque cuerpo a cuerpo");

    }

    @Override
    public void ataqueConRasengan(){
        System.out.println("Uzumaki Ataque rasengan");

    }

    @Override
    public void ataqueConClonesSombras() {
        System.out.println("Uzumaki Ataque clones de sombras");
    }
}
