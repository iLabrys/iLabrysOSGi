<%@ page language="java" contentType="text/html"%>
<%@ page session="false"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<jsp:include page="header.jsp" />

	<h1><spring:message code="planLaunched.h1" /></h1>
	
	<br />
	<form action="${flowExecutionUrl}" method="post">
	<input type="submit" name="_eventId_reportView" value="<spring:message code="executionReport.submit.showReport" />"/>
	<input type="submit" name="_eventId_OK" value="<spring:message code="planLaunched.submit.OK" />"/>
	</form>

<jsp:include page="footer.jsp" />