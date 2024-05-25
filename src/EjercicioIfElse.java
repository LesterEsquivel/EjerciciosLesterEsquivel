import java.util.Scanner;

public class EjercicioIfElse {
    private Scanner scanner;

    public EjercicioIfElse() {
        scanner = new Scanner(System.in);
    }

    public void determinarPositivoNegativoCero() {
        System.out.println("Ingrese un número:");
        int numero = scanner.nextInt();
        if (numero > 0) {
            System.out.println("El número es positivo.");
        } else if (numero < 0) {
            System.out.println("El número es negativo.");
        } else {
            System.out.println("El número es cero.");
        }
    }

    public void verificarParImpar() {
        System.out.println("Ingrese un número:");
        int numero = scanner.nextInt();
        if (numero % 2 == 0) {
            System.out.println("El número es par.");
        } else {
            System.out.println("El número es impar.");
        }
    }

    public void mostrarMayorDeTres() {
        System.out.println("Ingrese tres números:");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        int mayor;
        if (num1 >= num2 && num1 >= num3) {
            mayor = num1;
        } else if (num2 >= num1 && num2 >= num3) {
            mayor = num2;
        } else {
            mayor = num3;
        }
        System.out.println("El mayor de los tres números es: " + mayor);
    }

    public void determinarBisiesto() {
        System.out.println("Ingrese un año:");
        int año = scanner.nextInt();
        if ((año % 4 == 0 && año % 100 != 0) || (año % 400 == 0)) {
            System.out.println("El año es bisiesto.");
        } else {
            System.out.println("El año no es bisiesto.");
        }
    }
}
