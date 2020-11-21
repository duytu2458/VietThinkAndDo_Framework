<jsp:include page="/common/taglib.jsp"></jsp:include>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Admin Create Basic</title>
<!-- <link rel="stylesheet" href="fonts/fontawesome.min.css"> -->
<link rel="stylesheet" href="bootstrap/css/bootstrap.min.css">
<link rel="stylesheet" href="css/style.css">
<link rel="stylesheet" href="views/admin/own_css/home.css">
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<style type="text/css">
input[type=radio] {
	border: 0px;
	width: 100%;
	height: 1.5em;
}
</style>

</head>
<body>
	<article>
		<!-- Start header -->
		<jsp:include page="/views/admin/jsp/header.jsp"></jsp:include>
		<!-- End header  -->
		<!--  Start Main = -->
		<main class="mx-5">
			<div class="w-100 row mx-md-2 mx-sm-2 mx-1 mt-3">
				<div class="col-xl-1 col-lg-2 col-sm-4 col-6">
					<a href="#">
						<button
							class="btn btn-outline-primary btn-block px-1 w-100 active">Basic</button>
					</a>
				</div>
				<div class="col-xl-1 col-lg-2 col-sm-4 col-6">
					<a href="<%= request.getContextPath() %>/create-user-file-view">
						<button class="btn btn-outline-primary btn-block px-1 w-100">File</button>
					</a>
				</div>
			</div>
			
			<!--  Start User-Form  -->
			<jsp:include page="/views/admin/jsp/user-form.jsp"></jsp:include>
			<!--  End Use-Form  -->
		</main>

		<!--  End Main  -->

		<!--  Start Footer  -->
		<jsp:include page="/views/admin/jsp/footer.jsp"></jsp:include>
		<!--  End Footer  -->
	</article>
</body>
<script src="bootstrap/js/jquery-3.5.1.min.js"></script>
<script src="bootstrap/js/bootstrap.min.js" /></script>
<!-- Xu ly phan trang -->
<script src="views/admin/others_js/lib/jquery.twbsPagination.js"
	type="text/javascript"></script>
<script src="views/admin/others_js/pagiantionHandler_JS.js"
	type="text/javascript"></script>

</html>
