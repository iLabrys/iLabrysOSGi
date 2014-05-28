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
