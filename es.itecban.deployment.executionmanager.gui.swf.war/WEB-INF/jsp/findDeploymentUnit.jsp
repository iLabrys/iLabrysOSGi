<%@ page language="java" contentType="text/html"%>
<%@ page session="false"%>
<%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<jsp:include page="header.jsp"/>

	<script type="text/javascript">
	aMsg = new Array();
	aMsg[0] = ['Error','<spring:message code="find.error.0" />'];
	
	aToDoWhenLoaded = ['//resetForm();'];

	function validateName() {
		return true;
	}

	

	function isSelectedType(){
		s = document.getElementById("type");
		if (s[s.selectedIndex].value=="deployment.unit"){
			if (document.all){
				document.getElementById("trName").style.display     = "block";
				document.getElementById("trVersion").style.display  = "block";
				
			}else{
				document.getElementById("trName").style.display     = "table-row";
				document.getElementById("trVersion").style.display  = "table-row";
				
			}
			document.getElementById("divBt").style.display          = "block";
		}else if (s[s.selectedIndex].value=="unit.resource"){
			if (document.all){
				document.getElementById("trResourceType").style.display = "block";
			}else{
				document.getElementById("trResourceType").style.display = "table-row";
			}
			document.getElementById("trSupportedTypes").style.splay = "none";
			document.getElementById("trName").style.display         = "none";
			document.getElementById("trVersion").style.display      = "none";
			
			document.getElementById("divBt").style.display          = "none";
			
		}else{
			document.getElementById("trName").style.display         = "none";
			document.getElementById("trVersion").style.display      = "none";
			
			document.getElementById("trResourceType").style.display = "none";
			document.getElementById("trSupportedTypes").style.display = "none";
			document.getElementById("divBt").style.display          = "none";
		}
		resizeInnerContentBox();
	}

	function toSupportedTypes(){
		s = document.getElementById("resourceType");
		v = s[s.selectedIndex].value;
		txt = "";
		if (v!=""){
			stRT = v.split("|")[1];
			L = stRT.length;
			stRT = stRT.substring(1, L-2);
			aRT = stRT.split(",");

			//build the combo
			objSelect = document.getElementById("supportedtypes");
			objSelect.options.length = 0;
			objSelect.options[0]=new Option("","");
			for (i=0;i<aRT.length;i++){
				valueAux = aRT[i].split("=")[0];
				descAux  = aRT[i].split("=")[1];
				objSelect.options[i+1]=new Option(descAux,valueAux);
			}

			//show the TR
			oTR  = document.getElementById("trSupportedTypes");
			if (document.all){ //internet explorer
				oTR.style.display = "block";
			}else{ //all the rest browsers
				oTR.style.display = "table-row";
			}
		}else{
			//hide the TR
			document.getElementById("trName").style.display         = "none";
			document.getElementById("trVersion").style.display      = "none";
			
			document.getElementById("divBt").style.display          = "none";
			oTR = document.getElementById("trSupportedTypes");
			oTR.style.display = "none";
		}
		resizeInnerContentBox();
	}

	function isSelectedSupportedtypes(){
		s = document.getElementById("supportedtypes");
		if(s[s.selectedIndex].value!=""){
			if (document.all){
				document.getElementById("trName").style.display     = "block";
				document.getElementById("trVersion").style.display  = "block";
				
			}else{
				document.getElementById("trName").style.display     = "table-row";
				document.getElementById("trVersion").style.display  = "table-row";
				
			}
			document.getElementById("divBt").style.display          = "block";
		}else{
			document.getElementById("trName").style.display         = "none";
			document.getElementById("trVersion").style.display      = "none";
			
			document.getElementById("divBt").style.display          = "none";
		}
		resizeInnerContentBox();
	}



	
	
	</script>
	<h1><spring:message code="findByName.h1" /></h1>

	<form method="post" action="${flowExecutionUrl}" id="f">
	<fieldset>
		<legend><spring:message code="find.legend" /></legend>

		<p><spring:message code="find.p1" /></p>

		<div class="indent">
			<br />

			<table border="0">
			<tr id="trType">
				<td class="wtd"><label for="type"><spring:message code="find.label.type" /></label></td>
				<td><select name="type" id="type" class="border w200" onchange="isSelectedType()">
						<option value=""></option>
						<option value="deployment.unit"><spring:message code="find.option.deploymenUnit" /></option>
						<option value="unit.resource"><spring:message code="find.option.unitResource" /></option>
					</select>
				</td>
			</tr>
			<tr id="trResourceType" style="display:none;">
				<td class="wtd"><label for="resourceType"><spring:message code="find.label.resourceType" /></label></td>
				<td>
					<select name="resourceType" id="resourceType" class="border w200" onchange="toSupportedTypes();">
						<option value=""></option>
						<c:forEach var="t" items="${categories}">
							<option value="${t.name}|${t.supportedTypes}">${t.description}</option>
						</c:forEach>
					</select>
				</td>
			</tr>
			<tr id="trSupportedTypes" style="display:none;">
				<td class="wtd"><label for="supportedTypes"><spring:message code="find.label.supportedTypes" /></label></td>
				<td>
					<select name="supportedtypes" id="supportedtypes" class="border w200" onchange="isSelectedSupportedtypes()">
						<option value=""></option>
					</select>
				</td>
			</tr>
			<tr id="trName" style="display:none;">
				<td class="wtd"><label for="name"><spring:message code="find.label.name" /></label></td>
				<td><input type="text" size="20" name="name" id="name" class="border w200" /></td>
			</tr>
			<tr id="trVersion" style="display:none;">
				<td class="wtd"><label for="version"><spring:message code="find.label.version" /></label></td>
				<td><input type="text" size="20" name="version" id="version" class="border w200" /></td>
			</tr>
			<!--<tr id="trStrict" style="display:none;">
				<td class="wtd"><label for="name"><spring:message code="find.label.strictMatch" /></label></td>
				<td><input type="checkbox" name="strictMatch" id="strictMatch" value="strict"/></td>
			</tr>-->
 			</table>
		</div>

		<br />

		<div class="bt" id="divBt">	
			<input type="submit" name="_eventId_back" value="<spring:message code="find.submit.back" />" class="border"/>
			<input type="submit" name="_eventId_findDeploymentUnit" value="<spring:message code="find.submit.search" />"  onclick="return validateName()"  class="border"/>
		</div>
	</fieldset>
	</form>

<jsp:include page="footer.jsp"/>