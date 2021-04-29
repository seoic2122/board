<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>JSP 게시판 웹사이트</title>
</head>
<body>
<!-- 	<script>
location.href = 'login.jsp';
</script> -->
	
	<h1>문서 작성 화면</h1>
	
	<form action="write.do" method="post">
		<input type="text" id="title" name="title" />	
		<textarea rows="" cols="" name="contents" ></textarea>
		<input type="submit" value="저장"/>
		<button>취소</button>
	</form>
	
</body>


</html>