<%-- 
    Document   : ForgotPass
    Created on : Mar 11, 2022, 8:46:14 PM
    Author     : trinh
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-vidth", initial-scale="1.0">
    </head>
    <style>
        @import url('https://fonts.googleapis.com/css?family=Poppins:200,300,400,500,600,700,800,900&display=swap');
        *
        {
            margin: 0;
            padding: 0;
            box-sizing: border-box;
            font-family: 'Poppins', sans-serif;
        }
        body
        {
            display: flex;
            justify-content: center;
            align-items: center;
            min-height: 100vh;
            background: #03a9f4;
            transition: 0.5s; 
        }
        .container
        {
            position: relative;
            width: 700px;
            height: 500px;
            margin: 20px;
        }

        .formBx
        {
            position: absolute;
            top: 0;
            left: 20%;
            right: 20%;
            width: 60%;
            height: 100%;
            background: #fff;
            z-index: 1000;
            display: flex;
            justify-content: center;
            align-items: center;
            box-shadow: 0 5px 45px rgba(0,0,0,0.25);
            transition: 0.5s ease-in-out;
            overflow: hidden;
        }
        .formBx .form
        {
            position: absolute;
            left: 0;
            width: 100%;
            padding: 50px;
            transition: 0.5s;
        }
        .formBx .signinForm{
            transition-delay: 0.25s;
        }
        .formBx .form form
        {
            width: 100%;
            display: flex;
            flex-direction: column;
        }
        .formBx .form form h3
        {
            font-size: 1.5em;
            color: #333;
            margin-bottom: 20px;
            font-weight: 500;
        }
        .formBx .form form input{
            margin-bottom: 20px;
            padding: 10px;
            outline: none;
            font-size: 16px;
            border: 1px solid #333;

        }
        .formBx .form form input[type="submit"]
        {
            background: #03a9f4;
            border: none;
            color: #fff;
            max-width: 100px;
            cursor: pointer;
        }
        .formBx .form form .Other
        {
            color:  #333;
            list-style: none;
            text-decoration: none;

        }

        @media(max-width: 991px)
        {
            .container
            {
                max-width: 400px;
                height: 650px;
                display: flex;
                justify-content: center;
                align-items: center;
                margin-right: 30%;
                margin-top: 15%;
            }
            .formBx
            {
                width: 100%;
                height: 500px;
                top: 0;
                box-shadow: none;
            }
        }
    </style>
    <body>
        <div class="container">
            <div class="formBx">
                <div class="form signinForm">
                    <form id="form" action="sendEmail" method="post">
                        <h3>Add your email</h3>
                        <span style="font-size: 13px;" id="text"></span>
                        <input id="email" name = "useremail" type="Email" placeholder="Email Address"onkeydown="
                                validationn()">
                        <div>
                            <input type="submit" value="Register">
                            <a href="User?check=1" style="background: #03a9f4; color: #fff; padding: 10.8px; text-decoration: none;">Cance</a>
                        </div>
                        <a href="#" class="Other">Other</a>
                    </form>
                </div>
            </div>
        </div>
    </body>
    <script type="text/javascript">
        function validationn() {
            var from = document.getElementById("form");
            var email = document.getElementById("email").value;
            var text = document.getElementById("text");
            var pattern = /^[^ ]+@[^ ]+\.[a-z]{2,3}$/;

            if (email.match(pattern))
            {
                from.classList.add("valid");
                from.classList.remove("invalid");
                text.innerHTML = "Your Email Address invalid.";
                text.style.color = "#00ff00";

            } else
            {
                from.classList.remove("valid");
                from.classList.add("invalid");
                text.innerHTML = "Please Enter valid Email Address";
                text.style.color = "#ff0000";
            }

            if (email == "")
            {
                from.classList.remove("valid");
                from.classList.remove("invalid");
//                    text.innerHTML = "Your Email Address in valid.";
                text.style.color = "#00ff00";

            }
        }
    </script>
</html>