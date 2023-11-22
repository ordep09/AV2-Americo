package AV2;
import java.util.List;
import java.util.Scanner;

public class EnderecoView {
    private EnderecoController enderecoController;
    private Scanner scanner;

    public EnderecoView() {
        enderecoController = new EnderecoController();
        scanner = new Scanner(System.in);
    }

    public void menu() {
        int opcao;
        do {
            System.out.println("Escolha uma opção:");
            System.out.println("1. Listar Endereços");
            System.out.println("2. Adicionar Endereço");
            System.out.println("3. Atualizar Endereço");
            System.out.println("4. Deletar Endereço");
            System.out.println("0. Sair");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    listarEnderecos();
                    break;
                case 2:
                    adicionarEndereco();
                    break;
                case 3:
                    atualizarEndereco();
                    break;
                case 4:
                    deletarEndereco();
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 0);
    }

    private void listarEnderecos() {
        List<EnderecoModel> enderecoModels = enderecoController.listarEnderecos();
        for (EnderecoModel enderecoModel : enderecoModels) {
            System.out.println("ID: " + enderecoModel.getId() +
                    ", Rua: " + enderecoModel.getRua() +
                    ", Cidade: " + enderecoModel.getCidade() +
                    ", CEP: " + enderecoModel.getCep());
        }
    }

    private void adicionarEndereco() {
        System.out.println("Digite a rua:");
        scanner.nextLine();
        String rua = scanner.nextLine();
        System.out.println("Digite a cidade:");
        String cidade = scanner.nextLine();
        System.out.println("Digite o CEP:");
        String cep = scanner.nextLine();

        enderecoController.adicionarEndereco(rua, cidade, cep);
        System.out.println("Endereço adicionado com sucesso!");
    }

    private void atualizarEndereco() {
        System.out.println("Digite o ID do endereço a ser atualizado:");
        int id = scanner.nextInt();
        System.out.println("Digite a nova rua:");
        scanner.nextLine();
        String rua = scanner.nextLine();
        System.out.println("Digite a nova cidade:");
        String cidade = scanner.nextLine();
        System.out.println("Digite o novo CEP:");
        String cep = scanner.nextLine();

        enderecoController.atualizarEndereco(id, rua, cidade, cep);
        System.out.println("Endereço atualizado com sucesso!");
    }

    private void deletarEndereco() {
        System.out.println("Digite o ID do endereço a ser deletado:");
        int id = scanner.nextInt();

        enderecoController.deletarEndereco(id);
        System.out.println("Endereço deletado com sucesso!");
    }
}