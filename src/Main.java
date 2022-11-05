public class Main {
    public static void main(String[] args) {
        int numFactorial = 10;
        int resultado = suma(2,3,4);
        System.out.println("Hello world!: resultado --> "+resultado);
        Coche miCoche = new Coche();
        System.out.println("Mi coche tiene: "+ miCoche.ruedas + " ruedas");
        miCoche.quitarRueda();
        System.out.println("Ahora mi coche tiene " + miCoche.ruedas + " ruedas");
        System.out.println("El factorial de " + numFactorial + " es " + factorial(numFactorial) );
    }
    public static int suma(int a, int b, int c) {
        return a + b +c;
    }
    public static int factorial(int n) {
        if ( n == 1 ) return 1;
        return n * factorial(n - 1);
    }
}
class Coche {
    public int ruedas = 4;
    public int puertas = 4;
    public void quitarRueda() {
        this.ruedas--;
    }
    public void agregarPuerta() {
        this.puertas++;
    }
}
