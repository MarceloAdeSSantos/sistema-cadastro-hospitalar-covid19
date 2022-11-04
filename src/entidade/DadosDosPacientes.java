package entidade;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DadosDosPacientes {

	DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	
	private String nome;
	private String cpf;
	private String telefone;
	private String endereco1;
	private String endereco2;
	private LocalDate nascimento;
	private String email;
	private LocalDate diagnostico;
	private String comorbidade2;

	public DadosDosPacientes(String nome, String cpf, String telefone, String endereco1, String endereco2,
			LocalDate nascimento, String email, LocalDate diagnostico, String comorbidade2) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.telefone = telefone;
		this.endereco1 = endereco1;
		this.endereco2 = endereco2;
		this.nascimento = nascimento;
		this.email = email;
		this.diagnostico = diagnostico;
		this.comorbidade2 = comorbidade2;
	}

	public DadosDosPacientes(String nome, String cpf, String telefone, String endereco1, String endereco2,
			LocalDate nascimento, String email, LocalDate diagnostico) {
		this.nome = nome;
		this.cpf = cpf;
		this.telefone = telefone;
		this.endereco1 = endereco1;
		this.endereco2 = endereco2;
		this.nascimento = nascimento;
		this.email = email;
		this.diagnostico = diagnostico;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEndereco1() {
		return endereco1;
	}

	public void setEndereco1(String endereco1) {
		this.endereco1 = endereco1;
	}

	public String getEndereco2() {
		return endereco2;
	}

	public void setEndereco2(String endereco2) {
		this.endereco2 = endereco2;
	}

	public LocalDate getNascimento() {
		return nascimento;
	}

	public void setNascimento(LocalDate nascimento) {
		this.nascimento = nascimento;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public LocalDate getDiagnostico() {
		return diagnostico;
	}

	public void setDiagnostico(LocalDate diagnostico) {
		this.diagnostico = diagnostico;
	}

	public String getComorbidade2() {
		return comorbidade2;
	}

	public void setComorbidade2(String comorbidade2) {
		this.comorbidade2 = comorbidade2;
	}

	@Override
	public String toString() {
		 return "Verificamos que o(a) "
				+ nome
				+ ", do CPF "
				+ cpf
				+ ",\ndo Telefone: "
				+ telefone
				+ ", do Endereço: "
				+ endereco1
				+ " - "
				+ endereco2
				+ ",\ndo Email: "
				+ email
				+ ", nascido(a) na data de "
				+ nascimento.format(formato)
				+ ", foi diagnosticado(a) em "
				+ diagnostico.format(formato)
				+ ",\ne o(a) mesmo(a) alegou que tem tais comorbidades: "
				+ comorbidade2
				+ ".\nAssim sendo, averiguamos que o(a) mesmo(a) faz parte do grupo de risco,"
				+ "\ne por isso, guardamos os dados do(a) mesmo(a)"
				+ "\npara posteriormente enviar ao centro da Secretaria de Saúde da cidade.";
	}
}