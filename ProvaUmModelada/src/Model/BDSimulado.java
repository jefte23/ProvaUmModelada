package Model;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class BDSimulado {

	// Atributos
	private ArrayList<Cliente> clientes = new ArrayList<Cliente>();
	private ArrayList<Empresa> empresa = new ArrayList<Empresa>();
	private ArrayList<Ligacao> ligacoes = new ArrayList<Ligacao>();

	public BDSimulado() {

		// Criando Clientes
		Cliente c1 = new Cliente("Evandro da Silva", "987564123-89", LocalDate.of(1940, 9, 16), "1234-56789",
				"Rio de Janeiro", "RJ");
		Cliente c2 = new Cliente("João dos Montes", "457458459-45", LocalDate.of(2000, 1, 15), "1245-7896", "Brasilia",
				"DF");
		Cliente c3 = new Cliente("Maria do Socorro", "235678451-56", LocalDate.of(1988, 2, 26), "4758-6958", "Brasilia",
				"DF");
		Cliente c4 = new Cliente("Otaviano Neves", "895678451-91", LocalDate.of(1974, 4, 12), "2345-8945", "São Paulo",
				"SP");
		Cliente c5 = new Cliente("José das Couves", "111222333-44", LocalDate.of(1991, 9, 29), "2583-6985", "Brasilia",
				"DF");
		Cliente c6 = new Cliente("Regina Maria", "123456789-00", LocalDate.of(1950, 11, 6), "3265-8974",
				"Belo Horizonte", "MG");

		// Armazenando clientes
		this.clientes.add(c1);
		this.clientes.add(c2);
		this.clientes.add(c3);
		this.clientes.add(c4);
		this.clientes.add(c5);
		this.clientes.add(c6);

		// Criando Empresas
		Empresa e1 = new Empresa("Capgemini", "59544541", LocalDate.of(1970, 3, 15), "8795452125", "Brasilia", "DF",
				true);
		Empresa e2 = new Empresa("CAST", "69958744", LocalDate.of(1990, 2, 14), "996688542", "Rio de Janeiro", "DF",
				true);
		Empresa e3 = new Empresa("Junior", "98545745", LocalDate.of(2003, 2, 12), "999885444", "São Paulo", "DF",
				false);
		Empresa e4 = new Empresa("CTIS", "9999666654", LocalDate.of(1995, 1, 2), "889999888665", "Brasilia", "DF",
				true);
		Empresa e5 = new Empresa("CPMBRAX", "3322145", LocalDate.of(1983, 3, 11), "8998844212", "Franca", "SP", false);

		// Armazenando Empresas
		this.empresa.add(e1);
		this.empresa.add(e2);
		this.empresa.add(e3);
		this.empresa.add(e4);
		this.empresa.add(e5);

		// Criando Ligação
		this.ligacoes = new ArrayList<Ligacao>();
		Ligacao l1 = new Ligacao(1, "3212-8879", LocalDateTime.of(2017, 9, 12, 17, 0),
				LocalDateTime.of(2017, 9, 12, 17, 15), "Brasilia", "DF", c1, null);
		Ligacao l2 = new Ligacao(2, "3265-8974", LocalDateTime.of(2017, 9, 12, 17, 10),
				LocalDateTime.of(2017, 9, 12, 17, 15), "Rio de Janeiro", "RJ", null, e1);
		Ligacao l3 = new Ligacao(3, "4758-6958", LocalDateTime.of(2017, 9, 12, 17, 12),
				LocalDateTime.of(2017, 9, 12, 18, 12), "Brasilia", "DF", c3, null);
		Ligacao l4 = new Ligacao(4, "2345-8945", LocalDateTime.of(2017, 9, 12, 17, 12),
				LocalDateTime.of(2017, 9, 12, 17, 14), "São Paulo", "SP", c4, null);
		Ligacao l5 = new Ligacao(5, "1245-7896", LocalDateTime.of(2017, 9, 12, 18, 45),
				LocalDateTime.of(2017, 9, 12, 19, 00), "Rio de Janeiro", "RJ", null, e2);
		Ligacao l6 = new Ligacao(6, "3265-8974", LocalDateTime.of(2017, 9, 12, 19, 21),
				LocalDateTime.of(2017, 9, 12, 19, 30), "São Paulo", "SP", c6, null);
		Ligacao l7 = new Ligacao(7, "1245-7896", LocalDateTime.of(2017, 9, 12, 19, 55),
				LocalDateTime.of(2017, 9, 12, 20, 30), "Brasilia", "DF", null, e3);
		Ligacao l8 = new Ligacao(8, "4758-6958", LocalDateTime.of(2017, 9, 12, 20, 0),
				LocalDateTime.of(2017, 9, 12, 20, 22), "Rio de Janeiro", "RJ", c2, null);
		Ligacao l9 = new Ligacao(9, "3265-8974", LocalDateTime.of(2017, 9, 12, 20, 13),
				LocalDateTime.of(2017, 9, 12, 20, 51), "Rio de Janeiro", "RJ", c4, null);
		Ligacao l10 = new Ligacao(10, "1245-7896", LocalDateTime.of(2017, 9, 12, 21, 4),
				LocalDateTime.of(2017, 9, 12, 23, 44), "Belo Horizonte", "MG", c5, null);
		Ligacao l11 = new Ligacao(11, "4758-6958", LocalDateTime.of(2017, 9, 12, 22, 13),
				LocalDateTime.of(2017, 9, 12, 22, 19), "Rio de Janeiro", "RJ", null, e4);
		Ligacao l12 = new Ligacao(12, "2345-8945", LocalDateTime.of(2017, 9, 13, 9, 25),
				LocalDateTime.of(2017, 9, 13, 10, 15), "São Paulo", "SP", null, e4);
		Ligacao l13 = new Ligacao(13, "1245-7896", LocalDateTime.of(2017, 9, 13, 14, 36),
				LocalDateTime.of(2017, 9, 13, 15, 55), "São Paulo", "SP", null, e2);
		Ligacao l14 = new Ligacao(14, "3265-8974", LocalDateTime.of(2017, 9, 13, 20, 01),
				LocalDateTime.of(2017, 9, 13, 22, 12), "São Paulo", "SP", c2, null);
		Ligacao l15 = new Ligacao(15, "1245-7896", LocalDateTime.of(2017, 9, 13, 21, 14),
				LocalDateTime.of(2017, 9, 13, 21, 56), "Brasilia", "DF", c3, null);
		Ligacao l16 = new Ligacao(16, "4758-6958", LocalDateTime.of(2017, 9, 14, 12, 0),
				LocalDateTime.of(2017, 9, 14, 12, 55), "Belo Horizonte", "MG", null, e1);
		Ligacao l17 = new Ligacao(17, "2345-8945", LocalDateTime.of(2017, 9, 14, 16, 32),
				LocalDateTime.of(2017, 9, 14, 17, 21), "Rio de Janeiro", "RJ", c4, null);
		Ligacao l18 = new Ligacao(18, "1245-7896", LocalDateTime.of(2017, 9, 14, 20, 34),
				LocalDateTime.of(2017, 9, 14, 20, 35), "Rio de Janeiro", "RJ", c5, null);
		Ligacao l19 = new Ligacao(19, "4758-6958", LocalDateTime.of(2017, 9, 15, 10, 47),
				LocalDateTime.of(2017, 9, 15, 11, 03), "São Paulo", "SP", c2, null);
		Ligacao l20 = new Ligacao(20, "3265-8974", LocalDateTime.of(2017, 9, 15, 23, 35),
				LocalDateTime.of(2017, 9, 15, 23, 55), "Brasilia", "DF", null, e2);

		// Armazenando ligação
		this.ligacoes.add(l1);
		this.ligacoes.add(l2);
		this.ligacoes.add(l3);
		this.ligacoes.add(l4);
		this.ligacoes.add(l5);
		this.ligacoes.add(l6);
		this.ligacoes.add(l7);
		this.ligacoes.add(l8);
		this.ligacoes.add(l9);
		this.ligacoes.add(l10);
		this.ligacoes.add(l11);
		this.ligacoes.add(l12);
		this.ligacoes.add(l13);
		this.ligacoes.add(l14);
		this.ligacoes.add(l15);
		this.ligacoes.add(l16);
		this.ligacoes.add(l17);
		this.ligacoes.add(l18);
		this.ligacoes.add(l19);
		this.ligacoes.add(l20);
	}

	// Recupera o arraylist de Clientes
	public ArrayList<Cliente> getClientes() {
		return clientes;
	}

	// Recupera o arraylist de Empresa
	public void setEmpresa(ArrayList<Empresa> empresa) {
		this.empresa = empresa;
	}

	// Recupera o arraylist das Ligações
	public ArrayList<Ligacao> getLigacoes() {
		return ligacoes;
	}

	// Retorna cliente de acordo com a nome
	public Cliente getClientePorNome(String nome) {
		Cliente retorno = null;

		// Percorrer a lista de usuarios
		for (int i = 0; i < this.clientes.size(); i++) {
			if (this.clientes.get(i).getNome().equals(nome)) {
				retorno = this.clientes.get(i);
			}
		}
		return retorno;
	}

	// Retorna Empresa de acordo com a nome
	public Empresa getEmpresaPorNome(String nome) {
		Empresa retorno = null;

		// Percorrer a lista de usuarios
		for (int i = 0; i < this.empresa.size(); i++) {
			if (this.empresa.get(i).getNome().equals(nome)) {
				retorno = this.empresa.get(i);
			}
		}
		return retorno;
	}

	// Retorna Empresa de acordo com a codigo
	public Ligacao getLigacaoPorcodigo(int codigo) {
		Ligacao retorno = null;

		// Percorrer a lista de usuarios
		for (int i = 0; i < this.ligacoes.size(); i++) {
			if (this.ligacoes.get(i).getCodigo() == codigo) {
				retorno = this.ligacoes.get(i);
			}
		}
		return retorno;
	}

	// Insere um Cliente na lista de clientes
	public void insereCliente(Cliente cliente) {
		this.clientes.add(cliente);
	}

	// Insere um Empresa na lista de clientes
	public void insereCliente(Empresa empresa) {
		this.empresa.add(empresa);
	}

	// Insere um Ligação na lista de ligações
	public void insereCliente(Ligacao ligacao) {
		this.ligacoes.add(ligacao);
	}

}
