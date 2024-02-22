<%@page import="java.util.Arrays"%>
<%@page import="com.simple.command.MemberVO"%>
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
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
	<%--
	이 화면에 진입할 때 List[MemberVO, MemberVO, MemberVO] 형태의 데이터를 출력해주세요.
	데이터는 가짜로 생성하면 됩니다.
	a링크를 하나 만들고 회원정보를 클릭하면 회원정보화면으로 회원번호를 넘겨주세요
	 --%>
	 

	 
	<h2>목록(내꺼)</h2>
	<ul>
		<li><a href="quiz02_ok?id=${info.id }">${info }</a></li>
		<li><a href="quiz02_ok?id=${info2.id }">${info2 }</a></li>
		<li><a href="quiz02_ok?id=${info3.id }">${info3 }</a></li>
		
	</ul>
	
	<a href="quiz02_ok">회원정보</a>
	
	<hr>
	
	<h2>목록(쌤꺼)</h2>
	<ul>
		<c:forEach var="vo" items="${list }">
			<li>
				<a href="quiz02_ok?id=${vo.id }">${vo.id }-${vo.name }-${vo.age }</a>
			</li>
		</c:forEach>
	</ul>
	
	
	
	
	
</body>
</html>