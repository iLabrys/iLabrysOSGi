/**
 * 
 */
package es.itecban.deployment.utils;

import javax.servlet.ServletContext;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import es.itecban.deployment.utils.beans.HeaderBean;

/**
 * @author emocana
 *
 */
public class Util {

	/**
	 * Obtiene el bean de Spring "header" con el que manejamos las Uris a los diferentes 
	 * componentes del sistema (execution manager, environment, repository y artifact).
	 * 
	 * @param servletContext
	 * @return
	 */
	static public HeaderBean getBeanHeader (ServletContext servletContext)
	{
		WebApplicationContext springCtx =
		    WebApplicationContextUtils.getRequiredWebApplicationContext(servletContext);
		return (HeaderBean)springCtx.getBean("header");
	}
}
