package necrojava;

public class Monstro {
    private String nome;
    private Integer vida;
    private Integer dano;
    
    public void setNome(String nome) {
        this.nome = nome.toUpperCase();
    }
    public String getNome() {
        return nome;
    }

    public void setDano(String dano) {
        this.dano = Integer.parseInt(dano);
    }
    public Integer getDano() {
        return dano;
    }

    public void setVida(String vida) {
        this.vida = Integer.parseInt(vida);
    }
    public Integer getVida() {
        return vida;
    }



}
