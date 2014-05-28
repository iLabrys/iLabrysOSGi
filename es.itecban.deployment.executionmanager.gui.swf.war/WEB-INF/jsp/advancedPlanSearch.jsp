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
<%@ taglib prefix="c"      uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn"     uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<jsp:include page="header.jsp" />	
	<style type="text/css">
		.advanced{display:none;}
		.advancedBlock{display:block;}
		.advancedTableRow{display:table-row;}
		.firstColumn{width: 125px;
			overflow: hidden;
		}
		.dateColumn{
			/* width: 110px; */
		}
		.dateColumn input{padding:0px; margin:0px; width:72px;}
	</style> 
	<script type="text/javascript"><!--
		aMsg = new Array();
		aMsg[0] = ['Error','<spring:message code="advancedPlanSearch.error.0" />'];
		aMsg[1] = ['Error','<spring:message code="advancedPlanSearch.error.1" />'];
		aMsg[2] = ['Error','<spring:message code="advancedPlanSearch.error.2" />'];

		isAdvancedSearch = false;

		function parseToYYYYMMDD(txt){
			newTxt = ""; 
			if (txt.length==10){
				aTxt = txt.split("/");
				newTxt = aTxt[2] + aTxt[1] + aTxt[0];
			}
			return newTxt;
		}

		function updateRangeDates(){
			var txtCreationMin          = parseToYYYYMMDD(document.getElementById("creationDateMin").value);
			var txtDeletionMin          = parseToYYYYMMDD(document.getElementById("deletionDateMin").value);
			var txtLastModificationMin  = parseToYYYYMMDD(document.getElementById("lastModificationDateMin").value);
			var txtLaunchMin            = parseToYYYYMMDD(document.getElementById("launchDateMin").value);
			var txtScheduledLaunchMin   = parseToYYYYMMDD(document.getElementById("scheduledLaunchDateMin").value);

			if (txtCreationMin!="" && txtCreationMin.length==8){
				datePickerController.setRangeLow("creationDateMax",txtCreationMin);
			}

			if (txtDeletionMin!="" && txtDeletionMin.length==8){
				datePickerController.setRangeLow("deletionDateMax",txtDeletionMin);
			}

			if (txtLastModificationMin!="" && txtLastModificationMin.length==8){
				datePickerController.setRangeLow("lastModificationDateMax",txtLastModificationMin);
			}

			if (txtLaunchMin!="" && txtLaunchMin.length==8){
				datePickerController.setRangeLow("launchDateMax",txtLaunchMin);
			}

			if (txtScheduledLaunchMin!="" && txtScheduledLaunchMin.length==8){
				datePickerController.setRangeLow("scheduledLaunchDateMax",txtScheduledLaunchMin);
			}

			timer = setTimeout("updateRangeDates()", 1000);
		}

		function resetForm() {
			//alert("> initialiseInputs");
			document.getElementById("creationDateMin").value = "";
			document.getElementById("creationDateMax").value = "";
			document.getElementById("deletionDateMin").value = "";
			document.getElementById("deletionDateMax").value = "";
			document.getElementById("lastModificationDateMin").value = "";
			document.getElementById("lastModificationDateMax").value = "";
			document.getElementById("launchDateMin").value = "";
			document.getElementById("launchDateMax").value = "";
			document.getElementById("scheduledLaunchDateMin").value = "";
			document.getElementById("scheduledLaunchDateMax").value = "";
		}




		
		
		function toggleAdvancedSearch(){
			isAdvancedSearch = (!isAdvancedSearch);
			
			if (isAdvancedSearch){
				textLinkSearch = "<spring:message code="advancedPlanSearch.text.simpleSearch" />";
				if(document.all){
					defStyle = "advancedBlock";
				}else{
					defStyle = "advancedTableRow";
				}
				updateRangeDates();
			}else{
				
				textLinkSearch = "<spring:message code="advancedPlanSearch.text.advancedSearch" />";	
				defStyle = "advanced";
				clearTimeout("timer");
			}
			aTR = document.getElementsByTagName("tr");
			for(i=0;i<aTR.length;i++){
				if (aTR[i].className=="advanced" || aTR[i].className=="advancedTableRow" || aTR[i].className=="advancedBlock"){
					aTR[i].className = defStyle;
				}
			}
			document.getElementById("linkSearch").innerHTML = textLinkSearch;
			resizeInnerContentBox();
		}
		
	
		function validateSearch(){
			return true;
		}

		aToDoWhenLoaded = ['resizeInnerContentBox();','resetForm();'];

						
	--></script>
	
		<h1><spring:message code="advancedPlanSearch.h1" /></h1>
	
		<form method="post" action="${flowExecutionUrl}" id="f">
		<fieldset>
			<legend><spring:message code="advancedPlanSearch.legend" /></legend>
	
			<div class="indent">
				<br />
				
				<table width="370">
				<tr>
					<td class="firstColumn"><label for="planName"><spring:message code="advancedPlanSearch.label.planName" /></label></td>
					<td colspan="2" align="right"><input type="text" name="planName" id="planName" value="" class="border" /> &nbsp;</td>
				</tr>
				<tr>
					<td colspan="3" style="text-align:right"><label><a href="#" onclick="toggleAdvancedSearch()"><span id="linkSearch"><spring:message code="advancedPlanSearch.text.advancedSearch" /></span></a></label> &nbsp;</td>
				</tr>
				<tr class="advanced">
					<td class="firstColumn"><label for="environment"><spring:message code="advancedPlanSearch.label.environment" /></label></td>
					<td colspan="2" align="right"><select name="environment" id="environment" class="border">
						<c:forEach var="env" items="${environments}">			
							<option value="${env}">${env}</option>
						</c:forEach>
						</select> &nbsp;
					</td>
				</tr>
				<tr class="advanced">
					<td colspan="3"><label><strong><spring:message code="advancedPlanSearch.label.dateSearch" /></strong></label> &nbsp;</td>
				</tr>
				<tr class="advanced">
					<td class="firstColumn"><label for="creationDate"><spring:message code="advancedPlanSearch.label.creationDate" /></label></td>
					<td class="dateColumn"><input type="text" name="creationDateMin" id="creationDateMin" value="" class="dateformat-d-sl-m-sl-Y border"/></td>
					<td class="dateColumn"><input type="text" name="creationDateMax" id="creationDateMax" value="" class="dateformat-d-sl-m-sl-Y border" /></td>
				</tr>
				<tr class="advanced">
					<td class="firstColumn"><label for="deletionDate"><spring:message code="advancedPlanSearch.label.deletionDate" /></label></td>
					<td class="dateColumn"><input type="text" name="deletionDateMin" id="deletionDateMin" value="" class="dateformat-d-sl-m-sl-Y border"/></td>
					<td class="dateColumn"><input type="text" name="deletionDateMax" id="deletionDateMax" value="" class="dateformat-d-sl-m-sl-Y border" /></td>
				</tr>
				<tr class="advanced">
					<td class="firstColumn"><label for="lastModificationDate"><spring:message code="advancedPlanSearch.label.lastModificationDate" /></label></td>
					<td class="dateColumn"><input type="text" name="lastModificationDateMin" id="lastModificationDateMin" value="" class="dateformat-d-sl-m-sl-Y border"/></td>
					<td class="dateColumn"><input type="text" name="lastModificationDateMax" id="lastModificationDateMax" value="" class="dateformat-d-sl-m-sl-Y border" /></td>
				</tr>
				<tr class="advanced">
					<td class="firstColumn"><label for="launchDate"><spring:message code="advancedPlanSearch.label.launchDate" /></label></td>
					<td class="dateColumn"><input type="text" name="launchDateMin" id="launchDateMin" value="" class="dateformat-d-sl-m-sl-Y border"/></td>
					<td class="dateColumn"><input type="text" name="launchDateMax" id="launchDateMax" value="" class="dateformat-d-sl-m-sl-Y border"/></td>
				</tr>
				<tr class="advanced">
					<td class="firstColumn"><label for="scheduledLaunchDate"><spring:message code="advancedPlanSearch.label.scheduledLaunchDate" /></label></td>
					<td class="dateColumn"><input type="text" name="scheduledLaunchDateMin" id="scheduledLaunchDateMin" value="" class="dateformat-d-sl-m-sl-Y border"/></td>
					<td class="dateColumn"><input type="text" name="scheduledLaunchDateMax" id="scheduledLaunchDateMax" value="" class="dateformat-d-sl-m-sl-Y border"/></td>
				</tr>
				</table>
			</div>
	
			<br /><br />
	
			<div class="bt">
				<input type="button" name="reset" value="<spring:message code="advancedPlanSearch.button.reset" />" class="border" onclick="resetForm()" />
				<input type="submit" name="_eventId_advancedSearch" value="<spring:message code="advancedPlanSearch.submit.advancedSearch" />" class="border" onclick="return validateSearch();"/>
			</div>
		</fieldset>	
	
	
	
	</form>

<jsp:include page="footer.jsp" />	
