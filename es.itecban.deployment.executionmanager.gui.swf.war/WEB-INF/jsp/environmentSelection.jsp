<%@ page language="java" contentType="text/html"%>
<%@ page session="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="org.springframework.webflow.execution.RequestContext" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>


<jsp:include page="header.jsp"/>

<script type="text/javascript">
	function doProceed(){
		document.getElementById("progressDiv").style.display = "block";
		document.getElementById("btCancel").disabled = true;
		document.getElementById("btProceed").disabled = true;
		document.getElementById("f").action += "&_eventId=selectEnvironment";
		if (document.all){
			setTimeout("sendTheForm()",1000);
		}else{
			sendTheForm();
		}
	}
	
	function doCancel(){
		document.getElementById("f").action += "&_eventId=back";
		sendTheForm();
		
	}

	function sendTheForm(){
		objF = document.getElementById("f");
		objF.submit();
	}
</script>

	<h1><spring:message code="environmentSelection.h1" /></h1>

	<form action="${flowExecutionUrl}" method="post" name="enviromentForm" id="f">
	<fieldset>
		<legend><spring:message code="environmentSelection.legend" /></legend>

		<div class="indent">
<% 	String [] environments = (String []) request.getAttribute("environments");
	for(int i = 0; i < environments.length; i++){%>
			
			<p><input type="radio" name="selectedEnvironment" value="<%= environments[i] %>"	/> <%= environments[i] %></p>
<%		
	}
%>
		</div>
		<br/><br/>
		<div style="display:none;text-align:center;" id="progressDiv">
			<img src="../img/progressBar.gif" border="0"><br /><br />
		</div>
	
		<br/><br/>
	
		<div class="bt">
			<input type="button" name="_eventId_back" value="<spring:message code="environmentSelection.submit.back" />" class="border" id="btCancel" onclick="doCancel()"/>
			<input type="button" name="_eventId_selectEnvironment" value="<spring:message code="environmentSelection.submit.selectEnvironment" />" class="border" id="btProceed" onclick="doProceed()" />
		</div>	

	</fieldset>
	</form>

<jsp:include page="footer.jsp"/>