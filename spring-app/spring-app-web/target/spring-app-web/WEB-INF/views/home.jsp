<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>list of products</title>
<link rel="stylesheet" type="text/css"
	href="<%=request.getContextPath()%>/resources/css/style1.css" />
</head>
<body>
<h1>Hello world</h1>
	<div>
		<s:form modelAttribute="product" action="save" method="post">
			<table>
				<tr>
					<td>Serial Number</td>
					<td><s:input path="serianNumber"></s:input></td>
					<td><s:errors path="serianNumber" cssClass="error"></s:errors>
					</td>
				</tr>
				<tr>
					<td>DESIGNATION</td>
					<td><s:input path="designation"></s:input></td>
					<td><s:errors path="designation" cssClass="error"></s:errors>
					</td>
				</tr>
				<tr>
					<td>PRICE</td>
					<td><s:input path="price"></s:input></td>
					<td><s:errors path="price" cssClass="error"></s:errors></td>
				</tr>
				<tr>
					<td>QUANTITY</td>
					<td><s:input path="quantity"></s:input></td>
					<td><s:errors path="quantity" cssClass="error"></s:errors></td>
				</tr>
				<tr>
					<input type="submit" value="save" />

				</tr>

			</table>


		</s:form>

	</div>



	<div>

		<table class="tableStyle">
			<tr>
				<th>Serial Number</th>
				<th>Description</th>
				<th>prix</th>
				<th>Quantite</th>

			</tr>
			<c:forEach items="${products }" var="p">
				<tr>
					<td>${p.serianNumber}</td>
					<td>${p.designation}</td>
					<td>${p.price}</td>
					<td>${p.quantity}</td>
					<td>
						<form action="selectForUpdate" method="post">
							<input type="hidden" value="${p.serianNumber}"
								name="selectedProd"> <input type="submit" value="select">
						</form>
					</td>
					<td>
						<form action="delete" method="post">
							<input type="hidden" value="${p.serianNumber}"
								name="selectedProd"> <input type="submit" value="delete">
						</form>
					</td>


				</tr>



			</c:forEach>
		</table>

	</div>

</body>
</html>