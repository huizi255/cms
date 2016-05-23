<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <!-- -------这是jquery.form的异步提交-------- -->
<script>
$(function(){
	var form = $("#UpdFruitForm");
	form.off();
	form.on("submit",function(){
		form.ajaxSubmit(function(){
			 form[0].reset();
			 alert("修改成功");
			 $(".baseUI li:contains('水果管理')").trigger("click");
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
<h1 align="center">修改水果</h1>
<hr>
<form action="UpdFruit.action" method="post" id="UpdFruitForm">
          <input type="hidden" name="id" value="${fruit.id }"/>      
       水果名称：<input type="text" name="name" value="${fruit.name }"><br>
       水果价格：<input type="text" name="price" value="${fruit.price}"><br>
       水果产地：<input type="text" name="place" value="${fruit.place }"><br>
       <input type="submit" value="提交"/>
</form>