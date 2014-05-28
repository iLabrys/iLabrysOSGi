#-------------------------------------------------------------------------------
# Copyright 2014 Indra
# 
# Licensed under the Apache License, Version 2.0 (the "License");
# you may not use this file except in compliance with the License.
# You may obtain a copy of the License at
# 
#   http://www.apache.org/licenses/LICENSE-2.0
# 
# Unless required by applicable law or agreed to in writing, software
# distributed under the License is distributed on an "AS IS" BASIS,
# WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
# See the License for the specific language governing permissions and
# limitations under the License.
#-------------------------------------------------------------------------------
<%@ page language="java" contentType="text/html"%>
<%@ page session="false"%>
<%@ page import="es.itecban.deployment.executionmanager.elements.DeploymentUnit" %>
<%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>


<jsp:include page="header.jsp" />	
	<script type="text/javascript">
		function saveDeploymentUnit(name, version){
			document.forms[0].selectedDeploymentUnitName.value=name;
			document.forms[0].selectedDeploymentUnitVersion.value=version;
		}

		function paginar(k){
			document.forms[0].p.value=k;
			document.forms[0]._eventId.value = "pageListDU";
			document.forms[0].submit();
		}
	</script>
	

	<h1><spring:message code="pickDU.h1" /></h1>

	<form method="post" action="${flowExecutionUrl}" id="f">
	<fieldset>
		<legend><spring:message code="pickDU.legend" /></legend>
		<div class="indent">
			<br />
			<table>
				<c:forEach var="du" items="${availableDeploymentUnits.pageList}">
				<tr valign="top">
					<td><input 	type="radio"	name="selectedDeploymentUnit"  
					id="selectedDeploymentUnit:${du.name}" 	
					value="${du.name}" 
					onclick="saveDeploymentUnit('${du.name}','${du.version}')"/>
					</td>
					<td><label for="selectedDeploymentUnit:${du.name}">${du.name}<br />
						<spring:message code="pickDU.label.version" />  ${du.version}</label>
					</td>
				</tr>
				</c:forEach>
				<c:if test="${availableDeploymentUnits.nrOfElements lt 1}">
				<tr>
					<td colspan="2"><br /><br />
						<p><spring:message code="pickDU.p1" /></p></td>
				</tr>
				</c:if>
			</table>
		</div>

	<div align="center">
	<p>
	<c:if test="${availableDeploymentUnits.nrOfElements gt 0}">
	<c:forEach begin="${availableDeploymentUnits.firstLinkedPage}" end="${availableDeploymentUnits.lastLinkedPage}" var="crtpg">
	<c:choose>
		<c:when test="${crtpg == availableDeploymentUnits.page}"><c:out value="${crtpg+1}" /></c:when>
		<c:otherwise>
			<a href="${flowExecutionUrl}&_eventId=paginatedListDU&p=<c:url value="${crtpg}" />"><c:out value="${crtpg+1}" /></a>
		</c:otherwise>
	</c:choose>
	</c:forEach>
	</c:if>
	</p>
	</div>

		<input type="hidden" name="selectedDeploymentUnitName" value="" />
		<input type="hidden" name="selectedDeploymentUnitVersion" value="" />

		<br />

		<div class="bt">
			<input type="submit" name="_eventId_back" value="<spring:message code="pickDU.submit.back" />" class="border" />
<c:if test="${availableDeploymentUnits.nrOfElements gt 0}">
			<!-- <input type="submit" name="_eventId_reviewParameters" value="Check Params" class="border" /> -->
			<input type="submit" name="_eventId_selectUnit" value="<spring:message code="pickDU.submit.selectUnit" />" onclick="return validateDeploymentRadio(this.form)" class="border" />
</c:if>
		</div>
	</form>

<jsp:include page="footer.jsp" />
