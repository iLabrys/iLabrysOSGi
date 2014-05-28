package es.itecban.deployment.executionmanager.gui.swf.service;

import org.springframework.binding.message.MessageBuilder;
import org.springframework.binding.message.MessageContext;
import org.springframework.webflow.execution.RequestContext;

public class ErrorUtils {

	public static void createMessageError(RequestContext context, String errorCode, String[] args){
		
		MessageContext messageContext = context.getMessageContext();
		MessageBuilder builder = new MessageBuilder();
		if (args != null && args.length != 0)
			messageContext.addMessage(builder.error().source("error").code(errorCode).defaultText(errorCode).resolvableArgs(args).build());
		else
			messageContext.addMessage(builder.error().source("error").code(errorCode).defaultText(errorCode).build());
//		messageContext.addMessage(builder.warning().source("error").code("hola.error").build());
//		messageContext.addMessage(builder.warning().source("error").code("hola.marta").build());
//		String[] argsArray = {"marta", "jimenez"};
		
	}
}
