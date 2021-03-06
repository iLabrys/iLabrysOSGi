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
