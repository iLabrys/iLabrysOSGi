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
