import java.util.Scanner;

public class ConcessionariaTeste {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Carro novocarro = new Carro();

        System.out.println("Modelo: ");
        novocarro.setModelo(sc.nextLine());

        System.out.println("Marca: ");
        novocarro.setMarca(sc.nextLine());

        System.out.println("Ano: ");
        novocarro.setAno(Integer.parseInt(sc.nextLine()));

        System.out.println("preco");
        novocarro.setPreco(Double.parseDouble(sc.next()));

        novocarro.imprimir();


    }
}
