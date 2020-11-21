<jsp:include page="/common/taglib.jsp"></jsp:include>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Welcome</title>
<!-- <link rel="stylesheet" href="fonts/fontawesome.min.css"> -->
<link rel="stylesheet" href="bootstrap/css/bootstrap.min.css">
<link rel="stylesheet" href="css/style.css">
<link rel="stylesheet" href="views/welcome/own_css/welcome.css">
<link rel="stylesheet" href="views/welcome/others_css/loginModal_CSS.css">
<link rel="stylesheet" href="views/welcome/others_css/timeLine_CSS.css">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
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
								<img src="views/welcome/media/images/vn/viettridao.png" alt="VietTriDao"
									class="w-75">
							</div>
							<div class="carousel-item active">
								<img src="views/welcome/media/images/vn/viettridao.png" alt="VietTriDao"
									class="w-75">
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
				<!-- <div class="col-xl-3 col-lg-4 col-sm-12 col-12 mt-3">
					<div class="form-group row">
						<div class="col-xl-6 col-lg-6 col-sm-5 col-5">
							<img class="w-100" src="views/welcome/media/images/general/mrHuy.png" alt="Card image">
						</div>
						<div class="col-xl-6 col-lg-6 col-sm-7 col-7">
							<h5 class="">
								<b>Sáng lập viên</b>
							</h5>
							<a class="text-primary"><i>Kỹ sư CNTT Nguyễn Tấn Huy</i></a>
						</div>
					</div>

				</div> -->
			</div>

			<div class="mt-4">
				<div class="col-xl-7 col-lg-7 col-sm-12 col-12 mx-auto">
					<div class="form-group row"> 
						<video loop="loop" class="w-100"
							controls>
							<source src="views/welcome/media/video/GDF-HaNoi-2020.mp4"
								type="video/mp4">
						</video>
					</div>
				</div>
				<div class="col-xl-12 col-lg-12 col-sm-12 col-12 mx-auto">
					<jsp:include page="/views/welcome/jsp/timeLine.jsp"></jsp:include>
				</div>
			</div>
		
		
		
			
			
			
		</main>
		<!-- ============================== Stop Main =============================== -->

		<!-- ============================== Start Footer =============================== -->
		<jsp:include page="/views/welcome/jsp/footer.jsp"></jsp:include>
		<!-- ============================== Stop Footer =============================== -->
	</article>

	<!-- ============================= Start Login Modal ============================= -->
		<jsp:include page="/views/welcome/jsp/loginModal.jsp"></jsp:include>
	<!-- ============================= Stop Login Modal ============================= -->
</body>
<script src="bootstrap/js/jquery-3.5.1.min.js"></script>
<script src="bootstrap/js/bootstrap.min.js"/></script>
</html>
