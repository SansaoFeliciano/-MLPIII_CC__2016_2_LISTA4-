package br.unipe.cc.cursodecapacitacao.ui;

import java.util.Scanner;

import br.unipe.cc.cursodecapacitacao.dados.BancoDeDados;
import br.unipe.cc.cursodecapacitacao.modelo.Aluno;

public class Principal {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		BancoDeDados bancoAlunos = new BancoDeDados();
		String op = "-1";
		String op1 = "-1";

		while (!op.equals("0")){
		System.out.println("CURSO DE CAPACITAÇÃO");
		
		System.out.println("1- Incluir novo aluno");
		System.out.println("2- Remover aluno");
		System.out.println("3- Pesquisar aluno");
		System.out.println("4- Relatórios de alunos");
		
		op = leitor.nextLine();
		
		switch (op){
		
		case "1":
			Aluno novoaluno = new Aluno();
			novoaluno.cadastraAluno();
			bancoAlunos.setBancoDeAlunos(novoaluno);
			break;
			
		case "2":
			System.out.println("Digite o nome ou matrícula do aluno que deseja remover:");
			bancoAlunos.removeAluno(leitor.nextLine(), bancoAlunos);
			break;
			
		case "3":
			System.out.println("Digite o nome do aluno que deseja pesquisar:");
			bancoAlunos.verificaAluno(leitor.nextLine(), bancoAlunos);
			break;
			
		case "4":
			while (!op1.equalsIgnoreCase("0")){
			System.out.printf("\nRelatórios:\n1-Aprovados por média\n2-Reprovados por falta\n3-Ordem Afabética\n");
			op1 = leitor.nextLine();
			
			switch (op1){
			
			case "1":
				bancoAlunos.relatorioAprovados();
				System.out.printf("\nGerar novo relatório? 1- Sim ou 0- Não\n");
				op1= leitor.nextLine();
				break;
			case "2":
				bancoAlunos.relatorioReprovados();
				System.out.printf("\nGerar novo relatório? 1- Sim ou 0- Não\n");
				op1= leitor.nextLine();
				break;
			case "3":
				bancoAlunos.relatorioOrdAlfabetica();
				System.out.printf("\nGerar novo relatório? 1- Sim ou 0- Não\n");
				op1= leitor.nextLine();
				break;
			case "0":
				break;
			default:
				System.out.println("Opção Inválida!");
				break;
			}
			
		}
			op1= "-1";
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
