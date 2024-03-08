import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Atv2 {

    public static String fibonacci(int n) {
        // Lista para armazenar os números da sequência de Fibonacci
        List<Integer> fibonacciSequence = new ArrayList<>();
        // Primeiros valores da sequencia
        fibonacciSequence.add(0);
        fibonacciSequence.add(1);

        // sequencia até o número passado
        for (int i = 2; i <= n; i++) {
            Integer anterior1 = fibonacciSequence.get(i - 1);
            Integer anterior2 = fibonacciSequence.get(i - 2);
            fibonacciSequence.add(anterior1 + anterior2);
        }

        // Verifica se o numero está na list
        return (fibonacciSequence.contains(n)) ? "O número está contido na sequencia de Fibonacci"
                : "O número não está contido na sequencia de Fibonacci";
    }

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Insira o numero para verificar se existe na sequencia de fibonacci");
        int numero = ler.nextInt();

        System.out.println(fibonacci(numero));
    }

}
