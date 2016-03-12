package br.com.lle.sata.alert.interfaces;

import br.com.lle.sata.alert.domain.UsuarioAlert;

public interface INotificacao {

	 public void notificar(UsuarioAlert usuario, String msg);
	 
}
