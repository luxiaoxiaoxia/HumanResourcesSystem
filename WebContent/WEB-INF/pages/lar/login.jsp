<%@ page language="java" contentType="text/html; charset=utf8"
    pageEncoding="utf8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf8">
<title>login</title>
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
	$(function(){
		$("input[type='submit']").click(function(){
			var name = $("input[name='name']").val();
			var password = $("input[name='password']").val();
			var submit = $("input[type='submit']");
			$.ajax({
				url:"${pageContext.request.contextPath}/index/checkLoginNameAndPassword",
				type:"get",
				dataType:"text",
				data:{name:name,password:password},
				success:function(data){
					if(data == 1){
						$("form").submit();
					}else if(data == 0){
						$("span").html("密码必须要六位及以上");
					}else if(data == "-1"){
						$("span").html("用户名不存在");
					}else{
						$("span").html("用户名和密码不匹配");
					}
				},
				error:function(x,msg,obj){
					alert(msg);
				}
			})
			return false;
		})
	})
</script>
</head>
<body background="${pageContext.request.contextPath}/img/linkview2.jpg">
	<audio autoplay="autoplay" loop="loop" height="100" width="100">
		<source src="${pageContext.request.contextPath}/mp3/アゲイン (Again).mp3" type="audio/mp3" />
		<source src="${pageContext.request.contextPath}/mp3/アゲイン (Again).ogg" type="audio/ogg" />
		<embed height="100" width="100" src="${pageContext.request.contextPath}/mp3/アゲイン (Again).mp3" />
	</audio>
	
	<!--主标题-->
	<div class = "first">
		<p class = "firstLine"><strong>卢西奥婚恋网</strong></p>
		<p class = "secondLine">luxiaoxiaoxia</p>
	</div>
	
	<div class = "main">
		<p type=center>
			<strong>卢西奥婚恋网登录界面</strong>
		</p>
		<form action="${pageContext.request.contextPath}/index/login" method="get">
			<table>
				<tr>
					<td class="class1"><strong>用户姓名：</strong></td>
					<td><input type="text" name="name" required="required"></td>
				</tr>
				<tr>
					<td class="class1"><strong>用户密码：</strong></td>
					<td><input type="text" name="password" required="required"></td>
				</tr>
				<tr>
					<td></td>
					<td style="color:red"><span>${requestScope.loginMsg }</span></td>
				</tr>
				<tr>
					<td></td>
					<td>
						<input type="submit" value="登录">&nbsp&nbsp<input type="button" value="返回" onclick="javascrtpt:window.location.href='${pageContext.request.contextPath}/index.jsp'">
					</td>
				</tr>
			</table>
		</form>
	</div>
</body>
</html>