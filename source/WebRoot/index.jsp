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
		<link rel="stylesheet" type="text/css" href="css/index_body.css"/>
	</head>
	<body>
		
		<%@include file="include/blog_header.jspa" %>

		<div class="main_wrapper">
			
			<div class="article_container">
			
				<s:iterator value="list" id="a">
					<article class="article_body">
						<section class="article_image">
							<a href="<%=path %>/findArticle?id=<s:property value="#a.id"/>" target="_blank"><img src="<s:property  escape="false" value="#a.image"/>"/></a>
						</section>
						<header class="article_title">
							<a href="<%=path %>/findArticle?id=<s:property value="#a.id"/>" target="_blank">
								<s:property  escape="false" value="#a.title"/>
							</a>
						</header>
						<section class="article_content">
						
						<s:property  escape="false" value="#a.content"/>
						</section>
						<footer class="article_footer">
							By 	<s:property  escape="false" value="#a.author"/>	on <s:property  escape="false" value="#a.postDate"/>
						</footer>
					</article>
				</s:iterator>
				
			</div>

			<%@include file="include/aside.jspa"  %>
		</div>
		
		<%@include file="include/foot.jspa" %>
		
	</body>

	
	<script type="text/javascript" src="js/index.js" ></script>
</html>