package classes;

public class OrdenAD extends Cliente {
	private String sistema;
	private String descricao;
	private String tipoMaquina;
	private String conecaoRemota;
	private String idRemoto;
	private String senha;
	
public OrdenAD(String nome, String sistema, String descricao, String tipoMaquina,
			String conecaoRemota, String idRemoto, String senha) {
		super(nome);
		this.sistema = sistema;
		this.descricao = descricao;
		this.tipoMaquina = tipoMaquina;
		this.conecaoRemota = conecaoRemota;
		this.idRemoto = idRemoto;
		this.senha = senha;
	}

public String mostrarDados() {
	return "\nNome do Requisitante: " + this.nome + "\nUtilização da Maquina: " + this.tipoMaquina + "\nSistema Operacional: " + this.sistema + "\nConeção Remota: " + this.conecaoRemota +
			 "\nDescrisãdo da Solicitação: " + this.descricao + "\nID:" + this.idRemoto + "\nSenha de Acesso: " + this.senha;
}

public String getSistema() {
	return sistema;
}

public void setSistema(String sistema) {
	this.sistema = sistema;
}

public String getDescricao() {
	return descricao;
}

public void setDescricao(String descricao) {
	this.descricao = descricao;
}

public String getTipoMaquina() {
	return tipoMaquina;
}

public void setTipoMaquina(String tipoMaquina) {
	this.tipoMaquina = tipoMaquina;
}

public String getConecaoRemota() {
	return conecaoRemota;
}

public void setConecaoRemota(String conecaoRemota) {
	this.conecaoRemota = conecaoRemota;
}

public String getIdRemoto() {
	return idRemoto;
}

public void setIdRemoto(String idRemoto) {
	this.idRemoto = idRemoto;
}

public String getSenha() {
	return senha;
}

public void setSenha(String senha) {
	this.senha = senha;
}

}
