<%-- 
    Document   : login
    Created on : May 18, 2024, 2:59:55 PM
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="en">

    <!-- Mirrored from kofejob.dreamstechnologies.com/html/template/login.html by HTTrack Website Copier/3.x [XR&CO'2014], Wed, 15 May 2024 10:35:03 GMT -->
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, user-scalable=0">
        <title>KofeJob</title>

        <link rel="shortcut icon" href="assets/img/favicon.png" type="image/x-icon">

        <link rel="stylesheet" href="assets/css/bootstrap.min.css">

        <link rel="stylesheet" href="assets/plugins/feather/feather.css">

        <link rel="stylesheet" href="assets/plugins/fontawesome/css/fontawesome.min.css">
        <link rel="stylesheet" href="assets/plugins/fontawesome/css/all.min.css">

        <link rel="stylesheet" href="assets/css/style.css">
    </head>
    <body class="account-page">

        <div class="main-wrapper">
            <header class="header">
                <div class="container">                                                                   
                    <a href="home" class="navbar-brand logo">
                        <img style="margin: 20px;" src="assets/img/logo.svg" class="img-fluid" alt="Logo">
                    </a>                                                               
                </div>
            </header>

            <div class="login-wrapper">
                <div class="content">

                    <div class="account-content">
                        <div class="align-items-center justify-content-center">
                            <div class="login-right">
                                <div class="login-header text-center">
                                    <a href="home"><img src="assets/img/logo.svg" alt="logo" class="img-fluid"></a>
                                    <h3>Welcome! Nice to see you again</h3>
                                </div>
                                <form action="login" method="post">
                                    <div class="input-block">
                                        <label class="focus-label">Username <span class="label-star"> *</span></label>
                                        <input required name="user" type="text" class="form-control floating" value="${username}" >
                                    </div>
                                    <div class="input-block">
                                        <label class="focus-label">Password <span class="label-star"> *</span></label>
                                        <div class="position-relative">
                                            <input required name="pass" type="password" class="form-control floating pass-input" value="${password}">
                                            <div class="password-icon ">
                                                <span class="fas toggle-password fa-eye-slash"></span>
                                            </div>
                                        </div>
                                    </div>  
                                            <c:if test = "${username != null }" >
                                            <p style="text-align: center;" class="text-danger">${loginFaild}</p>
                                            </c:if>
                                    <button class="btn btn-primary w-100 btn-lg login-btn d-flex align-items-center justify-content-center" type="submit">Login Now<i class="feather-arrow-right ms-2"></i></button>
                                    <div class="login-or">
                                        <p><span>OR</span></p>
                                    </div>

                                    <div class="row">
                                        <div class="col-sm-8 dont-have d-flex  align-items-center">New to Kofejob <a href="register.html" class="ms-2">Signup?</a></div>
                                        <div class="col-sm-4 text-sm-end">
                                            <a class="forgot-link" href="forgot-password.html">Lost Password?</a>
                                        </div>
                                    </div>
                                </form>
                            </div>
                        </div>
                    </div>

                </div>
            </div>


            <footer class="footer">
                <div class="footer-top">
                    <div class="container">
                        <div class="row">
                            <div class="col-md-3">
                                <h2 class="footer-title">Office Address</h2>
                                <div class="footer-address">
                                    <div class="off-address">
                                        <p class="mb-2">New York, USA (HQ)</p>
                                        <address class="mb-0">750 Sing Sing Rd, Horseheads, NY, 14845</address>
                                        <p>Call: <a href="javascript:void(0);"><u>469-537-2410</u> (Toll-free)</a> </p>
                                    </div>
                                    <div class="off-address">
                                        <p class="mb-2">Sydney, Australia </p>
                                        <address class="mb-0">24 Farrar Parade COOROW WA 6515</address>
                                        <p>Call: <a href="javascript:void(0);"><u>(08) 9064 9807</u> (Toll-free)</a> </p>
                                    </div>
                                </div>
                            </div>
                            <div class="col-lg-2">
                                <div class="footer-widget footer-menu">
                                    <h2 class="footer-title">Useful Links</h2>
                                    <ul>
                                        <li><a href="about.html">About Us</a></li>
                                        <li><a href="blog-list.html">Blog</a></li>
                                        <li><a href="login.html">Login</a></li>
                                        <li><a href="register.html">Register</a></li>
                                        <li><a href="forgot-password.html">Forgot Password</a></li>
                                    </ul>
                                </div>
                            </div>
                            <div class="col-lg-2">
                                <div class="footer-widget footer-menu">
                                    <h2 class="footer-title">Help & Support</h2>
                                    <ul>
                                        <li><a href="chats.html">Chat</a></li>
                                        <li><a href="faq.html">Faq</a></li>
                                        <li><a href="review.html">Reviews</a></li>
                                        <li><a href="privacy-policy.html">Privacy Policy</a></li>
                                        <li><a href="term-condition.html">Terms of use</a></li>
                                    </ul>
                                </div>
                            </div>
                            <div class="col-lg-2">
                                <div class="footer-widget footer-menu">
                                    <h2 class="footer-title">Other Links</h2>
                                    <ul>
                                        <li><a href="freelancer-dashboard.html">Freelancers</a></li>
                                        <li><a href="freelancer-portfolio.html">Freelancer Details</a></li>
                                        <li><a href="project.html">Project</a></li>
                                        <li><a href="project-details.html">Project Details</a></li>
                                        <li><a href="post-project.html">Post Project</a></li>
                                    </ul>
                                </div>
                            </div>
                            <div class="col-lg-3">
                                <div class="footer-widget footer-menu">
                                    <h2 class="footer-title">Mobile Application</h2>
                                    <p>Download our App and get the latest Breaking News Alerts and latest headlines and daily articles near you.</p>
                                    <div class="row g-2">
                                        <div class="col">
                                            <a href="javascript:void(0);"><img class="img-fluid" src="assets/img/app-store.svg" alt="app-store"></a>
                                        </div>
                                        <div class="col">
                                            <a href="javascript:void(0);"><img class="img-fluid" src="assets/img/google-play.svg" alt="google-play"></a>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>


                <div class="footer-bottom">
                    <div class="container">

                        <div class="copyright">
                            <div class="row">
                                <div class="col-md-6 col-lg-6">
                                    <div class="copyright-text">
                                        <p class="mb-0">&copy; 2021 All Rights Reserved</p>
                                    </div>
                                </div>
                                <div class="col-md-6 col-lg-6 right-text">
                                    <div class="social-icon">
                                        <ul>
                                            <li><a href="javascript:void(0);" class="icon" target="_blank"><i class="fab fa-instagram"></i> </a></li>
                                            <li><a href="javascript:void(0);" class="icon" target="_blank"><i class="fab fa-linkedin-in"></i> </a></li>
                                            <li><a href="javascript:void(0);" class="icon" target="_blank"><i class="fab fa-twitter"></i> </a></li>
                                        </ul>
                                    </div>
                                </div>
                            </div>
                        </div>

                    </div>
                </div>

            </footer>

        </div>


        <script src="assets/js/jquery-3.7.1.min.js" type="4bfb9e18a84f35f1be6270cc-text/javascript"></script>

        <script src="assets/js/bootstrap.bundle.min.js" type="4bfb9e18a84f35f1be6270cc-text/javascript"></script>

        <script src="assets/js/slick.js" type="4bfb9e18a84f35f1be6270cc-text/javascript"></script>

        <script src="assets/js/script.js" type="4bfb9e18a84f35f1be6270cc-text/javascript"></script>
        <script src="../cdn-cgi/scripts/7d0fa10a/cloudflare-static/rocket-loader.min.js" data-cf-settings="4bfb9e18a84f35f1be6270cc-|49" defer></script></body>

    <!-- Mirrored from kofejob.dreamstechnologies.com/html/template/login.html by HTTrack Website Copier/3.x [XR&CO'2014], Wed, 15 May 2024 10:35:08 GMT -->
</html>
