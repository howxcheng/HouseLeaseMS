﻿<html>
<!DOCTYPE html>
<html lang="en" class="no-js">
<head>
    <meta charset="utf-8">
    <title>登录</title>
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
        let code; //在全局定义验证码

        function createCode() {
            code = "";
            const codeLength = 4;//验证码的长度
            // const checkCode = document.getElementById("code");
            const random = [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R',
                'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'];//随机数
            for (let i = 0; i < codeLength; i++) {//循环操作
                const index = Math.floor(Math.random() * 36);//取得随机数的索引（0~35）
                code += random[index];//根据索引取得随机数加到code上
            }
            $("#code").val(code);
            // checkCode.value = code;//把code值赋给验证码
        }

        function register() {
            window.location.href = "register.jsp";
        }

        function judge(username, password) {
            let postData = {
                "username": username,
                "password": password
            };
            //alert(JSON.stringify(postData));
            $.ajax({
                url: "userLogin",
                type: "POST",
                data: JSON.stringify(postData),
                dataType: 'json',
                contentType: 'application/json;charset=UTF-8',
                success: function (msg) {
                    if (msg === 1) {
                        window.location.href = "house.jsp";
                    } else {
                        createCode();
                        alert("用户名或密码错误！");
                    }
                },
                error: function () {
                    alert("数据库连接异常！");
                }
            });
            return false;
        }

        //校验验证码
        function validate() {
            const userName = $("#username").val();
            const password = $("#password").val();
            const inputCode = $("#Captcha").val().toUpperCase(); //取得输入的验证码并转化为大写
            if (userName.length <= 0) {
                alert("用户名不能为空！");
            } else if (password.length <= 0) {
                alert("密码不能为空！");
            } else if (inputCode.length <= 0) { //若输入的验证码长度为0
                alert("请输入验证码！"); //则弹出请输入验证码
            } else if (inputCode !== code) { //若输入的验证码与产生的验证码不一致时
                alert("验证码输入错误！"); //则弹出验证码输入错误
                createCode();//刷新验证码
                document.getElementById("Captcha").value = "";//清空文本框
            } else { //输入正确时
                if (judge(userName, password))
                    return true;
            }
            return false;
        }
    </script>
</head>
<body>
<script type="text/javascript">window.onload = function () {
    createCode();
}</script>
<div class="page-container">
    <h1 style="font-size: 50px">登&nbsp;&nbsp;录</h1>
    <form action="" method="post" onsubmit="return false">
        <input type="text" id="username" name="username" class="username" placeholder="请输入您的用户名！">
        <input type="password" id="password" name="password" class="password" placeholder="请输入您的用户密码！">
        <input type="text" id="Captcha" class="Captcha" name="Captcha" placeholder="请输入验证码！">
        <input type="button" id="code" onclick="createCode()" style="float:right;width:130px;" title="点击更换验证码">
        <div style="margin: auto;width: 70%;text-align: center">
            <button type="submit" class="submit_button" onclick="validate()">登&nbsp;&nbsp;&nbsp;录</button>
            <button type="button" class="submit_button" onclick="register()">注&nbsp;&nbsp;&nbsp;册</button>
        </div>
        <div class="error"><span>+</span></div>
    </form>
</div>
</body>
</html>

