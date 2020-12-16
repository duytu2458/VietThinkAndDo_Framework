<jsp:include page="/common/taglib.jsp"></jsp:include>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
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
<link rel="stylesheet" href="views/user/other-css/side-nav.css">
<link rel="stylesheet" href="views/user/other-css/quick-menu.css">
<link rel="stylesheet" href="views/user/other-css/feedBack-button.css">
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
		<div class="row mt-3 ml-5">
			<div class="col-xl-9 col-lg-10 col-sm-10 col-12 mx-auto">
				<span class="h5"><a
					href="<%=request.getContextPath()%>/user-system">Home</a></span>
				<ul class="quick_menu_OtherStyle pl-1"
					style="display: inline-block;">
					<li class="h5"><a href="#">Java</a></li>
					<li class="h5"><a href="#">${news.title}</a></li>
				</ul>
			</div>
		</div>
		<div class="row h-100">
			<div
				class="col-xl-9 col-lg-10 col-sm-10 col-12 mx-auto media border ">
				<img src="views/user/media/images/avatar/boy3.png" alt="Account"
					class="mr-1 mt-1 rounded-circle">
				<div class="media-body mt-3">
					<h5>
						${news.createdBy} <small class="float-right"><i>Posted
								on ${news.createdDate}</i></small>
					</h5>
					<div class="btn-group pl-2" role="group" aria-label="Basic example">
						<button class="btn btn-sm like_click_OtherJs "
							style="border-radius: 5px 5px;">
							<i class="fa fa-thumbs-o-up likeNumBackground "
								style="font-size: 24px; color: blue;"></i> <span class="likeNum">1233</span>
						</button>
						<button class="btn btn-sm disLike_click_OtherJs"
							style="border-radius: 5px 5px;">
							<i class="fa fa-thumbs-o-down disLikeNumBackground"
								style="font-size: 24px;"></i> <span class="disLikeNum">12</span>
						</button>
						<button id="follow_click" class="btn btn-sm"
							style="border-radius: 5px 5px;">
							<i id="follow_background" class="fa fa-bell-o "
								style="font-size: 24px;"></i>
						</button>
						<button id="bookMark_click" class="btn btn-sm"
							style="border-radius: 5px 5px;">
							<i id="bookMark_background" class="fa fa-bookmark-o"
								style="font-size: 24px"></i>
						</button>

					</div>
					<h5>${news.title}</h5>
					<p>${news.content}</p>
					<div>
						<hr>
					</div>
					<dl>

						<c:forEach var="comment" items="${commentList}">
							<dd>
								<div class="media p-2 ml-n3">
									<img src="views/user/media/images/avatar/boy3.png"
										alt="Account" class="mr-1 mt-n3 rounded-circle">
									<div class="media-body">
										<h5>
											${comment.createdBy} <small class="float-right"><i>Posted
													on ${comment.createdDate}</i></small>
										</h5>
										<div class="btn-group pl-2" role="group"
											aria-label="Basic example">
											<button class="btn btn-sm like_click_OtherJs"
												style="border-radius: 5px 5px;">
												<i class="fa fa-thumbs-o-up likeNumBackground"
													style="font-size: 24px; color: blue;"></i> <span
													class="likeNum">123</span>
											</button>
											<button class="btn btn-sm disLike_click_OtherJs"
												style="border-radius: 5px 5px;">
												<i class="fa fa-thumbs-o-down disLikeNumBackground"
													style="font-size: 24px"></i> <span class="disLikeNum">12</span>
											</button>
										</div>
										<p>${comment.content}</p>
									</div>
								</div>
							</dd>
						</c:forEach>

						<dd>
							<hr>
						</dd>
						<dd>
							<div class="w-100">
								<textarea class="w-100 py-0" rows="5"></textarea>
							</div>
							<div>
								<button class="btn btn-outline-success">Submit</button>
								<button class="btn btn-outline-danger">Cancel</button>
							</div>

						</dd>
					</dl>
				</div>
			</div>
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

<script type="text/javascript" src="views/user/others-js/feed-back.js"></script>

















</html>