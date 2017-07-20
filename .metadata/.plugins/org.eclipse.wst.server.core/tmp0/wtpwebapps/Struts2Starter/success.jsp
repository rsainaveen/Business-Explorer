<%@page import="org.json.*"%>
<%@page import="java.util.*"%>
<%@page import="org.json.*"%>
<%@page import="org.apache.struts2.ServletActionContext"%>
<%@page import="javax.servlet.*"%>
<%@page import="javax.servlet.http.HttpServletRequest"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" lang="en">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
    <meta name="description" content="">
    <meta name="author" content="">

    <link rel="icon" href="http://getbootstrap.com/favicon.ico">

    <title>Local Guide using Yelp</title>

    <!-- Bootstrap core CSS -->
    <link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css" rel="stylesheet">

    <!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
    <link href="http://getbootstrap.com/assets/css/ie10-viewport-bug-workaround.css" rel="stylesheet">

    <!-- Custom styles for this template -->
    <link href="http://getbootstrap.com/examples/jumbotron-narrow/jumbotron-narrow.css" rel="stylesheet">

    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
      <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->

    <style type="text/css">
      a.list-group-item {
          height:auto;
          min-height:220px;
      }
      a.list-group-item.active small {
          color:#fff;
      }
      .stars {
          margin:20px auto 1px;    
      }
    </style>
  </head>

  <body >

    <div class="container">
      <div class="header clearfix">
        <nav>
          <ul class="nav nav-pills pull-right">
            <li role="presentation" class="active"><a href="/Struts2Starter/">Home</a></li>
            <li role="presentation"><a href="advancedtrends.jsp">Advanced Trends</a></li>
            <li role="presentation"><a href="#">Number of tuples</a></li>
          </ul>
        </nav>
        <h3 class="text-muted"><a href ="/Struts2Starter/">Locality Guide</a></h3>

        <div class="row" style="margin-top: 20px;">
          <div class="col-lg-12">
            <form class="text-center form-inline" action="getTutorial">  
                <div class="form-group">
                  <input type="text" placeholder=" FIND Bars,Restaurants,Hotels" class="form-control" id="searchRestaurant" name="place">
                </div>
                <div class="form-group">
                  <input type="text" class="form-control" id="searchLocation" placeholder=" CITY " name="city">
                </div>
              <input style="padding: 10px 15px 10px 15px;background-color: #cb202d;border-radius: 5px;color: white; font-weight: bold;border:2px solid #cb202d" type="submit" value="Search">       
            </form>
          </div>
        </div>

      </div><!-- end of header -->

      <% int num = (int)request.getAttribute("num");
String city = (String) request.getAttribute("city");
String plac = (String) request.getAttribute("place");%>

    <div class="row marketing">
      <h4>We have found <%=num %> results for <%=plac%> in the city <%=city %></h4>
        <div class="col-lg-12">
          <div class="list-group">
            <%JSONArray array = (JSONArray)request.getAttribute("array");
             HttpServletRequest request1 = ServletActionContext.getRequest();
             for(int i=0;i<array.length();i++)
             {
              JSONObject temp = array.getJSONObject(i);
              String name = temp.get("name").toString();
              String address = temp.get("address").toString();
              String place = temp.get("place").toString();
              String rating = temp.get("rating").toString();
              String id = temp.get("id").toString();
                  %>
                  <a href="/Struts2Starter/getInfo?id=<%=id%>" class="list-group-item" style="min-height:100px;">
                      <div class="media col-md-3">
                          <figure class="pull-left">
                              <img class="media-object img-rounded img-responsive" src="images/hotel.jpg" alt="placehold.it/350x250">
                          </figure>
                      </div>
                      <div class="col-md-6">
                          <h4 class="list-group-item-heading">  <%=name%> </h4>
                          <p class="list-group-item-text"> <%=address %> </p>
                      </div>
                      <div class="col-md-3 text-center">

                        <%if (Double.valueOf(rating)>=3.5){%><span style="float: right;background-color: #29a329;padding: 10px; border-radius:3px; color:white;">
                         <b><%=rating%></b></span>
                         <%}else if(Double.valueOf(rating)>=2.0){%>
                         <span style="float: right;background-color: #ffa64d; padding: 10px; border-radius:3px; color:white;">
                         <b><%=rating%></b></span>
                         <%}else{%>
                         <span style="float: right;background-color: #ff3300;padding: 10px; border-radius:3px; color:white;">
                         <b><%=rating%></b></span><%} %>
                      </div>
                  </a>
            <% 
            }
            %>
          </div>
        </div>
      </div>

      <footer class="footer">
        <p>© 2015 Company, Inc.</p>
      </footer>

    </div> <!-- /container -->

	<script
  src="https://code.jquery.com/jquery-2.2.4.min.js"
  integrity="sha256-BbhdlvQf/xTY9gja0Dq3HiwQF8LaCRTXxZKRutelT44="
  crossorigin="anonymous"></script>
    <!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
    <script src="http://getbootstrap.com/assets/js/ie10-viewport-bug-workaround.js"></script>
  </body>
</html>