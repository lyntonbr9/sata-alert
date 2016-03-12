package br.com.lle.sata.alert.domain;

import java.math.BigDecimal;

public class StopDisparo {

	private BigDecimal preco;
	private boolean notificar;
	private String mensagem;
	private int qtdNotificacoes;
	
	public BigDecimal getPreco() {
		return preco;
	}
	public void setPreco(BigDecimal preco) {
		this.preco = preco;
	}
	public boolean isNotificar() {
		return notificar;
	}
	public void setNotificar(boolean notificar) {
		this.notificar = notificar;
	}
	public String getMensagem() {
		return mensagem;
	}
	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}
	public int getQtdNotificacoes() {
		return qtdNotificacoes;
	}
	public void setQtdNotificacoes(int qtdNotificacoes) {
		this.qtdNotificacoes = qtdNotificacoes;
	}
	
}
