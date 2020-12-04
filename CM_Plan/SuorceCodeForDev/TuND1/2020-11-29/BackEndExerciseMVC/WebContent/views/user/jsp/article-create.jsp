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
<link rel="stylesheet" href="views/user/other-css/side-	nav.css">
<link rel="stylesheet" href="views/user/other-css/quick-menu.css">
<script type="text/javascript" src="libraries/ckeditor/ckeditor.js"></script>
<script type="text/javascript" src="libraries/ckfinder/ckfinder.js"></script>
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
			<div class="w-75 mx-auto">
				<hr>
			</div>
			<h3 class="text-center text-primary">Article Create</h3>
			<div class="row">
				<div class="col-xl-10 col-lg-10 col-sm-12 col-12 mx-auto">
					<!-- Start Content -->
					<div class="row">
						<div class="col-xl-7 col-lg-10 col-sm-12 col-12 mt-2">
							<span class="h5">Title : &nbsp;</span> <input type="text"
								class="w-75 form-control d-inline"
								placeholder="Nhap vao tieu de bai viet">
						</div>
						<div class="col-xl-5 col-lg-10 col-sm-12 col-12 mt-2">
							<span for="Category" class="h5">Category : &nbsp;</span> <input
								list="Categories" name="Category" id="Category"
								class="form-control w-50 d-inline">
							<datalist id="Categories">
								<option value="Java">
								<option value="Spring">
								<option value="Hibernate">
								<option value="Database">
								<option value="JavaScript">
							</datalist>
						</div>
					</div>
					<h5 class="mr-5 mt-3">Content :</h5>
					<textarea id="editor" class="w-100"></textarea>
					
					<div class="mt-3">
						<span class="h5">Image : </span>
						<input type="file" class="d-inline">
					</div>
					
					<!-- Stop Content -->

					<div class="mt-3 d-flex justify-content-end">
						<button class="btn btn-outline-success mr-3">Submit</button>
						<a href="<%= request.getContextPath()%>/article-my-post">
							<button class="btn btn-outline-danger ">Cancel</button>
						</a>
						
					</div>
				</div>


			</div>




		</main>
		<!--  Stop Main = -->

		<!--  Start Footer  -->
		<jsp:include page="/views/user/jsp/footer.jsp"></jsp:include>
		<!--  End Footer  -->

	</article>


</body>
<script src="bootstrap/js/jquery-3.5.1.min.js"></script>
<script src="bootstrap/js/bootstrap.min.js" /></script>
<script type="text/javascript">
	var editor = CKEDITOR.replace('editor');
	CKFinder.setupCKEditor(editor, 'libraries/ckfinder/');
	/* CKEDITOR.on('instanceReady', function(ev) {
		ev.editor.setData('<span style="font-size:20px;">&shy;</span>');
	}); */
</script>

</html>