package model;

public class Pessoa {
	//Atributos 
	private String nome;
	private int telefone;
	
	//Metodos acessores
	public String getNome(){
		return nome;
	}
	public void setNome(String nome) {
		if(!nome.equals("") ) {
			this.nome = nome;
		}else {
		throw new IllegalArgumentException("O nome não pode ser vazio");	
		} 
		
	}
	public int getTelefone() {
		return telefone;
	}
	public void setTelefone (int telefone) {
		if(telefone > 1000000) {
			this.telefone = telefone;
			
		}else {
			throw new IllegalArgumentException("O telefone deve ter ao menos sete digitos");
		}
	}
	//Construtor
	public Pessoa(String nome, int telefone) {
		setNome(nome);
		setTelefone(telefone);
	}
	public Pessoa() {
		
	}
}
