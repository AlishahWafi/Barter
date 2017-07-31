<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="Header.jsp" %>
		<div id="body">
            <div class="container">
                <div class="text-center">
                    <h1>Forgot Password? No worries.</h1>
                    <p>Enter your email to continue</p>
                </div>
                <div class="row">
                    <div class="col-md-offset-4 col-md-4">
                        <div class="hr"></div>
                        <form method="POST">
                            <div class="form-group">
                                <label class="">Email</label>
                                <input class="form-control" name="email" type="email" placeholder="Email" />
                            </div>
                            <div>
	                            <input class="btn btn-default btn-success" name="btn_recover" type="submit" value="Recover" />
	                        </div>
						</form>
                    </div>
                </div>
            </div>
        </div>
<%@ include file="Footer.jsp" %>