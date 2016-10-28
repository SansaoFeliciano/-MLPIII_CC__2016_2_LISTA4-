package br.unipe.cc.cursodecapacitacao.dados;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

import br.unipe.cc.cursodecapacitacao.modelo.Aluno;

public class BancoDeDados {
	
	private Set<Aluno> bancoDeAlunos = new HashSet<>();
	private Set<Aluno> bancoDeAlunosOrdenado = new TreeSet<>();

	public Set<Aluno> getBancoDeAlunos() {
		return bancoDeAlunos;
	}

	public void setBancoDeAlunos(Aluno aluno) {
		this.bancoDeAlunos.add(aluno);
	}
	
	public boolean verificaAluno(String aluno, BancoDeDados bancoDeAlunos){
		for (Aluno aluno1: bancoDeAlunos.getBancoDeAlunos()){
			if(aluno1.getNome().equalsIgnoreCase(aluno)){
				System.out.printf("Aluno %s está cadastrado neste curso!\n\n", aluno1.getNome());
				return true;
			}
			}
			System.out.printf("Aluno não cadastrado!\n\n");
			return false;
	}
	
	public boolean removeAluno(String aluno, BancoDeDados bancoDeAlunos){
		for (Aluno aluno1: bancoDeAlunos.getBancoDeAlunos()){
			if(aluno1.getNome().equalsIgnoreCase(aluno)||(aluno1.getMatricula().equals(aluno))){
				bancoDeAlunos.getBancoDeAlunos().remove(aluno1);
				System.out.printf("Aluno removido com sucesso!\n\n");
				return true;
	}
	}
		System.out.printf("Aluno não cadastrado!\n\n");
		return false;
	}
	
	public void relatorioAprovados(){
		System.out.println("====== APROVADOS ========");
		for (Aluno aluno1: this.getBancoDeAlunos()){
			if(aluno1.getMedia()>= 7.00){
				System.out.printf("Aluno: %s\nMédia: %.2f\n\n",aluno1.getNome(),aluno1.getMedia());
			}
	}
		System.out.println("=======================");
}
	
	public void relatorioReprovados(){
		System.out.println("====== REPROVADOS POR FALTA ========");
		for (Aluno aluno1: this.getBancoDeAlunos()){
			if(aluno1.getQtdFaltas()> 15){
				System.out.printf("Aluno: %s\nQtd. Faltas: %d\n\n",aluno1.getNome(),aluno1.getQtdFaltas());
			}
	}
		System.out.println("=======================");
}
	
	public void relatorioOrdAlfabetica(){
		bancoDeAlunosOrdenado = bancoDeAlunos;
		System.out.printf("\n====== LISTA DE ALUNOS ========\n");
		for (Aluno aluno1: this.bancoDeAlunosOrdenado){
				System.out.printf("Aluno: %s\nMatrícula: %s\nMédia: %.2f\nQtd. Faltas: %d\n\n",aluno1.getNome(),aluno1.getMatricula(),aluno1.getMedia(),aluno1.getQtdFaltas());
			}
		System.out.println("=======================");
}

}
