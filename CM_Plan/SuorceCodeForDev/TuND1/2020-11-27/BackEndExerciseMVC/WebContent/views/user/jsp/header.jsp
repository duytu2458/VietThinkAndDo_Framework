<header>
	<nav
		class="navbar navbar-expand-md navbar-dark header_background_OwnStyle">
		<span class="text-white pl-5"> &#9728; 28 &#8451; &nbsp; <span
			class="fa fa-map-marker"></span>&nbsp;Đà Nẵng
		</span>
		<!-- <a class="navbar-brand" href="#">VietThink&Do</a> -->
		<button class="navbar-toggler" type="button" data-toggle="collapse"
			data-target="#collapsibleNavbar">
			<span class="navbar-toggler-icon"></span>
		</button>
		<div class="collapse navbar-collapse" id="collapsibleNavbar">
			<ul class="navbar-nav ml-auto">
				<li class="nav-item dropdown"><a
					class="nav-link dropdown-toggle py-0" id="" data-toggle="dropdown"
					aria-haspopup="true" aria-expanded="false"> <i
						class="fa fa-user"></i> USER NAME (USER)
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
	<h2 class="text-center mt-3 text-success"><b>VietThink&Do</b></h2>
	<jsp:include page="/views/user/jsp/menu.jsp"></jsp:include>


</header>

