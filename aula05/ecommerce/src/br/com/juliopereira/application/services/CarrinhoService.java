package br.com.juliopereira.application.services;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import br.com.juliopereira.domain.entidades.Funcionario;
import br.com.juliopereira.domain.entidades.Produto;

public class CarrinhoService {
	private LocalDate dataDaCompra;
	private List<Produto> produtos;
	private Double total;
	private CarrinhoService.Checkout checkout;
	
	public CarrinhoService() {
		produtos = new ArrayList<>();
	}
	
	public void adicionarProduto(Produto produto) {
		produtos.add(produto);
	}
	
	public void adicionarProdutos(List<Produto> produtos) {
		this.produtos.addAll(produtos);
	}
	
	public LocalDate getDataDaCompra() {
		return this.dataDaCompra;
	}
	
	public List<Produto> getProdutos(){
		return this.produtos;
	}
	
	public Double getTotal() {
		return this.total;
	}
	
	public void Checkout(Integer caixa, Funcionario funcionario) {
		CarrinhoService.Checkout checkout = new Checkout(caixa, funcionario.nome);
		checkout.FecharCompra();
	}
	
	public CarrinhoService.Checkout getCheckout() {
		return checkout;
	}

 	public class Checkout{
		private Integer caixa;
		private String funcionario;
		
		private Checkout(Integer caixa, String funcionario){
			this.caixa = caixa;
			this.funcionario = funcionario;
		}
		
		public Integer getCaixa() {
			return this.caixa;
		}
		
		public String getFuncionario() {
			return this.funcionario;
		}
		
		public void FecharCompra() {
			CarrinhoService.this.checkout = this;
			CarrinhoService.this.dataDaCompra = LocalDate.now();
			CarrinhoService.this.total = 0.0;
			for(Produto p: CarrinhoService.this.produtos) {
				CarrinhoService.this.total += p.valor;
			}
			
		}
		
		
	}
	
	
}
