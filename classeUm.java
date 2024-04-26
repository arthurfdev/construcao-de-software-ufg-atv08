import java.util.InputMismatchException;
import java.util.Scanner;

public class Um {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Digite o primeiro número: ");
            double numero1 = scanner.nextDouble();

            System.out.print("Digite o segundo número: ");
            double numero2 = scanner.nextDouble();

            if (numero2 == 0) {
                throw new ArithmeticException("Divisão por zero!");
            }

            double resultado = numero1 / numero2;
            System.out.println("Resultado: " + resultado);
        } catch (InputMismatchException e) {
            System.out.println("Erro: Valor informado não é numérico.");
        } catch (ArithmeticException e) {
            System.out.println("Erro: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
