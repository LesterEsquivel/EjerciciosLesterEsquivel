import java.util.Scanner;

public class EjercicioFor {
    private Scanner scanner;

    public EjercicioFor() {
        scanner = new Scanner(System.in);
    }

    public void imprimirPares() {
        for (int i = 2; i <= 20; i += 2) {
            System.out.println(i);
        }
    }

    public void mostrarTablaMultiplicar() {
        System.out.println("Ingrese un número:");
        int numero = scanner.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }
    }

    public void sumarParesHastaN() {
        System.out.println("Ingrese un número:");
        int n = scanner.nextInt();
        int suma = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                suma += i;
            }
        }
        System.out.println("La suma de todos los números pares desde 1 hasta " + n + " es: " + suma);
    }

    public void calcularFactorial() {
        System.out.println("Ingrese un número:");
        int numero = scanner.nextInt();
        int factorial = 1;
        for (int i = 1; i <= numero; i++) {
            factorial *= i;
        }
        System.out.println("El factorial de " + numero + " es: " + factorial);
    }
}
