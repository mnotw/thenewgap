$(function() {
	//鼠标悬停菜单显示
	$(".nav_ul > li").on('mouseover', function() {
		$(this).children(":first").show();
		$(this).children(":first").css("display", "block");
	})
	$(".nav_ul > li").on('mouseout', function() {
		$(this).children(":first").hide();
	})
	//屏幕滚动显示、隐藏博客标题和返回顶部按钮
	$(window).on("scroll",function(){
		//博客标题为60
		//To_do   获取浏览器滚动属性幅度 目前默认为100，所以博客主题偏移量是130px
		if( $(document).scrollTop() > 60  ){
			//隐藏博客标题
			$(".blog_title").hide();
			//调整博客标题容器大小
			$(".blog_header").css("height","30px");
			//设置博客主体容器偏移量
			$(".main_wrapper").css("padding-top","130px");
			
		}else if( $(document).scrollTop() <= 60){
			$(".blog_header").css("height","90px");
			$(".blog_title").show();
			$(".main_wrapper").css("padding-top","90px");
		}

		//如果滚动条滚动超过当前屏幕高度的1/3，则显示滚动条
		if($(document).scrollTop() > $(window).height()/3){
			//出现在屏幕五分之一的地方
			var topOffset = $(document).scrollTop()+$(window).height()-$(window).height()/5+"px";
			$("#scroll_top_button").css({top:topOffset,left:"1000px"}).show();
		}else if($(document).scrollTop() <= $(window).height()/3){
			$("#scroll_top_button").hide();
		}
	})
	//返回顶部按钮添加事件
	$("#scroll_top_button").on("click",function () {
		//滚动到顶部，同时不显示出来博客标题
		//To_do 这个地方也需要确定滚动条一次的滚动量
		$("body,html").animate({scrollTop:100},200); 
	})

})