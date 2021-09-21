<%@ include file="./../common/header.jspf"%>
<%@ include file="./../common/navigation.jspf"%>

<div class="container" style="width: 15cm; ">
<form:form method="post" modelAttribute="user">
		<form:hidden path="id" />
		<fieldset class="form-group">
			<form:label path="username">User Name</form:label>
			<form:input path="username" type="text" class="form-control"
				required="required" />
			<form:errors path="username" cssClass="text-warning" />
		</fieldset>
		
		<fieldset class="form-group">
			<form:label path="password">Password</form:label>
			<form:input path="password" type="password" class="form-control"
				required="required" />
			<form:errors path="password" cssClass="text-warning" />
		</fieldset>
		
		<fieldset class="form-group">
			<form:label path="playerId">Player id</form:label>
			<form:input path="playerId" type="text" class="form-control"
				required="required" />
			<form:errors path="playerId" cssClass="text-warning" />
		</fieldset>
		
		<fieldset class="form-group">
			<form:label path="townhall">Town hall </form:label>
			<form:input path="townhall" type="text" class="form-control"
				required="required" />
			<form:errors path="townhall" cssClass="text-warning" />
		</fieldset>
		
		<fieldset class="form-group">
			<form:label path="email">Email</form:label>
			<form:input path="email" type="text" class="form-control"
				required="required" />
			<form:errors path="email" cssClass="text-warning" />
		</fieldset>

		
		<button type="submit" class="btn btn-primary">Register</button>
		<button  class="btn btn-primary">Clear</button>
		<button  class="btn btn-primary">Login</button>
		
		
	</form:form>
</div>
<%@ include file="./../common/footer.jspf"%>