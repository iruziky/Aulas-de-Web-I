package model;

public class Produto {
	protected String nome;
	protected double preco;
	protected String marca;
	protected String descricao;
	
	public Produto(String nome, double preco, String marca, String descricao) {
		this.nome = nome;
		this.preco = preco;
		this.marca = marca;
		this.descricao = descricao;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

}
