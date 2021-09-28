package br.com.traveller.model;

public class Restaurante {
	
	private int id;
	private String nome;
	private String descricao;
	private String tipoCozinha;
	private String localizacao;
	private String horarioFuncionamento;
	private String site;
	private String avaliacao;
	
	
	public String getTipoCozinha() {
		return tipoCozinha;
	}
	public void setTipoCozinha(String tipoCozinha) {
		this.tipoCozinha = tipoCozinha;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getLocalizacao() {
		return localizacao;
	}
	public void setLocalizacao(String localizacao) {
		this.localizacao = localizacao;
	}
	public String getHorarioFuncionamento() {
		return horarioFuncionamento;
	}
	public void setHorarioFuncionamento(String horarioFuncionamento) {
		this.horarioFuncionamento = horarioFuncionamento;
	}
	
	public String getSite() {
		return site;
	}
	public void setSite(String site) {
		this.site = site;
	}
	public String getAvaliacao() {
		return avaliacao;
	}
	public void setAvaliacao(String avaliacao) {
		this.avaliacao = avaliacao;
	}
	public Restaurante(int id, String nome, String descricao, String localizacao, String horarioFuncionamento,
			String site, String avaliacao) {
		super();
		this.id = id;
		this.nome = nome;
		this.descricao = descricao;
		this.localizacao = localizacao;
		this.horarioFuncionamento = horarioFuncionamento;
		this.site = site;
		this.avaliacao = avaliacao;
	}
	public Restaurante() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Restaurante []";
	}

	
	
	
	

	
	
	
	

	

}