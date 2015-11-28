<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<div>
		<s:form modelAttribute="user" action="doLogin" method="post">
			<table>
				<tr>
					<td>First Name</td>
					<td><s:input path="firstName"></s:input></td>
					<td><s:errors path="firstName" cssClass="error"></s:errors>
					</td>
				</tr>
				<tr>
					<td>Last Name</td>
					<td><s:input path="lastName"></s:input></td>
					<td><s:errors path="lastName" cssClass="error"></s:errors>
					</td>
				</tr>
				
				<tr>
				
					<input type="submit" value="login" />

				</tr>

			</table>


		</s:form>

	</div>

</body>
</html>