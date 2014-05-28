<%@ page language="java" contentType="text/xml"%>
<%@ page session="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>

<head>
	<title>Execution report</title>
</head>

<body>

<jsp:include page="header.jsp" />
<h1>Execution report:</h1>
<br />
<form action="${flowExecutionUrl}" method="post">
<form method="post" action="${flowExecutionUrl}" id="f">
<textarea>
<c:out value="${executionReport}"/>
</textarea>
<br />
</form>


</body>
<jsp:include page="footer.jsp" />