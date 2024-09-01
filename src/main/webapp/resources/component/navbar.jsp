<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!-- Start NavBar -->
<nav class="navbar navbar-expand-lg  bg-primary fixed-top navbar-dark">
	<div class="container-fluid">
		<a class="navbar-brand" href="#"><i class="fa-solid fa-book"></i>
			Emp Managment System </a>
		<button class="navbar-toggler" type="button" data-bs-toggle="collapse"
			data-bs-target="#navbarSupportedContent"
			aria-controls="navbarSupportedContent" aria-expanded="false"
			aria-label="Toggle navigation">
			<span class="navbar-toggler-icon"></span>
		</button>
		<div class="collapse navbar-collapse" id="navbarSupportedContent">

			<ul class="navbar-nav me-auto mb-2 mb-lg-0">
<%-- 				<c:if test="${ not empty usrObj}"> --%>
					<li class="nav-item"><a class="nav-link active"
						aria-current="page" href="/"><i class="fa-solid fa-house"></i>
							Home</a></li>
					<li class="nav-item"><a class="nav-link active"
						aria-current="page" href="${pageContext.request.contextPath}/employee/addEmployee">Add Employee</a></li>
<%-- 				</c:if> --%>
			</ul>

			<form class="d-flex">
				<c:if test="${ empty usrObj}">
					<a href="/login" class="btn btn-light me-2" type="submit">Login</a>
					<a href="/register" class="btn btn-light" type="submit">Register</a>
				</c:if>
				<c:if test="${not empty usrObj}">
					<a href="#" class="btn btn-light me-2" type="submit"><i
						class="fa-solid fa-user"></i> ${usrObj.fullname}</a>
					<a href="${pageContext.request.contextPath}/user/logoutUser" class="btn btn-light" type="submit">Logout</a>
				</c:if>
			</form>

		</div>
	</div>
</nav>

<!-- End NavBar -->