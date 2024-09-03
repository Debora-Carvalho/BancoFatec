/**
 * 
 */
package BancoFatec;

/**
 * 
 */
public class Cliente {
	 private String nome;
	 private String celular;
	 
	 //construtor
	 public Cliente (String nome, String celular) {
		 this.nome = nome;
		 this.celular = celular;
	 }
	 
	 //getters e setters
	 public String getNome() {
		 return this.nome;
	 }
	 
	 public String getCelular() {
		 return this.celular;
	 }
	 
	 public void setNome(String nome) {
		 this.nome = nome;
	 }
	 
	 public void setCelular(String celular) {
		 this.nome = celular;
	 }

	@Override
	public String toString() {
		return "Cliente [nome=" + nome + ", celular=" + celular + "]";
	}
	 
	 
	 
	 
}
