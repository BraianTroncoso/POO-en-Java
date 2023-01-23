package primerobjeto;

import comportamientoobjetos.CuentaBancaria;
/*
Toda clase en java hereda de la superclase Object por ende podemos acceder a unos métodos por defectos en esa clase

 */
public class Principal {
    public static void main(String[] args) {
        CuentaBancaria cb = new CuentaBancaria();

        cb.mostrarDatos();
        cb.CBU = "25505d940009847835201";
        cb.alias = "miCuenta";
        cb.mostrarDatos();
        //cb.obtenerSaldo();
        System.out.println(cb.obtenerSaldo());
        cb.depositar(200);
        System.out.println(cb.obtenerSaldo());
        cb.depositar(-50);
        System.out.println(cb.obtenerSaldo());
        cb.extraer(180);
        System.out.println(cb.obtenerSaldo());
        cb.extraer(100);
        System.out.println(cb.obtenerSaldo());

    }
}
