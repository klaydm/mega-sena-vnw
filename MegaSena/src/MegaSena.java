import java.util.Random;
import java.util.Scanner;

public class MegaSena {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] numerosUsuario = new int[7];
        int[] numerosSorteados = new int[7];
        int acertos = 0;

        // Pega os números do usuário
        for (int i = 0; i < numerosUsuario.length; i++) {

            System.out.println("Digite o " + (i + 1) + "º número: ");
            numerosUsuario[i] = sc.nextInt();

            while (numerosUsuario[i] < 0 || numerosUsuario[i] > 100) {

                System.out.println("O número deve ser um número inteiro entre 0 e 100.");
                numerosUsuario[i] = sc.nextInt();

            }

        }

        // Sorteio dos números
        Random random = new Random();

        for (int i = 0; i < numerosSorteados.length; i++) {

            numerosSorteados[i] = random.nextInt(101);

        }

        // Compara os números
        for (int k : numerosUsuario) {

            for (int numeroSorteado : numerosSorteados) {

                if (k == numeroSorteado) {

                    acertos++;

                }

            }

        }

        // Resultado do jogo
        System.out.println("Números sorteados: ");
        for (int numeroSorteado : numerosSorteados) {

            System.out.print(numeroSorteado + " ");

        }
        System.out.println();
        System.out.println("Números acertados: ");
        for (int i = 0; i < numerosUsuario.length; i++) {

            if (numerosUsuario[i] == numerosSorteados[i]) {

                System.out.print(numerosUsuario[i] + " ");

            }

        }
        System.out.println();
        switch (acertos) {
            case 5 -> System.out.println("Você acertou 5 números! Parabéns! O seu prêmio é de R$10.000,00.");
            case 6 -> System.out.println("Você acertou 6 números! Parabéns! O seu prêmio é de R$50.000,00.");
            case 7 -> System.out.println("Você acertou 7 números! Parabéns! O seu prêmio é de R$200.000,00.");
            default -> System.out.println("Você não acertou nenhum número.");
        }

    }

}
