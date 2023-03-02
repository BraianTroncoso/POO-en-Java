package logica;

public class principal {
    public static void main(String[] args) {
        Uchiha itachi = new Uchiha();

        System.out.println("Soy itachi");
        itachi.ataqueAmaretsu();
        itachi.ataqueSorpresa();
        itachi.ataqueGenjutsu();


        Uzumaki naruto = new Uzumaki();

        System.out.println("Soy naruto");
        naruto.ataqueConRasengan();
        naruto.ataqueConClonesSombras();
        naruto.ataqueKunai();

        Human lee = new Human();

        System.out.println("Soy lee");
        lee.sietePuertas();
        lee.ataqueKunai();
        lee.superPatada();

        Uzumaki minato = new Uzumaki();

        System.out.println("Soy minato");
        minato.ataqueConRasengan();
        minato.ataqueKunai();
        minato.ataqueSorpresa();

        Uchiha sasuke = new Uchiha();

        System.out.println("Soy sasuke");
        sasuke.ataqueAmaretsu();
        sasuke.ataqueSorpresa();
        sasuke.ataqueKunai();

        Uzumaki boruto = new Uzumaki();

        System.out.println("Soy boruto");
        boruto.ataqueConRasengan();
        boruto.ataqueConClonesSombras();
        boruto.ataqueCuerpoaCuerpo();
    }
}
