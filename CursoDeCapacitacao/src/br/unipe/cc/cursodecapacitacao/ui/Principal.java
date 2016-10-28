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
		System.out.println("CURSO DE CAPACITA��O");
		
		System.out.println("1- Incluir novo aluno");
		System.out.println("2- Remover aluno");
		System.out.println("3- Pesquisar aluno");
		System.out.println("4- Relat�rios de alunos");
		
		op = leitor.nextLine();
		
		switch (op){
		
		case "1":
			Aluno novoaluno = new Aluno();
			novoaluno.cadastraAluno();
			bancoAlunos.setBancoDeAlunos(novoaluno);
			break;
			
		case "2":
			System.out.println("Digite o nome ou matr�cula do aluno que deseja remover:");
			bancoAlunos.removeAluno(leitor.nextLine(), bancoAlunos);
			break;
			
		case "3":
			System.out.println("Digite o nome do aluno que deseja pesquisar:");
			bancoAlunos.verificaAluno(leitor.nextLine(), bancoAlunos);
			break;
			
		case "4":
			while (!op1.equalsIgnoreCase("0")){
			System.out.printf("\nRelat�rios:\n1-Aprovados por m�dia\n2-Reprovados por falta\n3-Ordem Afab�tica\n");
			op1 = leitor.nextLine();
			
			switch (op1){
			
			case "1":
				bancoAlunos.relatorioAprovados();
				System.out.printf("\nGerar novo relat�rio? 1- Sim ou 0- N�o\n");
				op1= leitor.nextLine();
				break;
			case "2":
				bancoAlunos.relatorioReprovados();
				System.out.printf("\nGerar novo relat�rio? 1- Sim ou 0- N�o\n");
				op1= leitor.nextLine();
				break;
			case "3":
				bancoAlunos.relatorioOrdAlfabetica();
				System.out.printf("\nGerar novo relat�rio? 1- Sim ou 0- N�o\n");
				op1= leitor.nextLine();
				break;
			case "0":
				break;
			default:
				System.out.println("Op��o Inv�lida!");
				break;
			}
			
		}
			op1= "-1";
			break;
		
		case "0":
			break;
			
		default:
			System.out.println("Op��o Inv�lida!");
			break;
			}
		}
	}
		
}
