<%@ page language="java" contentType="text/html; charset=utf8"
    pageEncoding="utf8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="f" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf8">
<title>managerIndex</title>
<style>
	/*
		界面背景设置
	*/
	body{
		background-repeat:repeat-y;
		background-position:center;
		background-attachment:fixed;
		background-size:cover;
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
	.pvTilte{
		font-size:14px;
		text-align:center;
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
	.leftBiv{
		width:18%;
		height:89%;
		position:absolute;
		top:10%;
		left:10%;
		margin:0 0 0 0;
		font-weight:bold;
	}
	.midTopBiv{
		width:40%;
		height:89%;
		position:absolute;
		top:10%;
		left:29%;
		margin:0 0 0 0;
	}
	.rightTopBiv{
		width:18%;
		height:16.39%;
		position:absolute;
		top:10%;
		left:70%;
		margin:0 0 0 0;
	}
	.rightDownBiv{
		width:18%;
		height:49.30%;
		position:absolute;
		top:27%;
		left:70%;
		margin:0 0 0 0;
	}
	.rightDown2Biv{
		width:18%;
		height:22.13%;
		position:absolute;
		top:77%;
		left:70%;
		margin:0 0 0 0;
	}

	/*
		div设置边框
	*/
	.divBorder{
		border:2px solid lightblue;
	}

	
	/*
		导向p标签
	*/
	.pLeft{
		margin-top:30px;
		margin-bottom:30px;
		text-align:center;
	}

	/*
		角色票选中tr的格式
	*/
	.tableInRightDownBiv{
		height:24px;
	}
			
	.aDecoration{
		color:black;
		text-decoration:none;
	}

</style>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-1.7.2.js"></script>
<script type="text/javascript">
	$(function() {
		$("#position").hide();
		$("#employee").hide();
		$("#eMsg").hide();
	})
	function findPositionByDId(dId){
			var tr = $("#"+"d"+dId);
			var dName = tr.children().eq(1).html();
			//alert(dId);
			//alert(dName);
			//$("#ptrFrist").after("<tr class='ptr'><td colspan='5'>"+dName+"</td></tr>");
			$.ajax({
				url:"${pageContext.request.contextPath}/manager/findPositionByDId",
				type:"post",
				dataType:"json",
				data:{dId:dId},
				success:function(data){
					//alert(data);
					$("tr[class='ptr']").remove();
					$("#ptrFirst").before("<tr class='ptr'><td colspan='5' align='center'>"+dName+"</td></tr>");
					$.each(data,function(index,item){
						//alert(item.pId);
						$("#ptrLast").before("<tr class='ptr'id="+"p"+item.pId+"><td>"+item.pId+"</td><td>"+item.pName+
								"</td><td>"+"<a href="+"javaScript:findEmployeeByPId("+item.pId+")"+">查看员工</a>"+
								"</td><td>"+"<a href="+""+">修改职位</a>"+"</td><td>"+
								"<a href="+"javaScript:deletePosition("+item.pId+")"+">删除职位</a>"+"</td></tr>");
					})
					$("#position").show();
				},
				error:function(x,msg,obj){
					alert(msg);
				}
			})
			return false;
		}
	
	function findEmployeeByDId(dId){
		var tr = $("#"+"d"+dId);
		var dName = tr.children().eq(1).html();
		$.ajax({
			url:"${pageContext.request.contextPath}/manager/findEmployeeByDId",
			type:"post",
			dataType:"json",
			data:{dId:dId},
			success:function(data){
				alert(data);
				$("tr[class='etr']").remove();
				$("#etrFirst").before("<tr class='etr'><td colspan='5' align='center'>"+dName+"</td></tr>");
				$.each(data,function(index,item){
					//alert(item.eId);
					$("#etrLast").before("<tr class='etr' id="+"e"+item.eId+"><td>"+item.eId+"</td><td>"+item.eName+
							"</td><td>"+"<a href="+"javaScript:findEmployeeByEId("+item.eId+")"+">查看员工</a>"+
							"</td><td>"+"<a href="+""+">修改职位</a>"+"</td><td>"+
							"<a href="+"javaScript:deletePosition("+item.eId+")"+">删除职位</a>"+"</td></tr>");
				})
				$("#employee").show();
			},
			error:function(x,msg,obj){
				alert(msg);
			}
		})
		return false;
	}
	
	function deleteDepartment(dId){
		var tr = $("#"+"d"+dId);
		$.ajax({
			url:"${pageContext.request.contextPath}/manager/deleteDepartment",
			type:"post",
			dataType:"json",
			data:{dId:dId},
			success:function(data){
				//alert(data);
				if(data == 1){
					tr.remove();
				}else{
					alert("该部门暂时无法删除");
				}
			},
			error:function(x,msg,obj){
				alert(msg);
			}
		})
		return false;
	}
	
	function findEmployeeByPId(pId){
		var tr = $("#"+"p"+pId);
		var dName = tr.parent().children().eq(0).children().html();
		alert(dName);
		var pName = tr.children().eq(1).html();
		alert(pName);
		$.ajax({
			url:"${pageContext.request.contextPath}/manager/findEmployeeByPId",
			type:"post",
			dataType:"json",
			data:{pId:pId},
			success:function(data){
				alert(data);
				$("tr[class='etr']").remove();
				$("#etrFirst").before("<tr class='etr'><td colspan='5' align='center'>"+dName+pName+"</td></tr>");
				$.each(data,function(index,item){
					//alert(item.eId);
					$("#etrLast").before("<tr class='etr' id="+"e"+item.eId+"><td>"+item.eId+"</td><td>"+item.eName+
							"</td><td>"+"<a href="+"javaScript:findEmployeeByEId("+item.eId+")"+">查看员工</a>"+
							"</td><td>"+"<a href="+""+">修改职位</a>"+"</td><td>"+
							"<a href="+"javaScript:deletePosition("+item.eId+")"+">删除职位</a>"+"</td></tr>");
				})
				$("#employee").show();
			},
			error:function(x,msg,obj){
				alert(msg);
			}
		})
		return false;
	}
	
	function deleteD() {
		$("#position").hide();
		$("#employee").hide();
		$("#eMsg").hide();
	}

</script>
</head>
<body background="${pageContext.request.contextPath}/img/desireview2.jpg">
	<!--主标题-->
	<div class = "first">
		<p class = "firstLine"><strong>卢西奥婚恋网</strong></p>
		<p class = "secondLine">luxiaoxiaoxia</p>
	</div>
		
	<!--导向-->
	<div class = "leftBiv divBorder">
			
		<p class="pLeft" onmouseover="this.style.background='lightblue'" onmouseout="this.style.background=''"><a href="${pageContext.request.contextPath}/manager/findAllDepartment" style="color:black;text-decoration:none;">查看公司</a></p>
				
		<p class="pLeft" onmouseover="this.style.background='lightblue'" onmouseout="this.style.background=''"><a href="" style="color:black;text-decoration:none;">查看考勤</a></p>
		
		<p class="pLeft" onmouseover="this.style.background='lightblue'" onmouseout="this.style.background=''"><a href="" style="color:black;text-decoration:none;">工资结算</a></p>
		
		<p class="pLeft" onmouseover="this.style.background='lightblue'" onmouseout="this.style.background=''"><a href="" style="color:black;text-decoration:none;">发布招聘信息</a></p>
		
		<p class="pLeft" onmouseover="this.style.background='lightblue'" onmouseout="this.style.background=''"><a href="" style="color:black;text-decoration:none;">查看招聘信息</a></p>
				
		<p class="pLeft" onmouseover="this.style.background='lightblue'" onmouseout="this.style.background=''"><a href="" style="color:black;text-decoration:none;">待处理信息</a></p>
				
		<p class="pLeft" onmouseover="this.style.background='lightblue'" onmouseout="this.style.background=''"><a href="" style="color:black;text-decoration:none;">已处理信息</a></p>
			
		<p class="pLeft" onmouseover="this.style.background='lightblue'" onmouseout="this.style.background=''"><a href="http://www.ivsky.com/bizhi/our_times_t32480/" style="color:black;text-decoration:none;">精美壁纸</a></p>
			
	</div>

	<!--主操作界面-->
	<div class = "midTopBiv">
		<p class="pLeft">manager</p>
		<c:if test="${!empty requestScope.dList }">
			<table>
				<tr>
					<td>部门id</td>
					<td>部门name</td>
					<td>查看职位</td>
					<td>查看员工</td>
					<td>修改部门</td>
					<td>删除部门</td>
				</tr>
				<c:forEach items="${requestScope.dList }" var="dept">
					<tr id="d${dept.dId}">
						<td>${dept.dId}</td>
						<td>${dept.dName}</td>
						<td><a href="javaScript:findPositionByDId(${dept.dId})">查看职位</a></td>
						<td><a href="javaScript:findEmployeeByDId(${dept.dId})">查看员工</a></td>
						<td><a href="${pageContext.request.contextPath}/manager/toUpdateDepartment?dId=${dept.dId}">修改部门</a></td>
						<td><a href="javaScript:deleteDepartment(${dept.dId})" onclick="deleteD()">删除部门</a></td>
					</tr>
				</c:forEach>
			</table>
		</c:if>
		<table id="position">
			<tr id="ptrFirst">
				<td>职位id</td>
				<td>职位name</td>
				<td>查看员工</td>
				<td>修改职位</td>
				<td>删除职位</td>
			</tr>
			<tr id="ptrLast">
				<td></td>
				<td></td>
				<td></td>
				<td></td>
				<td></td>
			</tr>
		</table>
		<table id="employee">
			<tr id="etrFirst">
				<td>员工id</td>
				<td>员工name</td>
				<td>查看员工详细信息</td>
				<td>修改员工信息</td>
				<td>删除员工</td>
			</tr>
			<tr id="etrLast">
				<td></td>
				<td></td>
				<td></td>
				<td></td>
				<td></td>
			</tr>
		</table>
	</div>
		
	<!--登录注册的连接-->
	<div class = "rightTopBiv divBorder">
		${sessionScope.employee.eName }<br/>
		${sessionScope.employee.eEntryDate }<br/>
		<input type="button" value="退出" onclick="javascrtpt:window.location.href='${pageContext.request.contextPath}/index.jsp'">
	</div>

	<!---->
	<div class = "rightDownBiv divBorder">
		<table id="eMsg">
			<tr>
				<td>员工id：</td>
				<td id="eid"></td>
			</tr>
			<tr>
				<td>员工name：</td>
				<td id="ename"></td>
			</tr>
			<tr>
				<td>员工基本工资：</td>
				<td id="esa"></td>
			</tr>
			<tr>
				<td>员工职位：</td>
				<td id="epost"></td>
			</tr>
			<tr>
				<td>员工部门：</td>
				<td id="edept"></td>
			</tr>
		</table>
	</div>

	<!--友情链接区-->
	<div class = "rightDown2Biv divBorder">
		<p><strong>友情链接：</strong></p>
		<a href="https://baike.baidu.com/item/%E6%88%91%E7%9A%84%E5%B0%91%E5%A5%B3%E6%97%B6%E4%BB%A3/17795757?fr=aladdin">百度百科-我的少女时代</a><br/>
		<a href="http://www.iqiyi.com/v_19rrkib984.html?vfm=2008_aldbd">我的少女时代</a><br/>
		<a href="http://www.baihe.com/betatest/betatest_newlandpage.html">百合网</a><br/>
	</div>

</body>
</html>