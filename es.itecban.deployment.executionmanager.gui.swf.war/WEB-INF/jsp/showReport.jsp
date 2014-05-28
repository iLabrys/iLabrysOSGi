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

	<script type="text/javascript">
	aMsg = new Array();
	aMsg[0] = ['Error','<spring:message code="showReport.error.0" />'];

	
	var jsonReport = '${jsonReport}';
	objReport = JSON.parse(jsonReport);
	
		function fillData(){
			document.getElementById("planId").innerHTML = "<b><spring:message code="showReport.p.planId" /> </b>" + objReport.reportName.split("|")[0];
			document.getElementById("startTime").innerHTML = "<b><spring:message code="showReport.p.startTime" /> </b>" + objReport.startTime;
			document.getElementById("endTime").innerHTML = "<b><spring:message code="showReport.p.endTime" /> </b>" + objReport.endTime;
			document.getElementById("creationUserId").innerHTML = "<b><spring:message code="showReport.p.creationUserId" /> </b>" + objReport.creationUserId;
			document.getElementById("launcherUserId").innerHTML = "<b><spring:message code="showReport.p.launcherUserId" /> </b>" + objReport.launcherUserId;
			document.getElementById("environment").innerHTML = "<b><spring:message code="showReport.p.environment" /> </b>" + objReport.environment;
			/* This line is commented for remove it at the future, when the technical reports will be running
				document.getElementById("technicalExecutionReport").innerHTML = "<a href=\"reports.htm?planName=" + objReport.reportName + "|" + objReport.reportCalendar + "\"><spring:message code="showReport.p.technicalExecutionReport" /> </a>";
			*/
			document.getElementById("technicalExecutionReport").innerHTML = "<a href=\"#\" onclick=\"writeMsg(0)\"><spring:message code="showReport.p.technicalExecutionReport" /> </a>";
			document.getElementById("result").innerHTML = "<b><spring:message code="showReport.p.result" /> </b>" + objReport.result;
			document.getElementById("message").innerHTML = "<b><spring:message code="showReport.p.message" /> </b>" + objReport.message;
		}
		
		aToDoWhenLoaded = ['fillData()','resizeInnerContentBox()'];
	</script>
	<style type="text/css">
	textarea{
		font-family: Trebuchet MS, Verdana, Arial, Geneva, Helvetica, sans-serif;
		font-size: 12px;
		width: 100%;
	}
	</style>
	<h1><spring:message code="showReport.h1" /></h1>
		<p id="planId"></p>
		<p id="startTime"></p>
		<p id="endTime"></p>
		<p id="creationUserId"></p>
		<p id="launcherUserId"></p>
		<p id="environment"></p>
		<p id="technicalExecutionReport"></p>
		<p id="result"></p>
		<p id="message"></p>
		
	
	<script type="text/javascript">
		txt = "";
		for (i=0;i<objReport.activitiesExecutionReport.length;i++){
		txt += "<div class=\"blockBox\" id=\"activitiesDiv" + i + "\">\n";
		txt += "	<p class=\"title\"><a href=\"#\" onclick=\"toggle('bb" + objReport.activitiesExecutionReport[i].activityId + "');\"><spring:message code="showReport.p.activity" /> #" + objReport.activitiesExecutionReport[i].activityId + "</a></p>\n";
		txt += "	<div id=\"bb" + objReport.activitiesExecutionReport[i].activityId + "\">\n";
		txt += "		<p id=\"startTime" + i + "\"><spring:message code="showReport.p.startTime" /> "+ objReport.activitiesExecutionReport[i].startTime + "</p>\n";
		txt += "		<p id=\"endTime" + i + "\"><spring:message code="showReport.p.endTime" /> "+ objReport.activitiesExecutionReport[i].endTime + "</p>\n";
		txt += "		<p id=\"description" + i + "\"><spring:message code="showReport.p.description" /> "+ objReport.activitiesExecutionReport[i].description + "</p>\n";
		txt += "		<p id=\"resultCode" + i + "\"><spring:message code="showReport.p.resultCode" /> "+ objReport.activitiesExecutionReport[i].resultCode + "</p>\n";
		txt += "		<p id=\"result" + i + "\"><spring:message code="showReport.p.result" /> "+ objReport.activitiesExecutionReport[i].result + "</p>\n";
		txt += "		<p id=\"technicalActivityExecReport" + i + "\"><a href=\"reports.htm?planName=" + objReport.reportName + "|" + objReport.reportCalendar + "&activityId="+objReport.activitiesExecutionReport[i].activityId+ "\" class=\"link\"><spring:message code="showReport.p.technicalActivityExecReport" /></a></p>\n";
		//txt += "		<p id=\"technicalActivityExecReport" + i + "\"><spring:message code="showReport.p.technicalActivityExecReport" /> "+ objReport.activitiesExecutionReport[i].technicalActivityExecReport + "</p>\n";
		
		txt += "	</div>	\n";
		txt += "</div>\n\n";
		}
		document.write(txt);
	</script>
	
	<script type="text/javascript">
	function doProceed(){
		document.getElementById("progressDiv").style.display = "block";
		document.getElementById("btBack").disabled = true;
		document.getElementById("btLaunchAntiPlan").disabled = true;
		document.getElementById("f").action += "&_eventId=launchAntiPlan";
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
	<form action="${flowExecutionUrl}" method="post" id="f">
	<br/>
	<div style="display:none;text-align:center;" id="progressDiv">
		<img src="../img/progressBar.gif" border="0">
	</div>
	<br/>
	<div class="bt">
		<input type="button" name="_eventId_back" value="<spring:message code="showReport.submit.back" />" class="border" id="btBack" onclick="doCancel()"/>
		<input type="button" name="_eventId_launchAntiPlan" value="<spring:message code="showReport.submit.launchAntiPlan" />" class="border" id="btLaunchAntiPlan" onclick="doProceed()"/>
	</div>
	</form>

<jsp:include page="footer.jsp" />
