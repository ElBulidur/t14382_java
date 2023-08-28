package br.com.juliopereira.model;

public enum EUnidadeProduto {	
	
	GR("Grama"),
	KL("Kilo"),
	UN("Unidade"),
	CX("Caixa");

	private String unidade;
	
	EUnidadeProduto(String unidade){
		this.unidade = unidade;
	}
	
	public String getUnidade() {
		return this.unidade;
	}
	
}
