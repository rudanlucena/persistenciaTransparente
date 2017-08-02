package entidades;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;

@Entity
@Table(name = "clubes")
public class Clube{
   @Id @GeneratedValue
   @Column(name = "id")
   private int id;

   @Column(name = "nome")
   private String nome;

   @Column(name = "cidade")
   private String cidade;

   @Column(name = "estadio")
   private String estadio; 
   
   @Column(name = "divisao")
   private int divisao;

   public Clube() {}
   
   public int getId() {
      return id;
   }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstadio() {
        return estadio;
    }

    public void setEstadio(String estadio) {
        this.estadio = estadio;
    }

    public int getDivisao() {
        return divisao;
    }

    public void setDivisao(int divisao) {
        this.divisao = divisao;
    }

    
}