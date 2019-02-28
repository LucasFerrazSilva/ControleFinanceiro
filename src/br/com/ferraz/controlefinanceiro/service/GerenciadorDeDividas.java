package br.com.ferraz.controlefinanceiro.service;

import br.com.ferraz.controlefinanceiro.model.Divida;
import br.com.ferraz.controlefinanceiro.model.Pagamento;

public class GerenciadorDeDividas {

	public void efetuaPagamento(Divida divida, double valor, String pagador, String cnpjPagador) {
		Pagamento pagamento = new Pagamento(pagador, cnpjPagador, valor);
		divida.registra(pagamento);
	}
	
}
