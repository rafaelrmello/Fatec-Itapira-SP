import java.util.Scanner;

public class BibliotecaTeste {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Livro novolivro = new Livro();
        System.out.println("Título: ");
        novolivro.setTitulo(sc.nextLine());
        System.out.println("Autor: ");
        novolivro.setAutor(sc.nextLine());
        System.out.println("Ano da publicação: ");
        novolivro.setAnoPublicacao(Integer.parseInt(sc.nextLine()));
        System.out.println("Preço: ");
        novolivro.setPreco(Float.parseFloat(sc.nextLine()));



        novolivro.imprimir();

    }

}
