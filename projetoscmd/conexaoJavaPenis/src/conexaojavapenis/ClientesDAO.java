package conexaoJavaPenis;

import java.sql.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ClientesDAO {

    Connection conn;
    PreparedStatement pstm;
    ResultSet rs;
    ArrayList<ClientesDTO> lista = new ArrayList<>();

    public void cadastrarCliente(ClientesDTO objClientesDTO) {
        String sql = "insert into genitais (nome, endereco, cidade, profissao) values (?,?,?,?)";
        conn = new Conexao().conectaDB();
        try {
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, objClientesDTO.getNome_genitais());
            pstm.setString(2, objClientesDTO.getEndereco_genitais());
            pstm.setString(3, objClientesDTO.getCidade_genitais());
            pstm.setString(4, objClientesDTO.getProfissao_genitais());
            pstm.execute();
            pstm.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public ArrayList<ClientesDTO> ListarClientes() {
        String sql = "select * from genitais";
        conn = new Conexao().conectaDB();
        try {
            pstm = conn.prepareStatement(sql);
            rs = pstm.executeQuery();
            while (rs.next()) {
                ClientesDTO objClientesDTO = new ClientesDTO();
                objClientesDTO.setId_genitais(rs.getInt("id_genitais"));
                objClientesDTO.setNome_genitais(rs.getString("nome"));
                objClientesDTO.setEndereco_genitais(rs.getString("endereco"));
                objClientesDTO.setCidade_genitais(rs.getString("cidade"));
                objClientesDTO.setProfissao_genitais(rs.getString("profissao"));
                lista.add(objClientesDTO);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return lista;
    }

    public void alterarCliente(ClientesDTO objClientesDTO) {
        String sql = "update genitais set nome = ?, endereco = ?, cidade = ?, profissao = ? where id_clientes = ?";
        conn = new Conexao().conectaDB();
        try {
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, objClientesDTO.getNome_genitais());
            pstm.setString(2, objClientesDTO.getEndereco_genitais());
            pstm.setString(3, objClientesDTO.getCidade_genitais());
            pstm.setString(4, objClientesDTO.getProfissao_genitais());
            pstm.setInt(5, objClientesDTO.getId_genitais());
            pstm.execute();
            pstm.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public void excluirCliente(ClientesDTO objClientesDTO) {
        String sql = "delete from genitais where id_genitais = ?";
        conn = new Conexao().conectaDB();
        try {
            pstm = conn.prepareStatement(sql);
            pstm.setInt(1, objClientesDTO.getId_genitais());
            pstm.execute();
            pstm.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
}
