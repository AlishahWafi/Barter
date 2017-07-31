<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="Header.jsp" %>
		<div id="body">
            <div class="container">
                <div class="text-center">
                    <h1>Ask us anything.</h1>
                    <p>Send us an email</p>
                </div>
                <div class="row">
                    <div class="col-md-offset-4 col-md-4">
                        <form method="POST">
	                        <div class="hr"></div>
                            <div class="form-group">
                                <label class="">Full Name</label>
                                <input class="form-control" name="Full Name" type="text" />
                            </div>
                            <div class="form-group">
                                <label class="">Email</label>
                                <input class="form-control" name="email" type="email" />
                            </div>
                            <div class="form-group">
                                <label class="">Mobile</label>
                                <input class="form-control" name="mobile" type="tel" />
                            </div>
                            <div class="form-group">
                                <label class="">Message</label>
                                <textarea class="form-control" name="message" rows="6"></textarea>
                            </div>
                            <div class="form-group">
                                <label class="">Location</label>
                                <select class="form-control">
                                	<option value="Pakistan">Pakistan</option>
                                </select>
                            </div>
							<div class="hr"></div>
							<div>
							    <input class="btn btn-default btn-success" name="btn_send" type="submit" value="Send" />
                	        </div>
                        </form>
                    </div>
                </div>
            </div>
        </div>
<%@ include file="Footer.jsp" %>