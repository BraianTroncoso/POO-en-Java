package Logica;

public class Bulbasur extends Pokemon implements IPlanta{
    public Bulbasur() {
    }

    @Override
    protected void atacarPlacaje() {
        System.out.println("Hola soy bulbasaur y este es mi ataque placaje");
    }

    @Override
    protected void atacarAraniazo() {
        System.out.println("Hola soy bulbasaur y este es mi ataque arañazo");
    }

    @Override
    protected void atacarMordisco() {
        System.out.println("Hola soy bulbasaur y este es mi ataque mordisco");
    }

    @Override
    public void atacarDrenaje() {
        System.out.println("Hola soy bulbasaur y este es mi ataque drenaje");

    }

    @Override
    public void atacarParalizar() {
        System.out.println("Hola soy bulbasaur y este es mi ataque Paralizar");

    }
}
