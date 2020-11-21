<h2 class="text-center">Create User Basic</h2>
<h4 class="text-center text-danger">Message Here!!!</h4>
<div class="mx-lg-5 mx-auto">
	<div class="mx-md-4 mx-sm-2 mx-1">
		<!-- ================================ -->
		<div class=" rounded styleBorderWidth2px">
			<div class="row mx-1">
				<div class="col-xl-4 col-lg-4 col-sm-6 col-12">
					<div class="form-group row mt-3">
						<label for="" class="col-4 col-form-label">Account</label>
						<div class="col-8">
							<input name="userForm" class="form-control" readonly />
						</div>
						<%-- <div class="col-2">
									<html:submit styleClass="btn btn-outline-success btn-block" property="submit">&#8634;</html:submit>
								</div> --%>
					</div>
				</div>
				<!-- Full Name  -->
				<div class="col-xl-4 col-lg-4 col-sm-6 col-12">
					<div class="form-group row mt-3">
						<label for="" class="col-4 col-form-label">Full Name <span
							class="text-danger">&#10033;</span></label>
						<div class="col-8">
							<input class="form-control" name="" maxlength="25" />
						</div>
					</div>
					<!-- ================ -->
					<div class="text-danger" id="messageFullName">Message Here!!!</div>

				</div>
				<!-- Password -->
				<div class="col-xl-4 col-lg-4 col-sm-6 col-12">
					<div class="form-group row mt-3">
						<label for="" class="col-4 col-form-label">Password <span
							class="text-danger">&#10033;</span></label>
						<div class="col-8">
							<input class="form-control" name="" maxlength="25" />
						</div>
					</div>
					<div class="text-danger" id="messagePassWord">Message here</div>
				</div>
			</div>
			<!-- Email -->
			<div class="row mx-2">
				<div class="col-xl-4 col-lg-4 col-sm-6 col-12">
					<div class="form-group row mt-3">
						<label for="" class="col-4 col-form-label">Email <span
							class="text-danger">&#10033;</span></label>
						<div class="col-8">
							<input class="form-control" name="" maxlength="25" />
						</div>
					</div>
					<div class="text-danger" id="messageEmail">Message here !!!</div>
				</div>
				<!-- Role -->
				<div class="col-xl-4 col-lg-4 col-sm-6 col-12">
					<div class="form-group row mt-3">
						<label for="" class="col-4 col-form-label">Role</label>
						<div class="col-8">
							<select class="form-control">
								<option class="form-control" value="Member">Member</option>
								<option class="form-control" value="Admin">Admin</option>
							</select>
						</div>
					</div>
				</div>
				<!-- Birth Date -->
				<div class="col-xl-4 col-lg-4 col-sm-6 col-12">
					<div class="form-group row mt-3">
						<label for="" class="col-4 col-form-label">Birth Date</label>
						<div class="col-8">
							<input type="date" name="birthDate" class="form-control"
								value="2020-11-21" />
						</div>
						<div class="text-danger">Message here !!!</div>
					</div>
				</div>
			</div>
			<!-- Gender -->
			<div class="row mx-2">
				<div class="col-xl-4 col-lg-4 col-sm-6 col-12">
					<div class="form-group row mt-3">
						<label for="" class="col-4 col-form-label ">Gender</label>
						<div class="col-8 mx-auto">
							<div class="form-check-inline">
								<label class="form-check-label"> <input type="radio"
									value="Male" name="gender" /> Male
								</label>
							</div>
							<div class="form-check-inline">
								<label class="form-check-label"> <input type="radio"
									value="Female" name="gender" /> Female
								</label>
							</div>
						</div>
					</div>
				</div>
				<!-- Phone -->
				<div class="col-xl-4 col-lg-4 col-sm-6 col-12">
					<div class="form-group row mt-3">
						<label for="" class="col-4 col-form-label">Phone<span
							class="text-danger">&#10033;</span></label>
						<div class="col-8">
							<input class="form-control" maxlength="11" />
						</div>
					</div>
					<div class="text-danger" id="messagePhone">Message here !!!</div>
				</div>
				<!-- Enable -->
				<div class="col-xl-4 col-lg-4 col-sm-6 col-12">
					<div class="form-group row mt-3">
						<label for="" class="col-4 col-form-label">Enable<span
							class="text-danger">&#10033;</span></label>
						<div class="col-8">
							<input class="form-control" maxlength="11" />
						</div>
					</div>
					<div class="text-danger" id="messagePhone">Message here !!!</div>
				</div>
			</div>
			<!-- Address -->
			<div class="row mx-2">
				<div class="col-xl-12 col-lg-12 col-sm-12 col-12">
					<div class="form-group row mt-1">
						<label for="" class="col-1 col-form-label">Address</label>
						<div class="col-11">
							<input class="form-control float-right" style="width: 97%"
								maxlength="100" />
						</div>
					</div>
					<div class="text-danger">Message here !!!</div>
				</div>
			</div>
		</div>
	</div>

	<div class="w-100 row mx-auto d-flex d-flex justify-content-center">
		<!-- d-flex justify-content-end -->
		<div class="col-xl-1 col-lg-3 col-sm-3 col-6 align-self-end">
			<a href="<%=request.getContextPath()%>/get-create">
				<button class="btn btn-outline-success btn-block" type="button"
					id="clickBack">Create</button>
			</a>
		</div>
		<div class="col-xl-1 col-lg-3 col-sm-3 col-6 align-self-end">
			<a href="<%=request.getContextPath()%>/homePage?pageNum=1">
				<button class="btn btn-outline-danger btn-block" type="button"
					id="clickBack">Cancel</button>
			</a>
		</div>

	</div>
</div>