import java.util.Scanner;

public class PlaylistTeste {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Musica novamusica = new Musica();

        System.out.println("Nome: ");
        novamusica.setNome(sc.nextLine());
        System.out.println("Artista: ");
        novamusica.setArtista(sc.nextLine());
        System.out.println("Duração: ");
        novamusica.setDuracao(Double.parseDouble(sc.nextLine()));
        System.out.println("Genêro: ");
        novamusica.setGenero(sc.nextLine());

        novamusica.imprimir();





    }
}
