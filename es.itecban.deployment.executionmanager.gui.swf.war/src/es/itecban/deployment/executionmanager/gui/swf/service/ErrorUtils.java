/*******************************************************************************
 * Copyright 2014 Indra
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 ******************************************************************************/
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
