package view;

import model.Deposito;
import model.ProdutoDuravel;
import model.ProdutoNaoDuravel;

public class LojaView {
	public static void main(String args[]) {
		Deposito deposito = new Deposito();
		
		ProdutoDuravel geladeira = new ProdutoDuravel("Cycle Defrost", 2311.46, "Eletrolux", "Geladeira de gelo seco", 10);
		ProdutoDuravel livro = new ProdutoDuravel("Meus Grandes predecessores", 89.99, "SOLIS", "Livro de Xadrez do Kasparov", 3);
		ProdutoDuravel celular = new ProdutoDuravel("Moto G54", 1159.99, "Motorola", "Celular custo x beneficio", 3);
		 
		ProdutoNaoDuravel chocolate = new ProdutoNaoDuravel("Barra de chocolate", 6.79, "Nestle", "Chocolate 40% amargo", "11/11/2024", "Comida");
		ProdutoNaoDuravel detergente = new ProdutoNaoDuravel("Detergente", 8.79, "Limpol", "Limpa Legal", "11/11/2024", "Produtos de limpeza");
		ProdutoNaoDuravel sabonete = new ProdutoNaoDuravel("sabonete", 7.79, "Natura", "Cheiroso", "11/11/2024", "Higiene Pessoal");
		
		deposito.adicionarProduto(geladeira);
		deposito.adicionarProduto(livro);
		deposito.adicionarProduto(celular);
		
		deposito.adicionarProduto(chocolate);
		deposito.adicionarProduto(detergente);
		deposito.adicionarProduto(sabonete);
		
		System.out.println(deposito.informarQtProdutosDeposito() + " Produtos no depósito");
		if (deposito.informarSeDepositoVazio() == 1) {
			System.out.println("O Depósito não vazio");
		} else {
			System.out.println("O Depósito não está vazio");
		}		
		System.out.println(deposito.informarProdutoMaisCaro().getNome() + " é o produto mais caro");
	}
}
