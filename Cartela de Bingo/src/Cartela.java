import java.util.Random;

public class Cartela {
    public static void main(String[] args) {
        int tamanho = 5;
        int[][] cartela = new int[tamanho][tamanho];

        Random random = new Random();

        int valorCentral = -1;
        cartela[tamanho / 2][tamanho / 2] = valorCentral;

        int valorMinimo = 1;
        int valorMaximo = 75;


        boolean[] numerosGerados = new boolean[valorMaximo + 1];

        // Preencha a cartela com números aleatórios não repetidos
        for (int i = 0; i < tamanho; i++) {
            for (int j = 0; j < tamanho; j++) {
                if (cartela[i][j] != valorCentral) {
                    int numeroAleatorio;
                    do {
                        numeroAleatorio = random.nextInt(valorMaximo - valorMinimo + 1) + valorMinimo;
                    } while (numerosGerados[numeroAleatorio]);
                    cartela[i][j] = numeroAleatorio;
                    numerosGerados[numeroAleatorio] = true;
                }
            }
        }

        // Imprima a cartela
        for (int i = 0; i < tamanho; i++) {
            for (int j = 0; j < tamanho; j++) {
                System.out.printf("%2d ", cartela[i][j]);
            }
            System.out.println();
        }
    }
}