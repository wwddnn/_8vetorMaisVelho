import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantas pessoas você vai digitar ");
        int n = sc.nextInt();
        //dados das pessoas
        String[] nomes = new String[n];
        int[] idades = new int[n];
        for (int i = 0; i < n ; i++) {
            System.out.println("Dados da " + (i+1) + "°" + " pessoa");
            System.out.print("Nome ");
            nomes[i] = sc.next();
            System.out.print("Idade ");
            idades[i] = sc.nextInt();
        }
        //pessoa mais velha
        int maisVelha = idades[0];
        int posicaoMaior = 0;
        for (int i = 0; i < n ; i++) {
            if (idades[i] > maisVelha){
                maisVelha = idades[i];
                posicaoMaior = i;
            }
        }
        System.out.println("Pessoa mais velha ");
        System.out.println(maisVelha);
    sc.close();
    }
}
