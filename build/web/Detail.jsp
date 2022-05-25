<%-- 
    Document   : Detail
    Created on : Feb 28, 2022, 11:28:15 AM
    Author     : trinh
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html style="font-size: 65%;">
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <title>Product Card/Page</title>
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="css/DetailProduct.css">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.1/css/all.min.css" integrity="sha512-+4zCK9k+qNFUR5X+cKL9EIR+ZOhtIloNl9GIKS57V1MyNsYpYcUrUeQc9vNfzsWfV28IaLL3i96P9sdNyeRssA==" crossorigin="anonymous" />
    </head>
    <body>
        <jsp:include page="Header.jsp"/>
        <div class = "card-wrapper">
            <div class = "card">
                <!-- card left -->
                <div class = "product-imgs">
                    <div class = "img-display">
                        <div class = "img-showcase">
                            <img src = "${detail.image}" alt = "image">
                        </div>
                    </div>
                </div>
                <!-- card right -->
                <div class = "product-content" style="padding-top: 100px;">
                    <h2 class = "product-title">${detail.name}</h2>
                    <a href = "Home" class = "product-link">visit flower store</a>
                    <div class = "product-rating">
                        <i class = "fas fa-star"></i>
                        <i class = "fas fa-star"></i>
                        <i class = "fas fa-star"></i>
                        <i class = "fas fa-star"></i>
                        <i class = "fas fa-star-half-alt"></i>
                        <span>4.7(21)</span>
                    </div>

                    <div class = "product-price">
                        <!--            <p class = "last-price">Old Price: <span>$257.00</span></p>-->
                        <p class = "new-price">Price: <span>$${detail.price}</span></p>
                    </div>

                    <div class = "product-detail">
                        <h2>about this item: </h2>
                        <p>${detail.title}</p>
                        <p>${detail.description}</p>
                    </div>

                    <div class = "purchase-info">
                        <input type = "number" min = "0" value = "1">
                        <a class = "btn" href="cartDetail?pid=${detail.id}" style="font-size: 13.5px">
                            Add to Cart <i class = "fas fa-shopping-cart"></i>
                        </a>

                        <a class = "btn" style="font-size: 13.5px">Compare</a>
                    </div>

                    <div class = "social-links">
                        <p>Share At: </p>
                        <a href = "#">
                            <i class = "fab fa-facebook-f"></i>
                        </a>
                        <a href = "#">
                            <i class = "fab fa-twitter"></i>
                        </a>
                        <a href = "#">
                            <i class = "fab fa-instagram"></i>
                        </a>
                        <a href = "#">
                            <i class = "fab fa-whatsapp"></i>
                        </a>
                        <a href = "#">
                            <i class = "fab fa-pinterest"></i>
                        </a>
                    </div>
                </div>
            </div>
        </div>

    </body>
    <script src="js/detail.js"></script>

</body>
</html>
