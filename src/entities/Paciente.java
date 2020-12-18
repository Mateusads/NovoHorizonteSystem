package entities;

import java.util.Date;

public class Paciente {
	
	private int idPaciente;
	private String nome;
	private String sobrenome;
	private String naturalidade;
	private String dataNacimento;
	private String cpf;
	private String rg;
	private String sexo;
	private String nomeDaMae;
	
	
	
	public Paciente(String nome, String sobrenome, String naturalidade, String dataNacimento, String cpf, String rg,
			String sexo, String nomeDaMae) {
		super();
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.naturalidade = naturalidade;
		this.dataNacimento = dataNacimento;
		this.cpf = cpf;
		this.rg = rg;
		this.sexo = sexo;
		this.nomeDaMae = nomeDaMae;
	}
	
	public int getIdPaciente() {
		return idPaciente;
	}
	public void setIdPaciente(int idPaciente) {
		this.idPaciente = idPaciente;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSobrenome() {
		return sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	public String getNaturalidade() {
		return naturalidade;
	}
	public void setNaturalidade(String naturalidade) {
		this.naturalidade = naturalidade;
	}
	public String getDataNacimento() {
		return dataNacimento;
	}
	public void setDataNacimento(String dataNacimento) {
		this.dataNacimento = dataNacimento;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public String getNomeDaMae() {
		return nomeDaMae;
	}
	public void setNomeDaMae(String nomeDaMae) {
		this.nomeDaMae = nomeDaMae;
	}

}
