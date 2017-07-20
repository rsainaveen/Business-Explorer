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

    <div class="row marketing fix">
    <h4>Reviews</h4>
        <div class="col-lg-12">
          


          <%JSONArray array = (JSONArray)request.getAttribute("jsonarray");
          if(array.length()==0){
            
              %>
              <div style="padding:40px;">
              <div style="text-decoration: none; font-family: Arial Black;font-size: 18px;font-weight: bold;">
              Unfortunately, there are no reviews found.
              </div>
              
          <%    
          }
          %>
          <%
           for(int i=0;i<array.length();i++)
           {
            JSONObject temp = array.getJSONObject(i);
            String name=temp.get("name").toString();
            String use=temp.get("useful").toString();
            String cool=temp.get("cool").toString();
            String funny=temp.get("funny").toString();
            String rating=temp.get("stars").toString();
            String date=temp.get("date").toString();
            String text=temp.get("text").toString();
            String user_id=temp.get("user_id").toString();
            
            %>
            
          <div class="well">
            <div class="media">
              <a class="pull-left" href="#">
              <img class="media-object" src="images/user.png" style="width:50px">
            </a>
            <div class="media-body">
              <h4 class="media-heading"><a href="/Struts2Starter/getReviewerInfo?user_id=<%=user_id%>"><%=name%></a></h4>
                <p><%=text%></p>
                <ul class="list-inline list-unstyled">
              <li><span><i class="glyphicon glyphicon-calendar"></i>Date: <%=date %></span></li>
                  <li>|</li>
                  <span>Useful : <%=use%></span>
                  <li>|</li>
                  <span>Cool : <%=cool %></span>
                  <li>|</li>
                  <span>Funny : <%=funny %></span>
                  <li>|</li>
                  <li>
                     <span class="glyphicon glyphicon-star"></span>
                      <span>Rating : <%=rating %></span>        
                  </li>
                  <li>|</li>
                  <li>
                  <!-- Use Font Awesome http://fortawesome.github.io/Font-Awesome/ -->
                    <span><i class="fa fa-facebook-square"></i></span>
                    <span><i class="fa fa-twitter-square"></i></span>
                    <span><i class="fa fa-google-plus-square"></i></span>
                  </li>
            </ul>
             </div>
          </div>
        </div>
          <% 
          }
          %>




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