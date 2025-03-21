import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        int opcao;
        Scanner entrada =  new Scanner(System.in);
        do{
            System.out.println("1-Criar um produto");
            System.out.println("2-Alterar um produto");
            System.out.println("3-Excluir um produto");
            System.out.println("4-Listar os produtos");
            System.out.println("5-Sair");
            opcao = entrada.nextInt();

            List<Produto> listaProdutos = new ArrayList<Produto>();
            

            switch (opcao) {
                case 1:

                    
                    System.out.println("Digite o nome do produto:");
                    String nome = entrada.nextLine();
                    entrada.nextLine();
                    System.out.println("Digite o preço do produto:");
                    String preco = entrada.nextLine();
                    System.out.println("Digite a marca do produto:");
                    String marca = entrada.nextLine();
                    System.out.println("Digite o tamanho do produto:");
                    String tamanho = entrada.nextLine();
                    System.out.println("Digite a largura do produto:");
                    String largura = entrada.nextLine();

                    listaProdutos.add(new Produto(nome, preco, marca, tamanho, largura));
                    
                break;

                case 2:
                    System.out.println("Escolha a posição do produto:");
                    int p = entrada.nextInt();

                    Produto produto = listaProdutos.get(p);

                    System.out.println("Digite o novo nome do produto:");
                    nome = entrada.nextLine();
                    System.out.println("Digite o novo preço do produto:");
                    preco = entrada.nextLine();
                    System.out.println("Digite a nova marca do produto:");
                    marca = entrada.nextLine();
                    System.out.println("Digite o novo tamanho do produto:");
                    tamanho = entrada.nextLine();
                    System.out.println("Digite a nova largura do produto:");
                    largura = entrada.nextLine();

                    produto.setNome(nome);
                    produto.setPreco(preco);
                    produto.setMarca(marca);
                    produto.setTamanho(tamanho);
                    produto.setLargura(largura);
                        
                break;

                case 3:
                    System.out.println("Digite a posição do produto que deseja excluir:");
                    int index = entrada.nextInt();

                    listaProdutos.remove(index);

                break;

                case 4:
                    for(int i=0; i<listaProdutos.size(); i++){
                        System.out.println(listaProdutos.get(i));
                    }

                break;

                case 5:
                    System.out.println("Saindo...");
                break;
            
                default:
                    System.out.println("Opção inválida!");
                break;
            }
        }while (opcao != 5); 
                
    }
    
}