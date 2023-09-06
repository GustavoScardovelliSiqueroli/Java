/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProjetoSaulo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Gustavo
 */
public class LivroDAO {
   
     Connection conn;
    PreparedStatement pstm;
    ResultSet rs; 
    ArrayList<LivroDTO> lista = new ArrayList<>();
    
    public void cadastrarLivro(LivroDTO objLivroDTO){
            String sql = "insert into livro (Nome, Editora, Genero_FK, Autor, Ano) values (?,?,?,?,?)";

            conn = new Conexao().conectaDB();
            try {
                pstm = conn.prepareStatement(sql);
                pstm.setString(1, objLivroDTO.getNome_livro());
                pstm.setString(2, objLivroDTO.getEditora_livro());
                pstm.setInt(3, objLivroDTO.getGenero_FK_livro());
                pstm.setString(4, objLivroDTO.getAutor_livro());
                pstm.setInt(5, objLivroDTO.getAno_livro());
                
                pstm.execute();
                pstm.close();

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
        }
    
     public ArrayList<LivroDTO> ListarLivros() { 
        String sql="select * from livro"; 
        conn = new Conexao().conectaDB(); 

        try { 
            pstm = conn.prepareStatement(sql); 
            rs = pstm.executeQuery(); 

            while(rs.next()){ 
                LivroDTO objLivroDTO = new LivroDTO(); 
                objLivroDTO.setID_livro(rs.getInt("ID")); 
                objLivroDTO.setNome_livro(rs.getString("Nome")); 
                objLivroDTO.setGenero_FK_livro(rs.getInt("Genero_FK"));
                objLivroDTO.setAutor_livro(rs.getString("Autor")); 
                objLivroDTO.setAno_livro(rs.getInt("Ano")); 
                objLivroDTO.setEditora_livro(rs.getString("Editora"));
               
                lista.add(objLivroDTO); 
            } 
            } catch (SQLException e) { 
                JOptionPane.showMessageDialog(null, e); 
            } 
        return lista; 
        }
    
    
    
    
    
    
    
    
    
}
