<%-- 
    Document   : Camnang
    Created on : May 25, 2023, 7:39:46 PM
    Author     : ASUS
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!doctype html>
<html class="no-js" lang="zxx">
    <head>
        <meta charset="utf-8">
        <meta http-equiv="x-ua-compatible" content="ie=edge">
        <title>Health | Template</title>
        <meta name="description" content="">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="shortcut icon" type="image/x-icon" href="assets/img/favicon.ico">

        <!-- CSS here -->
        <link rel="stylesheet" href="assets/css/bootstrap.min.css">
        <link rel="stylesheet" href="assets/css/owl.carousel.min.css">
        <link rel="stylesheet" href="assets/css/slicknav.css">
        <link rel="stylesheet" href="assets/css/animate.min.css">
        <link rel="stylesheet" href="assets/css/magnific-popup.css">
        <link rel="stylesheet" href="assets/css/fontawesome-all.min.css">
        <link rel="stylesheet" href="assets/css/themify-icons.css">
        <link rel="stylesheet" href="assets/css/themify-icons.css">
        <link rel="stylesheet" href="assets/css/slick.css">
        <link rel="stylesheet" href="assets/css/nice-select.css">
        <link rel="stylesheet" href="assets/css/style.css">
        <link rel="stylesheet" href="assets/css/responsive.css">
    </head>
    <body>
        <!--? Preloader Start -->
        <div id="preloader-active">
            <div class="preloader d-flex align-items-center justify-content-center">
                <div class="preloader-inner position-relative">
                    <div class="preloader-circle"></div>
                    <div class="preloader-img pere-text">
                        <img src="assets/img/logo/loder.png" alt="">
                    </div>
                </div>
            </div>
        </div>
        <!-- Preloader Start -->
        <header>
            <!--? Header Start -->
            <div class="header-area">
                <div class="main-header header-sticky">
                    <div class="container-fluid">
                        <div class="row align-items-center">
                            <!-- Logo -->
                            <div class="col-xl-2 col-lg-2 col-md-1">
                                <div class="logo">
                                    <a href="index.html"><img src="assets/img/logo/logo_5.png" alt=""></a>
                                </div>

                            </div>
                            <div class="col-xl-10 col-lg-10 col-md-10">
                                <div class="menu-main d-flex align-items-center justify-content-end">
                                    <!-- Main-menu -->
                                    <div class="main-menu f-right d-none d-lg-block">
                                        <nav> 
                                            <ul id="navigation">
                                                <li><a href="trang-chu">Trang chủ</a></li>
                                                <li><a>Thông tin</a>
                                                    <ul class="submenu">
                                                        <li><a href="TTPhongKham.jsp">Phòng Khám</a></li>
                                                        <li><a href="bac-si">Bác Sĩ</a></li>

                                                    </ul>
                                                </li>

                                                <li><a href="blog.html">Cẩm Nang</a>

                                                </li>

                                            </ul>
                                        </nav>
                                    </div>
                                    <div class="header-right-btn f-right d-none d-lg-block ml-15">
                                        <a href="#" class="btn header-btn">Đăng nhập/Đăng kí</a>
                                    </div>
                                </div>
                            </div>  
                            <!-- Mobile Menu -->
                            <div class="col-12">
                                <div class="mobile_menu d-block d-lg-none"></div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            <!-- Header End -->
        </header>
        <main>
            <!--? Slider Area Start-->
            <div class="slider-area slider-area2">
                <div class="slider-active dot-style">
                    <!-- Slider Single -->
                    <div class="single-slider  d-flex align-items-center slider-height2">
                        <div class="container">
                            <div class="row align-items-center">
                                <div class="col-xl-7 col-lg-8 col-md-10 ">
                                    <div class="hero-wrapper">
                                        <div class="hero__caption">
                                            <h1 data-animation="fadeInUp" data-delay=".3s">Cẩm Nang Y Tế</h1>
                                            <p data-animation="fadeInUp" data-delay=".6s">Kiến thức y tế - Kho báu <br> quý giá giúp bạn sống khỏe và hạnh phúc.</p>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>    
                </div>
            </div>
            <!-- Slider Area End -->
            <!--? Blog Area Start-->
            <section class="blog_area section-padding">
                <div class="container">

                    <div class="row">
                        <div class="col-lg-8 mb-5 mb-lg-0">
                            <div class="blog_left_sidebar">
                                <article class="blog_item">
                                    <c:forEach items="${showblog}" var="i">
                                        <div class="blog_item_img">
                                            <img class="card-img rounded-0" src="${i.image}" alt="">
                                            <a href="#" class="blog_item_date">
                                                <h3>${i.day}</h3>
                                                <p>${i.month}</p>
                                            </a>
                                        </div>
                                        <div class="blog_details">
                                            <a class="d-inline-block" href="chi-tiet?bid=${i.id}">
                                                <h2 class="blog-head" style="color: #2d2d2d;">${i.title}</h2>
                                            </a>
                                            <p>${i.scriptShort}</p>

                                        </div>
                                    </c:forEach>
                                </article>
                                <article class="blog_item">
                                    <c:forEach items="${timkiemBlog}" var="i">
                                        <div class="blog_item_img">
                                            <img class="card-img rounded-0" src="${i.image}" alt="">
                                            <a href="#" class="blog_item_date">
                                                <h3>${i.day}</h3>
                                                <p>${i.month}</p>
                                            </a>
                                        </div>
                                        <div class="blog_details">
                                            <a class="d-inline-block" href="chi-tiet?bid=${i.id}">
                                                <h2 class="blog-head" style="color: #2d2d2d;">${i.title}</h2>
                                            </a>
                                            <p>${i.scriptShort}</p>

                                        </div>
                                    </c:forEach>
                                </article>




                            </div>
                        </div>
                        <div class="col-lg-4">
                            <div class="blog_right_sidebar">
                                <aside class="single_sidebar_widget search_widget">
                                    <form action="searchBlog" method="post">
                                        <div class="form-group">
                                            <div class="input-group mb-3">
                                                <input type="text" class="form-control" placeholder='Search Keyword'
                                                       onfocus="this.placeholder = ''"
                                                       onblur="this.placeholder = 'Search Keyword'" name="txt">
                                                <div class="input-group-append">
                                                    <button class="btns" type="button"><i class="ti-search"></i></button>
                                                </div>
                                            </div>
                                        </div>
                                        <button class="button rounded-0 primary-bg text-white w-100 btn_1 boxed-btn"
                                                type="submit">Search</button>
                                    </form>
                                </aside>



                            </div>
                        </div>
                    </div>
                </div>
            </section>

            

                            <!-- Blog Area End -->
                            <!--? About Law Start-->
                            <section class="about-low-area mt-60">
                                <div class="container">
                                    <div class="about-cap-wrapper">
                                        <div class="row">
                                            <div class="col-xl-5  col-lg-6 col-md-10 offset-xl-1">
                                                <div class="about-caption mb-50">
                                                    <!-- Section Tittle -->
                                                    <div class="section-tittle mb-35">
                                                        <h2>100% satisfaction guaranteed.</h2>
                                                    </div>
                                                    <p>Almost before we knew it, we had left the ground</p>
                                                    <a href="about.html" class="border-btn">Make an Appointment</a>
                                                </div>
                                            </div>
                                            <div class="col-lg-6 col-md-12">
                                                <!-- about-img -->
                                                <div class="about-img">
                                                    <div class="about-font-img">
                                                        <img src="assets/img/gallery/about2.png" alt="">
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </section>
                            <!-- About Law End-->
                            </main>
                            <footer>
                                <div class="footer-wrappr section-bg3" data-background="assets/img/gallery/footer-bg.png">
                                    <div class="footer-area footer-padding ">
                                        <div class="container">
                                            <div class="row justify-content-between">
                                                <div class="col-xl-8 col-lg-8 col-md-6 col-sm-12">
                                                    <div class="single-footer-caption mb-50">
                                                        <!-- logo -->
                                                        <div class="footer-logo mb-25">
                                                            <a href="index.html"><img src="assets/img/logo/logo2_footer.png" alt=""></a>
                                                        </div>
                                                        <d iv class="header-area">
                                                            <div class="main-header main-header2">
                                                                <div class="menu-main d-flex align-items-center justify-content-start">
                                                                    <!-- Main-menu -->
                                                                    <div class="main-menu main-menu2">
                                                                        <nav> 
                                                                            <ul>
                                                                                <li><a href="index.html">Home</a></li>
                                                                                <li><a href="about.html">About</a></li>
                                                                                <li><a href="services.html">Services</a></li>
                                                                                <li><a href="blog.html">Blog</a></li>
                                                                                <li><a href="contact.html">Contact</a></li>
                                                                            </ul>
                                                                        </nav>
                                                                    </div>
                                                                </div>  
                                                            </div>
                                                        </d>
                                                        <!-- social -->
                                                        <div class="footer-social mt-50">
                                                            <a href="#"><i class="fab fa-twitter"></i></a>
                                                            <a href="https://bit.ly/sai4ull"><i class="fab fa-facebook-f"></i></a>
                                                            <a href="#"><i class="fab fa-pinterest-p"></i></a>
                                                        </div>
                                                    </div>
                                                </div>
                                                <div class="col-xl-4 col-lg-4 col-md-6 col-sm-12">
                                                    <div class="single-footer-caption">
                                                        <div class="footer-tittle mb-50">
                                                            <h4>Subscribe newsletter</h4>
                                                        </div>
                                                        <!-- Form -->
                                                        <div class="footer-form">
                                                            <div id="mc_embed_signup">
                                                                <form target="_blank" action="https://spondonit.us12.list-manage.com/subscribe/post?u=1462626880ade1ac87bd9c93a&amp;id=92a4423d01" method="get" class="subscribe_form relative mail_part" novalidate="true">
                                                                    <input type="email" name="EMAIL" id="newsletter-form-email" placeholder=" Email Address " class="placeholder hide-on-focus" onfocus="this.placeholder = ''" onblur="this.placeholder = 'Enter your email'">
                                                                    <div class="form-icon">
                                                                        <button type="submit" name="submit" id="newsletter-submit" class="email_icon newsletter-submit button-contactForm">
                                                                            Subscribe
                                                                        </button>
                                                                    </div>
                                                                    <div class="mt-10 info"></div>
                                                                </form>
                                                            </div>
                                                        </div>
                                                        <div class="footer-tittle">
                                                            <div class="footer-pera">
                                                                <p>Praesent porttitor, nulla vitae posuere iaculis, arcu nisl dignissim dolor, a pretium misem ut ipsum.</p>
                                                            </div>
                                                        </div>
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                    <!-- footer-bottom area -->
                                    <div class="footer-bottom-area">
                                        <div class="container">
                                            <div class="footer-border">
                                                <div class="row">
                                                    <div class="col-xl-10 ">
                                                        <div class="footer-copy-right">
                                                            <p><!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. -->
                                                                Copyright &copy;<script>document.write(new Date().getFullYear());</script> All rights reserved | This template is made with <i class="fa fa-heart" aria-hidden="true"></i> by <a href="https://colorlib.com" target="_blank">Colorlib</a>
                                                                <!-- Link back to Colorlib can't be removed. Template is licensed under CC BY 3.0. --></p>
                                                        </div>
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </footer>
                            <!-- Scroll Up -->
                            <div id="back-top" >
                                <a title="Go to Top" href="#"> <i class="fas fa-level-up-alt"></i></a>
                            </div>

                            <!-- JS here -->

                            <script src="./assets/js/vendor/modernizr-3.5.0.min.js"></script>
                            <!-- Jquery, Popper, Bootstrap -->
                            <script src="./assets/js/vendor/jquery-1.12.4.min.js"></script>
                            <script src="./assets/js/popper.min.js"></script>
                            <script src="./assets/js/bootstrap.min.js"></script>
                            <!-- Jquery Mobile Menu -->
                            <script src="./assets/js/jquery.slicknav.min.js"></script>

                            <!-- Jquery Slick , Owl-Carousel Plugins -->
                            <script src="./assets/js/owl.carousel.min.js"></script>
                            <script src="./assets/js/slick.min.js"></script>
                            <!-- One Page, Animated-HeadLin -->
                            <script src="./assets/js/wow.min.js"></script>
                            <script src="./assets/js/animated.headline.js"></script>

                            <!-- Nice-select, sticky -->
                            <script src="./assets/js/jquery.nice-select.min.js"></script>
                            <script src="./assets/js/jquery.sticky.js"></script>
                            <script src="./assets/js/jquery.magnific-popup.js"></script>

                            <!-- contact js -->
                            <script src="./assets/js/contact.js"></script>
                            <script src="./assets/js/jquery.form.js"></script>
                            <script src="./assets/js/jquery.validate.min.js"></script>
                            <script src="./assets/js/mail-script.js"></script>
                            <script src="./assets/js/jquery.ajaxchimp.min.js"></script>

                            <!-- Jquery Plugins, main Jquery -->	
                            <script src="./assets/js/plugins.js"></script>
                            <script src="./assets/js/main.js"></script>

                            </body>
                            </html>
