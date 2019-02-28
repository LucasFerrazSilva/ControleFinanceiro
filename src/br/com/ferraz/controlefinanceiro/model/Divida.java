package br.com.ferraz.controlefinanceiro.model;

import java.util.ArrayList;
import java.util.List;

public class Divida {

	private double total;
	private double valorPago;
	private String credor;
	private String cnpjCredor;
	private List<Pagamento> pagamentos = new ArrayList<>();
	
	
	public Divida() {}
	
	public Divida(double total, String credor, String cnpjCredor) {
		this.total = total;
		this.credor = credor;
		this.cnpjCredor = cnpjCredor;
	}


	public void registra(Pagamento pagamento) {
		if(pagamento == null)
			throw new IllegalArgumentException("Pagamento não pode ser nulo");
		
		paga(pagamento.getValor());
		this.pagamentos.add(pagamento);
	}
	
	private void paga(double valor) {
		if(valor < 0)
			throw new IllegalArgumentException("Valor invalido para pagamento");
		
		if(valor > 100)
			valor -= 8;
		
		this.valorPago = this.valorPago + valor;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public double getValorPago() {
		return valorPago;
	}

	public String getCredor() {
		return credor;
	}

	public void setCredor(String credor) {
		this.credor = credor;
	}

	public String getCnpjCredor() {
		return cnpjCredor;
	}

	public void setCnpjCredor(String cnpjCredor) {
		this.cnpjCredor = cnpjCredor;
	}

	public List<Pagamento> getPagamentos() {
		return pagamentos;
	}

	public void setValorPago(double valorPago) {
		this.valorPago = valorPago;
	}

}
