package classes;

import java.io.Serializable;

public class Cliente implements Serializable {
	protected String nome;
	protected int idade;
	public Cliente(String nome) {
		super();
		this.nome = nome;
	}
	
	public String mostrarDados() {
		return null;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
