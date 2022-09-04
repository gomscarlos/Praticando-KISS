import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ToDoList {

    private static List<String> Lista = new ArrayList<String>();

    public static void main(String[] args) {
        int resposta = -1;
        int numero = 0;
        Scanner scanner = new Scanner(System.in);

        while (resposta != 0) {

            System.out.println("-------------\nLista");
            for (String item : Lista) {
                System.out.println(++numero + " - " + item);
            }
            System.out.println("-------------\n");

            System.out.println("1 - Adicionar Item\n2 - Remover Item\n0 - Fechar\n");
            System.out.print("Escolha uma opção: ");

            resposta = scanner.nextInt();
            switch (resposta) {
                case 1:
                    Scanner scan = new Scanner(System.in); // Se não criar essa variável de scan no mesmo local que este
                                                           // scan ele buga e não lê o teclado e acaba adicionando um
                                                           // valor vazio a lista!!
                    System.out.println("Adicionar Item a Lista\n");
                    System.out.print("Nome do Item: ");

                    String item = scan.nextLine();
                    Lista.add(item);
                    break;
                case 2:
                    System.out.println("\nRemover Item\n");
                    System.out.print("Qual Item deseja remover?");
                    int index = scanner.nextInt();
                    if ((index - 1) < 0 || index > Lista.size()) {
                        System.out.println("Item não encontrado!");
                    } else {
                        Lista.remove(index - 1);
                    }
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Escolha uma opção válida");
            }
        }
    }
}
