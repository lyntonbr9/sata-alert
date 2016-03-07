package br.com.lle.alert.domain;

public class AlertaStop {
	
	private String codigoAtivo;
	private String precoStopLow;
	private String precoStopHigh;
	private boolean habilitado;
	
	public String getCodigoAtivo() {
		return codigoAtivo;
	}
	public void setCodigoAtivo(String codigoAtivo) {
		this.codigoAtivo = codigoAtivo;
	}
	public String getPrecoStopLow() {
		return precoStopLow;
	}
	public void setPrecoStopLow(String precoStopLow) {
		this.precoStopLow = precoStopLow;
	}
	public String getPrecoStopHigh() {
		return precoStopHigh;
	}
	public void setPrecoStopHigh(String precoStopHigh) {
		this.precoStopHigh = precoStopHigh;
	}
	public boolean isHabilitado() {
		return habilitado;
	}
	public void setHabilitado(boolean habilitado) {
		this.habilitado = habilitado;
	}

}
