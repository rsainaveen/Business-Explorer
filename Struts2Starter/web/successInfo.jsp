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

  <% JSONObject obj = (JSONObject) request.getAttribute("ob"); 
String name =(String) obj.get("Business_Name").toString();
String id = (String) obj.get("Business_id").toString();
String count = (String)obj.get("review_count").toString();
String address = (String)obj.get("address").toString();
String Mon = (String)obj.get("Mon").toString();
String Tues = (String)obj.get("Tues").toString();
String Wed = (String)obj.get("Wed").toString();
String Thur = (String)obj.get("Thur").toString();
String Fri = (String)obj.get("Fri").toString();
String Sat = (String)obj.get("Sat").toString();
String Sun = (String)obj.get("Sun").toString();
String wifi = (String)obj.get("wifi").toString();
String groups = (String)obj.get("groups").toString();
String Parking = (String)obj.get("Parking").toString();
String Reservations = (String)obj.get("Reservations").toString();
String Vegetarian = (String)obj.get("Vegetarian").toString();
%>

    <div class="row marketing">
        <div class="col-lg-12">
          <div class="col-sm-12 col-md-6">
          <h5><%=name %></h5>
          <h6><%=address %></h6>
            <img src="images/hotel.jpg" style="width: 100%;">
          </div>
          <div class="col-sm-12 col-md-6">
              <h2 class="text-info">Working hours</h2>
                          
              <table class="col-md-12 table-bordered table-striped table-condensed cf">
                <thead >
                  <tr>
                    <th>Day</th>
                    <th>Timings</th>
                  </tr>
                </thead>
                <tbody>
                  <tr>
                    <td >Monday</td>
                    <td ><%=Mon %></td>
                  </tr>
                  <tr>
                    <td >Tuesday</td>
                    <td ><%=Tues %></td>
                  </tr>
                  <tr>
                    <td >Wednesday</td>
                    <td ><%=Wed %></td>
                  </tr>
                  <tr>
                    <td >Thursday</td>
                    <td ><%=Thur %></td>
                  </tr>
                  <tr>
                    <td >Friday</td>
                    <td ><%=Fri %></td>
                  </tr>
                  <tr>
                    <td >Saturday</td>
                    <td ><%=Sat %></td>
                  </tr>
                  <tr>
                    <td >Sunday</td>
                    <td ><%=Sun %></td>
                  </tr>
                  </tbody>
              </table>
               <h2 class="text-info">Business Info</h2>
                <table class="col-md-12 table-bordered table-striped table-condensed cf">
                <tbody>
                  <tr>
                    <td >WIFI</td>
                    <td ><%=wifi%></td>
                  </tr>
                  <tr>
                    <td >Good for large groups</td>
                    <td ><%=groups%></td>
                  </tr>
                  <tr>
                    <td >Reservations</td>
                    <td ><%=Reservations%></td>
                  </tr>
                  <tr>
                    <td >Vegetarian</td>
                    <td ><%=Vegetarian%></td>
                  </tr>
                  <tr>
                    <td >Parking</td>
                    <td ><%=Parking%></td>
                  </tr>
                  </tbody>
              </table>
          </div>
        </div>
        
      </div>
<a type="button" class="btn btn-primary btn-block" href="/Struts2Starter/getReviewInfo?id=<%=id%>">Reviews (<%=count%>)</a>
      <footer class="footer">
        <p>� 2015 Company, Inc.</p>
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