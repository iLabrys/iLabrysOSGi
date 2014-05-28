<%@ page language="java" contentType="text/html"%>
<%@ page session="false"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<jsp:include page="header.jsp" />


	
	<c:choose>
		<c:when test="${operationFlow =='updateFlow'}">	
			<h1><spring:message code="warnAboutUpdate.h1" /></h1>
		</c:when>
		<c:when test="${operationFlow =='deleteFlow'}">		
			<h1><spring:message code="warnAboutDelete.h1" /></h1>
		</c:when>
		<c:otherwise>
		 	<h1><spring:message code="warnAboutUpdate.h1" /></h1>
		</c:otherwise>
	</c:choose>				
	
	
	<br/>
	<form action="${flowExecutionUrl}" method="post">
	<fieldset>
		<legend><spring:message code="warnAboutDelete.legend" /></legend>
			<div class="indent">
				<br/>
				<c:choose>
					<c:when test="${operationFlow =='updateFlow'}">	
						<spring:message code="warnAboutUpdate.warning" />	
					</c:when>
					<c:when test="${operationFlow =='deleteFlow'}">		
						<spring:message code="warnAboutDelete.warning" />	
					</c:when>
					<c:otherwise>
			 	 		<spring:message code="warnAboutDelete.warning" />
			 		</c:otherwise>
				</c:choose>					
			</div>
	<br/><br/>
	<div class="bt">
		<input type="submit" name="_eventId_back" value="<spring:message code="warnAboutDelete.submit.back" />" class="border" />
		<input type="submit" name="_eventId_next" value="<spring:message code="warnAboutDelete.submit.next" />" class="border"/>
	</div>
	</form>

<jsp:include page="footer.jsp" />