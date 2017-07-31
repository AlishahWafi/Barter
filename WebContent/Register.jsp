<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="Header.jsp" %>
		<div id="body">
            <div class="container">
                <div class="text-center">
                    <h1>One account for everything.</h1>
                    <p>Register to continue to Barter</p>
                </div>
                <div class="row">
                    <div class="col-md-offset-4 col-md-4">
                        <form method="POST">
	                        <div class="hr"></div>
	                        <div class="form-group">
                                <label class="">Profile Picture</label>
                                <div class="row">
                                	<div class="col-sm-4">
                                		<img class="img-responsive" src="images/no-avatar-ff.png" />
                                	</div>
                                	<div class="col-sm-8">
		                                <input name="Full Name" type="file" />
                                	</div>
                                </div>
                            </div>
                            <div class="form-group">
                                <label class="">Full Name</label>
                                <input class="form-control" name="Full Name" type="text" />
                            </div>
                            <div class="form-group">
                                <label class="">Username</label>
                                <input class="form-control" name="username" type="text" />
                            </div>
                            <div class="form-group">
                                <label class="">Password</label>
                                <input class="form-control" name="password" type="password" />
                            </div>
                            <div class="form-group">
                                <label class="">Confirm Password</label>
                                <input class="form-control" name="password" type="password" />
                            </div>
                            <div class="form-group">
                                <label class="">Date of Birth</label>
                                <table class="table table-bordered">
                                	<tr>
                                		<td>
                                			<label class="">Day</label>
	                                		<select class="form-control">
												<% for(int i = 1; i <= 31; ++i) { %>
													<option value="<%= i %>"><%= i %></option>
												<% } %>
											</select>
                                		</td>
                                		<td>
                                			<label class="">Month</label>
	                                		<select class="form-control">
												<% for(int i = 1; i <= 12; ++i) { %>
													<option value="<%= i %>"><%= i %></option>
												<% } %>
											</select>
                                		</td>
                                		<td>
											<label class="">Year</label>
	                                		<select class="form-control">
												<% for(int i = 2016; i >= 1900; --i) { %>
													<option value="<%= i %>"><%= i %></option>
												<% } %>
											</select>
                                		</td>
                                	</tr>
                                </table>
                            </div>
                            <div class="form-group">
                                <label class="">Gender</label>
                                <select class="form-control">
                                	<option value="male">Male</option>
                                	<option value="female">Female</option>
                                </select>
                            </div>
                            <div class="form-group">
                                <label class="">Email</label>
                                <input class="form-control" name="email" type="email" />
                            </div>
                            <div class="form-group">
                                <label class="">Card Number</label>
                                <input class="form-control" name="card_number" type="number" />
                            </div>
                            <div class="form-group">
                                <label class="">Mobile</label>
                                <input class="form-control" name="mobile" type="tel" />
                            </div>
                            <div class="form-group">
                                <label class="">Phone</label>
                                <input class="form-control" name="phone" type="tel" />
                            </div>
                            <div class="form-group">
                                <label class="">Address</label>
                                <textarea class="form-control" name="address" rows="6"></textarea>
                            </div>
                            <div class="form-group">
                                <label class="">Location</label>
                                <select class="form-control">
                                	<option value="Pakistan">Pakistan</option>
                                </select>
                            </div>
							<div class="hr"></div>
	                        <div class="form-group">
								<div class="checkbox">
									<label>
										<input type="checkbox"> I agree to the Barter Terms of Service and Privacy Policy.
									</label>
								</div>
							</div>
							<div>
							    <input class="btn btn-default btn-success" name="btn_register" type="submit" value="Register" />
                	        </div>
                        </form>
                    </div>
                </div>
            </div>
        </div>
<%@ include file="Footer.jsp" %>