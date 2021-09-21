<%@ include file="./../common/header.jspf"%>
<%@ include file="./../common/clan-manage-nav.jspf"%>


<div class="container">
	<table class="table table-striped">
		<caption>New Player Requests</caption>
		<thead>
			<tr>
				<th>User Name</th>
				<th>Town hall</th>
				<th>Player Id</th>
				<th>Player Email</th>
				
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
					

					<td><a type="button" class="btn btn-success"
						href="approve?id=${user.id}">Approve</a></td>
					<td><a type="button" class="btn btn-warning"
						href="reject?id=${user.id}">Reject</a></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>

</div>
<%@ include file="./../common/footer.jspf"%>