package es.itecban.deployment.security.client.ws;

public class LogonWSTest {
	private LogonWS sc;

	public void init() {
		try {
			System.out.println(sc.logon("A143973", "hola"));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public LogonWS getSc() {
		return sc;
	}

	public void setSc(LogonWS sc) {
		this.sc = sc;
	}

}
