<%@ page language="java" contentType="text/html"%>
<%@ page session="false"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<jsp:include page="header.jsp" />

<script type="text/javascript">
	function doProceed(){
		document.getElementById("progressDiv").style.display = "block";
		document.getElementById("btCancel").disabled = true;
		document.getElementById("btProceed").disabled = true;
		document.getElementById("f").action += "&_eventId=proceed";
		if (document.all){
			setTimeout("sendTheForm()",1000);
		}else{
			sendTheForm();
		}
	}
	
	function doCancel(){
		document.getElementById("f").action += "&_eventId=cancel";
		sendTheForm();
		
	}

	function sendTheForm(){
		objF = document.getElementById("f");
		objF.submit();
	}
</script>

	<h1><spring:message code="prepareToLaunch.h1" /></h1>
	
	<br/>
	<form action="${flowExecutionUrl}" method="post" id="f">
	<fieldset>
		<legend><spring:message code="prepareToLaunch.legend" /></legend>
		<div class="indent">
			<br/>
			<spring:message code="prepareToLaunch.message" />
		</div>
		<br/><br/>
		<div style="display:none;text-align:center;" id="progressDiv">
			<img src="../img/progressBar.gif" border="0"><br /><br />
		</div>
	
		<br/><br/>
	
		<div class="bt">
			<input type="button" name="_eventId_cancel" value="<spring:message code="prepareToLaunch.submit.cancel" />" class="border" id="btCancel" onclick="doCancel()"/>
			<input type="button" name="_eventId_proceed" value="<spring:message code="prepareToLaunch.submit.proceed" />" class="border" id="btProceed" onclick="doProceed()"/>
		</div>
	</fieldset>
	</form>

<jsp:include page="footer.jsp" />