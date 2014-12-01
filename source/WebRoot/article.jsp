<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%> 
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html>
<html>
	<head>
		<%@include file="include/head.jspa" %>
		<title>Jonathan's Blog</title>
		<link rel="stylesheet" type="text/css" href="css/article_body.css"/>
	</head>
	<body>
		<%@include file="include/blog_header.jspa" %>

		<div class="main_wrapper">
			<div class="article_container">
					<article class="article_body">
						
						<header class="article_title">
							<s:property value="article.title"/>
						</header>
						<div class="article_counter" id="view_counter">
							<s:property value="article.viewTimes"/>
						</div>
						<div class="article_counter" id="comment_counter">
							<s:property value="article.shareTimes"/>
						</div>
						<section class="article_image">
							<img src="<s:property value="article.image"/>"/>
						</section>
						<section class="article_content">
							<s:property escape="false" value="article.content"/>
						</section>
						<footer class="article_footer">
							<div class="article_signature">
								By <s:property value="article.author"/> 		
								on <s:property value="article.postDate"/>
							</div>
							
						</footer>
					</article>
			</div>

			<%@include file="include/aside.jspa" %>
		</div>
		
		<%@include file="include/foot.jspa" %>
	</body>

	<script type="text/javascript" src="js/index.js" ></script>
</html>