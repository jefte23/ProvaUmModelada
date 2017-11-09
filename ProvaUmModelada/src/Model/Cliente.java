package Model;

import java.time.LocalDate;

public class Cliente {
	
	private String nome;
	private String CPF;
	private LocalDate dataDeNascimento;
	private String telefone;
	private String cidade;
	private String UF;
	
	// Metodo ToString
	@Override
	public String toString() {
		return "Cliente [nome=" + nome + ", CPF=" + CPF + ", dataDeNascimento=" + dataDeNascimento + ", telefone="
				+ telefone + ", cidade=" + cidade + ", UF=" + UF + "]";
	}
	
	// Metodo Construtor
	public Cliente(String nome, String cPF, LocalDate dataDeNascimento, String telefone, String cidade, String uF) {
		super();
		this.nome = nome;
		CPF = cPF;
		this.dataDeNascimento = dataDeNascimento;
		this.telefone = telefone;
		this.cidade = cidade;
		UF = uF;
	}
	
	// Metodo Get's Set's
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCPF() {
		return CPF;
	}
	public void setCPF(String cPF) {
		CPF = cPF;
	}
	public LocalDate getDataDeNascimento() {
		return dataDeNascimento;
	}
	public void setDataDeNascimento(LocalDate dataDeNascimento) {
		this.dataDeNascimento = dataDeNascimento;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getUF() {
		return UF;
	}
	public void setUF(String uF) {
		UF = uF;
	}
	
	

}
