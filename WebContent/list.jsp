<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@page import="java.util.ArrayList"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
리스트 뷰

<% ArrayList<String> list = (ArrayList) request.getAttribute("list");

  for(int i = 0 ; i < list.size() ; i ++ ){
	  %> <p><%=list.get(i) %>  </p><% 
  }
  %>
</body>
</html>