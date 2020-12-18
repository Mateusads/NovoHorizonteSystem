package entities;

public class Medicamento {
	
	private int idPaciente;
	private String nome;
	private String nomeFabricante;
	private String efeitosColaterais;
	private String foneSac;
	private Boolean remedioControlado;
	
	public Medicamento(String nome, String nomeFabricante, String efeitosColaterais, String foneSac,
			Boolean remedioControlado) {
		super();
		this.nome = nome;
		this.nomeFabricante = nomeFabricante;
		this.efeitosColaterais = efeitosColaterais;
		this.foneSac = foneSac;
		this.remedioControlado = remedioControlado;
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
	public String getNomeFabricante() {
		return nomeFabricante;
	}
	public void setNomeFabricante(String nomeFabricante) {
		this.nomeFabricante = nomeFabricante;
	}
	public String getEfeitosColaterais() {
		return efeitosColaterais;
	}
	public void setEfeitosColaterais(String efeitosColaterais) {
		this.efeitosColaterais = efeitosColaterais;
	}
	public String getFoneSac() {
		return foneSac;
	}
	public void setFoneSac(String foneSac) {
		this.foneSac = foneSac;
	}
	public Boolean getRemedioControlado() {
		return remedioControlado;
	}
	public void setRemedioControlado(Boolean remedioControlado) {
		this.remedioControlado = remedioControlado;
	}
	
	

}
