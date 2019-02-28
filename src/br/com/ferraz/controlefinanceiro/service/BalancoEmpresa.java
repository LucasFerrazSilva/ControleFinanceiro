package br.com.ferraz.controlefinanceiro.service;

import java.util.HashMap;

import br.com.ferraz.controlefinanceiro.model.Divida;
import br.com.ferraz.controlefinanceiro.model.Pagamento;

public class BalancoEmpresa {
	
	private HashMap<String, Divida> dividas = new HashMap<>();
	

	public void registraDivida(String credor, String cnpjCredor, double valor) {
		Divida divida = new Divida(valor, credor, cnpjCredor);
		
		dividas.put(cnpjCredor, divida);
	}
	
	public void pagaDivida(String cnpjCredor, double valor, String pagador, String cnpjPagador) {
		Divida divida = dividas.get(cnpjCredor);
		
		if(divida != null) {
			Pagamento pagamento = new Pagamento(pagador, cnpjPagador, valor);
			divida.registra(pagamento);
		}
	}
	
}
