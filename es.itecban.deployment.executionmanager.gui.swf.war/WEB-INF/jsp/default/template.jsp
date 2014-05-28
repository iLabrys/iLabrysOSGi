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
<%@ page import="org.springframework.web.servlet.support.RequestContextUtils, java.util.Locale"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<%@ page contentType="text/html" %>
<%@ page session="false" %>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<% 	Locale local = RequestContextUtils.getLocale(request); %>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <title>ITECBAN SWF2 Template Title</title>
    <link rel="shortcut icon" href="<c:url value='/img/favicon.ico'/>"/>
	<link rel="stylesheet" href="<c:url value='/css/styles.css'/>" type="text/css">
	<script type="text/javascript">dRoot = "<c:url value='/' />";</script>
	<script type="text/javascript" src="<c:url value='/js/global.js.jsp'/>"></script>
	<script src="<c:url value='/js/utils.js'/>" type="text/javascript"></script>
	<script src="<c:url value='/js/skeleton.js'/>" type="text/javascript"></script>
		
	<meta name="title" content="ITECBAN SWF2 Template Title"/>
	<meta name="keywords" content="Keywords should go here"/>
	<meta name="description" content="Page description goes here"/>
	<meta name="Author" content="DIT - UPM" />
	<meta name="DC.Language" scheme="RFC1766"/>
	<meta name="language" content="<%=local.getLanguage()%>" />
	<meta name="revisit" content="1 days" />
	<meta name="robots" content="all / index / follow" />
		
	<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1" />
	<meta http-equiv="Content-Language" content="<%=local.getLanguage()%>" />
	<meta http-equiv="Pragma" content="no-cache" /> 
	<meta http-equiv="Cache-Control" content="no-cache" />
  </head>
  
<body>
	<script type="text/javascript" src="<c:url value='/js/wz_tooltip.js'/>"></script>
	<script type="text/javascript">writePreContent();</script>	
	
	<h1> Prueba </h1>

    				<%-- <tiles:insertAttribute name="home"/> --%>

	<script type="text/javascript">writePostContent();</script>
</body>
</html>
