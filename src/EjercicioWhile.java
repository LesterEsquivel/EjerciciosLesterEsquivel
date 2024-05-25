import java.util.Scanner;

public class EjercicioWhile {
    private Scanner scanner;

    public EjercicioWhile() {
        scanner = new Scanner(System.in);
    }

    public void imprimirNumerosAscendente() {
        int i = 1;
        while (i <= 20) {
            System.out.println(i);
            i++;
        }
    }

    public void imprimirNumerosHasta() {
        System.out.println("Ingrese un número:");
        int numero = scanner.nextInt();
        int i = 1;
        while (i <= numero) {
            System.out.println(i);
            i++;
        }
    }

    public void sumarNumerosPositivos() {
        int suma = 0;
        int numero;
        System.out.println("Ingrese números positivos para sumar. Ingrese un número negativo para detener:");
        while (true) {
            numero = scanner.nextInt();
            if (numero < 0) {
                break;
            }
            suma += numero;
        }
        System.out.println("La suma de los números positivos es: " + suma);
    }

    public void generarFibonacci() {
        System.out.println("Ingrese un número:");
        int limite = scanner.nextInt();
        int a = 0, b = 1;
        while (a <= limite) {
            System.out.println(a);
            int temp = a;
            a = b;
            b = temp + b;
        }
    }
}
