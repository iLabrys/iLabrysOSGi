<%@ page language="java" contentType="text/html"%>
<%@ page session="false"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<jsp:include page="header.jsp" />

	<h1><spring:message code="saveView.message" /></h1>
	
	<br/>
	<form action="${flowExecutionUrl}" method="post">
	
	<fieldset>
		<legend><spring:message code="saveView.toDo" /></legend>
			<!--<div class="indent">
				<br/>
				${messageError}
				${messageContext.allMessages}
			</div>-->
	<br/><br/>
	
	<!--<fieldset>
		<legend><spring:message code="error.legend" /></legend>
			<div class="indent">
				<br/>
				${messageError}
				${messageContext.allMessages}
			</div>
	<br/><br/>-->
	<div class="bt">
		<input type="submit" name="_eventId_launchPlan" value="<spring:message code="saveView.launchPlan" />" class="border" id="f"/>
		<input type="submit" name="_eventId_createNewPlan" value="<spring:message code="saveView.createNewPlan" />" class="border" id="f"/>
		<input type="submit" name="_eventId_finish" value="<spring:message code="saveView.finish" />" class="border" id="f"/>
		<!--<input type="submit" name="_eventId_schedulePlan" value="<spring:message code="saveView.schedulePlan" />" class="border" id="f"/>-->
	</div>
	</form>

<jsp:include page="footer.jsp" />