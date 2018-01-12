<%@ page language="java" contentType="text/html; charset=utf8"
    pageEncoding="utf8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf8">
<title>managerDefault</title>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-1.7.2.js"></script>
<script type="text/javascript">
	function ok(){
		window.location.href='${pageContext.request.contextPath}/manager/managerSD';
 	}
 	window.setTimeout("ok();",3000); 
</script>
</head>
<body>
	<h1>Default......</h1>
	
</body>
</html>