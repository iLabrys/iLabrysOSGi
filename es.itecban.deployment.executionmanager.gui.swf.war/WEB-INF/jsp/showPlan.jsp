<%@ page language="java" contentType="text/html"%>
<%@ page session="false"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<jsp:include page="header.jsp" />

	<script type="text/javascript">
	var jsonPlan = '${jsonPlan}';
	objPlan = JSON.parse(jsonPlan);
	
		function fillData(){
			document.getElementById("name").innerHTML = "<b><spring:message code="showPlan.p.name" /> </b>" + objPlan.name;
			document.getElementById("environment").innerHTML = "<b><spring:message code="showPlan.p.environment" /> </b>" + objPlan.environment;
			document.getElementById("creationDate").innerHTML = "<b><spring:message code="showPlan.p.creationDate" /> </b>" + objPlan.scheduleData.creationDate;
			document.getElementById("creationUser").innerHTML = "<b><spring:message code="showPlan.p.creationUser" /> </b>" + objPlan.creationUser;
			document.getElementById("lastModificationDate").innerHTML = "<b><spring:message code="showPlan.p.lastModificationDate" /> </b>" + objPlan.scheduleData.lastModificationDate;
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
	<h1><spring:message code="showPlan.h1" /></h1>
		<p id="name"></p>
		<p id="environment"></p>
		<p id="creationDate"></p>
		<p id="creationUser"></p>
		<p id="lastModificationDate"></p>
	
	<script type="text/javascript">
		txt = "";
		for (i=0;i<objPlan.activities.length;i++){
		txt += "<div class=\"blockBox\" id=\"activitiesDiv" + i + "\">\n";
		txt += "	<p class=\"title\"><a href=\"#\" onclick=\"toggle('bb" + objPlan.activities[i].activityId + "');\"><spring:message code="showPlan.p.activity" /> #" + objPlan.activities[i].activityId + "</a></p>\n";
		txt += "	<div id=\"bb" + objPlan.activities[i].activityId + "\">\n";
		target = objPlan.activities[i].target;
		txt += "		<p id=\"host\"><spring:message code="showPlan.p.host" /> " + target.split("#")[1] + "</p>\n";
		txt += "		<p id=\"cell\"><spring:message code="showPlan.p.cell" /> " + target.split("#")[2].split("/")[1] + "</p>\n";
		txt += "		<p id=\"node\"><spring:message code="showPlan.p.node" /> " + target.split("#")[2].split("/")[0] + "</p>\n";
		txt += "		<p id=\"server\"><spring:message code="showPlan.p.server" /> " + target.split("#")[2].split("/")[2] + "</p>\n";
	
		
		txt += "		<p id=\"type\"><spring:message code="showPlan.p.type" /> " + objPlan.activities[i].type + "</p>\n";
			if(objPlan.activities[i].configuration){
				txt += "	<p id=\"configuration\"><spring:message code="showPlan.p.configuration" /> \n";			
				for(j=0;j<objPlan.activities[i].configuration.length;j++){
					txt += " &nbsp; &nbsp; &middot; " + objPlan.activities[i].configuration[j].name + ": " + objPlan.activities[i].configuration[j].value + "<br />\n";
				}
				txt += "	</p>\n";
				
			}else if (objPlan.activities[i].resource){
				for(j=0;j<objPlan.activities[i].resource.length;j++){				
					txt += "		<p id=\"name\"><spring:message code="showPlan.p.unitName" /> " + objPlan.activities[i].resource[j].name + " " + objPlan.activities[i].resource[j].version + "</p>\n";				
				}	
			}else{
				txt += "		<p id=\"unitName\"><spring:message code="showPlan.p.unitName" /> " + objPlan.activities[i].unitName + " " + objPlan.activities[i].unitVersion + "</p>\n";
				
				if (objPlan.activities[i].previousUnitName && objPlan.activities[i].previousUnitName.length>0){
				    txt += "		<p id=\"previousUnitName\"><spring:message code="showPlan.p.previousUnitName" /> " + objPlan.activities[i].previousUnitName + " " + objPlan.activities[i].previousUnitVersion + "</p>\n";
				}
			}
	
		
		
		//txt += "		<p id=\"descriptor\"><spring:message code="showPlan.p.descriptor" /> <u><a href=\"#\">descriptor</a></u></p>\n";
		txt += "	</div>	\n";
		txt += "</div>\n\n";
		}
		document.write(txt);
	</script>
	<form action="${flowExecutionUrl}" method="post">
		<div class="bt">
			<input type="submit" name="_eventId_back" value="<spring:message code="showPlan.submit.back" />" class="border"/>
			<input type="submit" name="_eventId_launch" value="<spring:message code="showPlan.submit.launch" />" class="border"/>
		</div>
	</form>

<jsp:include page="footer.jsp" />
