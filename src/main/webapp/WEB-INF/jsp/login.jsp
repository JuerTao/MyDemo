<%--
  Created by IntelliJ IDEA.
  User: LENOVO
  Date: 2020/10/15
  Time: 14:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="utf-8">
    <title>登录</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <!-- CSS -->
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/reset.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/supersized.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/style.css">

    <script type="text/javascript" src="${pageContext.request.contextPath}/js/html5.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-1.8.2.min.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/scripts.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/supersized.3.2.7.min.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/supersized-init.js"></script>
</head>
<body>
<div class="page-container">
    <h1>登录</h1>
    <form action="/MyDemo/user/validate" method="post">
        <input type="text" name="username" class="username" placeholder="用户名！">
        <input type="password" name="password" class="password" placeholder="密码！">
        <input type="Captcha" class="Captcha" name="Captcha" placeholder="验证码！">
        <button type="submit" class="submit_button" >登录</button>
    </form>
</div>
</body>
</html>
