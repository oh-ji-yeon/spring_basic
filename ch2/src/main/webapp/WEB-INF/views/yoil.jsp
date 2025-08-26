<%@ page contentType="text/html; charset=utf-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
<P> year=<%=request.getParameter("year") %> </P>
<P>  ${year}년 ${month}월 ${day}일은 ${yoil}요일입니다. </P>
<P>  ${myDate.year}년 ${myDate.month}월 ${myDate.day}일은 ${yoil}요일입니다. </P>
</body>
</html>
