package AV2;
import java.util.List;

public class EnderecoController {
    private EnderecoDAO enderecoDAO;

    public EnderecoController() {
        enderecoDAO = new EnderecoDAO();
    }

    public List<EnderecoModel> listarEnderecos() {
        return enderecoDAO.listarEnderecos();
    }

    public void adicionarEndereco(String rua, String cidade, String cep) {
        EnderecoModel enderecoModel = new EnderecoModel(rua, cidade, cep);
        enderecoDAO.inserirEndereco(enderecoModel);
    }

    public void atualizarEndereco(int id, String rua, String cidade, String cep) {
        EnderecoModel enderecoModelAtualizado = new EnderecoModel(rua, cidade, cep);
        enderecoModelAtualizado.setId(id);
        enderecoDAO.atualizarEndereco(enderecoModelAtualizado);
    }

    public void deletarEndereco(int id) {
        enderecoDAO.deletarEndereco(id);
    }
}