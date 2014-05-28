<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<jsp:include page="header.jsp"/>

	<style type="text/css">
		fieldset{background: url("./img/bgLogoutBox.jpg") bottom left no-repeat;}
	</style>
	
	<h1><spring:message code="logout.h1" /></h1>
	
	<p><spring:message code="logout.p2" /></p>
	
	<form method="post" action="login.htm" id="f">
		<fieldset>
			<legend><spring:message code="logout.legend" /></legend>
			<div class="indent">
			
				<br /> 
				<p><spring:message code="logout.p3" /></p>
							
				
				<br /><br /><br /><br />
			</div>
			<div class="bt"><input type="submit" name="Send" value="<spring:message code="logout.submit.send" />" class="border"></div>
		</fieldset>
	</form>
	<br />


<jsp:include page="footer.jsp"/>
