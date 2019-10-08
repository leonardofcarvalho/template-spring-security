<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<html>
<head>	
<spring:theme code="stylesheet" var="themeName" />
<link href='<spring:url value="/resources/css/${themeName}"/>' rel="stylesheet" />
</head>
<body>
	<h3>Add tasks</h3>
	<form action="addTask" method="post">
		Descrição: <br />
		<textarea name="desc" rows="5" cols="100"></textarea>
		<br />
		<form:errors path="task.desc" />
		<br />
		<input type="submit" value="Add">
	</form>
</body>
</html>