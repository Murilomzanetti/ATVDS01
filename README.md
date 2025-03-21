//importo utilidades do java
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main { //crio  classe Main
    public static void main (String[] args) { //começo a função driver
        int opcao; //declaro a variável que será usada no switchcase
        Scanner entrada =  new Scanner(System.in); //declaro "entrada" como scanner para ler os valores
        do{ //inicio um laço de repetição
            System.out.println("1-Criar um produto");
            System.out.println("2-Alterar um produto");
            System.out.println("3-Excluir um produto");
            System.out.println("4-Listar os produtos");
            System.out.println("5-Sair");
            opcao = entrada.nextInt();
            // apresento o menu de opções e salvo

            List<Produto> listaProdutos = new ArrayList<Produto>(); //crio uma ArrayList para armazenar os produtos em ordem
            

            switch (opcao) { //começo o switchcase
                case 1: //criar um produto

                    
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

                case 2: //editar um produto
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

                case 3: //Excluir um produto
                    System.out.println("Digite a posição do produto que deseja excluir:");
                    int index = entrada.nextInt();

                    listaProdutos.remove(index);

                break;

                case 4: //Lista os produtos
                    for(int i=0; i<listaProdutos.size(); i++){
                        System.out.println(listaProdutos.get(i));
                    }

                break;

                case 5: //alerta o usuário que o sistema está fechando antes de fechar de vez
                    System.out.println("Saindo...");
                break;
            
                default: //caso o usuário digite uma opção inválida, receberá essa mensagem e retornará ao menu
                    System.out.println("Opção inválida!");
                break;
            }
        }while (opcao != 5); //executa o código até o número que o número digitado pelo usuário seja "5"
                
    }
    
}
