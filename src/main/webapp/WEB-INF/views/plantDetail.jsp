<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>

<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>${plantDetail.commonName}- Plant Details</title>
<style>
body {
	font-family: Arial, sans-serif;
	background-color: #f4f4f4;
	margin: 0;
	padding: 0;
}

.navbar {
	background-color: #333;
	overflow: hidden;
	position: sticky;
	top: 0;
	width: 100%;
	z-index: 1000;
}

.navbar a {
	float: left;
	display: block;
	color: white;
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
	padding-top: 60px; /* Adjust based on navbar height */
}

.plant-detail {
	background-color: white;
	padding: 20px;
	margin: 20px 0;
	border-radius: 5px;
	box-shadow: 0 2px 4px rgba(0, 0, 0, 0.1);
}

.plant-detail img {
	max-width: 100%;
	height: auto;
	border-radius: 5px;
}

.plant-detail h1 {
	text-align: center;
	font-size: 2em;
	color: #333;
}

.plant-detail table {
	width: 100%;
	margin-top: 20px;
	border-collapse: collapse;
}

.plant-detail table th, .plant-detail table td {
	padding: 8px;
	text-align: left;
	border-bottom: 1px solid #ddd;
}

.back-button {
	background-color: #4CAF50;
	color: white;
	padding: 10px 20px;
	font-size: 16px;
	cursor: pointer;
	border-radius: 5px;
	text-decoration: none;
}

.back-button:hover {
	background-color: #45a049;
}
</style>
</head>
<body>

	<div class="navbar">
		<a href="#home">Home</a> <a href="/logout">Logout</a>
	</div>

	<div class="container">
		<div class="plant-detail">
			<h1> ${plantDetail.commonName}--Detailed Information</h1>

			<img src="${plantDetail.defaultImage.originalUrl}"
				alt="${plantDetail.commonName}">
				
			

			<table>
				<tr>
					<th>Scientific Name:</th>
					<td>${plantDetail.scientificName[0]}</td>
				</tr>
				<tr>
					<th>Other Names:</th>
					<td><c:forEach var="name" items="${plantDetail.otherName}"
							varStatus="status">
                            ${name}
                            <c:if
								test="${status.index < status.count - 1}">, </c:if>
						</c:forEach></td>
				</tr>
				<tr>
					<th>Family:</th>
					<td>${plantDetail.family}</td>
				</tr>
				<tr>
					<th>Origin:</th>
					<td><c:forEach var="origin" items="${plantDetail.origin}"
							varStatus="status">
                            ${origin}
                            <c:if
								test="${status.index < status.count - 1}">, </c:if>
						</c:forEach></td>
				</tr>
				<tr>
					<th>Type:</th>
					<td>${plantDetail.type}</td>
				</tr>
				<tr>
					<th>Dimensions:</th>
					<td>${plantDetail.dimension}</td>
				</tr>
				<tr>
					<th>Cycle:</th>
					<td>${plantDetail.cycle}</td>
				</tr>
				<tr>
					<th>Propagation:</th>
					<td><c:forEach var="method" items="${plantDetail.propagation}"
							varStatus="status">
                            ${method}
                            <c:if
								test="${status.index < status.count - 1}">, </c:if>
						</c:forEach></td>
				</tr>
				<tr>
					<th>Watering:</th>
					<td>${plantDetail.watering}</td>
				</tr>
				<tr>
					<th>Watering Interval:</th>
					<td>${plantDetail.wateringGeneralBenchmark.value}
						${plantDetail.wateringGeneralBenchmark.unit}</td>
				</tr>
				<tr>
					<th>Plant Anatomy:</th>
					<td><c:forEach var="anatomy"
							items="${plantDetail.plantAnatomy}">
                            ${anatomy.part} - 
                            <c:forEach var="color"
								items="${anatomy.color}" varStatus="status">
                                ${color}
                                <c:if
									test="${status.index < status.count - 1}">, </c:if>
							</c:forEach>
							<br />
						</c:forEach></td>
				</tr>
				<tr>
					<th>Sunlight:</th>
					<td><c:forEach var="sunlight" items="${plantDetail.sunlight}"
							varStatus="status">
                            ${sunlight}
                            <c:if
								test="${status.index < status.count - 1}">, </c:if>
						</c:forEach></td>
				</tr>
				<tr>
					<th>Description:</th>
					<td>${plantDetail.description}</td>
				</tr>
				<tr>
					<th>Growth Rate:</th>
					<td>${plantDetail.growthRate}</td>
				</tr>
				<tr>
					<th>Drought Tolerant:</th>
					<td>${plantDetail.droughtTolerant ? 'Yes' : 'No'}</td>
				</tr>
				<tr>
					<th>Salt Tolerant:</th>
					<td>${plantDetail.saltTolerant ? 'Yes' : 'No'}</td>
				</tr>
				<tr>
					<th>Thorny:</th>
					<td>${plantDetail.thorny ? 'Yes' : 'No'}</td>
				</tr>
				<tr>
					<th>Invasive:</th>
					<td>${plantDetail.invasive ? 'Yes' : 'No'}</td>
				</tr>
				<tr>
					<th>Tropical:</th>
					<td>${plantDetail.tropical ? 'Yes' : 'No'}</td>
				</tr>
				<tr>
					<th>Indoor:</th>
					<td>${plantDetail.indoor ? 'Yes' : 'No'}</td>
				</tr>
				<tr>
					<th>Medicinal:</th>
					<td>${plantDetail.medicinal ? 'Yes' : 'No'}</td>
				</tr>
				<tr>
					<th>Poisonous to Humans:</th>
					<td>${plantDetail.poisonousToHumans == 0 ? 'No' : 'Yes'}</td>
				</tr>
				<tr>
					<th>Poisonous to Pets:</th>
					<td>${plantDetail.poisonousToPets == 0 ? 'No' : 'Yes'}</td>
				</tr>
				<tr>
					<th>Flowering Season:</th>
					<td>${plantDetail.floweringSeason != null ? plantDetail.floweringSeason : 'N/A'}</td>
				</tr>
				<tr>
					<th>Fruit Color:</th>
					<td><c:forEach var="color" items="${plantDetail.fruitColor}"
							varStatus="status">
                            ${color}
                            <c:if
								test="${status.index < status.count - 1}">, </c:if>
						</c:forEach></td>
				</tr>
				<tr>
					<th>Harvest Season:</th>
					<td>${plantDetail.harvestSeason}</td>
				</tr>
				<tr>
					<th>Leaf Color:</th>
					<td><c:forEach var="color" items="${plantDetail.leafColor}"
							varStatus="status">
                            ${color}
                            <c:if
								test="${status.index < status.count - 1}">, </c:if>
						</c:forEach></td>
				</tr>
				<tr>
					<th>Flower Color:</th>
					<td><c:forEach var="color" items="${plantDetail.flowerColor}"
							varStatus="status">
                            ${color}
                            <c:if
								test="${status.index < status.count - 1}">, </c:if>
						</c:forEach></td>
				</tr>
			</table>

			<a href="javascript:history.back()" class="back-button">Back</a>
		</div>
	</div>

</body>
</html>
