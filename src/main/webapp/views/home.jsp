<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<%@include file="/resources/component/all_link.jsp"%>
<title>Insert title here</title>
</head>
<body>
	<%@include file="/resources/component/navbar.jsp"%>

	<div class="container p-5 mt-5">
		<div class="text-center">
			<div class="card card-sh">
				<div class="card-header text-center fs-4">Employees Details</div>
				<c:if test="${not empty msg}">
					<p class="fs-3 fw-bold text-success">${msg}</p>
					<c:remove var="msg" />
				</c:if>
				<div class="card-body">
					<table class="table">
						<thead>
							<tr>
								<th scope="col">No</th>
								<th scope="col">Name</th>
								<th scope="col">Address</th>
								<th scope="col">Email</th>
								<th scope="col">Password</th>
								<th scope="col">Designation</th>
								<th scope="col">Salary</th>
								<th scope="col">Action</th>
							</tr>
						</thead>
						<tbody>
							<c:forEach var="emp" items="${employees}">
								<tr>
									<th scope="col">${emp.id}</th>
									<td>${emp.fullName}</td>
									<td>${emp.address}</td>
									<td>${emp.email}</td>
									<td>${emp.password}</td>
									<td>${emp.designation}</td>
									<td>${emp.salary}</td>

									<td><a href="/editEmployee/${emp.id}"
										class="btn btn-primary btn-sm"> <i
											class="fa-solid fa-pen-to-square fa-1x"></i> Edit
									</a> <a href="/deleteEmployee/${emp.id}"
										class="btn btn-danger btn-sm"> <i
											class="fa-solid fa-trash  fa-1x"></i> Delete
									</a></td>
								</tr>
							</c:forEach>
						</tbody>
					</table>
				</div>
			</div>
		</div>
	</div>

</body>
</html>