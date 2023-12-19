package br.com.ExplorerPlaces.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Cliente")
public class Cliente {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String nome;
	private String email;
	private String telefone;
	private String senha;
	private String confirmasenha;
	

	public Cliente() {
		super();
	}



	public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
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
	

	public String getTelefone() {
		return telefone;
	}



	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}



	public String getSenha() {
		return senha;
	}



	public void setNomeSenha(String senha) {
		this.senha = senha;
	}



	public String getConfirmasenha() {
		return confirmasenha;
	}



	public void setConfirmasenha(String confirmasenha) {
		this.confirmasenha = confirmasenha;
	}



	@Override
	public String toString() {
		return "Cliente [id=" + id + ", nome=" + nome + ", email=" + email + ", telefone=" + telefone + ", senha=" + senha
				+ ", confirmasenha=" + confirmasenha + "]";
	}
}