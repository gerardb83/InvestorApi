<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Investor Exchange</title>
<link href="https://stackpath.bootstrapcdn.com/bootswatch/4.3.1/spacelab/bootstrap.min.css" rel="stylesheet" crossorigin="anonymous">
<link href="/styles.css" rel="stylesheet" /> 
</head>
<body>
<div class="container">

		<h1>Exchange List </h1>
		<table class="table">
			<thead>
				<tr>
					<th>Volume</th><th>Venue</th><th>Venue Name</th><th>Spread</th><th>Quoted</th><th>Price Change</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="each" items="${securities}">
				<tr>
					<td>${each.volume}</td>
					<td>${each.venue}</td>
					<td>${each.venueName}</td>
					<td>${each.effectiveSpread}</td>
					<td>${each.effectiveQuoted}</td>
					<td>${each.priceImprovement}</td>
				
					
				</tr>
				</c:forEach>
			</tbody>
		</table>
		<a class="btn primary" href="/">Home</a>

	</div>
	
</body>
</html>