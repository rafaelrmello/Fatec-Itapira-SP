import java.util.Scanner;

public class LojaTeste {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Produto novoproduto = new Produto();
        System.out.println("Nome: ");
        novoproduto.setNome(sc.nextLine());
        System.out.println("Descrição: ");
        novoproduto.setDescricao(sc.nextLine());
        System.out.println("Quantidade em estoque: ");
        novoproduto.setQuantidadeEmEstoque(Double.parseDouble(sc.nextLine()));
        System.out.println("Preço Unitário");
        novoproduto.setPrecoUnitario(Double.parseDouble(sc.nextLine()));

        novoproduto.imprimir();



    }


}
