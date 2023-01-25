package encapsulamiento;

public class Lavadora {
    private int kgRopa = 0, llenadoCompleto = 0, tipoDeRopa = 0, lavadoCompleto = 0, secadoCompleto = 0;


    public Lavadora(int kgRopa, int tipoDeRopa) {
        this.kgRopa = kgRopa;
        this.tipoDeRopa = tipoDeRopa;
    }

    private void LlenadoDeAgua(){ // Este método sirve para llenar.
        if (kgRopa <= 12){
            llenadoCompleto = 1;
            System.out.println("Llenando...");
            System.out.println("Llenado completo.");
        }else{
            System.out.println("La carga de ropa es muy pesada, reduce la carga.");
        }
    }
    private void Lavado(){ // Este método sirve para lavar.
        LlenadoDeAgua();
        if (llenadoCompleto == 1){
            if(tipoDeRopa == 1){
                System.out.println("Ropa blanca / Lavado suave.");
                System.out.println("Lavando...");
                lavadoCompleto = 1;
            }else if(tipoDeRopa == 2){
                System.out.println("Ropa de color / Lavado intenso.");
                System.out.println("Lavando...");
                lavadoCompleto = 1;
            }else{
                System.out.println("El tipo de ropa no esta disponible.");
                System.out.println("Se lavara como ropa de color / Lavado intenso.");
                lavadoCompleto = 1;
            }
        }
    }
    private void Secado(){ // Este método sirve para secar.
        Lavado();
        if(lavadoCompleto == 1){
            System.out.println("Secando...");
            secadoCompleto = 1;
        }
    }

    public void CicloFinalizado(){ // Este método sirve para confirmar el ciclo finalizado.
        Secado();
        if(secadoCompleto == 1){
            System.out.println("Tu ropa está lista.");
        }
    }

    // Setter y Getter

    public int getTipoDeRopa(){
        return tipoDeRopa;
    }
    public void setTipoDeRopa(int tipoDeRopa){
        this.tipoDeRopa = tipoDeRopa;
    }

}
