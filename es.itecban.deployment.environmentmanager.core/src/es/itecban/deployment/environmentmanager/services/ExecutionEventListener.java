package es.itecban.deployment.environmentmanager.services;

import java.util.EventListener;


/**
 * @author lmfteomiro
 * 
 * Defines the interface to the events receptor
 *
 */
public interface ExecutionEventListener extends EventListener {
	
	/**
	 * @param evt Receipt event
	 * @throws Exception 
	 */
	public void captureExecutionEvent (ExecutionEvent evt) throws Exception;

}
