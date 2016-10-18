package br.unipe.cc.lojainformatica.ui;

import java.util.Scanner;

import br.unipe.cc.lojainformatica.dados.BancoDeEstoques;
import br.unipe.cc.lojainformatica.dados.Estoques;
import br.unipe.cc.lojainformatica.modelo.Produto;
import br.unipe.cc.lojainformatica.modelo.TipoDeEstoque;

public class Principal {

	public static void main(String[] args) {
		
		String op = "-1";
		Integer op1 = -1;
		String nomeEstoque;
		TipoDeEstoque tiposEstoques;
		Scanner leitor = new Scanner(System.in);
		BancoDeEstoques bancoEstoques = new BancoDeEstoques();
		
		while (!op.equals("0")){
		
		System.out.printf("\nLOJA DE INFORMÁTICA\n");
		System.out.println("1- Cadastrar Estoque\n2- Cadastrar Produto\n3- Exibir Estoque\n0-Sair");
		
		op = leitor.nextLine();
		
		switch (op){
		
		case "1":
			System.out.println("Digite o nome do Estoque:");
			nomeEstoque = leitor.nextLine();
			Estoques novoEstoque = new Estoques(nomeEstoque);
			for (TipoDeEstoque estoque : TipoDeEstoque.values()){
				System.out.printf("%d: %s\n",estoque.ordinal(),estoque.name());
			}
			System.out.printf("\nEscolha o tipo do estoque:");
			novoEstoque.setTipo(leitor.nextLine());
			bancoEstoques.guardaEstoques(novoEstoque);
			break;
			
		case "2":
			Produto novoProduto = new Produto();
			System.out.println("Digite o nome do Produto:");
			novoProduto.setNome(leitor.nextLine());
			System.out.println("Digite o código do Produto:");
			novoProduto.setCodigo(leitor.nextLine());
			System.out.println("Digite o preço do Produto:");
			novoProduto.setPreco(leitor.nextDouble());
			bancoEstoques.mostraEstoque();
			System.out.println("Em qual estoque deseja guardar o produto?");
			bancoEstoques.getBancoEstoques().get(leitor.nextInt()).guardaProduto(novoProduto);
			op = leitor.nextLine();
			break;
			
		case "3":
			System.out.println("Digite o estoque que deseja visualizar:");
			bancoEstoques.mostraEstoque();
			bancoEstoques.getBancoEstoques().get(leitor.nextInt()).exibeEstoque();
			op = leitor.nextLine();
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

