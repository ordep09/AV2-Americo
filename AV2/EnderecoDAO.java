package AV2;
import java.util.ArrayList;
import java.util.List;
public class EnderecoDAO {
    private List<EnderecoModel> listaEnderecoModels;

    public EnderecoDAO() {
        listaEnderecoModels = new ArrayList<>();
    }

    public List<EnderecoModel> listarEnderecos() {
        return listaEnderecoModels;
    }

    public void inserirEndereco(EnderecoModel enderecoModel) {
        listaEnderecoModels.add(enderecoModel);
    }

    public void atualizarEndereco(EnderecoModel enderecoModelAtualizado) {
        for (EnderecoModel enderecoModel : listaEnderecoModels) {
            if (enderecoModel.getId() == enderecoModelAtualizado.getId()) {
                enderecoModel.setRua(enderecoModelAtualizado.getRua());
                enderecoModel.setCidade(enderecoModelAtualizado.getCidade());
                enderecoModel.setCep(enderecoModelAtualizado.getCep());
                break;
            }
        }
    }

    public void deletarEndereco(int id) {
        listaEnderecoModels.removeIf(enderecoModel -> enderecoModel.getId() == id);
    }
}