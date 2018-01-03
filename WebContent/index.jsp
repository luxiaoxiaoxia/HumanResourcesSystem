<%@ page language="java" contentType="text/html; charset=utf8"
    pageEncoding="utf8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf8">
<title>index</title>
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
	div{
		position:absolute;
		top:50%;
		left:50%;
		margin:-100px -150px -100px -150px;
		height:200px;
		width:300px;
		text-align:center;
	}

	/*
		表格内容居中
	*/
	.class1{
		text-align:center;
	}
</style>
</head>
<body background="${pageContext.request.contextPath}/img/linkview2.jpg">
	<!--如果把autoplay="autoplay"换为controls="controls"就会出现音乐控制台，高度和宽度则是下面所设的高宽-->
	<audio autoplay="autoplay" loop="loop" height="100" width="100">
		<source src="${pageContext.request.contextPath}/mp3/アゲイン (Again).mp3" type="audio/mp3" />
		<source src="${pageContext.request.contextPath}/mp3/アゲイン (Again).ogg" type="audio/ogg" />
		<embed height="100" width="100" src="${pageContext.request.contextPath}/mp3/アゲイン (Again).mp3" />
	</audio>
	
	<div>
		<p type=center>
			<strong>我的愿望登录界面</strong>
		</p>
		<form action="Desire.html" method="get">
			<table>
				<tr>
					<td class="class1"><strong>学生姓名：</strong></td>
					<td><input type="text" name="name"></td>
				</tr>
				<tr>
					<td class="class1"><strong>学生密码：</strong></td>
					<td><input type="text" name="password" onkeyup="validate()" required="required"></td>
				</tr>
				<tr>
					<td></td>
					<td style="color:red"><span></span></td>
				</tr>
				<tr>
					<td></td>
					<td><input type="submit" value="登录">&nbsp&nbsp<input type="submit" value="注册"></td>
				</tr>
			</table>
		</form>
	</div>
</body>
</html>