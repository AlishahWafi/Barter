<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
        <title>Barter - Auction your products</title>

        <!-- Bootstrap -->
        <link href="libs/bootstrap/3.3.6/css/bootstrap.min.css" rel="stylesheet">
        <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
        <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
        <!--[if lt IE 9]>
            <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
            <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
        <![endif]-->

        <!-- Font-Awesome -->
        <link href="libs/font-awesome/4.5.0/css/font-awesome.min.css" rel="stylesheet">

        <!-- LESS -->
        <link rel="stylesheet/less" type="text/css" href="less/styles.less" />

        <!-- JS -->
        <script src="libs/less/2.6.0/less.min.js" type="text/javascript"></script>
    </head>
    <body>
        <nav class="navbar navbar-default topbar">
            <div class="container">
                <div class="navbar-header">
                    <button type="button" class ="navbar-toggle collapsed" data-toggle="collapse" data-target="#topbar" aria-expanded="false" aria-controls="navbar">
                        <span class="sr-only">Toggle navigation</span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                    </button>
                    <a class="navbar-brand" href="#">Barter</a>
                </div>
                <div id="topbar" class="navbar-collapse collapse" aria-expanded="false">
                    <ul class="nav navbar-nav navbar-right">
                        <li class="hide"><a href="#">Login</a></li>
                        <li class="hide"><a href="#">Register</a></li>
                    	<li>
                            <a class="dropdown-toggle" data-toggle="dropdown" role="button">@username <span class="caret"></span></a>
                            <ul class="dropdown-menu">
                                <li><a href="#">Profile</a></li>
                                <li><a href="#">Settings</a></li>
                            </ul>
                        </li>
                        <li class="help-tab">
                            <a class="dropdown-toggle" data-toggle="dropdown" role="button">Help <span class="caret"></span></a>
                            <ul class="dropdown-menu">
                                <li><a href="#">FAQs</a></li>
                                <li><a href="#">Contact</a></li>
                            </ul>
                        </li>
                    </ul>
                    <div class="pull-right">
						<a href="#" class="btn btn-default navbar-btn">Auction Item</a> &nbsp;
                    </div>
                </div>
            </div>
        </nav>