package entidades;

import java.util.Objects;

public class Cliente {
	
	private String nome;
	private String email;
	private String cpf;
	private String endereco;
	private Produto[] carrinho;
	
	public Cliente() {}

	public Cliente(String nome, String email, String cpf, String endereco) {	
		this.nome = nome;
		this.email = email;
		this.cpf = cpf;
		this.endereco = endereco;
		this.carrinho = new Produto[10];
	}	

	public Produto[] getCarrinho() {
		return carrinho;
	}

	public void setCarrinho(Produto[] carrinho) {
		this.carrinho = carrinho;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	@Override
	public int hashCode() {
		return Objects.hash(cpf, email, endereco, nome);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cliente other = (Cliente) obj;
		return Objects.equals(cpf, other.cpf) && Objects.equals(email, other.email)
				&& Objects.equals(endereco, other.endereco) && Objects.equals(nome, other.nome);
	}

	@Override
	public String toString() {
		return "Cliente [nome=" + nome + ", email=" + email + ", cpf=" + cpf + ", endereco=" + endereco + "]";
	}

}
