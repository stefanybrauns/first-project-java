import java.util.Random;
import java.util.Scanner;

public class NovoPrograma {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        int numeroAleatorio = new Random().nextInt(100);
        int tentativas = 0;
        int numeroDigitado = 0;

        while (tentativas <= 5) {
            System.out.println("Adivinhe o número de 0 e 100: ");
            numeroDigitado = leitura.nextInt();

            if (numeroDigitado < numeroAleatorio) {
                tentativas++;
                System.out.println("O número aleatório é maior que o número digitado");
            } else if (numeroDigitado > numeroAleatorio) {
                tentativas++;
                System.out.println("O número aleatório é menor que o número digitado");
            } else {
                break;
            }
            if (tentativas == 5 && numeroDigitado != numeroAleatorio) {
                System.out.println("Você não conseguiu acertar o número em 05 tentativas. O número era: " + numeroAleatorio);
            }
        }
    }
}
