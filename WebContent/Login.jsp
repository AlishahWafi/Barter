<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="Header.jsp" %>
		<div id="body">
            <div class="container">
                <div class="text-center">
                    <h1>One account for everything.</h1>
                    <p>Sign in to continue to Barter</p>
                </div>
                <div class="row">
                    <div class="col-md-offset-4 col-md-4">
                        <div class="hr"></div>
                        <form method="POST">
                            <div class="form-group">
                                <label class="">Email</label>
                                <input class="form-control" name="email" type="email" placeholder="Email" />
                            </div>
                            <div class="form-group">
                                <label class="">Password</label>
                                <input class="form-control" name="password" type="password" placeholder="Password" />
                            </div>
	                        <div class="hr"></div>
	                        <div>
	                            <input class="btn btn-default btn-success" name="btn_login" type="submit" value="Login" />
	                            <a class="btn btn-default btn-link" href="#">Forgot password?</a>
	                        </div>
						</form>
                    </div>
                </div>
            </div>
        </div>
<%@ include file="Footer.jsp" %>