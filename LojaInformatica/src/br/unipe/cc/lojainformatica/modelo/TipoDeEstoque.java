package br.unipe.cc.lojainformatica.modelo;

public enum TipoDeEstoque {
	
	EstoqueCentral(1), EstoqueSetorial(2);
	
	private int valor;
	
	private TipoDeEstoque(int valor){
		this.valor = valor;
	}

}
