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
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<jsp:include page="header.jsp"/>

	<script type="text/javascript">
	aMsg = new Array();
	aMsg[0] = ['Error','<spring:message code="findByName.error.0" />'];
	
	function validateUnitSearchByName() {
		
		objUnitName = document.getElementById("unitName");
		
		if (objUnitName.value == "" || objUnitName.value.length==0) {
			writeMsg(0);
			objUnitName.focus();
			return false;
		}else {
			return true;
		}
	}
	
	</script>
	<h1><spring:message code="findByName.h1" /></h1>

	<form method="post" action="${flowExecutionUrl}" id="f">
	<fieldset>
		<legend><spring:message code="findByName.legend" /></legend>

		<p><spring:message code="findByName.p1" /></p>

		<div class="indent">
			<br />

			<table>
			<tr>
				<td><label for="unitName"><spring:message code="findByName.label.unitName" /></label></td>
				<td><input type="text" name="unitName" id="unitName" value="" class="border" /></td>
				<td>*</td>
			</tr>
			<tr>
				<td><label for="unitVersion"><spring:message code="findByName.label.unitVersion" /></label></td>
				<td><input type="text" name="unitVersion" id="unitVersion" value="" class="border" /></td>
				<td></td>
			</tr>
			</table>

		</div>

		<br />
		<div class="bt">	
			<input type="submit" name="_eventId_back" value="<spring:message code="findByName.submit.back" />" class="border"/>
			<input type="submit" name="_eventId_findDeploymentUnitByName" value="<spring:message code="findByName.submit.byName" />"  onclick="return validateUnitSearchByName()"  class="border"/>
		</div>
		<br /><br />
		<div class="bt">
			<input type="submit" name="_eventId_findDeploymentUnitByResource" value="<spring:message code="findByName.submit.byResource" />" class="border"/>
			<input type="submit" name="_eventId_viewAllAvailableDeploymentUnits" value="<spring:message code="findByName.submit.viewAll" />" class="border"/>
		</div>
	</fieldset>
	</form>

<jsp:include page="footer.jsp"/>
