import java.io.Serializable;
import javax.persistence.*;

@Entity
@Table(name = "clubes")
public class Clube implements Serializable {
   @Id @GeneratedValue
   @Column(name = "id")
   private int id;

   @Column(name = "nome")
   private String firstName;

   @Column(name = "cidade")
   private String lastName;

   @Column(name = "estadio")
   private int salary; 
   
   @Column(name = "divisao")
   private int divisao;

   public Clube() {}
   
   public int getId() {
      return id;
   }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getDivisao() {
        return divisao;
    }

    public void setDivisao(int divisao) {
        this.divisao = divisao;
    }
}