public class EjerciciosJavaLesterEsquivel {
    public static void main(String[] args) {
        EjercicioIfElse ejercicioIfElse = new EjercicioIfElse();
        EjercicioWhile ejercicioWhile = new EjercicioWhile();
        EjercicioFor ejercicioFor = new EjercicioFor();

        // Ejercicios con if-else
        ejercicioIfElse.determinarPositivoNegativoCero();
        ejercicioIfElse.verificarParImpar();
        ejercicioIfElse.mostrarMayorDeTres();
        ejercicioIfElse.determinarBisiesto();

        // Ejercicios con while
        ejercicioWhile.imprimirNumerosAscendente();
        ejercicioWhile.imprimirNumerosHasta();
        ejercicioWhile.sumarNumerosPositivos();
        ejercicioWhile.generarFibonacci();

        // Ejercicios con for
        ejercicioFor.imprimirPares();
        ejercicioFor.mostrarTablaMultiplicar();
        ejercicioFor.sumarParesHastaN();
        ejercicioFor.calcularFactorial();
    }
}
