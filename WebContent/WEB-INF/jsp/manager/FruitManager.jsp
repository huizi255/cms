<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<style>
  th{
    background:lightblue;
    text-align:center;
    text-family:微软雅黑；
    font-size:16px;
  }
  td{
    text-align:center;
    text-family:微软雅黑；
    font-size:16px;
  }
</style>    
<h1>水果管理</h1>
<hr>
<table border="1" style="width:100%;border-collapse:collapse;margin-top:10px">
<tr>
  <th>编号</th>
  <th>水果名称</th>
  <th>水果价格</th>
  <th>水果产地</th>
  <th>操作</th>
</tr>
<c:forEach items="${fruitList }" var="c">
<tr>
  <td><input type="checkbox" value="${c.id }"/></td>
  <td>${c.name}</td>
  <td>${c.price}</td>
  <td>${c.place}</td>
  <td>
    <a href="javascript:void(0)" val="${c.id }" class="upd">修改</a>
    <a href="javascript:void(0)" val="${c.id }" class="del">删除</a>
  </td>
</tr>
</c:forEach>
</table>
<script>
$(".upd").off;
$(".upd").on("click",function(){
	  var id = $(this).attr("val");
	  $(".right").load("toUpdFruit.action",{id:id});
});
  
  $(".del").off;
  $(".del").on("click",function(){
	  var flag = confirm("确定要删除吗？");
	  if(flag){
		  var id = $(this).attr("val");
			$.post("delFruit.action",{id:id},function(){
				$(".baseUI li:contains('水果管理')").trigger("click");
			});
	  }
  });
</script>