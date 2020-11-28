<jsp:include page="/common/taglib.jsp"></jsp:include>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>User Home</title>
<!-- <link rel="stylesheet" href="fonts/fontawesome.min.css"> -->
<link rel="stylesheet" href="bootstrap/css/bootstrap.min.css">



<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<!-- <link rel="stylesheet" href="views/admin/own_css/home.css"> -->
<!-- 
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script> -->

<link rel="stylesheet" href="css/style.css">
<link rel="stylesheet" href="views/user/own-css/own.css">
<link rel="stylesheet" href="views/user/other-css/menu.css">
<link rel="stylesheet" href="views/user/other-css/sidenav.css">
<link rel="stylesheet" href="views/user/other-css/quick-menu.css">
</head>
<body>
	<!-- Start Side Nav -->
	<jsp:include page="/views/user/jsp/side-nav.jsp"></jsp:include>
	<!-- Stop Side Nav -->
	<article>
		<!-- Start header -->
		<jsp:include page="/views/user/jsp/header.jsp"></jsp:include>
		<!-- End header  -->
		<hr class="home_hrTag_OtherStyle">
		<!--  Start Main = -->

		<main class="mx-5">
			Tao bai viet
			<!--  Stop Main = -->
		</main>

		<!--  Start Footer  -->
		<jsp:include page="/views/user/jsp/footer.jsp"></jsp:include>
		<!--  End Footer  -->

	</article>


</body>
<script src="bootstrap/js/jquery-3.5.1.min.js"></script>
<script src="bootstrap/js/bootstrap.min.js" /></script>

</html>