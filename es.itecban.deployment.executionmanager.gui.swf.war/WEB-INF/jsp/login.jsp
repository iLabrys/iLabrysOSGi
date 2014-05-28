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
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<jsp:include page="header.jsp" />

<script type="text/javascript">
		aMsg = new Array();
		aMsg[0] = ['Error','<spring:message code="login.error.0" />'];
	<c:if test="${not empty param.error}">
		aMsg[1] = ["Error","<spring:message code="${param.error}" />"];
		aToDoWhenLoaded = ["writeMsg(1);","document.getElementById('login').focus();"];
	</c:if>
	
		function validate(){
			stLogin    = document.getElementById("login").value;
			stPassword = document.getElementById("password").value;
	
			if (stLogin.length==0){
				writeMsg(0);
				document.getElementById("login").focus();
				return false;
			}else if (stPassword.length==0){
				writeMsg(0);
				document.getElementById("password").focus();
				return false;
			}else{
				document.getElementById("f").submit();
			}
		}
	</script>
<style type="text/css">
	fieldset {background: url("./img/bgLoginBox.jpg") bottom left no-repeat;}
	<c:if test="${not empty param.error}">
		div.error{
			color: #FF0000;
			border:1px solid #FF0000; 
			background-color: #FFCCCC;
			margin-right: 15px;
			margin-bottom: 15px;
			padding: 10px 5px 10px 60px;
		}
	</c:if>
</style>

<h1><spring:message code="login.h1" /></h1>

<p><spring:message code="login.p2" /></p>

<form method="post" action="j_spring_security_check" id="f">
<fieldset><legend><spring:message
	code="login.legend" /></legend>
<div class="indent"><br />

<c:if test="${not empty param.error}">
	<div class="error"><spring:message code="${param.error}" /></div>
</c:if> 

<table border="0">
	<tr>
		<td><label for="login"><spring:message
			code="login.label.login" /></label></td>
		<td><input type="text" size="20" name="j_username" id="login"
			class="border w200" /></td>
	</tr>
	<tr>
		<td><label for="password"><spring:message
			code="login.label.password" /></label></td>
		<td><input type="password" size="20" name="j_password"
			id="password" class="border w200" /></td>
	</tr>
</table>
<br />
<br />
<br />
<br />
</div>
<div class="bt"><input type="button" name="Send"
	value="<spring:message code="login.button.send" />" class="border"
	onclick="validate();"></div>
</fieldset>
</form>
<br />

<jsp:include page="footer.jsp" />
