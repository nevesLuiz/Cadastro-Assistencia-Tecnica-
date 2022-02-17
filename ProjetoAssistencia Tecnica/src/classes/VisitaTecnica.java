package classes;

public class VisitaTecnica extends Cliente {
	private String endereco,bairro,referencia,cep,tipomaquina,descricao;
	private Double horario,numeroDaCasa;
	private int dia;
	public VisitaTecnica(String nome, String endereco, String bairro, String referencia, String cep, String tipomaquina,
			String descricao, Double horario, Double numeroDaCasa, int dia) {
		super(nome);
		this.endereco = endereco;
		this.bairro = bairro;
		this.referencia = referencia;
		this.cep = cep;
		this.tipomaquina = tipomaquina;
		this.descricao = descricao;
		this.horario = horario;
		this.numeroDaCasa = numeroDaCasa;
		this.dia = dia;
	}
	public String mostrarDados() {
	return "\nNome:" + this.nome + "\nTipo de Maquina: " + this.tipomaquina + "\nCEPF : " + this.cep + "\nBairro " + this.bairro + "\nNumero da Casa: " + this.numeroDaCasa + 
			"\nEndereço:" + this.endereco + "\nReferencia: " + this.referencia + 
			   "\nDia: : " + this.dia + "\nHorario: : " + this.horario +"\nDesclição: " + this.descricao + "\n******************************************";

	}
}


