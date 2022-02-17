package classes;

public class Cadastro extends Cliente {
	String cpf,rg,tipoMaquina,email,telefone,endereco,avarias,numSerie,descricao,protocoloco;

	public Cadastro(String nome, String cpf, String rg, String tipoMaquina, String email, String telefone,
			String endereco, String avarias, String numSerie, String descricao, String protocoloco) {
		super(nome);
		this.cpf = cpf;
		this.rg = rg;
		this.tipoMaquina = tipoMaquina;
		this.email = email;
		this.telefone = telefone;
		this.endereco = endereco;
		this.avarias = avarias;
		this.numSerie = numSerie;
		this.descricao = descricao;
		this.protocoloco = protocoloco;
	}
	public String mostrarDados() {
	return "\nProtocolo: " +this.protocoloco + "\nNome:" + this.nome + "\nTipo de Maquina: " + this.tipoMaquina + "\nCPF : " + this.cpf + "\nRG: " + this.rg +
			   "\nEmail :" + this.email + "\nTelefone: " + this.telefone + "\nEndereço:" + this.endereco + "\nAvarias: " + this.avarias + 
			   "\nNumero de Serie: " + this.numSerie + "\nDesclição: " + this.descricao + "\n******************************************";

	}
}
