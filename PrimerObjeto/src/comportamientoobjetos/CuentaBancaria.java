package comportamientoobjetos;

public class CuentaBancaria {
    private String CBU;
    private String alias;
    private double saldo;
    private double prestamo = 10000;

    public void mostrarDatos(){
        System.out.println(CBU + " " + alias + " " + saldo + " " + prestamo);
    }
    public double obtenerSaldo(){ // Todo metodo que devuelva un valor distinto a void, se debe ingresar un return
        return saldo;
    }
    public void depositar(double monto){
        if (monto > 0){
            saldo += saldo + monto;
        }
    }
    private boolean saldoDisponible(double monto){
        return saldo >= monto;
    }

    public void extraer (double monto){
        if(saldoDisponible(monto)){
            saldo -= monto;
        }
    }

    public void establecerAlias(String nuevoAlias) {
        if(nuevoAlias != null){
            alias = nuevoAlias;
        }
    }

    public String obtenerAlias(){
        return alias;
    }
}
