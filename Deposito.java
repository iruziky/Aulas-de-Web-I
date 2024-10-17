package model;

import java.util.ArrayList;

public class Deposito {
	private ArrayList<Produto> produtos;
	
	public Deposito() {
		this.produtos = new ArrayList<Produto>();
	}

	public void adicionarProduto(Produto produto) {
		produtos.add(produto);
	}
	
	public int informarQtProdutosDeposito() {
		return produtos.size();
	}
	
	public int informarSeDepositoVazio() {
		if (produtos.size() == 0) {
			return 1;
		}
		return 0;
	}
	
	public Produto informarProdutoMaisCaro() {
		Produto produtoMaisCaro = new Produto(null, 0, null, null);
		double maiorPreco = 0;
	
		for (Produto produto: produtos) {
			if(produto.preco > maiorPreco) {
				maiorPreco = produto.preco;
				produtoMaisCaro = produto;
			}
		}
		return produtoMaisCaro;
	}
}
