<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<header>
	<nav class="mb-1 navbar navbar-expand navbar-dark"
		style="background-color: rgb(49, 96, 206);">
		<div class="collapse navbar-collapse" id="">
			<span class="text-white pl-5"> &#9728; 28 &#8451; &nbsp; <span
				class="fa fa-map-marker"></span>&nbsp;Đà Nẵng
			</span>
			<ul class="navbar-nav ml-auto">
				<li class="nav-item dropdown"><a
					class="nav-link dropdown-toggle py-0" id="" data-toggle="dropdown"
					aria-haspopup="true" aria-expanded="false"> <i
						class="fa fa-user"></i> USER NAME (ADMIN)
				</a>
					<div class="dropdown-menu dropdown-menu-right dropdown-info">
						<a class="dropdown-item styleLogout" href="">History</a>

						<%-- <html:link styleClass="dropdown-item styleLogout" href="/MyDemoF/logout"> LogOut 2</html:link> --%>
						<a class="dropdown-item styleLogout"
							href="<%=request.getContextPath()%>/logout">LogOut</a>
					</div></li>
			</ul>
		</div>
	</nav>
	<nav class="navbar navbar-expand navbar-dark">
		<div class="collapse navbar-collapse" id="">
			<ul class="nav nav-pills">
				<li class="nav-item ml-5"><a class="nav-link mx-2 active"
					href="<%=request.getContextPath()%>/homePage?pageNum=1">Home</a></li>
			</ul>
		</div>
	</nav>
</header>

