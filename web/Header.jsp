
Document   : Header
Created on : Mar 6, 2022, 7:35:34 PM
Author     : trinh

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.3/css/all.min.css">
        <link rel="stylesheet" type="text/css" href="css/cartFlower.css">
    </head>

    <body>

        <header>
            <input type="checkbox" name="" id="toggler">
            <label for="toggler" class="fas fa-bars"></label>

            <a href="Home" class="logo">flower<span>.</span></a>

            <nav class="navbar">
                <c:if test="${sessionScope.acc.isSell == 1}">
                    <a href="manager">Manager Product</a>   
                    <a href="managerorder">Manager Oder</a>
                </c:if>
                <c:if test="${sessionScope.acc.isAdmin == 1}">
                    <a href="managerAccount">Manager Account</a>
                </c:if>    
                <c:if test="${sessionScope.acc.isSell == 0 && sessionScope.acc.isAdmin == 0}">
                    <a href="#Home">home</a>
                    <a href="#about">about</a>
                    <a href="#products">products</a>
                    <a href="#review">review</a>
                    <a href="#contact">contact</a>
                </c:if> 


            </nav>

            <div class="icons">
                <a href="#products" class="fas fa-search"></a>
                <a href="#" class="fas fa-heart"></a>
                <c:set var="size" value="${sessionScope.size}"/>
                <a href="Cart.jsp" class="fas fa-shopping-cart">${size}</a>

                <c:if test="${sessionScope.acc != null}">
                    <a href="User?check=1" class="fas fa-grin-squint-tears"></a>
                    <a href="logout" class="fas fa-sign-out-alt"></a>
                </c:if>

                <c:if test="${sessionScope.acc == null}">
                    <a href="login" class="fas fa-user"></a>
                </c:if>
            </div>

        </header>
</html>