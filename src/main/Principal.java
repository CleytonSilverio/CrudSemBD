package main;

import java.util.ArrayList;
import java.util.Scanner;

import br.gft.dao.CidadaoDao;
import br.gft.entidade.Cidadao;
import br.gft.telas.Cadastrar;
import br.gft.telas.Listar;

public class Principal {

	public static void main(String[] args) {
		
		
		
		Scanner sc = new Scanner(System.in);
		
		int inicio = 0;
		if(inicio == 0) {
			System.out.println("Bem vindo ao crude básico!");
			System.out.println("Ele basicamente possui este menu com o que deseja efetuar! :)");
			inicio = 1;
		}
		
		for(;;) {
			System.out.println("--------------------------------------------------------------------------------------------------");
			System.out.println("1 - Cadastrar.");
			System.out.println("2 - Listar.");
			System.out.println("3 - Alterar.");
			System.out.println("4 - Deletar.");
			System.out.println("5 - Sair.");
			
			int opcao = sc.nextInt();
			
			if (opcao == 1) {
				new Cadastrar().cadastro(opcao);
			}
			if (opcao == 2) {
				new Cadastrar().cadastro(opcao);
			}
			if (opcao == 3) {
				new Cadastrar().cadastro(opcao);
			}
			if (opcao == 4) {
				new Cadastrar().cadastro(opcao);
			}
			
			
			if (opcao == 5) {
				break;
			}

		}
		
	}

}
