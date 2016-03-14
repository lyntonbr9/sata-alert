package br.com.lle.sata.alert.domain;

public class UsuarioAlert {
	private String login;
	private String regId;
	
	public UsuarioAlert() {}
	
	public UsuarioAlert(String login, String regId) {
		this.login = login;
		this.regId = regId;
	}
	
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getRegId() {
		return regId;
	}
	public void setRegId(String regId) {
		this.regId = regId;
	}
}
