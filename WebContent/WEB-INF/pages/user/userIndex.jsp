<%@ page language="java" contentType="text/html; charset=utf8"
    pageEncoding="utf8"%>
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
</head>
<body background="${pageContext.request.contextPath}/img/desireview2.jpg">
	<!--主标题-->
	<div class = "first">
		<p class = "firstLine"><strong>卢西奥婚恋网</strong></p>
		<p class = "secondLine">luxiaoxiaoxia</p>
	</div>
		
	<!--导向-->
	<div class = "leftBiv divBorder">
			
		<p class="pLeft" onmouseover="this.style.background='lightblue'" onmouseout="this.style.background=''"><a href="" style="color:black;text-decoration:none;">公司简介</a></p>
				
		<p class="pLeft" onmouseover="this.style.background='lightblue'" onmouseout="this.style.background=''"><a href="" style="color:black;text-decoration:none;">老板介绍</a></p>
				
		<p class="pLeft" onmouseover="this.style.background='lightblue'" onmouseout="this.style.background=''"><a href="" style="color:black;text-decoration:none;">公司宗旨</a></p>
				
		<p class="pLeft" onmouseover="this.style.background='lightblue'" onmouseout="this.style.background=''"><a href="" style="color:black;text-decoration:none;">制作相关</a></p>
				
		<p class="pLeft" onmouseover="this.style.background='lightblue'" onmouseout="this.style.background=''"><a href="" style="color:black;text-decoration:none;">推荐音乐</a></p>
				
		<p class="pLeft" onmouseover="this.style.background='lightblue'" onmouseout="this.style.background=''"><a href="" style="color:black;text-decoration:none;">获奖记录</a></p>
			
		<p class="pLeft" onmouseover="this.style.background='lightblue'" onmouseout="this.style.background=''"><a href="http://www.ivsky.com/bizhi/our_times_t32480/" style="color:black;text-decoration:none;">精美壁纸</a></p>
			
	</div>

	<!--宣传pv和公司简介-->
	<div class = "midTopBiv">
		<p class = "pvTilte">公司宣传PV</p>
		<video width="100%" height="57%" controls="controls">
			<source src="${pageContext.request.contextPath}/video/君の名はPV.mp4" type="video/mp4">
			<source src="${pageContext.request.contextPath}/video/君の名はPV.ogg" type="video/ogg">
		</video><br/>
		<p align="center"><strong>公司简介</strong></p>
		<p>&nbsp&nbsp卢西奥婚恋网是中国一家通过网上实名进行交友和婚恋的服务商，以“帮助亿万中国人拥有幸福的婚姻和家庭”为己任。</p>
		<p>&nbsp&nbsp卢西奥婚恋网的线下实体店行业领先，目前已在全国开设100城市实体店。卢西奥婚恋网的目标是集各地优势，合百家文化，共建全国最大的开放式平台，为中国单身男女提供专业的婚恋咨询、婚恋指导、婚恋匹配。卢西奥婚恋网的目标是通过不断探索和创新，奠定中国现代婚恋服务业的基础，成为行业龙头企业。</p>
	</div>
		
	<!--登录注册的连接-->
	<div class = "rightTopBiv divBorder">
		${sessionScope.user.uName }<br/>
		${sessionScope.user.uCreateTime }
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