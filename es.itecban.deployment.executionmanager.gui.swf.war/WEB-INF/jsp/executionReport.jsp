<%@ page language="java" contentType="text/html"%>
<%@ page session="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<jsp:include page="header.jsp" />

	<script type="text/javascript">
		function verLog(){
			objTA = document.getElementById("ta");
			if (objTA.style.display!="block"){
				objTA.style.display = "block";
			}else{
				objTA.style.display = "none";
			}
			resizeInnerContentBox();
		}
	
	
		aToDoWhenLoaded = ['cb();'];
	</script>
	<style type="text/css">
	textarea{
		font-family: Trebuchet MS, Verdana, Arial, Geneva, Helvetica, sans-serif;
		font-size: 10px;
		width: 100%;
		display: none;
		margin-left: 10px;
		margin-reight: 10px;
		border: 1px solid #FFFFFF;
	}
	</style>
	<h1><spring:message code="executionReport.h1" /></h1>
	<c:if test="${isExecutedOK}">
		<p><spring:message code="executionReport.p1" /></p>
	</c:if>
	<c:if test="${not isExecutedOK}">
		<p><spring:message code="executionReport.p2" /></p>
	</c:if>
	<p><a href="#" onclick="verLog()"><spring:message code="executionReport.p3" /></a></p>
	
	<form method="post" action="${flowExecutionUrl}" id="f">
		<fieldset>
		<textarea rows="15" cols="50" id="ta">${executionReport}</textarea>
	
		<br />
		<div class="bt"><input type="submit" name="_eventId_showReport" value="<spring:message code="executionReport.submit.showReport" />" class="border"/></div>
		<div class="bt"><input type="submit" name="_eventId_OK" value="<spring:message code="executionReport.submit.OK" />" class="border"/></div>
		</fieldset>
	</form>

<jsp:include page="footer.jsp" />