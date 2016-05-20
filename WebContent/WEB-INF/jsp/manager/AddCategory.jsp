<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <!-- -------这是jquery.form的异步提交-------- -->
<script>
$(function(){
	var form = $("#addCategoryForm");
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
<h1 align="center">添加栏目</h1>
<hr>
<form action="AddCategory.action" method="post" id="addCategoryForm">
       栏目名称：<input type="text" name="name"><br>
       栏目编号：<input type="text" name="code"><br>
       <input type="submit" value="添加"/>
</form>