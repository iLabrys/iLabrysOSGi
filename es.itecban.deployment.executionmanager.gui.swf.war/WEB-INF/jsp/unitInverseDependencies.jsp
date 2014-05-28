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
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<jsp:include page="header.jsp"/>
	<script type="text/javascript">
		aToDoWhenLoaded = ['cb();'];
	</script>
			
	<h1><spring:message code="unitDependencies.h1" /></h1>
	<div class="blockBox" id="depviewer" style="text-align:center;">		
		<applet code="es.itecban.deployment.software.inversedependency.viewer.InverseDependencyViewer" 
			archive="viewer/es.itecban.deployment.software.inversedependency.viewer.jar"
			width="550"
			height="350">
       		<param name="xmlDependencyGraph" value="${xmlDependencyGraph}"/>
			<param name="color_r" value="255"/>
			<param name="color_g" value="255"/>
			<param name="color_b" value="255"/>
			<param name="name" value="${name}" />
			<param name="version" value="${version}" />
			<param name ="environment" value="${environment}" />
			<!-- 
			<param name="debug" value="true">
			 -->
		</applet>
	</div>	  

<jsp:include page="footer.jsp"/>
