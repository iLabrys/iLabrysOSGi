<%@ page language="java" contentType="text/html"%>
<%@ page session="false"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<jsp:include page="header.jsp"/>

	<script type="text/javascript">
	aMsg = new Array();
	aMsg[0] = ['Error','<spring:message code="findByResource.error.0" />'];
	aMsg[1] = ['Error','<spring:message code="findByResource.error.1" />'];
	aMsg[2] = ['Error','<spring:message code="findByResource.error.2" />'];
	
	function validateUnitSearchByResource() {
		
		objN = document.getElementById("resourceName");
		objV = document.getElementById("resourceVersion");
		objT = document.getElementById("resourceType");
		
		if (objN.value == "" || objN.value.length==0) {
			writeMsg(0);
			objN.focus();
			return false;
		}else if (objV.value == "" || objV.value.length==0) {
			writeMsg(1);
			objV.focus();
			return false;
		}else if (objT.value == "" || objT.value.length==0) {
			writeMsg(2);
			objT.focus();
			return false;
		}else {
			return true;
		}
	}
	</script>

	<h1><spring:message code="findByResource.h1" /></h1>

	<form method="post" action="${flowExecutionUrl}" id="f">
	<fieldset>
		<legend><spring:message code="findByResource.legend" /></legend>

		<p><spring:message code="findByResource.p1" /></p>

		<div class="indent">
			<br />

			<table>
			<tr>
				<td><label for="resourceName"><spring:message code="findByResource.label.resourceName" /></label></td>
				<td><input type="text" name="resourceName" id="resourceName" class="border" value=""/></td>
				<td>*</td>
			</tr>
			<tr>
				<td><label for="resourceVersion"><spring:message code="findByResource.label.resourceVersion" /></label></td>
				<td><input type="text" name="resourceVersion" id="resourceVersion" class="border" value=""/></td>
				<td>*</td>
			</tr>
			<tr>
				<td><label for="resourceType"><spring:message code="findByResource.label.resourceType" /></label></td>
				<td><input type="text" name="resourceType" id="resourceType" class="border" value=""/></td>
				<td>*</td>
			</tr>
			</table>
		
		</div>

		<br />

		<div class="bt">	
			<input type="submit" name="_eventId_back" value="<spring:message code="findByResource.submit.back" />" class="border" />
			<input type="submit" name="_eventId_findDeploymentUnitByResource" value="<spring:message code="findByResource.submit.byResource" />" class="border" onclick="return validateUnitSearchByResource()"/>
		</div>
	</fieldset>
	</form>

<jsp:include page="footer.jsp"/>
