<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<jsp:include page="header.jsp"/>

	<style type="text/css">
		fieldset{background: url("../img/bgErrorBox.jpg") bottom left no-repeat;}
	</style>
	
	<h1><spring:message code="error.h1" /></h1>
	
	<p><spring:message code="error.p1" /></p>
	
	<p><spring:message code="error.p2" /></p>
	
	<form method="post" action="${flowExecutionUrl}" id="f">
		<fieldset>
			<legend><spring:message code="error.legend" /></legend>
			<div class="indent">
				<p>
				<c:choose>
					<c:when test="${not empty param.error}">
						<spring:message code="${param.error}"/>
					</c:when>
					<c:when test="${not empty error}">
						<spring:message code="${error}"/>
					</c:when>
					<c:when test="${not empty flowRequestContext.messageContext.allMessages}">
						<c:forEach items="${flowRequestContext.messageContext.allMessages}" var="message">
    							<c:if test="${message.source eq 'error'}">
      								<div class="error-msg">${message.text}</div>
      							</c:if>
      						</c:forEach>
					</c:when>
					<c:otherwise>
						<spring:message code="error.nodesc"/>						
					</c:otherwise>
				</c:choose>
				</p>
											
				<br /><br /><br /><br /><br /><br /> 
			</div>
			<div class="bt">
				<input type="submit" name="_eventId_back" value="<spring:message code="error.back" />" class="border">
			</div>
		</fieldset>
	</form>
	<br />


<jsp:include page="footer.jsp"/>
