<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>

<script src="/js/jquery-1.12.4.js"></script>

<body>

	<form class="form-send" action="/localeSelect" method="get">

		<c:set var="userId" value="brown" />

		<select id="locale" name="locale">
			<option value="ko" ${locale == 'ko' ? "selected" : ''}>한국어</option>
			<option value="ja" ${locale == 'ja' ? "selected" : ''}>日本語</option>
			<option value="en" ${locale == 'en' ? "selected" : ''}>English</option>
		</select>

		<fmt:setLocale value="${locale }" />

		<fmt:bundle basename="kr.or.ddit.msg.msg">
			<fmt:message key="hello" />
			<br>
			<fmt:message key="visitor">
				<fmt:param value="${userId }" />
			</fmt:message>
		</fmt:bundle>

				<br>
				<button type="submit">전송</button>
	</form>

</body>

<script type="text/javascript">
	$("#locale").change(function() {
		 $( ".form-send" ).submit();
	});
</script>

</html>