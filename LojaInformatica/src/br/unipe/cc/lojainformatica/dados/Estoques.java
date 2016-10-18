package br.unipe.cc.lojainformatica.dados;

import java.util.HashSet;
import java.util.Set;

import br.unipe.cc.lojainformatica.modelo.Produto;

public class Estoques {
	
	private String nome;
	private String Tipo;
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTipo() {
		return Tipo;
	}

	public void setTipo(String tipo) {
		Tipo = tipo;
	}

	public Estoques(String nome){
		this.nome = nome;
	}
	
	private Set<Produto> listaDeProdutos = new HashSet<>();
	
	public Set<Produto> getListaDeProdutos(){
		return this.listaDeProdutos;
	}
	
	public boolean guardaProduto(Produto produto){
		listaDeProdutos.add(produto);
		System.out.printf("Produto %s salvo com sucesso!\n",produto.getNome());
		return true;
	}
	
	public void exibeEstoque(){
		System.out.printf("\nEstoque %s Detalhado:\n", this.getNome());
		for (Produto e : this.listaDeProdutos){
			System.out.printf("Produto: %s\nCódigo: %s\nPreço: %s\n", e.getNome(),e.getCodigo(),e.getPreco());
		}
	}
	

}
