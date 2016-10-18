package br.unipe.cc.sitemadepvd.modelo;

import java.util.Scanner;

public class Item implements Comparable<Item>{
	
	Scanner leitor = new Scanner(System.in);
	
	private int codigo;
	private String Descrição;
	private String op = "";
	private Double preco;

	public int compareTo(Item item) {
		if (this.codigo < item.codigo ){
			return -1;
		}
		if (this.codigo > item.codigo ){
			return 1;
		}
		return 0;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getDescrição() {
		return Descrição;
	}

	public void setDescrição(String descrição) {
		Descrição = descrição;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}
	
	public void cadastroItens(){
		System.out.println("Digite o Código do Item:");
		this.setCodigo(leitor.nextInt());
		System.out.println("Digite a descrição do Item:");
		this.setDescrição(leitor.next());
		System.out.println("Digite o Preço do Item:");
		this.setPreco(leitor.nextDouble());
		System.out.printf("Item %s cadastrado com sucesso!\n",this.getDescrição());
		op = leitor.nextLine();
	}

	}

