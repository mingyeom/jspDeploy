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
		<form action="/mulcalculation" method="post">
		
		<label for="param1">param1</label>
		<input type="text" id="param1" name="param1">
		<br>
		<label for="param2">param2</label>
		<input type="text" id="param2" name="param2">
		
		<button type="submit">제출</button>
		
		</form>
	</div>

</body>
</html>