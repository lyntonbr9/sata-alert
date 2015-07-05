package br.com.lle.alert.domain;

import java.math.BigDecimal;

public class StopAtivo {
	
	public static int MAX_NUM_NOTIFIC = 3;
	private String ativo;
	StopDisparo minDisparo = new StopDisparo();
	StopDisparo maxDisparo = new StopDisparo();
	
	public StopAtivo(String ativo, String precoMinDisparo, String precoMaxDisparo) {
		this.ativo = ativo;
		this.minDisparo.setPreco(new BigDecimal(precoMinDisparo));
		this.maxDisparo.setPreco(new BigDecimal(precoMaxDisparo));
	}
	
	public String getAtivo() {
		return ativo;
	}
	public void setAtivo(String ativo) {
		this.ativo = ativo;
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

}
