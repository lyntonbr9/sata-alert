package br.com.lle.alert.domain;

import java.util.List;

public class AvisoStop {

	private UsuarioAlert usuario;
	private List<StopAtivo> stopsAtivo;
	
	public UsuarioAlert getUsuario() {
		return usuario;
	}
	public void setUsuario(UsuarioAlert usuario) {
		this.usuario = usuario;
	}
	public List<StopAtivo> getStopsAtivo() {
		return stopsAtivo;
	}
	public void setStopsAtivo(List<StopAtivo> stopsAtivo) {
		this.stopsAtivo = stopsAtivo;
	}
	
}
