import java.util.Scanner;

public class MultiplicacaoVetores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] vetor1 = new int[10];
        int[] vetor2 = new int[10];
        int[] resultado = new int[10];

        // Leitura do primeiro vetor
        System.out.println("Digite 10 números para o primeiro vetor:");
        for (int i = 0; i < 10; i++) {
            System.out.print("vetor1[" + i + "] = ");
            vetor1[i] = scanner.nextInt();
        }

        // Leitura do segundo vetor
        System.out.println("\nDigite 10 números para o segundo vetor:");
        for (int i = 0; i < 10; i++) {
            System.out.print("vetor2[" + i + "] = ");
            vetor2[i] = scanner.nextInt();
        }

        // Multiplicação e exibição dos resultados
        System.out.println("\nResultado da multiplicação dos termos:");
        for (int i = 0; i < 10; i++) {
            resultado[i] = vetor1[i] * vetor2[i];
            System.out.println("vetor1[" + i + "] * vetor2[" + i + "] = " + resultado[i]);
        }

        scanner.close();
    }
}
