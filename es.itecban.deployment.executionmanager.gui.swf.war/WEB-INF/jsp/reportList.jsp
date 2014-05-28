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
<%@ page import="es.itecban.deployment.executionmanager.elements.DeploymentPlan" %>
<%@ page import="es.itecban.deployment.executionmanager.elements.PlanReport" %>
<%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<jsp:include page="header.jsp" />

<script type="text/javascript">
	function showData(planID,entorno,fecha){
		newDate = new Date();
		newDate.setTime(fecha);
		stDate = "" + newDate.getDate() + "/";
		stDate += (newDate.getMonth() + 1) + "/";
		stDate += "" + newDate.getFullYear() + " ";
		stDate += "" + newDate.getHours() + ":";
		stDate += "" + newDate.getMinutes() + ":";
		stDate += "" + newDate.getSeconds();
	
		txt = "";
		txt += "<b>" + planID + "</b><br />";
		txt += " &nbsp; &nbsp; Environment:" + entorno + "<br />";
		txt += " &nbsp; &nbsp; Report Date:" + stDate + "<br />";
		Tip(txt);
	}

	var aReportList = new Array();
	<c:forEach var="rl" items="${availableReports.pageList}" varStatus="status">			
		aReportList[${status.count-1}] = "${rl}";
	</c:forEach>
	
	function generateTable(){
		txt = "";
		txt += "<ul>";
		for (i=0;i<aReportList.length;i++){
			stName        = aReportList[i].split("|")[0];
			stEnvironment = aReportList[i].split("|")[1];
			if (aReportList[i].split("|").length == 4){
				stDate  = aReportList[i].split("|")[3];
			}else{
				stDate = aReportList[i].split("|")[4];
			}
			txt += "<li><a href=\"${flowExecutionUrl}&_eventId=showReport&selectedReport=" + aReportList[i] +  "\" onmouseover=\"showData('"+ stName +"','" + stEnvironment + "','"+ stDate +"')\" onmouseout=\"UnTip()\">" + stName +"</a></li>";
		}
		txt += "</ul>";
		document.getElementById("divReportsList").innerHTML = txt;
	}

	aToDoWhenLoaded = ['generateTable();','resizeInnerContentBox();'];
	
</script>

<h1><spring:message code="reportList.h1" /></h1>
	<form method="post" action="${flowExecutionUrl}" id="f">
		<div class="indent">
			<div id="divReportsList"></div>
			
			<c:if test="${availableReports.nrOfElements lt 1}">
			<tr>
				<td colspan="2"><br /><br />
					<p><spring:message code="reportList.p.zeroResults" /></p></td>
			</tr>
			</c:if>
		</div>
		
		<div align="center">
		<p>
		<c:if test="${availableReports.nrOfElements gt availableReports.pageSize}">
		<c:forEach begin="${availableReports.firstLinkedPage}" end="${availableReports.lastLinkedPage}" var="crtpg">
		<c:choose>
			<c:when test="${crtpg == availableReports.page}"><c:out value="${crtpg+1}" /></c:when>
			<c:otherwise>
				<a href="${flowExecutionUrl}&_eventId=paginateList&p=<c:url value="${crtpg}" />"><c:out value="${crtpg+1}" /></a>
			</c:otherwise>
		</c:choose>
		</c:forEach>
		</c:if>
		</p>
		</div>

		

		<div class="bt">
			<input type="submit" name="_eventId_back" value="<spring:message code="reportList.submit.back" />" class="border" />
<c:if test="${availableReports.nrOfElements gt 0}">
			
			<!-- <input type="submit" name="_eventId_showReport" value="<spring:message code="planList.submit.showPlan" />" class="border" /> -->
</c:if>
		</div>

	</form>




<jsp:include page="footer.jsp" />
