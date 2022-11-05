public class Main {
    public static void main(String[] args) {
        int num1 = 2, num2 = 3, num3 = 4;
        int resultado = suma(num1, num2, num3);
        System.out.println("resultado de sumar " + num1 + ", " + num2 + " y " + num3 + " es: " + resultado);
        Coche miCoche = new Coche();
        System.out.println("Mi coche tiene: "+ miCoche.puertas + " puertas");
        miCoche.agregarPuerta();
        System.out.println("Ahora mi coche tiene " + miCoche.puertas + " puertas");
    }
    public static int suma(int a, int b, int c) {
        return a + b +c;
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
