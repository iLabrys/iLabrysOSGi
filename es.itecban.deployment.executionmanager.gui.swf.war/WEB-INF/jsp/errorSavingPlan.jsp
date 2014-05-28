<%@ page language="java" contentType="text/html"%>
<%@ page session="false"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<jsp:include page="header.jsp" />

	<h1><spring:message code="errorSavingPlan.h1" /></h1>
	
	<br />
	<form action="${flowExecutionUrl}" method="post">
	<input type="submit" name="_eventId_back" value="<spring:message code="errorSavingPlan.submit.back" />"/>
	</form>

<jsp:include page="footer.jsp" />