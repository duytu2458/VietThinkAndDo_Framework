<form action="<%=request.getContextPath()%>/CheckLoginServlet"
	method="POST">
	<div class="modal fade" id="confirmModal">
		<div class="modal-dialog mt-5">
			<div class="modal-content">
				<!-- Modal Header -->
				<div class="modal-header">
					<h4 class="modal-title">WARNING</h4>
					<button type="button" class="close" data-dismiss="modal">×</button>
				</div>
				<!-- Modal body -->
				<div class="modal-body px-4 pb-0">
					
					<h4 class="text-center text-danger">Xác nhận XÓA ?</h4>
					<h5 class="text-center text-danger">Account TuND14</h5>
				</div>
				<!-- Modal footer -->
				<div class="modal-footer">
					<div class="form-group row w-100">
						<div class="col-4">
							<!-- <input type="checkbox" style="transform: scale(1.5);"><span> &nbsp;Remember</span> -->
						</div>
						
						<div class="col-4">
							<button type="submit" class="btn btn-success btn-block">Delete</button>
						</div>
						<div class="col-4">
							<button type="button" class="btn btn-danger btn-block"
								data-dismiss="modal">Cancel</button>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>

</form>



