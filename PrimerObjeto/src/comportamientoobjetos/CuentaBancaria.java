package comportamientoobjetos;

public class CuentaBancaria {
    public String CBU;
    public String alias;
    public double saldo;

    public void mostrarDatos(){
        System.out.println(CBU + " " + alias + " " + saldo);
    }
    public double obtenerSaldo(){ // Todo metodo que devuelva un valor distinto a void, se debe ingresar un return
        return saldo;
    }
    public void depositar(double monto){
        if (monto > 0){
            saldo += saldo + monto;
        }
    }
    public boolean saldoDisponible(double monto){
        return saldo >= monto;
    }

    public void extraer (double monto){
        if(saldoDisponible(monto)){
            saldo -= monto;
        }
    }
}
