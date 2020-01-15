package br.gft.dao;

import java.util.ArrayList;
import java.util.List;

import br.gft.entidade.Cidadao;

public class CidadaoDao{
	
	
	private static List<Cidadao> cidadoes = new ArrayList<Cidadao>();
			
	
	public Cidadao inserir(Cidadao cidadao) {
		cidadoes.add(cidadao);
		return cidadao;
	}

	
	public Cidadao alterar(Cidadao cidadao) {
		// TODO Auto-generated method stub
		return null;
	}


	public Cidadao excluir(Cidadao cidadao) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Cidadao> listar() {
		return cidadoes;
	}


	public Cidadao buscarPorId(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}
}
