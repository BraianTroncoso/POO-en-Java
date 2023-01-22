package primerobjeto;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Auto a = new Auto();
        System.out.println(a.patente + " " + a.color + " "+ a.kms + " "+ a.conAire);
        // java le asigna un estado inicial a todo objeto de cualquier tipo
        // String = null; Numericos = 0; Boolean = false;
        a.patente = "abc123";
        a.color = "verde";
        a.kms = 500;
        a.conAire = true;
        System.out.println(a.patente + " " + a.color + " "+ a.kms + " "+ a.conAire);
        Auto otroAuto;
        otroAuto = a;
        otroAuto = null; //Los punteros son variables que hacen referencia a un lugar determinado de memoria
                        // En el ejemplo de null, le decimos que acceda a una referencia nula por ende
                        // causa el famoso error NullPointerException;
        System.out.println(a);
        System.out.println(otroAuto); //La identidad del objeto es unico, y se puede modificar con otra variable
                                    //Que haga referencia a la variable que tiene asignada el objeto
                                    //Un objeto se almacena en varios puntos de memoria
        System.out.println(a.color);
        otroAuto.color = "Azul";
        System.out.println(a.color);


    }
}