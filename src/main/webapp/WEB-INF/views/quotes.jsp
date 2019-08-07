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

		<h1>Quotes </h1>
		<table class="table">
			<thead>
				<tr>
					<th>Symbol</th><th>Company</th><th>Exchange</th><th>Sector</th><th>Open</th><th>Close</th>
					<th>High</th><th>Low</th><th>Change</th><th>PE Ratio</th><th>YTD Change</th>
				</tr>
			</thead>
			<tbody>
			<%-- 	<c:forEach var="each" items="${quote}"> --%>
				<tr>
					<td>${each.symbol}</td>
					<td>${each.companyName}</td>
					<td>${each.primaryExchange}</td>
					<td>${each.sector}</td>
					<td>${each.open}</td>
					<td>${each.close}</td>
					<td>${each.high}</td>
					<td>${each.low}</td>
					<td>${each.change}</td>
					<td>${each.peRatio}</td>
					<td>${each.ytdChange}</td>
					<td>${each.latestTime}</td>
					
				</tr>
				<%-- </c:forEach> --%>
			</tbody>
		</table>
		<a class="btn primary" href="/">Home</a>
		<a class="btn primary" href="/spread">Spread</a>
	</div>
	
</body>
</html>