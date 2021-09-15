﻿<html>
<!DOCTYPE html>
<html lang="en" class="no-js">
<head>
    <meta charset="utf-8">
    <title>注册</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="">
    <meta name="author" content="">

    <!-- CSS -->
    <link rel="stylesheet" href="assets/css/reset.css">
    <link rel="stylesheet" href="assets/css/supersized.css">
    <link rel="stylesheet" href="assets/css/style.css">

    <!-- HTML5 shim, for IE6-8 support of HTML5 elements -->
    <!--[if lt IE 9]>
    <script src="assets/js/html5.js"></script>
    <![endif]-->

    <!-- Javascript -->
    <script src="assets/js/jquery-1.8.2.min.js"></script>
    <script src="assets/js/supersized.3.2.7.min.js"></script>
    <script src="assets/js/supersized-init.js"></script>
    <script src="assets/js/scripts.js"></script>
    <script type='text/javascript'>
        function exam() {
            let username = $("#username").val();
            let password = $("#password").val();
            let password2 = $("#confirmPassword").val();
            let email = $("#email").val();
            let phoneNumber = $("#phoneNumber").val();
            let myReg = /^(((13[0-9]{1})|(15[0-9]{1})|(17[0-9]{1})|(18[0-9]{1}))+\d{8})$/;
            let reg = /^([a-zA-Z]|[0-9])(\w|\-)+@[a-zA-Z0-9]+\.([a-zA-Z]{2,4})$/;

            if (username.trim() === "") {
                alert("请先输入用户名~~")
                username.focus();
            } else if (password.trim() === "") {
                alert("请先输入密码~~")
                password.focus();

            } else if (password2.trim() === "") {
                alert("请先确认密码~~")
                password2.focus();
            } else if (password.trim().length < 6) {
                alert("密码长度不能少于6位~~");
                password.focus();
            } else if (password.trim() !== password2.trim()) {
                alert("确认密码错误~请重新输入~")
                password.focus();
            } else if (email.trim() === "") {
                alert("请输入email~~")
            } else if (phoneNumber.trim() === "") {
                alert("请输入手机号~");
                password.focus();
            } else if (!reg.test(email.trim())) {
                alert("邮箱格式错误~请重新输入");
                password.focus();
            } else if (!myReg.test(phoneNumber.trim())) {
                alert("手机号格式错误~请重新输入");
                password.focus();
            } else {
                register();
            }
        }

        function register() {
            let postData = {
                "username": $("#username").val(),
                "password": $("#password").val(),
                "phoneNumber": $("#phoneNumber").val(),
                "email": $("#email").val()
            }
            console.log(JSON.stringify(postData));
            $.ajax({
                url: "userRegister",
                type: "POST",
                data: JSON.stringify(postData),
                dataType: 'json',
                contentType: 'application/json;charset=UTF-8',
                success: function (msg) {
                    if (msg === 1) {
                        alert("注册成功，即将跳转至登录界面！");
                        window.location.href = "login.jsp";
                    } else {
                        alert("注册失败！");
                    }
                },
                error: function () {
                    alert("数据库连接异常！");
                }
            });
        }

        function backToHome() {
            window.location.href = "house.jsp";
        }
    </script>
</head>


<body>
<div class="headerLine">
    <div class="headerButton" onclick="backToHome()">
        <table>
            <tr>
                <td onclick="backToHome()">返回首页</td>
            </tr>
        </table>
    </div>
</div>
<div class="page-container">
    <h1 style="font-size: 50px">注&nbsp;&nbsp;册</h1>
    <form id="registerForm" action="" method="post" onsubmit="return false">
        <input type="text" id="username" name="username" class="username" placeholder="请输入您的用户名！">
        <input type="password" id="password" name="password" class="password" placeholder="请输入您的用户密码！">
        <input type="password" id="confirmPassword" name="confirmPassword" class="password" placeholder="请确认您的用户密码！">
        <input type="email" id="email" name="email" placeholder="请输入您的电子邮箱！">
        <input type="text" id="phoneNumber" name="phoneNumber" placeholder="请输入您的电话号码">


        <div style="margin: auto;width: 70%;text-align: center">
            <button type="button" class="submit_button" onclick="exam()">注&nbsp;&nbsp;&nbsp;册</button>
            <p style="margin-top: 20px">
                <a href="login.jsp">已有账号，点此处登录</a>
            </p>
        </div>
        <div class="error"><span>+</span></div>
    </form>
</div>
</body>
</html>

