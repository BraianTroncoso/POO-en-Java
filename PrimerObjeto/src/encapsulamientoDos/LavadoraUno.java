package encapsulamientoDos;

import encapsulamiento.Lavadora;

import java.util.Scanner;

public class LavadoraUno {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("¿La ropa es blanca o de color?");
        System.out.println("Presiona 1 = Ropa blanca / Presiona 2 = Ropa de color");
        int tipoDeRopa = entrada.nextInt();

        System.out.println("¿Cuantos kilos de ropa?");
        int kgRopa = entrada.nextInt();

        Lavadora mensajero = new Lavadora(tipoDeRopa,kgRopa);
        mensajero.setTipoDeRopa(2);
        System.out.println("El tipo de ropa es: " + mensajero.getTipoDeRopa());
        mensajero.CicloFinalizado();

    }
}