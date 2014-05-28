<%@ page language="java" contentType="text/html"%>
<%@ page session="false"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<jsp:include page="header.jsp"/>

	<h1><spring:message code="createPlan.h1" /></h1>
	
	<form action="${flowExecutionUrl}" method="post">
	<fieldset>
		<legend><spring:message code="createPlan.legend" /></legend>
	
		<div class="indent">
			<p><spring:message code="createPlan.p2" /></p>
			<input type="text" name="planName" id="planName" value="" />
		</div>

		<br/><br />

		<div class="bt">
			<input type="submit" name="_eventId_changePlanType" value="<spring:message code="createPlan.submit.changePlanType" />" class="border">
			<input type="submit" name="_eventId_createNewPlan" value="<spring:message code="createPlan.submit.createNewPlan" />" class="border">
		</div>
	</fieldset>
	</form>

<jsp:include page="footer.jsp"/>
