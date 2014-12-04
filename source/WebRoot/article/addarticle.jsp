<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%> 
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<DOCTYPE! html>
<html>
	<head>
		<mata charset="utf-8">
		<title>写作</title>
		<link rel="stylesheet" type="text/css" href="../css/reset.css">
		<link rel="stylesheet" href="../kindeditor/themes/default/default.css" />
	    <link rel="stylesheet" href="../kindeditor/plugins/code/prettify.css" />
		<style type="text/css">
			input{
				/*should be in it's own css file*/
				display: inline-block;
				height: 30px;
				width: 300px;
				margin: 15px;
				border-radius: 4px;
				border: 1px solid #DADADA;
				background: white;
			}
			.titleContainer{
				width: 330px;
				/*height: 160px;*/
				margin: 10px;
				/*border-radius: 7px;*/
				border: 1px solid #DADADA;
				background: #F5F5F5;
			}
			.editorContainer{
				/*background: #F5F5F5;*/
				background: white;
				margin-left: 20px;
				margin-right: 20px;
				margin: 10px;
			}
			.editorContainer textarea{
				border-radius: 4px;
				border: 0px solid white;
				background: gray;
				width: 100%;
				height: 100px;
				outline: none;
				resize:none;
			}
			.editorContainer textarea:focus{
				height: 200px;
			}
			.editorContainer input{
				background: gray;
			}
		</style>
	</head>
	<body>
		<form id="example" name="example" method="post" action="/addArticle"  ENCTYPE="multipart/form-data" >
			<div class="titleContainer">
				<form action="" method="post">
					 <input type="text" placeholder="title"/><br/>
					 <input type="text" placeholder="author"/><br/>
					 <input type="file" placeholder="image"/><br/>		 
				</form>
			</div>
			<div class="editorContainer">
				article content
				
				<textarea id="newsContent" name="newsContent" cols="100" rows="8" style="width:100%;height:100%;visibility:hidden;"></textarea>
				<input type="button" name="button" value="提交内容"  />
			</div>
		</form>
	<script charset="utf-8" src="../kindeditor/kindeditor.js"></script>
	<script charset="utf-8" src="../kindeditor/lang/zh_CN.js"></script>
	<script charset="utf-8" src="../kindeditor/plugins/code/prettify.js"></script>
	<script type="text/javascript" src="../js/jquery-1.8.2.js"></script>
	<script type="text/javascript" src="../js/addarticle.js"></script>
	</body>
</html>
