<jsp:include page="/common/taglib.jsp"></jsp:include>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>My post</title>
<!-- <link rel="stylesheet" href="fonts/fontawesome.min.css"> -->
<link rel="stylesheet" href="bootstrap/css/bootstrap.min.css">


<!-- <link rel="stylesheet" href="views/admin/own_css/home.css"> -->
<!-- 
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script> -->
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<link rel="stylesheet" href="css/style.css">
<link rel="stylesheet" href="views/user/own-css/own.css">
<link rel="stylesheet" href="views/user/other-css/menu.css">
<link rel="stylesheet" href="views/user/other-css/side-nav.css">
<link rel="stylesheet" href="views/user/other-css/quick-menu.css">
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
			<h3 class="text-center text-center" style="color: rgb(255, 117, 26);"><b>My Post</b></h3>
			<div class="row mt-3 ml-5">
				<div class="col-xl-9 col-lg-10 col-sm-10 col-12 mx-auto">
					<span class="h5"><a
						href="<%=request.getContextPath()%>/user-system">Home</a></span>
					<ul class="quick_menu_OtherStyle pl-1"
						style="display: inline-block;">
						<li class="h5"><a href="#">My Post</a></li>
					</ul>
				</div>
			</div>

			<div class="row mt-n4">
				<div class="col-xl-9 col-lg-10 col-sm10 col-12 mx-auto">
					<a href="<%=request.getContextPath()%>/article-create">
						<button class="btn btn-outline-success float-right">Create</button>
					</a>

				</div>
			</div>
			<div class="row mt-3">

				<div class="col-xl-9 col-lg-10 col-sm10 col-12 mx-auto">
					<!-- Start 1 Line article -->

					<div class="media border p-2">
						<img src="views/user/media/images/avatar/boy3.png" alt="John Doe"
							class="mr-3 mt-1 rounded-circle">
						<div class="media-body">
							<h5>
								Nguyen Duy Tu <small class="float-right"><i>Posted
										on 12/30/2020</i></small>
							</h5>
							<a href="<%=request.getContextPath()%>/article-view">
								<h5>Giải ngố vấn đề Java Giải ngố vấn đề Java Giải ngố vấn
									đề Java</h5>
							</a>
							<div class="mt-n2">
								<button
									class="btn btn-sm btn-outline-secondary ml-3 float-right">
									<i class="fa fa-power-off" style="font-size: 18px"></i>
								</button>
								<button class="btn btn-sm btn-outline-danger ml-3 float-right">
									<i class="fa fa-trash-o" style="font-size: 18px"></i>
								</button>
								<a href="<%=request.getContextPath()%>/article-create">
									<button class="btn btn-sm btn-outline-primary float-right">
										<i class="fa fa-wrench" style="font-size: 18px"></i>
									</button>
								</a>

							</div>
						</div>
					</div>
					<!-- Stop 1 Line article -->
					<!-- Start 1 Line article -->
					<div class="media border p-2">
						<img src="views/user/media/images/avatar/boy3.png" alt="John Doe"
							class="mr-3 mt-1 rounded-circle">
						<div class="media-body">
							<h5>
								Nguyen Duy Tu <small class="float-right"><i>Posted
										on 12/30/2020</i></small>
							</h5>
							<a href="<%=request.getContextPath()%>/article-view">
								<h5>Giải ngố vấn đề Java Giải ngố vấn đề Java Giải ngố vấn
									đề Java</h5>
							</a>
							<div class="mt-n2">
								<button
									class="btn btn-sm btn-outline-secondary ml-3 float-right">
									<i class="fa fa-power-off" style="font-size: 18px"></i>
								</button>
								<button class="btn btn-sm btn-outline-danger ml-3 float-right">
									<i class="fa fa-trash-o" style="font-size: 18px"></i>
								</button>
								<button class="btn btn-sm btn-outline-primary float-right">
									<i class="fa fa-wrench" style="font-size: 18px"></i>
								</button>
							</div>
						</div>
					</div>
					<!-- Stop 1 Line article -->
					<!-- Start 1 Line article -->
					<div class="media border p-2">
						<img src="views/user/media/images/avatar/boy3.png" alt="John Doe"
							class="mr-3 mt-1 rounded-circle">
						<div class="media-body">
							<h5>
								Nguyen Duy Tu <small class="float-right"><i>Posted
										on 12/30/2020</i></small>
							</h5>
							<a href="<%=request.getContextPath()%>/article-view">
								<h5>Giải ngố vấn đề Java Giải ngố vấn đề Java Giải ngố vấn
									đề Java</h5>
							</a>
							<div class="mt-n2">
								<button
									class="btn btn-sm btn-outline-secondary ml-3 float-right">
									<i class="fa fa-power-off" style="font-size: 18px"></i>
								</button>
								<button class="btn btn-sm btn-outline-danger ml-3 float-right">
									<i class="fa fa-trash-o" style="font-size: 18px"></i>
								</button>
								<button class="btn btn-sm btn-outline-primary float-right">
									<i class="fa fa-wrench" style="font-size: 18px"></i>
								</button>
							</div>
						</div>
					</div>
					<!-- Stop 1 Line article -->
					<!-- Start 1 Line article -->
					<div class="media border p-2">
						<img src="views/user/media/images/avatar/boy3.png" alt="John Doe"
							class="mr-3 mt-1 rounded-circle">
						<div class="media-body">
							<h5>
								Nguyen Duy Tu <small class="float-right"><i>Posted
										on 12/30/2020</i></small>
							</h5>
							<a href="<%=request.getContextPath()%>/article-view">
								<h5>Giải ngố vấn đề Java Giải ngố vấn đề Java Giải ngố vấn
									đề Java</h5>
							</a>
							<div class="mt-n2">
								<button
									class="btn btn-sm btn-outline-secondary ml-3 float-right">
									<i class="fa fa-power-off" style="font-size: 18px"></i>
								</button>
								<button class="btn btn-sm btn-outline-danger ml-3 float-right">
									<i class="fa fa-trash-o" style="font-size: 18px"></i>
								</button>
								<button class="btn btn-sm btn-outline-primary float-right">
									<i class="fa fa-wrench" style="font-size: 18px"></i>
								</button>
							</div>
						</div>
					</div>
					<!-- Stop 1 Line article -->
				</div>
			</div>


			<!--  Stop Main = -->
		</main>
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