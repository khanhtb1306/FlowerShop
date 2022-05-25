<%-- 
    Document   : User.jsp
    Created on : Mar 12, 2022, 10:43:48 PM
    Author     : trinh
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>responsive personal portfolio website design tutorail</title>

        <!-- font awesome cdn link  -->
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.2/css/all.min.css">

        <!-- custom css file link  -->
        <link rel="stylesheet" href="css/user.css">

    </head>
    <body>

        <!-- header section starts  -->

        <header>

            <div class="user">
                <img src="${info.image}" alt="Avatar">
                <h3 class="name">${info.fullName}</h3>
                <p class="post"></p>
            </div>

            <nav class="navbar">
                <ul>
                    <li><a href="Home">home</a></li>
                    <li><a href="purcharse">Purchase Order</a></li>
                    <li><a href="ChangePassWord.jsp">Change PassWord</a></li>
                    <li><a href="#">Deposit money into wallet</a></li>
                    <li><a href="User?check=0">Change Profiles</a></li>
                </ul>
            </nav>

        </header>

        <div id="menu" class="fas fa-bars"></div>

        <!-- about section starts  -->

        <section class="about" id="about">

            <h1 class="heading"> <span>Your</span> Account </h1>

            <div class="row">

                <div class="info">
                    <h3> <span> User Name : </span> ${acc.user} </h3>
                    <h3> <span> Email Address : </span> ${acc.email} </h3>
                    <c:if test="${sessionScope.acc.isSell == 0 && sessionScope.acc.isAdmin == 0}">
                        <h3> <span> Is : </span> User </h3>
                    </c:if>
                    <c:if test="${sessionScope.acc.isSell == 1}">
                        <h3> <span> Is : </span> Seller </h3>
                    </c:if>
                    <c:if test="${sessionScope.acc.isAdmin == 1}">
                        <h3> <span> Is : </span> Admin </h3>
                    </c:if>
                    <h3> <span> Address: </span> ${info.address}</h3>
                    <h3> <span> Phone Number: </span>${info.phone}</h3>
                    <h3> <span> Description: </span>${info.description} </h3>
                    <h3> <span> Wallet: </span>${info.wallet}</h3>
                </div>

            </div>

        </section>

        <!-- jquery cdn link  -->
        <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>

        <!-- custom js file link  -->
        <script src="js/user.js"></script>


    </body>
</html>