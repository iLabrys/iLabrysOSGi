package es.itecban.deployment.security.client.ws;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.HashMap;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Source;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.TransformerFactoryConfigurationError;
import javax.xml.transform.dom.DOMSource;

import org.springframework.security.Authentication;
import org.springframework.security.AuthenticationException;
import org.springframework.security.BadCredentialsException;
import org.springframework.security.GrantedAuthority;
import org.springframework.security.GrantedAuthorityImpl;
import org.springframework.security.providers.AuthenticationProvider;
import org.springframework.security.providers.UsernamePasswordAuthenticationToken;
import org.springframework.security.userdetails.UserDetails;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.xml.transform.StringResult;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.w3c.dom.Text;
import org.xml.sax.SAXException;

public class LogonWS extends WebServiceGatewaySupport implements
		AuthenticationProvider {

	public static final String NAMESPACE_URI = "http://Logon.ws.endpoints.seguridad.src.itecban.com/";
	public static final String LOGON_PREFIX = "log";
	// Elementos de la estructura del mensaje de Login
	public static final String LOGON_OPERATION = "logon";
	public static final String LOGON_PARAM = "arg0";
	private static final String PARTE_TECNICA = "parte_tecnica";
	private static final String DATOS_TECNICOS = "DatosTecnicos";
	private static final String COD_SERVICIO = "CodigoServicio";
	private static final String COD_APP_CANAL = "CodigoAplicacionCanal";
	private static final String CANAL_DIST = "CanalDistribucion";
	private static final String VER_SERV = "VersionServicio";
	private static final String ID_MENSAJE = "IdentificadorUnicoMensaje";
	private static final String MOMENTO_EJEC = "MomentoEjecucion";

	// Valores de la cabecera tecnica
	private static final String COD_SERVICIO_VALUE = "SecurityLogonWsService";
	private static final String COD_APP_CANAL_VALUE = "050";
	private static final String CANAL_DIST_VALUE = "0010";
	private static final String VER_SERV_VALUE = "1";
	private static final String ID_MENSAJE_VALUE = "SRINF01000007600001 010.002.083.041               012009-01-20T12:40:08.876+01:000000000000000000000";
	private static final String MOMENTO_EJEC_VALUE = "2009-01-20T12:40:08.876+01:00";
	private static final String ID_ORIGIN_VALUE = "ILABRYS";

	// Valores del servicio de seguridad
	private static final String PARTE_ESPECIFICA = "parteEspecifica";
	private static final String ID_ORIGIN = "idOrigin";
	private static final String PASSWORD = "password";
	private static final String USERNAME = "user";
	private static final String TOKEN = "token";

	private boolean enableSecurity;
	private DocumentBuilderFactory factory;
	private DocumentBuilder documentBuilder;
	private RoleManager rm;

	// Init method
	public void init() throws ParserConfigurationException {
		factory = DocumentBuilderFactory.newInstance();
		factory.setNamespaceAware(true);
		documentBuilder = factory.newDocumentBuilder();
	}
	
	public void setRm(RoleManager rm) {
		this.rm = rm;
	}

	private Element getRequestElement(String operationName) {
		// Create the DOM document
		Document doc = documentBuilder.newDocument();
		doc.setDocumentURI(NAMESPACE_URI);
		// Create the root element
		Element requestElement = doc.createElementNS(NAMESPACE_URI,
				operationName);
		// Element requestElement = doc.createElement(operationName);
		doc.appendChild(requestElement);
		// Return it
		return requestElement;
	}

	private Document getResponseDocument(Source requestSource)
			throws IOException, SAXException {
		// Prepare the result
		StringResult result = new StringResult();
		// Send the request and get the response
		//getWebServiceTemplate().sendSourceAndReceiveToResult(requestSource,new
		// Callback(),result);
		getWebServiceTemplate().sendSourceAndReceiveToResult(requestSource,
				result);
		// Create the inputStream
		byte xmlBytes[] = result.toString().getBytes("UTF-8");
		ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(
				xmlBytes);
		// Create the DOM document
		return documentBuilder.parse(byteArrayInputStream);
	}

	private static void addTextNode(Element element, String nodeName,
			String textValue) {
		// Get the document
		Document doc = element.getOwnerDocument();
		// Write the name
		Node resourceNameNode = doc.createElement(nodeName);
		element.appendChild(resourceNameNode);
		Text resourceNameText = doc.createTextNode(textValue);
		resourceNameNode.appendChild(resourceNameText);
	}

	private Node addChildNode(Element parent, String nodeName) {
		// Get the document
		Document doc = parent.getOwnerDocument();
		// Write the name
		Node resourceNameNode = doc.createElement(nodeName);
		parent.appendChild(resourceNameNode);
		return resourceNameNode;
	}

	/**
	 * 
	 * @param username
	 * @param password
	 * @return the security token obtained by invoking ITECBAN's security
	 *         service or ANONYMOUSTOKEN if security is disabled
	 */
	public String logon(String username, String password) throws Exception {
		// Get the request element and document
		if (!isEnableSecurity())
			return "ANONYMOUSTOKEN";

		Element requestElement = this.getRequestElement(LogonWS.LOGON_PREFIX
				+ ":" + LogonWS.LOGON_OPERATION);
		Document requestDoc = requestElement.getOwnerDocument();
		// Add main element
		Node logon = addChildNode(requestElement, LogonWS.LOGON_PARAM);
		Node ptecnica = addChildNode((Element) logon, LogonWS.PARTE_TECNICA);
		Node dtecnicos = addChildNode((Element) ptecnica,
				LogonWS.DATOS_TECNICOS);
		addTextNode((Element) dtecnicos, LogonWS.COD_SERVICIO,
				LogonWS.COD_SERVICIO_VALUE);
		addTextNode((Element) dtecnicos, LogonWS.COD_APP_CANAL,
				LogonWS.COD_APP_CANAL_VALUE);
		addTextNode((Element) dtecnicos, LogonWS.CANAL_DIST,
				LogonWS.CANAL_DIST_VALUE);
		addTextNode((Element) dtecnicos, LogonWS.VER_SERV,
				LogonWS.VER_SERV_VALUE);
		// FIXME Change these values for real ones obtained using "capa tecnica"
		// classes
		addTextNode((Element) dtecnicos, LogonWS.ID_MENSAJE,
				LogonWS.ID_MENSAJE_VALUE);
		addTextNode((Element) dtecnicos, LogonWS.MOMENTO_EJEC,
				LogonWS.MOMENTO_EJEC_VALUE);
		Node pespecifica = addChildNode((Element) logon,
				LogonWS.PARTE_ESPECIFICA);
		addTextNode((Element) pespecifica, LogonWS.ID_ORIGIN,
				LogonWS.ID_ORIGIN_VALUE);
		addTextNode((Element) pespecifica, LogonWS.PASSWORD, password);
		addTextNode((Element) pespecifica, LogonWS.USERNAME, username);
		Source requestSource = new DOMSource(requestDoc);
		// printMessage(requestSource);
		Document responseDoc = this.getResponseDocument(requestSource);
		// Get the operation result (security token) and return it
		NodeList token = responseDoc.getElementsByTagName(LogonWS.TOKEN);
		if (token == null)
			throw new Exception("Logon reject for user:" + username);
		return token.item(0).getTextContent();
	}

	private void printMessage(Source requestSource)
			throws TransformerFactoryConfigurationError,
			TransformerConfigurationException, TransformerException {
		// Create the response document
		java.io.StringWriter writer = new StringWriter();
		javax.xml.transform.Result result = new javax.xml.transform.stream.StreamResult(
				writer);
		javax.xml.transform.TransformerFactory tfactory = TransformerFactory
				.newInstance();
		javax.xml.transform.Transformer xform = tfactory.newTransformer();
		xform.transform(requestSource, result);
		System.out.println(writer.toString());
	}

	@Override
	public Authentication authenticate(Authentication authentication)
			throws AuthenticationException {
		Object obj = authentication.getPrincipal();
 		String username = "";
		String password = "";
		// First extract username and password details

		if (obj instanceof UserDetails) {
			username = ((UserDetails) obj).getUsername();
			password = ((UserDetails) obj).getPassword();
		} else {
			username = (String) authentication.getPrincipal();
			password = (String) authentication.getCredentials();
		}

		// If security is enabled then check if we must rely on the
		// list of pre-authenticated users
		try {
			if (isEnableSecurity() && this.rm.getUsers() != null) {
				boolean valid = false;
				if (username != null)
					if (this.rm.getUsers().containsKey(username)
							&& this.rm.getUsers().get(username).equals(password)) {
						valid = true;
					}
				if (!valid)
					throw new BadCredentialsException(
							"Username and password are not valid");
				// return a token generated by the internal users list
				String token = "ILABRYS-INTERNAL-TOKEN";
				GrantedAuthority[] auths = this.getGrantedAuthorities(username);
				return new UsernamePasswordAuthenticationToken(username,
						new TokenCredentials(token), auths);
			}

			// If the token is already obtained then we do not need to validate
			// the token again
			// and the user is already authenticated
			if (obj instanceof TokenCredentials) {
				// TODO Validate the token, it could have expired or be invalid
				return authentication;
			}

			String token = this.logon(username, password);
			GrantedAuthority[] auths = this.getGrantedAuthorities(username);
			return new UsernamePasswordAuthenticationToken(username,
					new TokenCredentials(token), auths);
		} catch (Exception e) {
			throw new BadCredentialsException(e.getMessage(), e);
		}
	}

	private GrantedAuthority[] getGrantedAuthorities(String user)
			throws Exception {
		String[] roles = this.rm.getUserRoles(user);
		GrantedAuthority[] gauths = new GrantedAuthority[roles.length];
		for (int i = 0; i < roles.length; i++) {
			gauths[i] = new GrantedAuthorityImpl(roles[i]);
		}
		return gauths;
	}

	@Override
	public boolean supports(Class authentication) {
		// TODO Implement this method
		return true;
	}

	public void setEnableSecurity(boolean enableSecurity) {
		this.enableSecurity = enableSecurity;
	}

	public boolean isEnableSecurity() {
		return enableSecurity;
	}
	

}

// class Callback extends SoapActionCallback{
//	
// public Callback(){
// this("");
// }
//
// public Callback(String soapAction) {
// super(soapAction);
// }
// @Override
// public void doWithMessage(WebServiceMessage message) throws IOException {
// super.doWithMessage(message);
// SaajSoapMessage smes= (SaajSoapMessage)message;
// SOAPMessage sm=smes.getSaajMessage();
// SOAPPart sp=sm.getSOAPPart();
// try {
// SOAPEnvelope se=sp.getEnvelope();
// se.addNamespaceDeclaration(LogonWS.LOGON_PREFIX, LogonWS.NAMESPACE_URI);
// NodeList nl=se.getElementsByTagName(LogonWS.LOGON_OPERATION);
// for (int i = 0; i < nl.getLength(); i++) {
// nl.item(i).setPrefix(LogonWS.LOGON_PREFIX);
// }
// } catch (SOAPException e) {
// // TODO Auto-generated catch block
// e.printStackTrace();
// }
//	
// }
//	
// }