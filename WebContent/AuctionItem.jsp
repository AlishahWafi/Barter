<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="Header.jsp" %>
		<div id="body">
            <div class="container">
                <div class="text-center">
                    <h1>Auction anything<br />from anywhere.</h1>
                    <p>Add new item to auction</p>
                </div>
                <div class="row">
                    <div class="col-md-offset-4 col-md-4">
                        <form method="POST">
	                        <div class="hr"></div>
	                        <div class="form-group">
                                <label class="">Title/Name</label>
                                <input class="form-control" name="title" type="text" />
                            </div>
                            <div class="form-group">
                                <label class="">Category</label>
                                <select name="sub_category" class="form-control">
                                	<optgroup label="Top Category">
                                		<option>Sub-category</option>
                                	</optgroup>
                                </select>
                            </div>
                            <div class="form-group">
                                <label class="">Price</label>
                                <input class="form-control" name="price" type="number" />
                            </div>
                            <div class="form-group">
                                <label class="">Photos</label>
								<input name="file" type="file" />
                            </div>
                            <div class="form-group">
                                <label class="">Description</label>
                                <textarea class="form-control" name="description" rows="6"></textarea>
                            </div>
                            <div class="hr"></div>
							<div>
							    <input class="btn btn-default btn-success" name="btn_add" type="submit" value="Add Item" />
                	        </div>
                        </form>
                    </div>
                </div>
            </div>
        </div>
<%@ include file="Footer.jsp" %>