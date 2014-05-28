<%@ page language="java" contentType="text/html"%>
<%@ page session="false"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<jsp:include page="header.jsp" />

	<script type="text/javascript">
		aToDoWhenLoaded = ['cb();'];
	</script>

		<c:choose>
			<c:when test="${operationFlow =='updateFlow'}">	
				<h1><spring:message code="planExecutionImpact.h1" /></h1>
			</c:when>
			<c:when test="${operationFlow =='deleteFlow'}">		
				<h1><spring:message code="planExecutionImpactDelete.h1" /></h1>
			</c:when>
			<c:otherwise>
			 <h1><spring:message code="planExecutionImpact.h1" /></h1>
			 </c:otherwise>
		</c:choose>	
	
	
	<br/>
	<form action="${flowExecutionUrl}" method="post">
	<fieldset>
		<legend><spring:message code="planExecutionImpact.legend" /></legend>
		
	<div class="blockBox" id="depviewer" style="text-align:center;">		
		<applet code="es.itecban.deployment.software.inversedependency.viewer.InverseDependencyViewer" 
			archive="../viewer/es.itecban.deployment.software.inversedependency.viewer.jar"
			width="550"
			height="350">
       		<!--<param name="xmlDependencyGraph" value="${xmlDependencyGraph}"/>-->
       		<!--<param name="xmlDependencyGraph" value="http://192.168.182.95:9090/es.itecban.deployment.executionmanager.gui.swf/unitInverseDependencies.htm?name=pbo-ddl&version=1.0.0&environment=entorno+de+pruebas&justGraph=true"/>-->
       		<param name="xmlDependencyGraph" value="http${xmlDependencyGraph}"/>
       		
			<param name="color_r" value="255"/>
			<param name="color_g" value="255"/>
			<param name="color_b" value="255"/>
			<param name="name" value="${name}" />
			<param name="version" value="${version}" />
			<param name="environment" value="${environment}" />
			<param name="containerGraphList" value="${containerGraphList}" />	 
			<param name="debug" value="true">			 
		</applet>
	</div>	  
			
			
			
	<br/><br/>
	<div class="bt">
	<input type="submit" name="_eventId_back" value="<spring:message code="planExecutionImpact.submit.back" />" class="border" />
	<input type="submit" name="_eventId_next" value="<spring:message code="planExecutionImpact.submit.next" />" class="border" />
	</div>	
	
	</form>

<jsp:include page="footer.jsp" />





