<%@ include file="./../common/header.jspf"%>
<%@ include file="./../common/clan-manage-nav.jspf"%>


<div class="container">
	<table class="table table-striped">
		<caption>Available Players</caption>
		<thead>
			<tr>
				<th>User Name</th>
				<th>Town hall</th>
				<th>Player Id</th>
				<th>Player Email</th>
				<th>Remarks</th>

				<th></th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${users}" var="user">
				<tr>
					<td>${user.username}</td>
					<td>${user.townhall}</td>
					<td>${user.playerId}</td>
					<td>${user.email}</td>
					<td>${user.adminremarks}</td>
					<td><a type="button" class="btn btn-success"
						href="/clan/available-players/preare-team?id=${user.id}">Select</a></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	<div>
		<a type="button" class="btn btn-warning" href="out?id=${user.id}">Prepare
			List</a>
	</div>

</div>
<%@ include file="./../common/footer.jspf"%>