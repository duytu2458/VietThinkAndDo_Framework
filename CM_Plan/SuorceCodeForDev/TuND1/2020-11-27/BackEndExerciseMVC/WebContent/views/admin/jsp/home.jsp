<jsp:include page="/common/taglib.jsp"></jsp:include>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Admin Home</title>
<!-- <link rel="stylesheet" href="fonts/fontawesome.min.css"> -->
<link rel="stylesheet" href="bootstrap/css/bootstrap.min.css">


<link rel="stylesheet" href="css/style.css">
<!-- <link rel="stylesheet" href="views/admin/own-css/home.css"> -->
<link rel="stylesheet" href="views/admin/own-css/own.css">

<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
</head>
<body>
	<article>
		<!-- Start header -->
		<jsp:include page="/views/admin/jsp/header.jsp"></jsp:include>
		<!-- End header  -->
		<!--  Start Main = -->
		<main class="mx-5">
			<!-- Start Search -->
			<jsp:include page="/views/admin/jsp/search.jsp"></jsp:include>
			<!-- End Search -->
			<div class="row">
				<div class="col-12 mt-2">
					<h2 class="text-center text-black-50">User List</h2>
					<h4 class="text-center text-danger">Thong bao tai day !!!!</h4>
				</div>
			</div>
			<div class="border border-success mx-md-4 mx-sm-2 mx-1">
				<div class="table-responsive">
					<table class="table table-striped table-hover">
						<thead>
							<tr class="bg-success">
								<th scope="col" style="width: 2%;">#</th>
								<th scope="col" style="width: 12%;">Account</th>
								<th scope="col" style="width: 10%;">Full Name</th>
								<th scope="col" style="width: 6%;">Role</th>
								<th scope="col" style="width: 6%;">Gender</th>
								<th scope="col" style="width: 12%;">Birth Date</th>
								<th scope="col" style="width: 10%;">Email</th>
								<th scope="col" style="width: 6%;">Phone</th>
								<th scope="col" style="width: 6%;">Address</th>
								<th scope="col" style="width: 6%;">Enable</th>
								<th colspan="2" style="width: 7%;"></th>
							</tr>
						</thead>
						<tbody>
							<tr>
								<td>1</td>
								<td>TuND14</td>
								<td>Nguyen Duy Tu</td>
								<td>Admin</td>
								<td>sd</td>
								<td>asd</td>
								<td>asd</td>
								<td>asd</td>
								<td>Dia chi</td>
								<th scope="col" style="width: 6%;">Enable</th>
								<td><a href="<%=request.getContextPath()%>/update-user">
										<button type="submit" class="btn btn-outline-primary">Update</button>
								</a></td>
								<td>
									<button class="btn btn-outline-danger" data-toggle="modal"
										data-target="#confirmModal">Delete</button>
								</td>
							</tr>
						</tbody>
					</table>
				</div>
			</div>
		</main>
		<!--  End Main  -->

		<div class="mx-md-5 mx-sm-2 mx-1 mt-4">
			<div class="px-1 py-2 mx-auto text-center h6">Totals: 999
				Results / 999 Pages</div>
			<div class="row mx-5">

				<div class="col-xl-2 col-lg-6 col-md-6 col-sm-6 mt-1">
					<div class="btn-group">
						<input type="text" placeholder="Page" class="form-control">
						&nbsp;
						<button class="btn btn-outline-primary btn-block rounded">
							Go</button>
					</div>
				</div>
				<div class="col-xl-1 col-lg-3 col-md-4 col-sm-4 col-6 mt-1">
					
				</div>
				<div
					class="col-xl-6 col-lg-12 col-md-12 col-sm-12 overflow-auto text-center mt-1">
					<ul class="pagination w-100 mx-auto d-flex justify-content-center"
						id="pagination"></ul>
				</div>
				<div class="col-xl-1 col-lg-3 col-md-4 col-sm-4 col-6 mt-1">
					<a href="<%=request.getContextPath()%>/create-user-basic">
						<button class="btn btn-outline-primary btn-block px-1">Create</button>
					</a>
				</div>

				<div class="col-xl-1 col-lg-3 col-md-4 col-sm-4 col-6 mt-1">
					<a href="/addUser-view">
						<button class="btn btn-outline-primary btn-block px-1">Back</button>
					</a>
				</div>
				<div class="col-xl-1 col-lg-3 col-md-4 col-sm-4 col-6 mt-1">
					<a href="/homePage?pageNum=1">
						<button class="btn btn-outline-primary btn-block px-1">Reload</button>
					</a>
				</div>
			</div>

		</div>


		<!--  Start Footer  -->
		<jsp:include page="/views/admin/jsp/footer.jsp"></jsp:include>
		<!--  End Footer  -->
	</article>

	<!-- Start confirmModal -->
	<jsp:include page="/views/admin/jsp/confirmModal.jsp"></jsp:include>
	<!-- End confirmModal  -->

</body>
<script src="bootstrap/js/jquery-3.5.1.min.js"></script>
<script src="bootstrap/js/bootstrap.min.js" /></script>
<!-- Xu ly phan trang -->
<script src="views/admin/others-js/lib/jquery.twbsPagination.js"
	type="text/javascript"></script>
<script src="views/admin/others-js/pagiantionHandler.js"
	type="text/javascript"></script>

</html>
