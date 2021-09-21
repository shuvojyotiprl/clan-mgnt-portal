<%@ include file="./../common/header.jspf"%>
<%@ include file="./../common/clan-manage-nav.jspf"%>


<div class="container">
	<form:form method="post" modelAttribute="user">
		<form:hidden path="id" />
		<form:hidden path="team" />
		<form:hidden path="active" />
		<form:hidden path="username" />
		<form:hidden path="password" />
		<form:hidden path="playerId" />
		<form:hidden path="townhall" />
		<form:hidden path="adminremarks" />
		<form:hidden path="email" />
		
		
		<fieldset class="form-group">
			<form:label path="roles">Role</form:label>
			<br>
			<form:select path="roles" class="form-select"
				aria-label="Default select example">
				<option value="ROLE_USER,ROLE_ELDERE,ROLE_CO">Co-Leader</option>
				<option value="ROLE_USER,ROLE_ELDER">Elder</option>
				
			</form:select>

		</fieldset>

		<fieldset class="form-group">
			<form:label path="adminremarks">Remarks</form:label>
			<form:input path="adminremarks" type="text" class="form-control"
				required="required" />
			

		</fieldset>

		<button type="submit" class="btn btn-success">Approve</button>
		<button type="submit" class="btn btn-danger">Reject</button>

	</form:form>
</div>


<%@ include file="./../common/footer.jspf"%>