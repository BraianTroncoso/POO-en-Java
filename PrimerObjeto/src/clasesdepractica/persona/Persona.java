package clasesdepractica.persona;
/*
2) Haz una clase llamada Persona que siga las siguientes condiciones:

Sus atributos son: nombre, edad, DNI, sexo (H hombre, M mujer), peso y altura.
No queremos que se accedan directamente a ellos. Piensa que modificador de acceso es el más adecuado,
también su tipo. Si quieres añadir algún atributo puedes hacerlo.

Por defecto, todos los atributos menos el DNI serán valores por defecto según su tipo
(0 números, cadena vacía para String, etc.). Sexo sera hombre por defecto, usa una constante para ello.

Se implantaran varios constructores:
Un constructor por defecto.
Un constructor con el nombre, edad y sexo, el resto por defecto.
Un constructor con todos los atributos como parámetro.

Los métodos que se implementaran son:
calcularIMC(): calculara si la persona esta en su peso ideal (peso en kg/(altura^2  en m)),
si esta fórmula devuelve un valor menor que 20, la función devuelve un -1,
si devuelve un número entre 20 y 25 (incluidos), significa que esta por debajo de su peso ideal
la función devuelve un 0  y si devuelve un valor mayor que 25 significa que tiene sobrepeso,
la función devuelve un 1. Te recomiendo que uses constantes para devolver estos valores.


esMayorDeEdad(): indica si es mayor de edad, devuelve un booleano.

comprobarSexo(char sexo): comprueba que el sexo introducido es correcto.
Si no es correcto, sera H. No sera visible al exterior.

toString(): devuelve toda la información del objeto.
generaDNI(): genera un número aleatorio de 8 cifras, genera a partir de este su número su letra correspondiente.
Este método sera invocado cuando se construya el objeto. Puedes dividir el método para que te sea más fácil.
No será visible al exterior.
Métodos set de cada parámetro, excepto de DNI.
 */
import  java.lang.Math;
public class Persona {
    private String nombre = "";
    private final String sexo = "H";
    private int edad = 0, peso = 0, altura = 0;
    private double dni;

/*    public Persona(){}*/

    public Persona(String nombre, int edad, int peso, int altura, int dni) {
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
        this.altura = altura;
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSexo() {
        return sexo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public double getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public int calcularIMC(int peso, int altura, int pIdeal){
        this.peso = peso;
        this.altura = altura;
        pIdeal = peso / (altura*altura);
        if (pIdeal < 20){
            pIdeal = -1;
        } else if (pIdeal >= 20 && pIdeal <=25) {
            pIdeal = 0;
        }else {
            pIdeal = 1;
        }
    return pIdeal;
    }
    public int esMayorDeEdad(int edad){
        this.edad = edad;
        if (edad >= 18){
           return edad = 1;
        } else {
            edad = 0;
        }
        return edad;
    }

    public String comprobarSexo(String sexo){
        if (sexo != "H"){
            sexo = "H";
        }
        sexo = this.sexo;
    return sexo;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", sexo='" + sexo + '\'' +
                ", edad=" + edad +
                ", peso=" + peso +
                ", altura=" + altura +
                ", dni=" + dni +
                '}';
    }
    public double generaDNI(double dni, int codigoAscii){
        this.dni = dni;
        dni = (Math.random() * 0) + 8;
        dni = (int)Math.floor(Math.random()*(122 -
                97)+97);



        return dni;
    }

}
