import java.util.Scanner;

public class Exercicios {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha de 1 a 10: ");
        int numeroInteiro = scanner.nextInt();

        for (int i = 0; i < 11; i++) {
            System.out.println(numeroInteiro + " x " + i + " = " + (numeroInteiro * i));
        }


        /*System.out.println("Digite um número inteiro:");
        int numeroDigitadoPrimeiro = leitura.nextInt();

        System.out.println("Digite outro número inteiro: ");
        int numeroDigitadoSegundo = leitura.nextInt();

        if (numeroDigitadoPrimeiro > numeroDigitadoSegundo) {
            System.out.println("O primeiro número digitado é maior que o segundo");
        } else if (numeroDigitadoPrimeiro < numeroDigitadoSegundo){
            System.out.println("O segundo número é maior que o primeiro");
        } else if (numeroDigitadoPrimeiro != numeroDigitadoSegundo) {
            System.out.println("Os números são diferentes");
        } else {
            System.out.println("Os números são iguais");
        } */

        /*System.out.println("Digite um número: ");
        int numeroDigitado = leitura.nextInt();

        if (numeroDigitado > 0) {
            System.out.println("Número positivo");
        } else {
            System.out.println("Número negativo");

         */


    }
}
