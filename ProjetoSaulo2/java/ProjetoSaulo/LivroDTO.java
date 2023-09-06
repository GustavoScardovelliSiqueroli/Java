/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProjetoSaulo;

/**
 *
 * @author Gustavo
 */
public class LivroDTO {
    private int ID_livro;
    private String Nome_livro;
    private String Editora_livro;
    private int Genero_FK_livro;
    private String Autor_livro;
    private int Ano_livro;

    public String getNome_livro() {
        return Nome_livro;
    }

    public void setNome_livro(String Nome_livro) {
        this.Nome_livro = Nome_livro;
    }

    public String getEditora_livro() {
        return Editora_livro;
    }

    public void setEditora_livro(String Editora_livro) {
        this.Editora_livro = Editora_livro;
    }

   

    public String getAutor_livro() {
        return Autor_livro;
    }

    public void setAutor_livro(String Autor_livro) {
        this.Autor_livro = Autor_livro;
    }

    public int getAno_livro() {
        return Ano_livro;
    }

    public void setAno_livro(int Ano_livro) {
        this.Ano_livro = Ano_livro;
    }

    public int getID_livro() {
        return ID_livro;
    }

    public void setID_livro(int ID_livro) {
        this.ID_livro = ID_livro;
    }

    public int getGenero_FK_livro() {
        return Genero_FK_livro;
    }

    public void setGenero_FK_livro(int Genero_FK_livro) {
        this.Genero_FK_livro = Genero_FK_livro;
    }
}
