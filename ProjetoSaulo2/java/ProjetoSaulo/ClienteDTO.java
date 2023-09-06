
package ProjetoSaulo;

/**
 *
 * @author Gustavo
 */
public class ClienteDTO {
    
    private String Nome_cliente, CPF_cliente, Endereco_cliente;
    private int ID_cliente, Cidade_FK_cliente;

    public String getNome_cliente() {
        return Nome_cliente;
    }

    public void setNome_cliente(String Nome_cliente) {
        this.Nome_cliente = Nome_cliente;
    }

    public String getCPF_cliente() {
        return CPF_cliente;
    }

    public void setCPF_cliente(String CPF_cliente) {
        this.CPF_cliente = CPF_cliente;
    }

    public String getEndereco_cliente() {
        return Endereco_cliente;
    }

    public void setEndereco_cliente(String Endereco_cliente) {
        this.Endereco_cliente = Endereco_cliente;
    }

    public int getID_cliente() {
        return ID_cliente;
    }

    public void setID_cliente(int ID_cliente) {
        this.ID_cliente = ID_cliente;
    }

    public int getCidade_FK_cliente() {
        return Cidade_FK_cliente;
    }

    public void setCidade_FK_cliente(int Cidade_FK_cliente) {
        this.Cidade_FK_cliente = Cidade_FK_cliente;
    }
    
}
