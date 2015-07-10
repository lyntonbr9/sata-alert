package br.com.lle.alert.domain;

import java.math.BigDecimal;

public class StopAtivo {
	
	public static int MAX_NUM_NOTIFIC = 3;
	private String codigoAtivo;
	private StopDisparo minDisparo = new StopDisparo();
	private StopDisparo maxDisparo = new StopDisparo();
	private boolean habilitado;
	
	public StopAtivo(String codigoAtivo, String precoMinDisparo, String precoMaxDisparo, boolean habilitado) {
		this.codigoAtivo = codigoAtivo;
		this.minDisparo.setPreco(new BigDecimal(precoMinDisparo));
		this.maxDisparo.setPreco(new BigDecimal(precoMaxDisparo));
		this.habilitado = habilitado;
	}
	
	public String getCodigoAtivo() {
		return codigoAtivo;
	}

	public void setCodigoAtivo(String codigoAtivo) {
		this.codigoAtivo = codigoAtivo;
	}

	public StopDisparo getMinDisparo() {
		return minDisparo;
	}

	public void setMinDisparo(StopDisparo minDisparo) {
		this.minDisparo = minDisparo;
	}

	public StopDisparo getMaxDisparo() {
		return maxDisparo;
	}

	public void setMaxDisparo(StopDisparo maxDisparo) {
		this.maxDisparo = maxDisparo;
	}

	public boolean isHabilitado() {
		return habilitado;
	}

	public void setHabilitado(boolean habilitado) {
		this.habilitado = habilitado;
	}

}
