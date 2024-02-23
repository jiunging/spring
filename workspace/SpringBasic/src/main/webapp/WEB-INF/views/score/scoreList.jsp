<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h3>점수 목록</h3>
	<c:forEach var="vo" items="${list }">
		<a href="#">번호: ${vo.sno }, 이름: ${vo.name}, 국어: ${vo.kor }, 영어: ${vo.eng }, 수학: ${vo.math }</a>
		<button type="button" onclick="location.href='deleteForm?sno=${vo.sno}';">삭제하기</button>
		<br>
	</c:forEach>
	
	

</body>
</html>