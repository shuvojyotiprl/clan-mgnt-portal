<%@ include file="./../../common/header.jspf"%>
<%@ include file="./../../common/navigation.jspf"%>

<div class="container">
	<table class="table table-striped">
		<caption>Active War</caption>
		<thead>
			<tr>
				<th>WarId</th>
				<th>Clan Name</th>
				<th>Start Date</th>
				<th>End Date</th>
				<th>Status</th>
				<th></th>
				<th></th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${wars}" var="war">
				<tr>
					<td>${war.warid}</td>
					<td>${war.clanname}</td>
					<td>${war.startdate}</td>
					<td>${war.enddate}</td>
					<td>${war.status}</td>
					<td><a type="button" class="btn btn-success"
						href="/clan/war/end-war?id=${war.warid}">End War</a></td>
					<td><a type="button" class="btn btn-warning"
						href="/clan/war/assign-targets?id=${war.warid}">Assign targets</a></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	<div class="container">
		<a href="/clan/war/start-war">Start War</a>
	</div>
</div>

<%@ include file="./../../common/footer.jspf"%>
