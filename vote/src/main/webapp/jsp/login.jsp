<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" language="java"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head> 
<title>登录页面</title>
<!-- <link href="../css/index.css" rel="stylesheet" type="text/css"/> -->
<link href="../css/simpleAlert.css" rel="stylesheet" type="text/css"/>
</head>
<body>
<div id = "welcomeLogin">登录页面</div>

<div>
<span>账号</span>   
<input id ="userName" ></input>
<span>密码</span>
<input type="password" id="userPass"></input>
<button id="loginSystem">登录</button>
<button id="newSystem">注册</button>
</div>

<div id ="newAccount" hidden>
<span>账号</span>   
<input id ="newName" ></input>
<span>密码</span>
<input type="password" id="newPass"></input>
<span>个性签名</span>   
<input id ="newsign" ></input>
</div>
</body>

<script type="text/javascript" src="../scripts/jquery-3.1.1.js"></script>
<script type="text/javascript" src="../scripts/jquery-3.1.1.min.js"></script>
<script type="text/javascript" src="../scripts/index.js"></script>
<script type="text/javascript" src="../tools/simpleAlert.js"></script>
</html>