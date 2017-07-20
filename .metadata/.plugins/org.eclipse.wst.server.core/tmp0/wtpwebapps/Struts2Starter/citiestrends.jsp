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
            <form class="text-center form-inline" action="getCitiesTrends">
              <h4>Your Locality Guide</h4>
              <div class="form-group">
                <input class="form-control" type="text" id="detailsRestaurant" placeholder="Business name" name = "name"/>       
              </div>
              <input style="padding: 10px 15px 10px 15px;background-color: #cb202d;border-radius: 5px;color: white; font-weight: bold;border:2px solid #cb202d" type="submit" value="Search"/>            
            </form> 
          </div>
        </div>

      </div><!-- end of header -->


      <div class="row marketing fix">
        <div class="col-lg-12">
         <h4>Top 10 businesses</h4>
         <ul class="list-group">

            <%JSONArray array=(JSONArray)request.getAttribute("jsonarray");
              %>
              <%
              for(int i=0;i<array.length();i++){
                JSONObject obj=array.getJSONObject(i);
                String name=obj.get("name").toString();
                %>
                 <li class="list-group-item"><%=(i+1) %><a href="/Struts2Starter/getCitiesTrends?name=<%=name%>"> <%=name %></a></li>
              <%  
              }
              %>
        </ul>

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