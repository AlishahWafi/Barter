<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="Header.jsp" %>
        <nav class="navbar navbar-default catbar">
            <div class="container">
                <div class="navbar-header">
                    <button type="button" class ="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
                        <span class="sr-only">Toggle navigation</span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                    </button>
                    <a class="navbar-brand hide" href="#">Barter</a>
                </div>
                <div id="navbar" class="navbar-collapse collapse" aria-expanded="false">
                    <ul class="nav navbar-nav navbar-right">
                        <li>
                            <a class="dropdown-toggle" data-toggle="dropdown" role="button">Fashion <span class="caret"></span></a>
                            <ul class="dropdown-menu">
                                <li><a href="#">Men</a></li>
                                <li><a href="#">Women</a></li>
                                <li><a href="#">Kids</a></li>
                            </ul>
                        </li>
                        <li>
                            <a class="dropdown-toggle" data-toggle="dropdown" role="button">Electronics <span class="caret"></span></a>
                            <ul class="dropdown-menu">
                                <li><a href="#">Cell Phones</a></li>
                                <li><a href="#">Tablets</a></li>
                                <li><a href="#">Laptops</a></li>
                                <li><a href="#">Desktops</a></li>
                                <li><a href="#">Cameras</a></li>
                            </ul>
                        </li>
                        <li>
                            <a class="dropdown-toggle" data-toggle="dropdown" role="button">Collectibles & Art <span class="caret"></span></a>
                            <ul class="dropdown-menu">
                                <li><a href="#">Antiques</a></li>
                                <li><a href="#">Collectibles</a></li>
                            </ul>
                        </li>
                        <li>
                            <a class="dropdown-toggle" data-toggle="dropdown" role="button">Home & Decor <span class="caret"></span></a>
                            <ul class="dropdown-menu">
                                <li><a href="#">Furniture</a></li>
                                <li><a href="#">Tools</a></li>
                            </ul>
                        </li>
                        <li>
                            <a class="dropdown-toggle" data-toggle="dropdown" role="button">Vehicle <span class="caret"></span></a>
                            <ul class="dropdown-menu">
                                <li><a href="#">Car</a></li>
                                <li><a href="#">Motorbike</a></li>
                                <li><a href="#">Bicycle</a></li>
                            </ul>
                        </li>
                    </ul>
                    <form id="search" class="navbar-form navbar-left" role="search">
                        <div class="form-group">
                            <select class="form-control hide">
                                <option value="0">All</option>
                                <option value="1">Fashion</option>
                                <option value="2">Electronics</option>
                                <option value="3">Furniture</option>
                                <option value="4">Gadgets</option>
                                <option value="5">Garments</option>
                                <option value="6">Jwellery</option>
                                <option value="7">Vehicle</option>
                            </select>
                            <div class="input-group">
                                <div class="input-group-addon"><i class="fa fa-search"></i></div>
                                <input id="search-input" class="form-control" type="text" placeholder="Search" />
                            </div>
                            <input class="btn btn-default hide" type="submit" value="Search" />
                        </div>
                    </form>
                </div>
            </div>
        </nav>
        <div id="body" style="padding-top: 0;">
            <div class="container">
                <div id="carousel-top" class="carousel slide" data-ride="carousel">
                    <!-- Indicators -->
                    <ol class="carousel-indicators hide">
                        <li data-target="#carousel-top" data-slide-to="0" class="active"></li>
                        <li data-target="#carousel-top" data-slide-to="1"></li>
                        <li data-target="#carousel-top" data-slide-to="2"></li>
                    </ol>

                    <!-- Wrapper for slides -->
                    <div class="carousel-inner" role="listbox">
                        <div class="item active">
                            <img src="images/slider_default-1.jpg">
                            <div class="carousel-caption">
                                <h3>EYEWEAR</h3>
                                <p>
                                    Make Your Style Statement Unique and Stand Out From the Crowd This Upcoming Summer - Check our Curated Eyewear Collection.
                                    <br /><br />
                                    <a class="btn btn-default btn-border-only" href="#">Learn More</a>
                                </p>
                            </div>
                        </div>
                        <div class="item">
                            <img src="images/camping-1.jpg">
                            <div class="carousel-caption">
                                <h3>CAMPING GADGETS</h3>
                                <p>
                                    Next Time You Head For A Trip in the Woods, Don’t Forget to Pack Some of These Camping Gadgets To Experience a Dream Adventure.
                                    <br /><br />
                                    <a class="btn btn-default btn-border-only" href="#">Learn More</a>
                                </p>
                            </div>
                        </div>
                        <div class="item">
                            <img src="images/edlee_50-1.jpg">
                            <div class="carousel-caption">
                                <h3>EDLEE SUNGLASSES</h3>
                                <p>
                                    Feel what it’s like to live the Southern California beach culture in style no matter where you are with edlee Design Sunglasses.
                                    <br /><br />
                                    <a class="btn btn-default btn-border-only" href="#">Learn More</a>
                                </p>
                            </div>
                        </div>
                    </div>

                    <!-- Controls -->
                    <a class="left carousel-control" href="#carousel-top" role="button" data-slide="prev">
                        <span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
                        <span class="sr-only">Previous</span>
                    </a>
                    <a class="right carousel-control" href="#carousel-top" role="button" data-slide="next">
                        <span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
                        <span class="sr-only">Next</span>
                    </a>
                </div>

                <div id="featured-products" class="products">
                    <h5 class="product-header">Feature Products</h5>
                    <div class="hr"></div>
                    <div class="row">
                        <div class="col-sm-3 product">
                            <div class="inner">
                                <div class="img-wrapper">
                                    <img src="images/Zero-Wearables-Customize-Your-HAT-01-420x250.jpg" />
                                </div>
                                <div class="info">
                                    <h5><a href="#">Revolutionary Hat for 21st Century!</a></h5>
                                    <span class="price">$100</span>
                                </div>
                                <a class="add-to-cart" href="#"><i class="fa fa-cart-plus"></i> Add to Cart</a>
                            </div>
                        </div>
                        <div class="col-sm-3 product">
                            <div class="inner">
                                <div class="img-wrapper">
                                    <img src="images/Cufftore-06-420x250.jpeg" />
                                </div>
                                <div class="info">
                                    <h5><a href="#">Cufftore – First-Ever Interchangeable Suit Buttons</a></h5>
                                    <span class="price">$19</span>
                                </div>
                                <a class="add-to-cart" href="#"><i class="fa fa-cart-plus"></i> Add to Cart</a>
                            </div>
                        </div>
                        <div class="col-sm-3 product">
                            <div class="inner">
                                <div class="img-wrapper">
                                    <img src="images/Camera-Lens-Coffee-Mug-New-01-420x250.jpg" />
                                </div>
                                <div class="info">
                                    <h5><a href="#">Camera Lens Coffee Mug</a></h5>
                                    <span class="price">$16.99</span>
                                </div>
                                <a class="add-to-cart" href="#"><i class="fa fa-cart-plus"></i> Add to Cart</a>
                            </div>
                        </div>
                        <div class="col-sm-3 product">
                            <div class="inner">
                                <div class="img-wrapper">
                                    <img src="images/iPhone-SE-01-420x250.jpeg" />
                                </div>
                                <div class="info">
                                    <h5><a href="#">iPhone SE</a></h5>
                                    <span class="price">$399</span>
                                </div>
                                <a class="add-to-cart" href="#"><i class="fa fa-cart-plus"></i> Add to Cart</a>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
<%@ include file="Footer.jsp" %>