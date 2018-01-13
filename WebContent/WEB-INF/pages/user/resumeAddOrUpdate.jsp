<%@ page language="java" contentType="text/html; charset=utf8"
    pageEncoding="utf8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf8">
<title>resumeAddOrUpdate</title>
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
		margin:-200px -300px 0px -300px;
		height:400px;
		width:600px;
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
			<strong>简历界面</strong>
		</p>
		<form action="${pageContext.request.contextPath}/user/addOrUpdateResume" method="get">
			<table width="600px" >
				<tr>
					<td width="80px">真实姓名</td>
					<td>
						<input type="text" name="uRealName">
					</td>
					<td width="80px">性别</td>
					<td>
						<input type="radio" name="uSex" value="男">男
						<input type="radio" name="uSex" value="女">女
					</td>
				</tr>
				<tr>
					<td>年龄</td>
					<td>
						<input type="number" name="uAge">
					</td>
					<td>学历</td>
					<td>
						<select name="uEducation">
							<option value="中专">中专</option>
							<option value="大专">大专</option>
							<option value="本科">本科</option>
						</select>
					</td>
				</tr>
				<tr>
					<td>联系方式</td>
					<td>
						<input type="number" name="uPhotoNumber">
					</td>
					<td>电子邮箱</td>
					<td>
						<input type="email" name="uEmail">
					</td>
				</tr>
				<tr>
					<td>工作经历</td>
					<td>
						<input type="number" name="uWorkTime">年
					</td>
					<td>期望薪资</td>
					<td>
						<input type="number" name="uSalary">左右
					</td>
				</tr>
				<tr>
					<td>上一份工作</td>
					<td>
						<input type="text" name="uBeforeJob">
					</td>
					<td>政治面貌</td>
					<td>
						<select name="uPoliticalStatus">
							<option value="中共党员">中共党员</option>
							<option value="群众">群众</option>
						</select>
					</td>
				</tr>
				<tr>
					<td>爱好</td>
					<td>
						<input type="text" name="uHobby">
					</td>
					<td><input type="submit" value="提交"></td>
					<td><input type="button" value="取消" onclick="javascrtpt:window.location.href='${pageContext.request.contextPath}/user/userIndex.jsp'"></td>
				</tr>
			</table>
		</form>
	</div>
</body>
</html>