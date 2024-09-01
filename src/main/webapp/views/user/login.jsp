<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page isELIgnored="false"%>
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
	<div class="container mt-5 p-5">
		<div class="row">
			<div class="col-md-6 mt-5 offset-md-3">
				<div class="card">
					<div class="card-header">
						<p class="fs-4 text-center">Login</p>
						<c:if test="${not empty msg}">
							<p class="fs-3 fw-bold text-danger">${msg}</p>
							<c:remove var="msg" />
						</c:if>
					</div>
					<div class="card-body">
						<form action="/user/loginUser" method="post">
							<div class="mb-3">
								<label class="form-label">Email</label><input
									class="form-control" name="email" type="email">
							</div>
							<div class="mb-3">
								<label class="form-label">Password</label><input
									class="form-control" name="password" type="password">
							</div>
							<button type="submit" class="btn bg-primary text-white col-md-12">Login</button>
						</form>
					</div>
					<div class="card-footer text-center">
						<a href="#" class="text-decoration-none">Forget Password</a><br>
						Don't have an account ?<a href="/register"
							class="text-decoration-none"> Create one </a>
					</div>
				</div>
			</div>
		</div>
	</div>
</body>
</html>