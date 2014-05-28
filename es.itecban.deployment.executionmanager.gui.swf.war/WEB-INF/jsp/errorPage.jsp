<%@ page language="java" contentType="text/html"%>
<%@ page session="false"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<jsp:include page="header.jsp" />

	<h1><spring:message code="errorPage.h1" /></h1>
	
	<br/>
	<form action="${flowExecutionUrl}" method="post" id="f">
	<fieldset>
		<legend><spring:message code="errorPage.legend" /></legend>
			<div class="indent">
				<br/>
				<p>
					${messageError}
					${messageContext.allMessages}
				</p>
			</div>
	</fieldset>
	<br/><br/>
	<input type="submit" name="_eventId_finish" value="<spring:message code="errorPage.submit.finish" />" id="f" class="border"/>
	</form>

<jsp:include page="footer.jsp" />