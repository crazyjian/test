<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page session="false" %>
<html>
<head>
	<title>首页</title>
	<script src="extjs5.1.0/build/ext-all.js"></script>  
	<script src="extjs5.1.0/build/packages/ext-theme-crisp/build/ext-theme-crisp.js"></script>  
	<link href="extjs5.1.0/build/packages/ext-theme-crisp/build/resources/ext-theme-crisp-all.css" rel="stylesheet" />  
	<!-- <script src="js/home.js"></script> -->
	<script src="js/jquery-2.1.1.js"></script>
	<script src="js/jquery.ztree.core.js"></script>
	<script src="js/jquery.ztree.excheck.js"></script>
	<script src="js/home.js"></script>
	<link href="js/zTreeStyle.css" rel="stylesheet"/>
</head>
<body>
	<h1 style="text-align:center">用户信息</h1>
	<form:form modelAttribute="student" id="studentForm">
		<form:hidden path="id"/>
		 <label for="name">姓名：</label><form:input path="name" id="name"/>
		 <label for="password">密码：</label><form:input path="password" id="password"/>
		 <button type="button" onclick="save();">确定</button>
		 <button type="button" onclick="removeParam();">取消</button>
	</form:form>

<script type="text/javascript">
	function save() {
		var params = $("#studentForm").serializeArray();
		$.ajax({
			type: 'post',
			dataType:'json',
			data: params,
			traditional: true,
			url: 'http://localhost:8080/Test/save',
			success: function(result) {
				if(result.flag) {
					alert("保存成功！");
				}else {
					alert(result.msg);
				}
			},
			error: function(XMLHttpRequest, textStatus, errorThrown) {
                alert(XMLHttpRequest.status);
                alert(XMLHttpRequest.readyState);
                alert(textStatus);
            }
			/* error: function() {
				alert("发生未知错误");	
			} */
		});
	};
	function removeParam() {
		/* $('#name').val('');
		$('#password').val('');
		$('#createTime').val(''); */
		$("#studentForm").find(':input').not(':button, :submit, :reset').val('')
		.removeAttr('checked').removeAttr('selected');
	};
</script>
</body>
</html>


