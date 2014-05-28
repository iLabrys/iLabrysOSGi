package es.itecban.deployment.security.client.ws;

import java.io.Serializable;

public class TokenCredentials implements Serializable {

	private static final long serialVersionUID = 1L;	
	private String token;
	
	public TokenCredentials(String token){
		this.token=token;
	}
		
	public String getToken() {
		return token;
	}
	

}
