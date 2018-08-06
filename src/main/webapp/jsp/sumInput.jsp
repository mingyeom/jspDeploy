<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>

	<div class="container">
		<form action="<%=application.getContextPath() %>/sumCalculation" method="post">
		
		<label for="start">start</label>
		<input type="text" id="start" name="start">
		<br>
		<label for="end">end</label>
		<input type="text" id="end" name="end">
		
		<button type="submit">제출</button>
		
		</form>
	</div>
</body>
</html>