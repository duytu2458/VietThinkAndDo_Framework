<jsp:include page="/common/taglib.jsp"></jsp:include>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Welcome</title>
<!-- <link rel="stylesheet" href="fonts/fontawesome.min.css"> -->
<link rel="stylesheet" href="bootstrap/css/bootstrap.min.css">
<link href="https://fonts.googleapis.com/css?family=Montserrat"
	rel="stylesheet" type="text/css">
<link href="https://fonts.googleapis.com/css?family=Lato"
	rel="stylesheet" type="text/css">

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

			<!-- Container (About Section) -->
			<br>
			<div id="about" class="container-fluid mt-5">
				<div class="row">
					<div class="col-sm-8">
						<h2 class="text-center">SỨ MỆNH</h2>
						<br>
						<h4>
							<strong class="text-primary">"BIẾN ƯỚC MƠ CỦA BẠN
								THÀNH HIỆN THỰC"</strong>
						</h4>
						<br>
						<p>VIỆT TRÍ ĐẠO mong muốn trở thành một nơi đào tạo
							về công nghệ thông tin uy tín nhất, trên cơ sở cam kết mức
							học phí tiết kiệm nhất và thời gian học được rút ngắn
							nhất phù hợp với từng học viên. Chúng tôi quyết tâm theo
							đuổi mục tiêu lấy thành quả trong việc tìm được việc
							làm của TỪNG học viên để đo mức độ thành công của VIỆT
							TRÍ ĐẠO.</p>
						<br>
					</div>
					<div class="col-sm-4">
						<span class="glyphicon glyphicon-signal logo"></span>
					</div>
				</div>
			</div>

			<div class="container-fluid mt-5">
				<div class="row">
					<div class="col-sm-4">
						<span class="glyphicon glyphicon-globe logo slideanim"></span>
					</div>
					<div class="col-sm-8">
						<h2 class="text-center">TRIẾT LÝ ĐÀO TẠO</h2>
						<br>
						<h4>
							<strong class="text-primary">"LẤY HỌC VIÊN LÀM TRUNG
								TÂM, VIỆC HỌC VÀ DẠY ĐỀU PHẢI CÓ CẢM XÚC"</strong>
						</h4>
						<br>
						<p>1. Đào tạo sát với THỰC TẾ, chú trọng đến THỰC
							HÀNH. <br>2. Lấy HỌC VIÊN làm TRUNG TÂM. <br> 3. Xem trọng đào tạo
							KỸ NĂNG MỀM và rèn luyện khả năng TƯ DUY. <br> 4. Không dạy
							thừa, DẠY VỪA ĐỦ nhưng phải SÂU. <br> 5. KHÔNG BẮT BUỘC học
							viên phải đóng HỌC PHÍ TRỌN GÓI.<br> 6. Sẵn sàng hợp tác
							với PHỤ HUYNH.<br> 7. GIẢNG VIÊN cũng là HỌC VIÊN.<br> 8. KHÔNG CÓ
							HỨNG THÚ thì ĐỪNG ĐẾN LỚP.</p>
					</div>
				</div>
			</div>

			<!-- Container (Services Section) -->
			<div id="services" class="container-fluid text-center mt-5">
				<h2 class="">DỊCH VỤ</h2>
				<h4 class="text-primary mt-1">
					<strong>"Chúng tôi mang đến"</strong>
				</h4>
				<br> <br> 
				<div class="row slideanim">
					<div class="col-sm-4">
						<span><i class="fa fa-wrench"
							style="font-size: 48px; color: red"></i></span>
						<div class="pt-2">
							<a href="#" class="h4">SẢN PHẨM</a>
						</div>
						<p>Phát triển các ứng dụng web đa nền tảng</p>
					</div>
					<div class="col-sm-4">
						<span><i class="fa fa-graduation-cap"
							style="font-size: 48px; color: red"></i></span>
						<div class="pt-2">
							<a href="#" class="h4">KHÓA HỌC</a>
						</div>
						<p>Đào tạo các kỹ sư CNTT đa cấp bậc</p>
					</div>
					<div class="col-sm-4">
						<span><i class="fa fa-briefcase"
							style="font-size: 48px; color: red"></i></span>
						<div class="pt-2">
							<a href="#" class="h4">NGUỒN LỰC</a>
						</div>
						<p>Nhân sự cho các công ty lớn nhỏ</p>
					</div>

				</div>
				<br> <br> <br>
				<div class="row slideanim">
					<div class="col-sm-4">
						<span><i class="fa fa-desktop"
							style="font-size: 48px; color: red"></i></span>
						<div class="pt-2">
							<a href="#" class="h4">MÔI TRƯỜNG</a>
						</div>
						<p>Làm việc trực tiếp hoặc gián tiếp linh động</p>
					</div>
					<div class="col-sm-4">
						<span><i class="fa fa-users"
							style="font-size: 48px; color: red"></i></span>
						<div class="pt-2">
							<a href="#" class="h4">TRẢI NGHIỆM</a>
						</div>
						<p>Nơi thực tập cho các sinh viên</p>
					</div>


					<div class="col-sm-4">
						<span><i class="fa fa-comments"
							style="font-size: 48px; color: red"></i></span>
						<div class="pt-2">
							<a href="#" class="h4">DIỄN ĐÀN</a>
						</div>
						<p>Nơi trao đổi kiến thức, giải quyết các thắc mắc</p>
					</div>
				</div>
			</div>


			<br> <br>

			<div class="col-xl-7 col-sm-12 mx-auto mt-5">
				<video loop="loop" class="w-100" controls
					poster="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRi-GlIY2sBZnodzuljEeg3Kp70sVIj-i2lFQ&usqp=CAU">
					<source src="views/welcome/media/video/GDF-HaNoi-2020.mp4"
						type="video/mp4">
				</video>
			</div>

			<!-- Container (Contact Section) -->
			<div id="contact" class="container-fluid mt-5">
				<h2 class="text-center">LIÊN HỆ</h2>
				<p class="text-center text-primary h4 mt-3">Chúng tôi sẽ liên hệ lại bạn trong vòng 24h</p>
				<div class="row">
					<div class="col-sm-8 mx-auto">
						<div class="row">
							<div class="col-sm-4 form-group">
								<input class="form-control" id="name" name="name"
									placeholder="Name" type="text" required>
							</div>
							<div class="col-sm-4 form-group">
								<input class="form-control" id="name" name="name"
									placeholder="Phone" type="text" required>
							</div>
							<div class="col-sm-4 form-group">
								<input class="form-control" id="email" name="email"
									placeholder="Email" type="email" required>
							</div>
						</div>
						<textarea class="form-control" id="comments" name="comments"
							placeholder="Comment" rows="5"></textarea>
						<br>
						<div class="row">
							<div class="col-sm-12 form-group">
								<button class="btn btn-outline-success pull-right" type="submit">Send</button>
							</div>
						</div>
					</div>
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
