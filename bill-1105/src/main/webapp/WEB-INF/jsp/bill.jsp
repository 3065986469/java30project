<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<base href="${pageContext.request.contextPath }/">
<title>Insert title here</title>
</head>
<body>
	<h1>订单列表</h1>
	<table>
		<tr>
			<td>单号</td>
			<td>单据日期</td>
			<td>供应商</td>
			<td>供应商地址</td>
			<td><input type="checkbox" id="a"></td>
		</tr>
		<tbody id="tbody"></tbody>
	</table>
	<div id="div">
	</div>
	<select id="pageSize" onchange="querySize(this.value)">
			<option value="3">3</option>
			<option value="2">2</option>
			<option value="1">1</option>
		</select>
	<script type="text/javascript" src="static/js/jquery-1.12.4.js"></script>
	<script type="text/javascript">

		$(function(){
			$("#a").click(function(){
				if($(this).prop("checked")){
					$("[name='aa']").attr("checked",true);
				}else{
					$("[name='aa']").attr("checked",false);
				}
			});
		});
		function init(pageNum,pageSize){
			$.ajax({
				url:"bill/query",
				data:{
					pageNum:pageNum,
					pageSize:pageSize
				},
				success:function(res){
					$("#tbody").empty();
					$.each(res.list,function(i,obj){
						let str="<tr>"+
							"<td>"+obj.billno+"</td>"+
							"<td>"+obj.billdate+"</td>"+
							"<td>"+obj.suppliername+"</td>"+
							"<td>"+obj.supplieraddress+"</td>"+
							"<td><input type='checkbox' name='aa' value="+obj.billno+"></td>"+
						"</tr>";
						$("#tbody").append(str);
						bind(res);
					});
				}
			});
		}

		function bind(res){
			$("#div").empty();
			let str2="<span onclick='goPage(1)'>首页</span>"+
			"<span onclick='goPage("+res.prePage+")'>上一页</span>"+
			"<span>"+res.pageNum+"</span>"+
			"<span>/</span>"+
			"<span>"+res.pages+"</span>"+
			"<span onclick='goPage("+res.nextPage+")'>下一页</span>"+
			"<span onclick='goPage("+res.pages+")'>尾页</span>"+
			
			"<span onclick='del()'>删除</span>";

			$("#div").append(str2);
		}
		function goPage(pageNum){
			init(pageNum,$("#pageSize").val());
		}

		function del(){
			if(confirm("你确定删除吗？")){
				let ids="";
				$("[name='aa']").each(function(){
					if($(this).prop("checked")){
						ids+=$(this).val()+",";
					}
				});

				$.ajax({
					url:"bill/del",
					data:{
						ids:ids
					},
					success:function(res){
						init();
					}
						
				});
			}
		}

		function querySize(pageSize){
			$.ajax({
				url:"bill/query",
				data:{
					pageNum:1,
					pageSize:pageSize
				},
				success:function(res){
					console.log(res);
					$("#tbody").empty();
					$.each(res.list,function(i,obj){
						let str="<tr>"+
							"<td>"+obj.billno+"</td>"+
							"<td>"+obj.billdate+"</td>"+
							"<td>"+obj.suppliername+"</td>"+
							"<td>"+obj.supplieraddress+"</td>"+
							"<td><input type='checkbox' name='aa' value="+obj.billno+"></td>"+
						"</tr>";
						$("#tbody").append(str);
					});
					bind(res);
				}
			});
		}
		
		init(1,$("#pageSize").val());
	</script>
</body>
</html>