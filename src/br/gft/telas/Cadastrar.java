package br.gft.telas;

import java.util.List;
import java.util.Scanner;

import br.gft.dao.CidadaoDao;
import br.gft.entidade.Cidadao;

public class Cadastrar {

	public void cadastro(int opcao) {

		Cidadao cidadao = new Cidadao();
		Scanner sc = new Scanner(System.in);

		System.out.println("-------------------------------------------------------------");

		if (opcao == 1) {

			System.out.println(
					"--------------------------------------------------------------------------------------------------");
			System.out.println("Nome: ");
			String nome = sc.next();
			nome += sc.nextLine();
			cidadao.setNome(nome);
			System.out.println(
					"--------------------------------------------------------------------------------------------------");
			System.out.println("Sobre nome: ");
			String sobrenome = sc.next();
			sobrenome += sc.nextLine();
			cidadao.setSobreNome(sobrenome);
			System.out.println(
					"--------------------------------------------------------------------------------------------------");
			System.out.println("Telefone: ");
			String telefone = sc.next();
			telefone += sc.nextLine();
			cidadao.setTelefone(telefone);
			System.out.println(
					"--------------------------------------------------------------------------------------------------");
			System.out.println("E-mail: ");
			String email = sc.next();
			email += sc.nextLine();
			cidadao.setEmail(email);

			CidadaoDao dao = new CidadaoDao();
			List<Cidadao> cidadoes = dao.listar();
			if (cidadoes.size() == 0) {
				cidadao.setId(0);
			}
			if (cidadoes.size() > 0) {
				int id = cidadoes.size();
				cidadao.setId(id);
			}
			dao.inserir(cidadao);
		}

		if (opcao == 2) {
			CidadaoDao dao = new CidadaoDao();
			List<Cidadao> cidadoes = dao.listar();
			if (cidadoes.size() >= 1) {
				for (Cidadao c : cidadoes) {
					System.out.println("Id do cidadao: " + c.getId());
					System.out.println("Nome e sobrenome do cidadão: " + c.getNome() + " " + c.getSobreNome());
					System.out.println("Telefone: " + c.getTelefone());
					System.out.println("Email: " + c.getEmail());
					System.out.println("-------------------------------------------------------------");
				}
			}
			else {
				System.out.println("Não possui nenhum cidadao cadastrado :/");
			}
		}

		if (opcao == 3) {
			System.out.println("Qual cidadao deseja alterar? (id): ");
			int escolha = sc.nextInt();
			CidadaoDao dao = new CidadaoDao();
			List<Cidadao> cidadoes = dao.listar();
			int n = 0;
			for (Cidadao c : cidadoes) {
				if (n == escolha) {
					System.out.println("Qual campo deseja alterar?");
					System.out.println("1 - Nome");
					System.out.println("2 - Sobrenome");
					System.out.println("3 - Telefone");
					System.out.println("4 - E-mail");
					int escolha2 = sc.nextInt();
					if (escolha2 == 1) {
						System.out.println("Digite o nome para alterar: ");
						String nome = sc.next();
						nome += sc.nextLine();
						c.setNome(nome);
						System.out.println("Nome Alterado!");
					}
					if (escolha2 == 2) {
						System.out.println("Digite o sobrenome para alterar: ");
						String sobrenome = sc.next();
						sobrenome += sc.nextLine();
						c.setSobreNome(sobrenome);
						System.out.println("Sobrenome Alterado!");
					}
					if (escolha2 == 3) {
						System.out.println("Digite o telefone para alterar: ");
						String telefone = sc.next();
						telefone += sc.nextLine();
						c.setTelefone(telefone);
						System.out.println("Telefone Alterado!");
					}
					if (escolha2 == 4) {
						System.out.println("Digite o e-mail para alterar: ");
						String email = sc.next();
						email += sc.nextLine();
						c.setEmail(email);
						System.out.println("E-mail Alterado!");
					}
				}
				n++;
			}

		}
		if (opcao == 4) {
			CidadaoDao dao = new CidadaoDao();
			List<Cidadao> cidadoes = dao.listar();
			System.out.println("Qual cadastro deseja remover? (Id)");
			int escolha = sc.nextInt();
			for (Cidadao c : cidadoes) {
				if (c.getId() == escolha) {
					cidadoes.remove(escolha);
					System.out.println("Removido!");
				}
				if (cidadoes.size() == 0) {
					break;
				}
			}
		}
	}

}