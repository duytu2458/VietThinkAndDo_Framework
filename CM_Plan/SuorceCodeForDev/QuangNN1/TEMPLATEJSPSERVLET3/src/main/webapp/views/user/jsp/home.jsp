<jsp:include page="/common/taglib.jsp"></jsp:include>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>User Home</title>
<!-- <link rel="stylesheet" href="fonts/fontawesome.min.css"> -->
<link rel="stylesheet" href="bootstrap/css/bootstrap.min.css">

<link rel="stylesheet" href="css/style.css">
<!-- <link rel="stylesheet" href="views/admin/own_css/home.css"> -->
<!-- 
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script> -->

<link rel="stylesheet" href="views/user/own-css/own.css">
<link rel="stylesheet" href="views/user/other-css/menu.css">
<link rel="stylesheet" href="views/user/other-css/side-nav.css">

</head>
<body>

	<article>
		<!-- Start Side Nav -->
		<jsp:include page="/views/user/jsp/side-nav.jsp"></jsp:include>
		<!-- Stop Side Nav -->

		<!-- Start header -->
		<jsp:include page="/views/user/jsp/header.jsp"></jsp:include>
		<!-- End header  -->
		<!--  Start Main = -->

		<main class="mx-5">
		<div class="w-50 mx-auto">
			<hr>
		</div>
		<div class="row mt-2 ml-5 mb-3">
			<div class="col-xl-9 col-lg-10 col-sm-10 col-12 mx-auto">
				<span class="h5"><a
					href="<%=request.getContextPath()%>/user-system">Home</a></span>
			</div>
		</div>

		<div class="row mt-3">
			<c:forEach var="news" items="${newDtoList}">
				<div class="col-xl-9 col-lg-10 col-sm10 col-12 mx-auto">
					<div class="media border p-2">
						<img src="views/user/media/images/avatar/boy3.png" alt="John Doe"
							class="mr-3 mt-1 rounded-circle">
						<div class="media-body">
							<h5>
								${news.createdBy} <small class="float-right"><i>Posted
										on ${news.createdDate}</i></small>
							</h5>
							<a href='<c:url value="/user-new?type=detail&id=${news.id}"/>'>
								<h5>${news.title}</h5>
							</a>
						</div>
					</div>
				</div>
			</c:forEach>
		</div>
		<!--  Stop Main = --> </main>
		<!--  Start Pagination -->
		<jsp:include page="/views/user/jsp/pagination.jsp"></jsp:include>
		<!--  Stop Pagination -->

		<!--  Start Footer  -->
		<jsp:include page="/views/user/jsp/footer.jsp"></jsp:include>
		<!--  End Footer  -->
	</article>


</body>
<script src="bootstrap/js/jquery-3.5.1.min.js"></script>
<script src="bootstrap/js/bootstrap.min.js" /></script>
<!-- Xu ly phan trang -->
<script src="views/user/others-js/lib/jquery.twbsPagination.js"
	type="text/javascript"></script>
<script src="views/user/others-js/pagiantionHandler.js"
	type="text/javascript"></script>

</html>