<%@ include file="./../../common/header.jspf"%>
<%@ include file="./../../common/navigation.jspf"%>

<div class="container" style="width: 15cm;">
	<form:form method="post" modelAttribute="war">

		<div style="margin-left: 11cm">
			<label><jsp:useBean id="date" class="java.util.Date" /> <fmt:formatDate
					value="${date}" type="date" pattern="dd-MMM-yyyy" /></label>
		</div>

		<fieldset class="form-group">
			<form:label path="clanname">Clan Name</form:label>
			<form:input path="clanname" type="text" class="form-control"
				required="required" />
			<form:errors path="clanname" cssClass="text-warning" />
		</fieldset>


		<fieldset class="form-group">
			<form:label path="startdate">Start Date</form:label>
			<form:input path="startdate" type="text" class="form-control"
				required="required" />
			<form:errors path="startdate" cssClass="text-warning" />
		</fieldset>



		<fieldset class="form-group">
			<form:label path="enddate">End Date</form:label>
			<form:input path="enddate" type="text" class="form-control"
				required="required" />
			<form:errors path="enddate" cssClass="text-warning" />
		</fieldset>




		<button type="submit" class="btn btn-primary">Add</button>
		<button class="btn btn-primary">Clear</button>



	</form:form>
</div>
<%@ include file="./../../common/footer.jspf"%>