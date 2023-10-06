package model;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class GerenciarProduto {
    public static void main(String[] args) {
        List<Categoria> categorias = new ArrayList<>();
        List<Produto> produtos = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Menu");
            System.out.println("1. Cadastrar a categoria");
            System.out.println("2. Cadastrar o produto");
            System.out.println("3. Dar entrada no produto no estoque");
            System.out.println("4. Dar saída do produto do estoque");
            System.out.println("5. Mostrar o saldo disponível de todos os produtos");
            System.out.println("6. Sair");

            int escolha = scanner.nextInt();

            switch (escolha) {
                case 1:
                    System.out.print("Código da categoria: ");
                    int codigoCategoria = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Nome da categoria: ");
                    String nomeCategoria = scanner.nextLine();

                    Categoria categoria = new Categoria(codigoCategoria, nomeCategoria);
                    categorias.add(categoria);
                    break;

                case 2:
                    System.out.print("Código do produto: ");
                    int codigoProduto = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Nome do produto: ");
                    String nomeProduto = scanner.nextLine();
                    System.out.print("Preço do produto: ");
                    double precoProduto = scanner.nextDouble();
                    System.out.print("Quantidade em estoque: ");
                    int quantidadeProduto = scanner.nextInt();
                    System.out.print("Código da categoria do produto: ");
                    int codigoCategoriaProduto = scanner.nextInt();
                    Categoria categoriaProduto = null;
                    for (Categoria cat : categorias) {
                        if (cat.getCodigoCategoria() == codigoCategoriaProduto) {
                            categoriaProduto = cat;
                            break;
                        }
                    }

                    if (categoriaProduto != null) {
                        Produto produto = new Produto(codigoProduto, nomeProduto, precoProduto, quantidadeProduto, categoriaProduto);
                        produtos.add(produto);
                        System.out.println("O Produto foi cadastrado com sucesso!");
                    } else {
                        System.out.println("A Categoria não foi encontrada.");
                    }
                    break;

                case 3:
                    System.out.print("Código do produto: ");
                    int codigoEntrada = scanner.nextInt();
                    System.out.print("Quantidade: ");
                    int qtdEntrada = scanner.nextInt();
                    for (Produto produto : produtos) {
                        if (produto.getCodigo() == codigoEntrada) {
                            produto.entradaEstoque(qtdEntrada);
                            System.out.println("Entrada de estoque realizada com sucesso!");
                            break;
                        }
                    }
                    break;

                case 4:
                    System.out.print("Código do produto: ");
                    int codigoSaida = scanner.nextInt();
                    System.out.print("Quantidade para dar saída: ");
                    int qtdSaida = scanner.nextInt();
                    for (Produto produto : produtos) {
                        if (produto.getCodigo() == codigoSaida) {
                            produto.saidaEstoque(qtdSaida);
                            System.out.println("Saída de estoque realizada com sucesso!");
                            break;
                        }
                    }
                    break;

                case 5:
                    System.out.println("Saldo disponível de todos os produtos:");
                    for (Produto produto : produtos) {
                        System.out.println(produto.toString());
                    }
                    break;

                case 6:
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Escolha uma opção novamente.");
            }
        }
    }
}
