package br.edu.unicid.bean;

import java.util.Date;

public class Alunos {
	
	private int rgm;
	private String nome;
	private String email;
	private Date dataNascimento;
	private int idade;
	private String endereco;
	
	public Alunos(int rgm, String nome, String email, Date dataNascimento, int idade, String endereco) {
		super();
		this.rgm = rgm;
		this.nome = nome;
		this.email = email;
		this.dataNascimento = dataNascimento;
		this.idade = idade;
		this.endereco = endereco;
	}

	public int getRgm() {
		return rgm;
	}

	public void setRgm(int rgm) {
		this.rgm = rgm;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}


	
		
	
}
 