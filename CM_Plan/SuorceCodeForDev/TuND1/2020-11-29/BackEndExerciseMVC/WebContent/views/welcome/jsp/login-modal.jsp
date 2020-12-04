<form action="<%= request.getContextPath()%>/CheckLoginServlet" method="POST">
	<div class="modal fade" id="loginModal">
		<div class="modal-dialog mt-5">
			<div class="modal-content">
				<!-- Modal Header -->
				<div class="modal-header">
					<h4 class="modal-title">Login</h4>
					<button type="button" class="close" data-dismiss="modal">X</button>
				</div>
				<!-- Modal body -->
				<div class="modal-body px-4 pb-0">
					<div class="form-group row">
						<label for="" class="col-3 col-form-label">User Name</label>
						<div class="col-9">
							<input type="text" class="form-control" id=""
								placeholder="Username">
						</div>
					</div>
					<div class="form-group row">
						<label for="" class="col-3 col-form-label">Password</label>
						<div class="col-9">
							<input type="text" class="form-control" id=""
								placeholder="Password">
						</div>
					</div>
					<div class="form-group row mt-3">
						<div class="col-6">
							<a href="#" class="fb btn bg-primary text-white btn-block"> <i
								class="fa fa-facebook fa-fw"></i>Facebook
							</a>
						</div>
						<div class="col-6">
							<a href="#" class="google btn bg-danger text-white btn-block"><i
								class="fa fa-google fa-fw"> </i>Google+ </a>
						</div>
					</div>
					<div class="form-group row">
						<div class="col-6">
							<a href="#" class="float-left"><i>Register</i></a>
						</div>
						<div class="col-6">
							<a href="#" class="float-right"><i>Forgot Password?</i></a>
						</div>
					</div>
					<p class="text-center text-danger">Message here !!!</p>
				</div>
				<!-- Modal footer -->
				<div class="modal-footer">
					<div class="form-group row w-100">
						<div class="col-4">
							<!-- <input type="checkbox" style="transform: scale(1.5);"><span> &nbsp;Remember</span> -->
						</div>
						<div class="col-4">
							<button type="button" class="btn btn-danger btn-block"
								data-dismiss="modal">Close</button>
						</div>
						<div class="col-4">
							<button type="submit" class="btn btn-success btn-block">Login</button>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>

</form>



