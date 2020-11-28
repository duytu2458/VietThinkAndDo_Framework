<jsp:include page="/common/taglib.jsp"></jsp:include>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Welcome</title>
<!-- <link rel="stylesheet" href="fonts/fontawesome.min.css"> -->
<link rel="stylesheet" href="bootstrap/css/bootstrap.min.css">


<link rel="stylesheet" href="css/style.css">
<link rel="stylesheet" href="views/welcome/own-css/own.css">


<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
</head>
<body>
	<article>
		<!-- ============================= Start header ============================= -->
		<jsp:include page="/views/welcome/jsp/header.jsp"></jsp:include>
		<!-- ============================= Stop header ============================== -->
		<!-- ============================== Start Main ============================= -->
		<main class="mx-5">
			<div class="row mt-2">
				<div class="col-xl-12 col-lg-12 col-sm-12 col-12">
					<div id="demo" class="carousel slide" data-ride="carousel">
						<!-- Indicators -->
						<ul class="carousel-indicators">
							<li data-target="#demo" data-slide-to="0" class="active"></li>
							<li data-target="#demo" data-slide-to="1"></li>
						</ul>
						<!-- The slideshow -->
						<div class="carousel-inner text-center">
							<div class="carousel-item ">
								<img src="views/welcome/media/images/vn/viettridao.png"
									alt="VietTriDao" class="w-75">
							</div>
							<div class="carousel-item active">
								<img src="views/welcome/media/images/vn/viettridao.png"
									alt="VietTriDao" class="w-75">
							</div>
						</div>
						<!-- Left and right controls -->
						<a class="carousel-control-prev" href="#demo" data-slide="prev">
							<span class="carousel-control-prev-icon"></span>
						</a> <a class="carousel-control-next" href="#demo" data-slide="next">
							<span class="carousel-control-next-icon"></span>
						</a>

					</div>
				</div>
			</div>
			<h5 class="text-center mt-3">
				<!-- "LẤY HỌC VIÊN LÀM TRUNG TÂM, VIỆC HỌC VÀ DẠY ĐỀU PHẢI CÓ CẢM XÚC" -->
			</h5>
			<div class="col-xl-6 col-sm-12 mx-auto mt-5">
				<video loop="loop" class="w-100" controls poster="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRi-GlIY2sBZnodzuljEeg3Kp70sVIj-i2lFQ&usqp=CAU">
					<source src="views/welcome/media/video/GDF-HaNoi-2020.mp4"
						type="video/mp4">
				</video>
			</div>

			<div class="mt-4 w-100">
				<div class="mx-auto">
				</div>
			</div>
		</main>
		<!-- ============================== Stop Main =============================== -->

		<!-- ============================== Start Footer =============================== -->
		<jsp:include page="/views/welcome/jsp/footer.jsp"></jsp:include>
		<!-- ============================== Stop Footer =============================== -->
	</article>

	<!-- ============================= Start Login Modal ============================= -->
	<jsp:include page="/views/welcome/jsp/login-modal.jsp"></jsp:include>
	<!-- ============================= Stop Login Modal ============================= -->
</body>
<script src="bootstrap/js/jquery-3.5.1.min.js"></script>
<script src="bootstrap/js/bootstrap.min.js" /></script>
</html>
