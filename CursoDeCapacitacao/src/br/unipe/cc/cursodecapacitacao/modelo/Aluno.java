package br.unipe.cc.cursodecapacitacao.modelo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class Aluno{
	
	private String nome;
	private String matricula;
	private List<Double> notas = new ArrayList<>();
	private double media;
	private int qtdFaltas;
	Scanner leitor = new Scanner(System.in);
	
	public List<Double> getNotas() {
		return notas;
	}
	public void setNotas(double notas) {
		this.notas.add(notas);
	}
	public double getMedia() {
		return media;
	}
	public void calcMedia() {
		int i=0;
		for(;i < notas.size(); i++){
			media += notas.get(i);
		}
		media = media/(i);
	}
	public int getQtdFaltas() {
		return qtdFaltas;
	}
	public String getNome() {
		return nome;
	}
	public String getMatricula() {
		return matricula;
	}
	
	public boolean cadastraAluno(){
		System.out.println("Digite o nome do aluno");
		this.nome = leitor.nextLine();
		System.out.println("Digite a matrícula do aluno");
		this.matricula = leitor.nextLine();
		System.out.println("Entre com as notas do Aluno:");
		for(int i=0;i < 4; i++){
			System.out.printf("Nota %d: \n",i+1);
			notas.add(leitor.nextDouble());
		}
		calcMedia();
		System.out.println("Digite a quantidade de faltas do aluno");
		qtdFaltas = leitor.nextInt();
		System.out.printf("Aluno %s cadastrado com sucesso!\n\n", this.nome);
		return true;
	}
	
	public boolean removeAluno(){
		System.out.println("Digite o nome do aluno a remover");
		
		return true;
	}
	

}
