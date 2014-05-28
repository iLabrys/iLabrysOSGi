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

	<h1><spring:message code="createPlan.h1" /></h1>
	
	<form action="${flowExecutionUrl}" method="post">
	<fieldset>
		<legend><spring:message code="createPlan.legend" /></legend>
		
		<p><spring:message code="createPlan.p1" /></p>

		<div class="indent">
		
			<br />  
			<select name="defaultGoal"><%
				String[][] supportedGoals = (String [][]) request.getAttribute("supportedGoals");
				for(int i =0; i < supportedGoals.length; i++) {%>
				<option value="<%=i%>"><% 
					for(int j = 0; j < supportedGoals[i].length; j++){
						if(j > 0){%> + <% } %>
						<%=supportedGoals[i][j]%>
					<%	}%>
				</option>
				<%} %>
			</select>
			
		</div>

		<br/><br />

		<div class="bt">
			<input type="submit" name="_eventId_selectOperation" value="<spring:message code="createPlan.submit.createNewPlan" />" class="border"></div>
	</fieldset>
	</form>

<jsp:include page="footer.jsp"/>
