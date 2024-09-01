<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<%@include file="/resources/component/all_link.jsp"%>
</head>
<body style="background-color: #f0f0f1">
	<%@include file="/resources/component/navbar.jsp"%>

	<div class="container mt-5 ">
		<div class="row">
			<div class="col-md-6 mt-5 offset-md-3">
				<div class="card">
					<div class="card-header">
						<p class="fs-4 text-center">Register</p>
						<c:if test="${not empty msg}">
							<p class="fs-3 fw-bold text-success">${msg}</p>
							<c:remove var="msg" />
						</c:if>
					</div>
					<div class="card-body">
						<form action="/user/createUser" method="post">

							<div class="mb-3">
								<label class="form-label">Full Name</label><input
									class="form-control" name="fullname" type="text">
							</div>

							<div class="mb-3">
								<label class="form-label">Address</label><input
									class="form-control" name="address" type="text">
							</div>

							<div class="mb-3">
								<label class="form-label">Email</label><input
									class="form-control" name="email" type="email">
							</div>


							<div class="mb-3">
								<label class="form-label">Password</label><input
									class="form-control" name="password" type="password">
							</div>

							<div class="mb-3 mt-5">
								<button type="submit"
									class="btn bg-primary text-white col-md-12">Register</button>

							</div>
						</form>
					</div>
					<div class="card-footer text-center">
						have an account ?<a href="/login" class="text-decoration-none">
							Login </a>
					</div>
				</div>
			</div>
		</div>
	</div>
</body>
</html>