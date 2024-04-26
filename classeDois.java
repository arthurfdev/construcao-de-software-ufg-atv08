import java.util.InputMismatchException;
import java.util.Scanner;

public class VetorInteiros {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] vetor = new int[10];
        int index = 0;
        boolean continuaInserindo = true;

        try {
            while (continuaInserindo && index < 10) {
                System.out.print("Digite um valor inteiro (ou 0 para sair): ");
                int valor = scanner.nextInt();

                if (valor == 0) {
                    continuaInserindo = false;
                } else {
                    vetor[index] = valor;
                    index++;
                }
            }

            System.out.println("\nValores inseridos:");
            for (int i = 0; i < index; i++) {
                System.out.println(vetor[i]);
            }

        } catch (InputMismatchException e) {
            System.out.println("Erro: Valor informado não é um inteiro.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Erro: Você informou mais que 10 valores.");
        } finally {
            scanner.close();
        }
    }
}
