<%@ page language="java" contentType="text/html; charset=utf8"
    pageEncoding="utf8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf8">
<title>userIndex</title>
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
<script type="text/javascript" src="${pageContext.request.contextPath }/js/jquery-1.7.2.js"></script>
<script type="text/javascript">
	$(function(){
		$("p[class='pc']").hide();
		$("#rmtable").hide();
	})
	
	function showPC(){
		$("p[class='pc']").show();
		$("#rmtable").hide();
		return false;
	}
	
	function showrmtable(){
		$("p[class='pc']").hide();
		$("#rmtable").show();
		return false;
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
			
		<p class="pLeft" onmouseover="this.style.background='lightblue'" onmouseout="this.style.background=''"><a href="javaScript:showPC()" style="color:black;text-decoration:none;">查看公司简介</a></p>
				
		<p class="pLeft" onmouseover="this.style.background='lightblue'" onmouseout="this.style.background=''"><a href="javaScript:showrmtable()" style="color:black;text-decoration:none;">查看招聘信息</a></p>
				
		<p class="pLeft" onmouseover="this.style.background='lightblue'" onmouseout="this.style.background=''"><a href="${pageContext.request.contextPath }/user/toAddOrUpdateResume" style="color:black;text-decoration:none;">填写或查看简历</a></p>
			
		<p class="pLeft" onmouseover="this.style.background='lightblue'" onmouseout="this.style.background=''"><a href="http://www.ivsky.com/bizhi/our_times_t32480/" style="color:black;text-decoration:none;">精美壁纸</a></p>
			
	</div>

	<!--宣传pv和公司简介-->
	<div class = "midTopBiv">
		<p class="pc" align="center"><strong>公司简介</strong></p>
		<p class="pc">&nbsp&nbsp卢西奥婚恋网是中国一家通过网上实名进行交友和婚恋的服务商，以“帮助亿万中国人拥有幸福的婚姻和家庭”为己任。</p>
		<p class="pc">&nbsp&nbsp卢西奥婚恋网的线下实体店行业领先，目前已在全国开设100城市实体店。卢西奥婚恋网的目标是集各地优势，合百家文化，共建全国最大的开放式平台，为中国单身男女提供专业的婚恋咨询、婚恋指导、婚恋匹配。卢西奥婚恋网的目标是通过不断探索和创新，奠定中国现代婚恋服务业的基础，成为行业龙头企业。</p>
		
		<table id="rmtable">
			<tr>
				<td>招聘信息id</td>
				<td>招聘部门</td>
				<td>招聘岗位</td>
				<td>招聘信息</td>
				<td>投递简历</td>
			</tr>
			<c:forEach items="${sessionScope.rmList }" var="rm">
				<tr>
					<td>${rm.rmId }</td>
					<td>${rm.rmDept.dName }</td>
					<td>${rm.rmPosit.pName }</td>
					<td>${rm.rmMessage }</td>
					<td><a href="${pageContext.request.contextPath }/user/toAddApplicationMessage?rmId=${rm.rmId }">投递简历</a></td>
				</tr>
			</c:forEach>
		</table>
	</div>
		
	<!--登录注册的连接-->
	<div class = "rightTopBiv divBorder">
		${sessionScope.user.uName }<br/>
		${sessionScope.user.uCreateTime }<br/>
		<input type="button" value="退出" onclick="javascrtpt:window.location.href='${pageContext.request.contextPath}/index.jsp'">
	</div>

	<!---->
	<div class = "rightDownBiv divBorder">
		
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