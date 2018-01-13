<%@ page language="java" contentType="text/html; charset=utf8"
    pageEncoding="utf8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf8">
<title>recruitmentMessageUpdate</title>
<style>
	/*
		界面背景设置
	*/
	body{
		background-repeat:no-repeat;
		background-position:center;
		background-attachment:fixed;
		background-size:cover;
	}

	/*
		div定位
	*/
	.main{
		position:absolute;
		top:50%;
		left:50%;
		margin:-100px -150px -100px -150px;
		height:200px;
		width:300px;
		text-align:center;
	}
	
	/*
		p属性定义
	*/
	.firstLine{
		font-size:30px;
		margin:0 0 0 0;
	}
	.secondLine{
		font-size:10px;
		margin:0 0 0 0;
	}

	/*
		div定位
	*/
	.first{
		width:79%;
		height:10%;
		text-align:center;
		margin:0 0 0 9.5%;
		border-bottom:2px solid lightblue;
	}
	

	/*
		表格内容居中
	*/
	.class1{
		text-align:center;
	}
</style>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-1.7.2.js"></script>
<script type="text/javascript">

</script>
</head>
<body background="${pageContext.request.contextPath}/img/linkview2.jpg">
	
	<!--主标题-->
	<div class = "first">
		<p class = "firstLine"><strong>卢西奥婚恋网</strong></p>
		<p class = "secondLine">luxiaoxiaoxia</p>
	</div>
	
	<div class = "main">
		<p type=center>
			<strong>发布招聘信息界面</strong>
		</p>
		<form action="${pageContext.request.contextPath}/manager/updateRecruitmentMessage" method="get">
			<table>
				<tr>
					<td>部门</td>
					<td>
						<input type="hidden" value="${requestScope.rm.rmId }" name="rmId">
						${requestScope.rm.rmDept.dName }
					</td>
				</tr>
				<tr>
					<td>职位</td>
					<td>
						${requestScope.rm.rmPosit.pName }
					</td>
				</tr>
				<tr>
					<td>招聘信息</td>
					<td><input type="text" name="rmMessage" value="${requestScope.rm.rmMessage }" width="80px" height="100px"></td>
				</tr>
				<tr>
					<td></td>
					<td><span></span></td>
				</tr>
				<tr>
					<td></td>
					<td><input type="submit" value="提交">
					<input type="button" value="取消" onclick="javascrtpt:window.location.href='${pageContext.request.contextPath}/manager/managerIndex.jsp"></td>
				</tr>
			</table>
		</form>
	</div>
</body>
</html>