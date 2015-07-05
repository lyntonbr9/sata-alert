package br.com.lle.alert.interfaces;

import br.com.lle.alert.domain.UsuarioAlert;

public interface INotificacao {

	 public void notificar(UsuarioAlert usuario, String msg);
	 
}
