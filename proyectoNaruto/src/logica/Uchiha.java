package logica;

public class Uchiha extends Shinobi implements IGenjutsu{


    public Uchiha() {
    }

    @Override
    protected void ataqueKunai() {
        System.out.println("Uchiha Ataque kunai");
    }

 
    public void ataqueSorpresa() {
        System.out.println("Uchiha Ataque sorpresa");

    }

    @Override
    protected void ataqueCuerpoaCuerpo() {
        System.out.println("Uchiha Ataque cuerpo a cuerpo");

    }

    @Override
    public void ataqueGenjutsu(){
        System.out.println("Uchiha Ataque genjutsu");
    }

    @Override
    public String ataqueAmaretsu() {
        System.out.println("Uchiha Ataque Amaretsu");
        return null;
    }


}
