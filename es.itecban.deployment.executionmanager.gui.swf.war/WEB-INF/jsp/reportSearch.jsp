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
	<script type="text/javascript">
		isAdvancedSearch = false;
		
		function toggleAdvancedSearch(){
			isAdvancedSearch = (!isAdvancedSearch);
			
			if (isAdvancedSearch){
				textLinkSearch = "<spring:message code="reportSearch.text.simpleSearch" />";
				if(document.all){
					defStyle = "advancedBlock";
				}else{
					defStyle = "advancedTableRow";
				}
			}else{
				
				textLinkSearch = "<spring:message code="reportSearch.text.advancedSearch" />";	
				defStyle = "advanced";
			}
			aTR = document.getElementsByTagName("tr");
			for(i=0;i<aTR.length;i++){
				if (aTR[i].className=="advanced" || aTR[i].className=="advancedTableRow" || aTR[i].className=="advancedBlock"){
					aTR[i].className = defStyle;
				}
			}
			document.getElementById("linkSearch").innerHTML = textLinkSearch;

		}
	</script>
	<h1><spring:message code="reportSearch.h1" /></h1>
	
	<form method="post" action="${flowExecutionUrl}" id="f">
		<fieldset>
			<legend><spring:message code="reportSearch.legend" /></legend>
	
			<div class="indent">
				<br >
	
				<table border="0" width="370">
				<tr>
					<td class="firstColumn"><label for="planName"><spring:message code="reportSearch.label.name" /></label></td>
					<td colspan="2" align="right" nowrap><input type="text" name="planName" id="planName" value="" class="border" style="width:220px" > &nbsp;</td>
				</tr>
				<tr>
					<td colspan=3" style="text-align:right"><label><a href="#" onclick="toggleAdvancedSearch()"><span id="linkSearch"><spring:message code="reportSearch.text.advancedSearch" /></span></a></label> &nbsp;</td>
				</tr>
				<tr class="advanced">
					<td class="firstColumn"><label for="environment"><spring:message code="reportSearch.label.environment" /></label></td>
					<td colspan="2" align="right" nowrap><select name="environment" id="environment" class="border"style="width:220px">
						<c:forEach var="env" items="${environments}">			
							<option value="${env}">${env}</option>
						</c:forEach>
						</select> &nbsp;
					</td>
				</tr>
				<tr class="advanced">
					<td class="firstColumn"><label for="endDate"><spring:message code="reportSearch.label.endDate" /></label></td>
					<td class="dateColumn"><input type="text" name="endDateMin" id="endDateMin" value="" class="dateformat-d-sl-m-sl-Y border"/></td>
					<td class="dateColumn" align="right"><input type="text" name="endDateMax" id="endDateMax" value="" class="dateformat-d-sl-m-sl-Y border"/> &nbsp;</td>
				</tr>
				<tr class="advanced">
					<td class="firstColumn"><label for="creationUser"><spring:message code="reportSearch.label.creationUser"  /></label></td>
					<td colspan="2" align="right" nowrap><input type="text" name="creationUser" id="creationUser" value="" class="border" style="width:220px"> &nbsp;</td>
				</tr>
				<tr class="advanced">
					<td class="firstColumn"><label for="launcherUser"><spring:message code="reportSearch.label.launcherUser"   /></label></td>
					<td colspan="2" align="right" nowrap><input type="text" name="launcherUser" id="launcherUser" value="" class="border" style="width:220px"> &nbsp;</td>
				</tr>
				</table>
			</div>
	
			<br><br>
	
			<div class="bt">
				<input type="submit" name="_eventId_search" value="<spring:message code="reportSearch.submit.search" />" class="border" />
			</div>
		</fieldset>
	</form>

<jsp:include page="footer.jsp" />	