import java.util.Scanner;

public class Atv5 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        char letra;
        String novaPalavra = "";

        System.out.println("Insira uma palavra e ela ficará invertida.");
        String palavra = ler.next();

        for(int i=0;i<palavra.length();i++){
            letra = palavra.charAt(i);
            novaPalavra = letra+novaPalavra;
        }
        System.out.println("Palavra Original:" + palavra);
        System.out.println("Palavra invertida:" + novaPalavra);
    }
}
