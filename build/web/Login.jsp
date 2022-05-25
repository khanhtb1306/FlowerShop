<%-- 
    Document   : Login
    Created on : Feb 27, 2022, 4:27:17 PM
    Author     : trinh
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-vidth", initial-scale="1.0">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
        <link rel="stylesheet" type="text/css" href="css/Login.css">
    </head>

    <body>
        <div class="container">

            <div class="blueBg">

                <div class="box signin">
                    <h2>Already Have an Account ?</h2>
                    <button type="submit" class="signinBtn">Sign in</button>
                </div>  


                <div class="box signup">
                    <h2>Don't Have an Account ?</h2>
                    <button type="submit" class="signupBtn">Sign up</button>
                </div>  

            </div>

            <div class="formBx">
                <div class="form signinForm">
                    <form action="login" method="post">
                        <h3>Sign in</h3>
                        <p class="text-danger">${mess}</p>
                        <input name="user" value="${userName}" type="text" placeholder="Username">
                        <input name="pass" value="${passWord}" type="Password" placeholder="Password">
                        <div class="form-group form-check">
                            <input name="remember" value="1" type="checkbox" class="form-check-input" id="exampleCheck1">
                            <label class="form-check-label" for="exampleCheck1">Remember me</label>
                        </div>
                        <input type="submit" value="Login">
                        <a href="ForgotPass.jsp" class="forgot">Forgot Password</a>
                    </form>
                </div>

                <div class="form signupForm">
                    <form id="form" action="signup" method="post">
                        <h3>Sign up</h3>
                        <input name = "user" type="text" placeholder="Username">
                        <span style="font-size: 10px" id="text"></span>
                        <input id="email" name = "email" type="Email" placeholder="Email Address" onkeydown="
                                validation()">
                        <input id="pass" name= "pass" type="Password" placeholder="Password">
                        <span style="font-size: 10px" id="textt"></span>
                        <input id="repass" name= "repass" type="Password" placeholder="Confirm Password" onkeyup="
                                checkRepass()">
                        <input type="submit" value="Register">
<!--                        <a href="#" class="forgot">Forgot Password</a>-->
                    </form>
                </div>
            </div>
        </div>
        <script type="text/javascript">
            const signinBtn = document.querySelector('.signinBtn');
            const signupBtn = document.querySelector('.signupBtn');
            const formBx = document.querySelector('.formBx');
            const body = document.querySelector('body');
            signupBtn.onclick = function () {
                formBx.classList.add('active')
                body.classList.add('active')
            }
            signinBtn.onclick = function () {
                formBx.classList.remove('active')
                body.classList.remove('active')
            }

            function validation() {
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

            function checkRepass() {
                var from = document.getElementById("form");
                let pass = document.getElementById("pass").value;
                let repass = document.getElementById("repass").value;
                console.log(pass, repass);
                var textt = document.getElementById("textt");
                if (pass == repass) {
                    from.classList.add("equals");
                    from.classList.remove("notequals");
                    textt.textContent = "Confirm Password Invalid";
                    textt.style.color = "#00ff00";
                } else {
                    from.classList.remove("equals");
                    from.classList.add("notequals");
                    textt.textContent = "Confirm Password don't match Password.";
                    textt.style.color = "#ff0000";
                }
            }

        </script>
    </body>
</html>
