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
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<jsp:include page="header.jsp" />
	
	 
	<script type="text/javascript">
	var jsonPlan = '${jsonPlan}';
	objPlan = JSON.parse(jsonPlan);
	
		function fillData(){
			document.getElementById("name").innerHTML = "<b><spring:message code="launchPlan.p.name" /> </b>" + objPlan.name;
			document.getElementById("environment").innerHTML = "<b><spring:message code="launchPlan.p.environment" /> </b>" + objPlan.environment;
			document.getElementById("creationDate").innerHTML = "<b><spring:message code="launchPlan.p.creationDate" /> </b>" + objPlan.scheduleData.creationDate;
			document.getElementById("lastModificationDate").innerHTML = "<b><spring:message code="launchPlan.p.lastModificationDate" /> </b>" + objPlan.scheduleData.lastModificationDate;
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
	
		
	<c:choose>
		<c:when test="${operationFlow =='updateFlow'}">	
			<h1><spring:message code="launchPlanUpdate.h1" /></h1>
		</c:when>
		<c:when test="${operationFlow =='deleteFlow'}">		
			<h1><spring:message code="launchPlanDelete.h1" /></h1>
		</c:when>
		<c:otherwise>
		 	<h1><spring:message code="launchPlan.h1" /></h1>
		</c:otherwise>
	</c:choose>		
		
		
			<p id="name"></p>
			<p id="environment"></p>
			<p id="creationDate"></p>
			<p id="lastModificationDate"></p>
	
	<script type="text/javascript">
		txt = "";
		for (i=0;i<objPlan.activities.length;i++){
		txt += "<div class=\"blockBox\" id=\"activitiesDiv" + i + "\">\n";
		txt += "	<p class=\"title\"><a href=\"#\" onclick=\"toggle('bb" + objPlan.activities[i].activityId + "');\"><spring:message code="launchPlan.p.activity" /> #" + objPlan.activities[i].activityId + "</a></p>\n";
		txt += "	<div id=\"bb" + objPlan.activities[i].activityId + "\">\n";
		target = objPlan.activities[i].target;
		txt += "		<p id=\"host\"><spring:message code="launchPlan.p.host" /> " + target.split("#")[1] + "</p>\n";
		txt += "		<p id=\"cell\"><spring:message code="launchPlan.p.cell" /> " + target.split("#")[2].split("/")[1] + "</p>\n";
		txt += "		<p id=\"node\"><spring:message code="launchPlan.p.node" /> " + target.split("#")[2].split("/")[0] + "</p>\n";
		txt += "		<p id=\"server\"><spring:message code="launchPlan.p.server" /> " + target.split("#")[2].split("/")[2] + "</p>\n";
	
		
		txt += "		<p id=\"type\"><spring:message code="launchPlan.p.type" /> " + objPlan.activities[i].type + "</p>\n";
			if(objPlan.activities[i].configuration){
				txt += "	<p id=\"configuration\">Configuration: \n";			
				for(j=0;j<objPlan.activities[i].configuration.length;j++){
					txt += " &nbsp; &nbsp; &middot; " + objPlan.activities[i].configuration[j].name + ": " + objPlan.activities[i].configuration[j].value + "<br />\n";
				}
				txt += "	</p>\n";
				
			}else{
				txt += "		<p id=\"unitName\"><spring:message code="launchPlan.p.unitName" /> " + objPlan.activities[i].unitName + " " + objPlan.activities[i].unitVersion + "</p>\n";
				if (objPlan.activities[i].previousUnitName && objPlan.activities[i].previousUnitName.length>0){
				    txt += "		<p id=\"previousUnitName\"><spring:message code="showPlan.p.previousUnitName" /> " + objPlan.activities[i].previousUnitName + " " + objPlan.activities[i].previousUnitVersion + "</p>\n";
				}
			}
	
		
		
		//txt += "		<p id=\"descriptor\"><spring:message code="launchPlan.p.descriptor" /> <u><a href=\"#\">descriptor</a></u></p>\n";
		txt += "	</div>	\n";
		txt += "</div>\n\n";
		}
		document.write(txt);
	</script>
	
	<form action="${flowExecutionUrl}" method="post">
		<fieldset>
			<div class="bt">
				<input type="submit" name="_eventId_cancel" value="<spring:message code="launchPlan.submit.cancel" />" class="border"/>
				<input type="submit" name="_eventId_save" value="<spring:message code="launchPlan.submit.save" />" class="border"/>
			</div>
		</fieldset>
	</form>

<jsp:include page="footer.jsp" />
