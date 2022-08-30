import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ToDoList {

    public static Scanner scanner = new Scanner(System.in);

    private static List<String> Lista = new ArrayList<String>();

    public static void main(String[] args) {
        int itemMenu = -1;

        while (itemMenu != 0) {
            itemMenu = menu();
            switch (itemMenu) {
                case 1:
                    mostrarLista();
                    break;
                case 2:
                    adicionarItem();
                    break;
                case 3:
                    removerItem();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Escolha uma opção válida");
            }
        }
    }

    public static int menu() {
        System.out.println("\nMENU PRINCIPAL\n");
        System.out.println("1 - Mostrar Lista\n2 - Adicionar Item\n3 - Remover Item\n0 - Fechar\n");
        System.out.print("Escolha uma opção: ");
        int resposta = scanner.nextInt();
        return resposta;
    }

    public static void mostrarLista() {
        System.out.println("-------------\nLista\n-------------");
        int numero = 0;
        for (String item : Lista) {
            System.out.println(++numero + " - " + item);
        }

    }

    public static void adicionarItem() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Adicionar Item a Lista\n");
        System.out.print("Nome do Item: ");

        String item = scanner.nextLine();
        Lista.add(item);
    }

    public static void removerItem() {
        mostrarLista();

        System.out.println("\nRemover Item\n");
        System.out.print("Qual Item deseja remover?");
        int index = scanner.nextInt();
        if ((index - 1) < 0 || index > Lista.size()) {
            System.out.println("Item não encontrado! Selecione um Item de 1 a " + Lista.size());
        } else {
            Lista.remove(index - 1);
        }
    }
}
