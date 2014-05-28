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
<%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<jsp:include page="header.jsp" />

	<script type="text/javascript">
		var aMsg = new Array();
		aMsg[0] = ['Error','<spring:message code="planList.error.0" />'];

		function saveDeploymentPlanBin(name){
			document.forms[0].selectedDeploymentPlanBinName.value=name;
		}

		function validatePlanRadio(){
			objF = document.getElementById("f");
			aInputs = document.getElementsByTagName("input");
			isAnySelected = false;
			for (i=0;i<aInputs.length;i++){
				if(aInputs[i].type=="radio" && aInputs[i].checked){
					isAnySelected = true;
					break;
				}
			}
			if (!isAnySelected){
				writeMsg(0);
			}
			return isAnySelected
			
		}

		function showData(planID,entorno,fecha){
			txt = "";
			txt += "<b>" + planID + "</b><br />";
			txt += " &nbsp; &nbsp; Environment:" + entorno + "<br />";
			txt += " &nbsp; &nbsp; Launch Date:" + fecha + "<br />";
			Tip(txt);
		}
		aPlanList = new Array();
		i=0;
		<c:forEach var="pl" items="${availableDeploymentPlans.pageList}">			
			aPlanList[i++] = "${pl.planID}";
		</c:forEach>
		
		function generateTable(){
			txt = "";
			txt += "<ul>";
			for (i=0;i<aPlanList.length;i++){
				stName        = aPlanList[i].split("|")[0];
				stEnvironment = aPlanList[i].split("|")[1];
				stDate        = aPlanList[i].split("|")[2];
				
				txt += "<li for=\"selectedDeploymentPlan:" + aPlanList[i] + "\"><a href=\"${flowExecutionUrl}&_eventId=showPlan&selectedDeploymentPlan=" + aPlanList[i] +  "\" onmouseover=\"showData('"+ stName +"','" + stEnvironment + "','"+ stDate +"')\" onmouseout=\"UnTip()\">" + stName +"</a></li>";
			}
			txt += "</ul>";
			document.getElementById("divPlanList").innerHTML = txt;
			
			
		}
		
		aToDoWhenLoaded = ['generateTable();','resizeInnerContentBox();'];
		
	</script>

<h1><spring:message code="planList.h1" /></h1>
	<form method="post" action="${flowExecutionUrl}" id="f">

		<div class="indent">
			<div id="divPlanList"></div>
			
			<c:if test="${availableDeploymentPlans.nrOfElements lt 1}">
			<tr>
				<td colspan="2"><br /><br />
					<p><spring:message code="planList.p.zeroResults" /></p></td>
			</tr>
			</c:if>
		</div>

		<div align="center">
		<p>
		<c:if test="${availableDeploymentPlans.pageCount gt 1}">
		<c:forEach begin="${availableDeploymentPlans.firstLinkedPage}" end="${availableDeploymentPlans.lastLinkedPage}" var="crtpg">
		<c:choose>
			<c:when test="${crtpg == availableDeploymentPlans.page}"><c:out value="${crtpg+1}" /></c:when>
			<c:otherwise>
				<a href="${flowExecutionUrl}&_eventId=paginateList&p=<c:url value="${crtpg}" />"><c:out value="${crtpg+1}" /></a>
			</c:otherwise>
		</c:choose>
		</c:forEach>
		</c:if>
		</p>
		</div>

		<input type="hidden" name="selectedDeploymentPlanBinName" value="" />

		<div class="bt">
			<input type="submit" name="_eventId_back" value="<spring:message code="planList.submit.back" />" class="border" />
<c:if test="${availableDeploymentPlans.nrOfElements gt 0}">
			<!-- 
			<input type="submit" name="_eventId_showPlan" value="<spring:message code="planList.submit.showPlan" />" onclick="return validatePlanRadio()" class="border" />
			 -->
</c:if>
		</div>
	</form>




<jsp:include page="footer.jsp" />
