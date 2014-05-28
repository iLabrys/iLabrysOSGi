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

<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags"%>
<%
	String theme = "themes/indra/";
	//String theme = "themes/bbva/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
		<meta http-equiv="content-type" content="text/html; charset=ISO-8859-1">
		<meta http-equiv="Content-Language" content="English" />
		<meta name="Keywords" content="itecban, framework, bundle, repository, osgi" >
		<script type="text/javascript">
			dRoot = "<c:url value='/' />";
			if (dRoot.charAt(dRoot.length-1)!="/"){
				dRoot = dRoot.substring(0,dRoot.lastindexOf("/"));
			}
			theme = dRoot + "<%=theme%>";
			
		</script>
  		<title>iLabrys GEX</title>
  		
		<link rel="stylesheet" href="<c:url value='/' /><%=theme%>css/styles.css" type="text/css">
		<link rel="stylesheet" href="<c:url value='/utils/datePicker/css/datepicker.css' />" type="text/css">
		<script type="text/javascript">
		user = "<security:authentication property="principal"/>";
		aMenu = new Array();
			aMenu[0] = ["execution","http://192.168.181.169:7070/es.itecban.deployment.executionmanager.gui.swf.war/swf/createPlan",true,"Execution Manager"];
			aMenu[1] = ["environment","http://192.168.181.169:9090/es.itecban.deployment.environmentmanager.web.mvc.war",false,"Environment Manager"];
			aMenu[2] = ["repository","http://192.168.181.169:8090/es.itecban.deployment.repository.web.war/index.htm",false,"Repository Manager"];
			aMenu[3] = ["artifact","http://192.168.181.169:8090/es.itecban.deployment.repository.physical.filesystem.web.war/index.htm",false,"Artifact Manager"];
			//aMenu[0] = ["execution","http://10.65.233.121:7070/es.itecban.deployment.executionmanager.gui.swf.war/swf/createPlan",false];
			//aMenu[1] = ["environment","http://10.65.233.121:9090/es.itecban.deployment.environmentmanager.web.mvc.war",true];
			//aMenu[2] = ["repository","http://10.65.233.121:8090/es.itecban.deployment.repository.web.war/index.htm",false];
			//aMenu[3] = ["artifact","http://10.65.233.121:8090/es.itecban.deployment.repository.physical.filesystem.web.war/index.htm",false];
			//aMenu[0] = ["execution","http://10.40.100.115:7070/es.itecban.deployment.executionmanager.gui.swf.war/swf/createPlan",false];
			//aMenu[1] = ["environment","http://10.40.100.115:9090/es.itecban.deployment.environmentmanager.web.mvc.war",true];
			//aMenu[2] = ["repository","http://10.40.100.115:8090/es.itecban.deployment.repository.web.war/index.htm",false];
			//aMenu[3] = ["artifact","http://10.40.100.115:8090/es.itecban.deployment.repository.physical.filesystem.web.war/index.htm",false];

		
		aNavigation = new Array();
			aNavigation[0] = ["<spring:message code="js.navigation.home" />","#"," onmouseover=\"writeMenu()\" onmouseout=\"UnTip()\""];
			aNavigation[1] = ["<spring:message code="js.navigation.createPlan" />","./generalPlan",""];
			aNavigation[2] = ["<spring:message code="js.navigation.searchPlan" />","./searchPlan",""];
			aNavigation[3] = ["<spring:message code="js.navigation.searchReport" />","./reportSearch",""];

			js_writePostContent_user   = "<spring:message code="js.writePostContent.user" />";
			js_writePostContent_logout = "<spring:message code="js.writePostContent.logout" />";
		</script>
		<script src="<c:url value='/' /><%=theme %>js/utils.js" type="text/javascript"></script>
		<script src="<c:url value='/' /><%=theme %>js/skeleton.js" type="text/javascript"></script>
		<script src="<c:url value='/js/artifactsUtils.js' />" type="text/javascript" /></script>
		<script src="<c:url value='/js/json2.js' />" type="text/javascript"></script>
		<script src="<c:url value='/utils/datePicker/js/datepicker.js' />" type="text/javascript"></script>

	</head>

<body>
<script type="text/javascript" src="<c:url value='/' /><%=theme %>js/wz_tooltip.js"></script>
<script type="text/javascript">writePreContent();</script>	
