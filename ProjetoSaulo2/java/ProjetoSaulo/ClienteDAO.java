
package ProjetoSaulo;


import java.sql.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;
/**
 *
 * @author Gustavo
 */
public class ClienteDAO {
    
    
     Connection conn;
    PreparedStatement pstm;
    ResultSet rs; 
    ArrayList<ClienteDTO> lista = new ArrayList<>();
    
    public void cadastrarCliente(ClienteDTO objClienteDTO){
            String sql = "insert into cliente (Nome, CPF, Endereco, Cidade_FK) values (?,?,?,?)";

            conn = new Conexao().conectaDB();
            try {
                pstm = conn.prepareStatement(sql);
                pstm.setString(1, objClienteDTO.getNome_cliente());
                pstm.setString(2, objClienteDTO.getCPF_cliente());
            
                pstm.setString(3, objClienteDTO.getEndereco_cliente());
                pstm.setInt(4, objClienteDTO.getCidade_FK_cliente());

                pstm.execute();
                pstm.close();

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }
    
    public ArrayList<ClienteDTO> ListarClientes() { 
        String sql="select * from cliente"; 
        conn = new Conexao().conectaDB(); 

        try { 
            pstm = conn.prepareStatement(sql); 
            rs = pstm.executeQuery(); 

            while(rs.next()){ 
                ClienteDTO objClienteDTO = new ClienteDTO(); 
                objClienteDTO.setID_cliente(rs.getInt("ID")); 
                objClienteDTO.setNome_cliente(rs.getString("Nome")); 
                objClienteDTO.setCPF_cliente(rs.getString("CPF"));
                objClienteDTO.setEndereco_cliente(rs.getString("Endereco")); 
                objClienteDTO.setCidade_FK_cliente(rs.getInt("Cidade_FK")); 
                

                lista.add(objClienteDTO); 
            } 
            } catch (SQLException e) { 
                JOptionPane.showMessageDialog(null, e); 
            } 
        return lista; 
        }
    
    
     public void alterarCliente(ClienteDTO objClienteDTO){ 
        String sql = "update cliente set Nome = ?, CPF = ?, Endereco = ?, Cidade_FK = ? where ID = ?"; 

        conn = new Conexao().conectaDB(); 
        try { 
            pstm = conn.prepareStatement(sql); 
            pstm.setString(1, objClienteDTO.getNome_cliente()); 
            pstm.setString(2, objClienteDTO.getCPF_cliente()); 
            pstm.setString(3, objClienteDTO.getEndereco_cliente()); 
            pstm.setInt(4, objClienteDTO.getCidade_FK_cliente()); 
            pstm.setInt(5, objClienteDTO.getID_cliente()); 

            pstm.execute(); 
            pstm.close(); 

        } catch (Exception e) { 
            JOptionPane.showMessageDialog(null, e); 
        } 

    }
    
    
    public void excluirCliente(ClienteDTO objClienteDTO){ 
        String sql = "delete from cliente where ID = ?"; 

        conn = new Conexao().conectaDB(); 
        try { 
            pstm = conn.prepareStatement(sql); 
            pstm.setInt(1, objClienteDTO.getID_cliente()); 

            pstm.execute(); 
            pstm.close(); 

        } catch (Exception e) { 
        JOptionPane.showMessageDialog(null, e); 
        } 
    } 
    
      public ResultSet carregarCBX(){
        conn = new Conexao().conectaDB();
        String sql = "select * from cidade order by nome;";
        
        try{
            pstm = conn.prepareStatement(sql);
            return pstm.executeQuery();
        }catch (SQLException erro){
            System.out.println(erro.getMessage());
            return null;
        }
    }
    
    
}
