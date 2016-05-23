<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <!-- -------这是jquery.form的异步提交-------- -->
<script>
$(function(){
	var form = $("#addFruitForm");
	form.off();
	  form.on("submit",function(){
		 form.ajaxSubmit(function(){
			 form[0].reset();
			 alert("添加成功")
		 });
		 return false;
	  });
 });
</script>
<style type="text/css">
  h1{
    color:orange;
  }
  form{
    font-size:15px;
    padding-left:20px;
    line-height:20px;
  }
</style>
<h1 align="center">添加水果</h1>
<hr>
<form action="AddFruit.action" method="post" id="addFruitForm">
       水果名称：<input type="text" name="name"><br>
       水果价格：<input type="text" name="price"><br>
        水果产地：<input type="text" name="place"><br>
       <input type="submit" value="添加"/>
</form>