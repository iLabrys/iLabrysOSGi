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
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<jsp:include page="header.jsp" />

	<script type="text/javascript">
		function validateTargetRadio(radioForm) {
			return true;
		}

		var aContainers = new Array();
		<c:forEach items="${containers}" var="container" varStatus="c">
			aContainers[${c.index}] = "${container}";
		</c:forEach>
		

		//aDeploymentGroups[i][j] = [nodeContainer,isCandidate,isInTheBoxToInstall];
		var aDeploymentGroups = new Array();
		<c:forEach items="${deploymentGroups}" var="group" varStatus="rowStatus">
			aDeploymentGroups[${rowStatus.index}] = new Array();
			<c:forEach items="${containers}" var="container" varStatus="columnStatus">
			aDeploymentGroups[${rowStatus.index}][${columnStatus.index}] = ["${container}",${candidates[columnStatus.index][rowStatus.index]},false];
			</c:forEach>
		</c:forEach>

		
		var aUnitsByGroup = new Array();
		<c:forEach items="${deploymentGroups}" var="dg" varStatus="groupsStatus">
			aUnitsByGroup[${groupsStatus.index}] = new Array();
			<c:forEach items="${dg.units}" var="du" varStatus="unitStatus">
			aUnitsByGroup[${groupsStatus.index}][${unitStatus.index}] = "${du.name}"; 			
			</c:forEach>
		</c:forEach>

		var aInstalledUnits = new Array();
		<c:forEach items="${installedUnitList}" var="iul" varStatus="unitStatus">
			aInstalledUnits[${unitStatus.index}] = new Array();
			<c:forEach items="${iul.containerArray}" var="iulca" varStatus="containerStatus">
			aInstalledUnits[${unitStatus.index}][${containerStatus.index}] = ["${iul.unitName}", "${iulca}"];
			</c:forEach>
		</c:forEach>


		function findTheGroupByUnit(unitName){
			for (a=0;a<aUnitsByGroup.length;a++){
				for (b=0; b<aUnitsByGroup[a].length;b++){
					if (aUnitsByGroup[a][b]==unitName){
						return a;
					}
				}
			}
			return -1;
		}

		function findContainer(containerName){
			for (x=0;x<aContainers.length;x++){
				if (aContainers[x]==containerName){
					return x;
				}
			}
			return -1;
		}
	
		function whatGroupsAreInstalled(){
			for (i=0;i<aInstalledUnits.length;i++){
				for (j=0; j<aInstalledUnits[i].length;j++){
					g = findTheGroupByUnit(aInstalledUnits[i][j][0]);
					c = findContainer(aInstalledUnits[i][j][1])
					if (g!=-1 && c!=-1){
						aDeploymentGroups[g][c][1] = false;
						//alert(aDeploymentGroups[g][c]);
					}
				}
			}
		}

		function fillSelectGroup(){
			objSelect = document.getElementById("selectGroup");
			for (i=0; i<objSelect.length; i++){
				objSelect.options[i] = null;
			}
			objSelect.options[0] = new Option(" ","");
			
			for (i=0; i<aDeploymentGroups.length; i++){
				iOption = new Option(1+parseInt(i),i);
				objSelect = document.getElementById("selectGroup");
				objSelect.options[objSelect.length] = iOption;
			}
		}

		function fillSelectContainer(){
			objSelectContainer = document.getElementById("selectContainer");
			while (objSelectContainer.options.length>0){
				objSelectContainer.options[0] = null;
			}
			objSelectContainer.options[0] = new Option(" ","");
			
			obj=document.getElementById("selectGroup");
			
			groupSelected = obj[obj.selectedIndex].value;
			
			if (groupSelected!=""){
				for (i=0; i<aDeploymentGroups[groupSelected].length; i++){
					//alert("groupSelected --> " + groupSelected+ "::Check::"+aDeploymentGroups[groupSelected][i]+":First Condition:"+aDeploymentGroups[groupSelected][i][1]+":Second Condition:"+!aDeploymentGroups[groupSelected][i][2]);
					if (aDeploymentGroups[groupSelected][i][1] && !aDeploymentGroups[groupSelected][i][2]){
						iOption = new Option(aDeploymentGroups[groupSelected][i][0],i);
						objSelect = document.getElementById("selectContainer");
						objSelect.options[objSelect.length] = iOption;
					}
				}
			}
		}

		function addOptions(){
			oSGroup     = document.getElementById("selectGroup");
			oSContainer = document.getElementById("selectContainer");
			oSToManage  = document.getElementById("selectGroupsToManage");
			
			group         = oSGroup[oSGroup.selectedIndex].value;
			container     = oSContainer[oSContainer.selectedIndex].value;
			containerText = oSContainer[oSContainer.selectedIndex].text;

			if (group!="" && container!=""){
			
				iText = "Group " + (1+parseInt(group)) + " --> " + containerText;
				iValue = group + "|" + containerText;
	
				valueExist = false;
				for (i=0;i<oSToManage.options.length;i++){
					if (oSToManage[i].value==iValue){
						valueExist = true;
						break;
					}
				}
	
				if (!valueExist){
					iOption = new Option(iText,iValue);
					oSToManage.options[oSToManage.length] = iOption;
					aDeploymentGroups[group][container][2] = true;
					fillSelectContainer();
				}
			}
			generateActionsToDo();
			
			
		}
		
		
		function removeOptions(){
			oSGroup     = document.getElementById("selectGroup");
			oSContainer = document.getElementById("selectContainer");
			oSToManage  = document.getElementById("selectGroupsToManage");
			
			if (oSToManage.selectedIndex>-1){
//alert("a");			
				group         = oSToManage[oSToManage.selectedIndex].value.split("|")[0];
				containerText = oSToManage[oSToManage.selectedIndex].value.split("|")[1];
				container     = findContainer(containerText);
//alert("group --> " + group + "\ncontainerText --> " + containerText + "\ncontainer --> " + container);
//alert(aDeploymentGroups[group][container]);				
				if (group>-1 && container>-1){
//alert("b");				
					aDeploymentGroups[group][container][2] = false;
					oSToManage[oSToManage.selectedIndex] = null;
					fillSelectContainer();
				}
			}
			generateActionsToDo();
		}

		function generateActionsToDo(){
			//list os pairs [group|container]
			stActionsToDo = "";
			oSToManage  = document.getElementById("selectGroupsToManage");
			for (i=0; i<oSToManage.length;i++){
				if (stActionsToDo.length>0){
					stActionsToDo += ",";
				}
				stActionsToDo += oSToManage[i].value;
			}
			if (stActionsToDo!=""){
				document.getElementById("actionsToDo").value = stActionsToDo;
			}
		}

		<c:choose>
		<c:when test="${operationFlow =='updateFlow'}">	
			aToDoWhenLoaded = ['cb();','fillSelectGroup();'];
		</c:when>
		<c:otherwise>
			aToDoWhenLoaded = ['cb();','whatGroupsAreInstalled();','fillSelectGroup();']; 
		</c:otherwise>
		</c:choose>
		
	</script>
		
		<c:choose>
			<c:when test="${operationFlow =='updateFlow'}">	
				<h1><spring:message code="pickTNU.h1" /></h1>
			</c:when>
			<c:when test="${operationFlow =='deleteFlow'}">		
				<h1><spring:message code="pickTND.h1" /></h1>
			</c:when>
			<c:otherwise>
			 	<h1><spring:message code="pickTN.h1" /></h1> 
			</c:otherwise>
		</c:choose>		
	

	<p><spring:message code="pickTN.h2"/></p>
	<form action="${flowExecutionUrl}" method="post" id="f">

	<br />
	
	<div class="blockBox" id="groupsForDeploymentDiv">
	
		<c:choose>
			<c:when test="${operationFlow =='updateFlow'}">		
				<p class="title"><a href="#" onclick="toggle('bb1');"><spring:message code="pickTNU.p1" /></a></p>
			</c:when>
		
			<c:when test="${operationFlow =='deleteFlow'}">		
				<p class="title"><a href="#" onclick="toggle('bb1');"><spring:message code="pickTND.p1" /></a></p>
			</c:when>
			<c:otherwise>
			 <p class="title"><a href="#" onclick="toggle('bb1');"><spring:message code="pickTN.p1" /></a></p> 
			 </c:otherwise>
		</c:choose>		
		
		<div id="bb1"><p>
			<c:forEach items="${deploymentGroups}" var="dg" varStatus="groupsStatus">
				<strong><spring:message code="pickTN.group" /> ${groupsStatus.index +1}:</strong><br />
					<c:forEach items="${dg.units}" var="du">
					 - ${du.name} ${du.version}<br /> 			
					</c:forEach>
			</c:forEach></p>
		</div>
	</div>
	
	<c:choose>
	    <c:when test="${operationFlow =='deleteFlow'}"/>	
		<c:otherwise>
			<div class="blockBox" id="installedUnitListDiv">
				<p class="title"><a href="#" onclick="toggle('bb3');"><spring:message code="pickTN.p_installedUnitsList" /> (${fn:length(installedUnitList)})</a></p>
				<div id="bb3"><p>
					<c:forEach items="${installedUnitList}" var="iul">
						${iul.unitName} ${iul.unitVersion} <spring:message code="pickTN.p_isInstalledIn" /><br />
						<c:forEach items="${iul.containerArray}" var="iulca">
							&nbsp; &nbsp; - ${iulca}<br />
						</c:forEach>
					</c:forEach></p>
				</div>
			</div>
		 </c:otherwise>
	</c:choose>
	
	<div class="blockBox" id="targetNodesDiv">
		<p class="title"><a href="#" onclick="toggle('bb2');"><spring:message code="pickTN.p2" /> (${fn:length(containers)})</a></p>
		<div id="bb2"><p>
			<c:forEach items="${containers}" var="node" varStatus="nodesStatus">
				- <spring:message code="pickTN.container" /> ${nodesStatus.index +1}: ${node}<br />
			</c:forEach></p>
		</div>
	</div>

	<fieldset>
		<legend><spring:message code="pickTN.legend" /></legend>
			
		<table border="0" align="center">
		<tr>
			<th><spring:message code="pickTN.group" /></th>
			<th><spring:message code="pickTN.container" /></th>
			<th></th>
		</tr>
		<tr>
			<td><select id="selectGroup" class="border w100" onchange="fillSelectContainer()">
						<option value="">&nbsp;</option>
					</select></td>
			<td><select id="selectContainer" class="border w400">
						<option value="">&nbsp;</option>
					</select></td>
			<td><input name="add" id="add" value="&gt;" class="border" onclick="addOptions();" type="button"></td>
		</tr>
		<tr valign="top">
			<td colspan="2"><select id="selectGroupsToManage" size="10" class="w400 h200 fS border" style="width:504px;"></select></td>
			<td><input name="remove" id="remove" value="&lt;" onclick="removeOptions();" class="border" type="button"></td>
		</tr>
		</table>	

		<input type="hidden" id="actionsToDo" name="actionsToDo" value="" />					
				
	

		<div class="bt">
			<input type="submit" name="_eventId_back" value="<spring:message code="pickTN.submit.back" />" class="border" />
			
			<c:choose>
				<c:when test="${operationFlow =='updateFlow'}">	
					<input type="submit" name="_eventId_impactAndMap" value="<spring:message code="pickTNimpact.submit.map" />" onclick="return validateTargetRadio(this.form)" class="border">
					<input type="submit" name="_eventId_map" value="<spring:message code="pickTN.submit.map" />" onclick="return validateTargetRadio(this.form)" class="border">
				</c:when>
				<c:when test="${operationFlow =='deleteFlow'}">		
					<input type="submit" name="_eventId_impactAndMap" value="<spring:message code="pickTNimpact.submit.map" />" onclick="return validateTargetRadio(this.form)" class="border">
					<input type="submit" name="_eventId_map" value="<spring:message code="pickTN.submit.map" />" onclick="return validateTargetRadio(this.form)" class="border">
				</c:when>
				<c:otherwise>
				 	<input type="submit" name="_eventId_map" value="<spring:message code="pickTN.submit.map" />" onclick="return validateTargetRadio(this.form)" class="border">
				 </c:otherwise>
			</c:choose>		
			
		</div>
	</fieldset>
	</form>
	<jsp:include page="footer.jsp" />
