package es.itecban.deployment.executionmanager;

public class MessageException extends Exception{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String[] args;
	
	public MessageException (String message, String... args){
		
		super(message);
		this.args = args;
	}
	
	@Override
	public String getMessage() {
		return super.getMessage();
	}
	
	public String[] getArgs() {
		return args;
	}
}
