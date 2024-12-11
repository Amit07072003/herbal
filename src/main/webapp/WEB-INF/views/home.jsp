<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home</title>
<style>
body {
	font-family: Arial, sans-serif;
	background-image:
		url('https://images.pexels.com/photos/35196/water-plant-green-fine-layers.jpg?auto=compress&cs=tinysrgb&w=600');
	background-size: cover;
	background-attachment: fixed;
	margin: 0;
	padding: 0;
}

.navbar {
	overflow: hidden;
	background-color: #333;
	position: sticky;
	top: 0;
	width: 100%;
	z-index: 1000;
}

.navbar a {
	float: left;
	display: block;
	color: #f2f2f2;
	text-align: center;
	padding: 14px 16px;
	text-decoration: none;
}

.navbar a:hover {
	background-color: #ddd;
	color: black;
}

.container {
	width: 80%;
	margin: auto;
	overflow: hidden;
	padding-top: 60px; /* Adjust based on navbar height */
}

h1 {
	text-align: center;
	color: white;
}

.card {
	
	background-color: rgba(248, 250, 248, 0.431);
	border: 1px solid #ddd;
	border-radius: 5px;
	box-shadow: 0 2px 4px rgba(0, 0, 0, 0.1);
	margin: 10px;
	padding: 10px;
	text-align: center;
	width: calc(33.333% - 40px);
	box-sizing: border-box;
	float: left;
}

.card img {
	max-width: 100%;
	height: auto;
	border-radius: 5px;
}

.card h2 {
	margin: 10px 0;
	font-size: 1.2em;
	color: #333;
}

.card p {
	color: #777;
	font-size: 1em;
}

.clearfix::after {
	content: "";
	clear: both;
	display: table;
}

.button-container {
	text-align: center; /* Centers the button */
	margin-top: 20px; /* Adds space above the button */
}

button {
	background-color: #4CAF50;
	color: white;
	border: none;
	padding: 10px 20px;
	font-size: 16px;
	cursor: pointer;
	border-radius: 5px;
}

button:hover {
	background-color: #45a049;
}

.pagination {
	text-align: center;
	margin-top: 20px;
}

.pagination button {
	margin: 0 5px;
}

.pagination button:disabled {
	background-color: #ccc;
	cursor: not-allowed;
}
</style>
</head>
<body>
	<div class="navbar">
		<a href="/user/home">Home</a> <a href="#virtual-tour">Virtual Tour</a>
		<a href="#advanced-search">Advanced Search</a> <a href="#books">Books</a>
		<a href="#quiz">Quiz</a> <a href="#kiosk">${username}</a> <a href="/logout">Logout</a>
	</div>
	<div class="container">
		<h1>Home Page</h1>
		<h1>Discover AYUSH Medicinal Plants</h1>

		<form action="/searchPlant" method="get">
			<input type="text" name="plantName"
				placeholder="SearchPlant..">
			<button type="submit"> <img src="../img/search.png" alt="Search Icon" class="search-icon">
  </button>
		</form>
		
		
	
		
		
		
		

		<c:if test="${not empty plants}">
			<div class="clearfix">
				<c:forEach var="plant" items="${plants}">
					<div class="card">
						<img src="${plant.defaultImage.originalUrl}"
							alt="${plant.commonName}">
						<table>
							<tr>
							
								<td><h2 style="color:black;">About Plant</h2></td>
							</tr>
							<tr>
								<th>commonName:</th>
								<td>${plant.commonName}</td>
							</tr>
							<tr>
								<th>scientificName:</th>
								<td>${plant.scientificName[0]}</td>
							</tr>
							<tr>
								<th>otherName:</th>
								<td>${plant.otherName}</td>
							</tr>
							<%-- <tr>
								<th>cycle:</th>
								<td>${plant.cycle}</td>
							</tr>
							<tr>
								<th>watering:</th>
								<td>${plant.watering}</td>
							</tr>
							<tr>
								<th>sunlight:</th>
								<td>${plant.sunlight}</td>
							</tr> --%>
						</table>
						<!-- More Detail Button -->
						<div class="button-container">
							<button onclick="window.location.href='/plantDetail/${plant.id}'">
								More Detail</button>
						</div>
					</div>
				</c:forEach>
			</div>

			<!-- Pagination Buttons -->
			<div class="pagination">
				<button
					onclick="window.location.href='/user/home?page=${currentPage - 1}'"
					${currentPage == 1 ? 'disabled' : ''}>Previous</button>
				<button
					onclick="window.location.href='/user/home?page=${currentPage + 1}'"
					${currentPage == totalPages ? 'disabled' : ''}>Next</button>
			</div>
		</c:if>
		<c:if test="${empty plants}">
			<p>No plants available.</p>
		</c:if>
	</div>
</body>
</html>