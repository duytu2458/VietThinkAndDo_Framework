<jsp:include page="/common/taglib.jsp"></jsp:include>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Admin Create File Post</title>
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
					<a href="<%=request.getContextPath()%>/create-user-basic">
						<button class="btn btn-outline-primary btn-block px-1 w-100 ">Basic</button>
					</a>
				</div>
				<div class="col-xl-1 col-lg-2 col-sm-4 col-6">
					<a href="<%=request.getContextPath()%>/create-user-file-view">
						<button
							class="btn btn-outline-primary btn-block px-1 w-100 active">File</button>
					</a>
				</div>
			</div>
			<h2 class="text-center">Create User File</h2>
			<h4 class="text-center text-danger">Message Here!!!</h4>
			<!--  Start User-File  -->
			<form action="<%=request.getContextPath()%>/create-user-file-post"
				method="post">
				<div class="w-100 mx-auto">

					<div class="mx-md-4 mx-sm-2 mx-1">

						<div
							class="border border-success styleBorderWidth2px mx-md-4 mx-sm-2 mx-1 my-3">
							<div class="table-responsive">

								<table>
									<thead>
										<tr class="bg-success">
											<table class="table table-striped table-hover">
												<tr class="bg-success">
													<th scope="col" style="width: 3%;">#</th>
													<th scope="col" style="width: 16%;">Account</th>
													<th scope="col" style="width: 14%;">Full Name</th>
													<th scope="col" style="width: 9%;">Password</th>
													<th scope="col" style="width: 10%;">Email</th>
													<th scope="col" style="width: 6%;">Role</th>
													<th scope="col" style="width: 8%;">Birth Date</th>
													<th scope="col" style="width: 7%;">Gender</th>
													<th scope="col" style="width: 10%;">Phone 1</th>
													<th scope="col" style="width: 15%;">Address</th>
													<th scope="col" style="width: 5%;">Enable</th>
												</tr>
											</table>
										</tr>
									</thead>
									<tbody>
										<tr>
											<table class="table table-striped table-hover ">
												<tr>
													<th scope="col" style="width: 3%;">1</th>
													<th scope="col" style="width: 16%;">Account</th>
													<th scope="col" style="width: 14%;">Full Name</th>
													<th scope="col" style="width: 9%;">Password</th>
													<th scope="col" style="width: 10%;">Email</th>
													<th scope="col" style="width: 6%;">Role</th>
													<th scope="col" style="width: 8%;">Birth Date</th>
													<th scope="col" style="width: 7%;">Gender</th>
													<th scope="col" style="width: 10%;">Phone 1</th>
													<th scope="col" style="width: 15%;">Address</th>
													<th scope="col" style="width: 5%;">Enable</th>
												</tr>
											</table>
										</tr>
										<tr>
											<td><p class="text-danger ml-5">Message here !!!</p></td>
										</tr>
										<tr>
											<table class="table table-striped table-hover ">
												<tr>
													<th scope="col" style="width: 3%;">1</th>
													<th scope="col" style="width: 16%;">Account</th>
													<th scope="col" style="width: 14%;">Full Name</th>
													<th scope="col" style="width: 9%;">Password</th>
													<th scope="col" style="width: 10%;">Email</th>
													<th scope="col" style="width: 6%;">Role</th>
													<th scope="col" style="width: 8%;">Birth Date</th>
													<th scope="col" style="width: 7%;">Gender</th>
													<th scope="col" style="width: 10%;">Phone 1</th>
													<th scope="col" style="width: 15%;">Address</th>
													<th scope="col" style="width: 5%;">Enable</th>
												</tr>
											</table>
										</tr>
										<tr>
											<td><p class="text-danger ml-5">Message here !!!</p></td>
										</tr>

									</tbody>
								</table>
							</div>
						</div>


					</div>


					<div class="w-100 row mx-auto d-flex d-flex justify-content-center">
						<!-- d-flex justify-content-end -->
						<div class="col-xl-1 col-lg-3 col-sm-3 col-6 align-self-end">
							<a href="<%=request.getContextPath()%>/create-user-file-post">
								<button class="btn btn-outline-success btn-block" type="button"
									id="clickBack">Create</button>
							</a>
						</div>
						<div class="col-xl-1 col-lg-3 col-sm-3 col-6 align-self-end">
							<a href="<%=request.getContextPath()%>/homePage?pageNum=1">
								<button class="btn btn-outline-danger btn-block" type="button"
									id="clickBack">Cancel</button>
							</a>
						</div>

					</div>
			</form>
			<!--  End Use-File  -->
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
