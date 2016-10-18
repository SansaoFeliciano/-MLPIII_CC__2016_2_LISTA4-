package br.unipe.cc.sitemadepvd.ui;

import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import br.unipe.cc.sistemadepvd.dados.BancoDeDados;
import br.unipe.cc.sitemadepvd.modelo.Item;

public class Principal {

	public static void main(String[] args) {
		
		String op = "-1";
		Scanner leitor = new Scanner(System.in);
		BancoDeDados bancoItens = new BancoDeDados();
	
		System.out.println("SISTEMA DE PVD");
		
		while (!op.equals("0")){
			
			System.out.println("1- Cadastrar Item\n2- Exibir itens ordem crescente\n3- Exibir itens ordem decrescente\n0- Sair");
			op = leitor.nextLine();
			
		switch (op){
		
		case "1":
			Item novoItem = new Item();
			novoItem.cadastroItens();
			bancoItens.getListaDeItens().add(novoItem);
			break;
			
		case "2":
			Collections.sort(bancoItens.getListaDeItens());
			System.out.printf("\nExibindo em ordem crescente...\n");
			for (Item list : bancoItens.getListaDeItens()){
			System.out.printf("Código: %d\nDescrição: %s\nPreço: %.2f\n\n",list.getCodigo(),list.getDescrição(),list.getPreco());
			}
			break;
			
		case "3":
			Collections.reverse(bancoItens.getListaDeItens());
			System.out.printf("\nExibindo em ordem decrescente...\n");
			for (Item list : bancoItens.getListaDeItens()){
			System.out.printf("Código: %d\nDescrição: %s\nPreço: %.2f\n\n",list.getCodigo(),list.getDescrição(),list.getPreco());
			}
			break;
			
		case "0":
			
			break;
			
		default:
			System.out.println("Opção Inválida!");
			break;
		}
		}

	}

}
