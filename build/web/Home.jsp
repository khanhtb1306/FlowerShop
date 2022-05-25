<%-- 
    Document   : Home
    Created on : Feb 27, 2022, 4:26:35 PM
    Author     : trinh
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0"> 
        <script> defer src = "https://use.fontawesome.com/releases/v5.0.6/js/all.js" ></script>
        <title>JSP Page</title>
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.3/css/all.min.css">
        <link rel="stylesheet" href="css/style.css">
    </head>
    <body>
        <!-- header section starts  -->
        <jsp:include page="Header.jsp"/>

        <!-- header section ends -->

        <!-- home section starts  -->

        <section class="home" id="home">

                        <div class="content">
                            <h3>fresh flowers</h3>
                            <span> natural & beautiful flowers </span>
                            <p>Lorem ipsum dolor sit amet consectetur adipisicing elit. Beatae laborum ut minus corrupti dolorum dolore assumenda iste voluptate dolorem pariatur.</p>
                            <a href="#" class="btn">shop now</a>
                        </div>

        </section>

        <!-- home section ends -->


        <section >

        </section>  


        <!-- prodcuts section starts  -->

        <section class="products" id="products">

            <h1 class="heading"><span>products</span> </h1>
            <form action="search" method="post">
                <div  class="search-box">
                    <button type="submit" href="#produts" class="search-btn">
                        <i class="fas fa-search"></i>
                    </button>
                    <input oninput="searchByName(this)" value="${txt$}" name="txt" type="text" class="Search-txt" aria-label="Small"  placeholder="Type to search">
                </div> 
            </form>

            <div class = "category">
                <nav class="category-list">
                    <c:forEach items="${ListC}" var="o"> 
                        <li class="${cateID == o.cid ? "active":""}"><a href="Home?cid=${o.cid}">${o.cname}</a></li>    
                        </c:forEach>                       
                </nav>
            </div>

            <div class="box-container" id="content">
                <c:forEach items="${ListP}" var="o">
                    <div class="box productLoad">
                        <span class="discount">-10%</span>
                        <div class="image">
                            <img src="${o.image}" alt="">
                            <div class="icons">
                                <a href="#" class="fas fa-heart"></a>
                                <a href="addCart?pid=${o.id}"class="cart-btn">add to cart</a>
                                <if></if>
                                <a href="detail?pid=${o.id}" class="fas fa-share"></a>
                            </div>
                        </div>
                        <div class="content">
                            <h3>${o.name}</h3>
<!--                            <div class="price"> ${o.price} <span>$15.5</span> </div>-->
                            <div class="price"> ${o.price}VND</div>
                        </div>
                    </div>
                </c:forEach> 

            </div>
            <!--            <div>
                            <button onclick="loadMore()" class="btn btn-primary">Load more</button>
                        </div>-->
        </section>
        <!-- prodcuts section ends -->

        <div class="paging">
            <ul class="pagination">
                <li><a href="Home?index=${tag-1}&cid=${cateID}" class="prev">< Prev</a></li>
                    <c:forEach begin="1" end="${end}" var="i">
                    <li class="pageNumber ${tag==i?"active":""}"><a href="Home?index=${i}&cid=${cateID}">${i}</a></li>
                    </c:forEach>
                <li><a href="Home?index=${tag+1}&cid=${cateID}" class="next">Next ></a></li>

            </ul>
        </div>

        <!-- icons section starts  -->

        <section class="icons-container">

            <div class="icons">
                <img src="images/icon-1.png" alt="">
                <div class="info">
                    <h3>free delivery</h3>
                    <span>on all orders</span>
                </div>
            </div>

            <div class="icons">
                <img src="images/icon-2.png" alt="">
                <div class="info">
                    <h3>10 days returns</h3>
                    <span>moneyback guarantee</span>
                </div>
            </div>

            <div class="icons">
                <img src="images/icon-3.png" alt="">
                <div class="info">
                    <h3>offer & gifts</h3>
                    <span>on all orders</span>
                </div>
            </div>

            <div class="icons">
                <img src="images/icon-4.png" alt="">
                <div class="info">
                    <h3>secure paymens</h3>
                    <span>protected by paypal</span>
                </div>
            </div>

        </section>

        <!-- icons section ends -->

        <!-- about section starts  -->

        <section class="about" id="about">

            <h1 class="heading"> <span> about </span> us </h1>

            <div class="row">

                <div class="video-container">
                    <video src="images/about-vid.mp4" loop autoplay muted></video>
                    <h3>best flower sellers</h3>
                </div>

                <div class="content">
                    <h3>why choose us?</h3>
                    <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Rem cumque sit nemo pariatur corporis perspiciatis aspernatur a ullam repudiandae autem asperiores quibusdam omnis commodi alias repellat illum, unde optio temporibus.</p>
                    <p>Lorem ipsum dolor, sit amet consectetur adipisicing elit. Accusantium ea est commodi incidunt magni quia molestias perspiciatis, unde repudiandae quidem.</p>
                    <a href="#" class="btn">learn more</a>
                </div>
            </div>

        </section>

        <!-- about section ends -->

        <!-- review section starts  -->

        <section class="review" id="review">

            <h1 class="heading"> customer's <span>review</span> </h1>

            <div class="box-container">

                <div class="box">
                    <div class="stars">
                        <i class="fas fa-star"></i>
                        <i class="fas fa-star"></i>
                        <i class="fas fa-star"></i>
                        <i class="fas fa-star"></i>
                        <i class="fas fa-star"></i>
                    </div>
                    <p>Lorem ipsum dolor sit amet consectetur adipisicing elit. Corrupti asperiores laboriosam praesentium enim maiores? Ad repellat voluptates alias facere repudiandae dolor accusamus enim ut odit, aliquam nesciunt eaque nulla dignissimos.</p>
                    <div class="user">
                        <img src="images/pic-1.png" alt="">
                        <div class="user-info">
                            <h3>john deo</h3>
                            <span>happy customer</span>
                        </div>
                    </div>
                    <span class="fas fa-quote-right"></span>
                </div>

                <div class="box">
                    <div class="stars">
                        <i class="fas fa-star"></i>
                        <i class="fas fa-star"></i>
                        <i class="fas fa-star"></i>
                        <i class="fas fa-star"></i>
                        <i class="fas fa-star"></i>
                    </div>
                    <p>Lorem ipsum dolor sit amet consectetur adipisicing elit. Corrupti asperiores laboriosam praesentium enim maiores? Ad repellat voluptates alias facere repudiandae dolor accusamus enim ut odit, aliquam nesciunt eaque nulla dignissimos.</p>
                    <div class="user">
                        <img src="images/pic-2.png" alt="">
                        <div class="user-info">
                            <h3>john deo</h3>
                            <span>happy customer</span>
                        </div>
                    </div>
                    <span class="fas fa-quote-right"></span>
                </div>

                <div class="box">
                    <div class="stars">
                        <i class="fas fa-star"></i>
                        <i class="fas fa-star"></i>
                        <i class="fas fa-star"></i>
                        <i class="fas fa-star"></i>
                        <i class="fas fa-star"></i>
                    </div>
                    <p>Lorem ipsum dolor sit amet consectetur adipisicing elit. Corrupti asperiores laboriosam praesentium enim maiores? Ad repellat voluptates alias facere repudiandae dolor accusamus enim ut odit, aliquam nesciunt eaque nulla dignissimos.</p>
                    <div class="user">
                        <img src="images/pic-3.png" alt="">
                        <div class="user-info">
                            <h3>john deo</h3>
                            <span>happy customer</span>
                        </div>
                    </div>
                    <span class="fas fa-quote-right"></span>
                </div>

            </div>

        </section>

        <!-- review section ends -->

        <!-- contact section starts  -->

        <section class="contact" id="contact">

            <h1 class="heading"> <span> contact </span> us </h1>

            <div class="row">

                <form action="">
                    <input type="text" placeholder="name" class="box">
                    <input type="email" placeholder="email" class="box">
                    <input type="number" placeholder="number" class="box">
                    <textarea name="" class="box" placeholder="message" id="" cols="30" rows="10"></textarea>
                    <input type="submit" value="send message" class="btn">
                </form>

                <div class="image">
                    <img src="images/contact-img.svg" alt="">
                </div>

            </div>

        </section>

        <!-- contact section ends -->

        <!-- footer section starts  -->

        <section class="footer">

            <div class="box-container">

                <div class="box">
                    <h3>quick links</h3>
                    <a href="#">home</a>
                    <a href="#">about</a>
                    <a href="#">products</a>
                    <a href="#">review</a>
                    <a href="#">contact</a>
                </div>

                <div class="box">
                    <h3>extra links</h3>
                    <a href="#">my account</a>
                    <a href="#">my order</a>
                    <a href="#">my favorite</a>
                </div>

                <div class="box">
                    <h3>locations</h3>
                    <a href="#">india</a>
                    <a href="#">USA</a>
                    <a href="#">japan</a>
                    <a href="#">france</a>
                </div>

                <div class="box">
                    <h3>contact info</h3>
                    <a href="#">+84 898637030</a>
                    <a href="#">trinhbaokhanh1306@gmail.com</a>
                    <a href="#">ĐH-FPT</a>
                    <img src="images/payment.png" alt="">
                </div>

            </div>

            <div class="credit"> created by <span> Trịnh Bảo Khánh</span> | all rights reserved </div>

        </section>

        <!-- footer section ends -->
        <script src="http://code.jquery.com/jquery-3.4.1.js"></script>
        <script type="text/javascript">
            $(document).ready(function () {
                $('.next').click(function () {
                    $('.pagination').find('.pageNumber.active').next().
                            addClass('active');
                    $('.pagination').find('.pageNumber.active').prev().
                            removeClass('active');
                });
                $('.prev').click(function () {
                    $('.pagination').find('.pageNumber.active').prev().
                            addClass('active');
                    $('.pagination').find('.pageNumber.active').next().
                            removeClass('active');
                });
            });


            function loadMore() {
                var amount = document.getElementsByClassName("productLoad").length;
                $.ajax({
                    url: "/FlowerShop/load",
                    type: 'get',
                    data: {
                        exits: amount
                    },
                    success: function (data) {
                        var row = document.getElementById("content");
                        row.innerHTML += data;
                    },
                    error: function (xhr) {
                    }
                });
            }

            function searchByName(param) {
                var txtSearch = param.value;
                $.ajax({
                    url: "/FlowerShop/searchAjax",
                    type: 'get',
                    data: {
                        txt: txtSearch
                    },
                    success: function (data) {
                        var row = document.getElementById("content");
                        row.innerHTML = data;
                    },
                    error: function (xhr) {
                    }
                });
            }

        </script>
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
    </body>
</html>
