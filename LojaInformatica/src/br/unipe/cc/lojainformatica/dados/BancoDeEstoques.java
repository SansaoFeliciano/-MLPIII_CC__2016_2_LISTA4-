package br.unipe.cc.lojainformatica.dados;

import java.util.ArrayList;
import java.util.List;

public class BancoDeEstoques {
	
	List<Estoques> bancoEstoques = new ArrayList<>();
	
	public boolean guardaEstoques(Estoques estoque){
		bancoEstoques.add(estoque);
		System.out.printf("Estoque %s criado com sucesso!\n",estoque.getNome());
		return true;
	}
	
	public void mostraEstoque(){
		System.out.println("Lista de Estoques:");
		for(int i=0;i<bancoEstoques.size();i++){
			System.out.printf("%d: %s\n",i,bancoEstoques.get(i).getNome());}
		}

	public List<Estoques> getBancoEstoques() {
		return bancoEstoques;
	}

	public void setBancoEstoques(List<Estoques> bancoEstoques) {
		this.bancoEstoques = bancoEstoques;
	}
	}
	

