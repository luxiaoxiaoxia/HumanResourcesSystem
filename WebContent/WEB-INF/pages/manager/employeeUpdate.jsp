<%@ page language="java" contentType="text/html; charset=utf8"
    pageEncoding="utf8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf8">
<title>positionUpdate</title>
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
			<strong>员工修改界面</strong>
		</p>
		<form action="${pageContext.request.contextPath}/manager/updateEmployee" method="get">
			<table width="600px" >
				<tr>
					<td width="80px">员工昵称</td>
					<td>
						<input type="hidden" value="${requestScope.employee.eId}" name="eId">
						<input type="text" value="${requestScope.employee.eName}" name="eName" readonly="readonly">
						<input type="hidden" value="${requestScope.employee.ePassword}" name="ePassword">
					</td>
					<td width="80px">真实姓名</td>
					<td>
						<input type="text" value="${requestScope.employee.eRealName}" name="eRealName" readonly="readonly">
					</td>
				</tr>
				<tr>
					<td>员工性别</td>
					<td>
						<c:if test="${requestScope.employee.eSex eq '男' }">
							<input type="radio" name="eSex" value="男" checked="checked">
							<input type="radio" name="eSex" value="女">
						</c:if>
						<c:if test="${requestScope.employee.eSex eq '女' }">
							<input type="radio" name="eSex" value="男">
							<input type="radio" name="eSex" value="女" checked="checked">
						</c:if>
					</td>
					<td>员工年龄</td>
					<td>
						<input type="number" name="eAge" value="${requestScope.employee.eAge}">
					</td>
				</tr>
				<tr>
					<td>学历</td>
					<td>
						<input type="text" name="eEducation" value="${requestScope.employee.eEducation}">
					</td>
					<td>联系方式</td>
					<td>
						<input type="number" name="ePhotoNumber" value="${requestScope.employee.ePhotoNumber}">
					</td>
				</tr>
				<tr>
					<td>电子邮箱</td>
					<td>
						<input type="email" name="eEmail" value="${requestScope.employee.eEmail}">
					</td>
					<td>入职时间</td>
					<td>
						${requestScope.employee.eEntryDate}
					</td>
				</tr>
				<tr>
					<td>部门</td>
					<td>
						<select name="eDId">
							<c:forEach items="${requestScope.dList}" var="dept">
								<c:if test="${dept.dId==requestScope.employee.eDepartment.dId }">
									<option value="${dept.dId}" selected="selected">${dept.dName}</option>
								</c:if>
								<c:if test="${dept.dId!=requestScope.employee.eDepartment.dId }">
									<option value="${dept.dId}">${dept.dName}</option>
								</c:if>
							</c:forEach>
						</select>
					</td>
					<td>职位</td>
					<td>
						<select name="ePId">
							<c:forEach items="${requestScope.pList}" var="pos">
								<c:if test="${pos.pId==requestScope.employee.ePosition.pId }">
									<option value="${pos.pId}" selected="selected">${pos.pName}</option>
								</c:if>
								<c:if test="${pos.pId!=requestScope.employee.ePosition.pId }">
									<option value="${pos.pId}">${pos.pName}</option>
								</c:if>
							</c:forEach>
						</select>
					</td>
				</tr>
				<tr>
					<td>政治面貌</td>
					<td>
						<select name="ePoliticalStatus">
							<c:if test="${requestScope.employee.ePoliticalStatus eq '中共党员'}">
								<option value="中共党员" selected="selected">中共党员</option>
								<option value="群众">群众</option>
							</c:if>
							<c:if test="${requestScope.employee.ePoliticalStatus eq '群众'}">
								<option value="中共党员">中共党员</option>
								<option value="群众" selected="selected">群众</option>
							</c:if>
						</select>
					</td>
					<td>爱好</td>
					<td>
						<input type="text" value="${requestScope.employee.eHobby}" name="eHobby">
					</td>
				</tr>
				<tr>
					<td></td>
					<td></td>
					<td><input type="submit" value="提交"></td>
					<td><input type="button" value="取消" src="${pageContext.request.contextPath}/manager/managerIndex.jsp"></td>
				</tr>
			</table>
		</form>
	</div>
</body>
</html>