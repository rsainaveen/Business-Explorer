/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.42
 * Generated at: 2017-04-20 08:35:25 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import org.json.*;
import java.util.*;
import org.json.*;
import org.apache.struts2.ServletActionContext;
import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;

public final class successReviewerInfo_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("java.util");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("org.json");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("javax.servlet.http.HttpServletRequest");
    _jspx_imports_classes.add("org.apache.struts2.ServletActionContext");
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

final java.lang.String _jspx_method = request.getMethod();
if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
return;
}

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html xmlns=\"http://www.w3.org/1999/xhtml\" lang=\"en\">\r\n");
      out.write("  <head>\r\n");
      out.write("    <meta charset=\"utf-8\">\r\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("    <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->\r\n");
      out.write("    <meta name=\"description\" content=\"\">\r\n");
      out.write("    <meta name=\"author\" content=\"\">\r\n");
      out.write("\r\n");
      out.write("    <link rel=\"icon\" href=\"http://getbootstrap.com/favicon.ico\">\r\n");
      out.write("\r\n");
      out.write("    <title>Local Guide using Yelp</title>\r\n");
      out.write("\r\n");
      out.write("    <!-- Bootstrap core CSS -->\r\n");
      out.write("    <link href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("    <!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->\r\n");
      out.write("    <link href=\"http://getbootstrap.com/assets/css/ie10-viewport-bug-workaround.css\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("    <!-- Custom styles for this template -->\r\n");
      out.write("    <link href=\"http://getbootstrap.com/examples/jumbotron-narrow/jumbotron-narrow.css\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->\r\n");
      out.write("    <!--[if lt IE 9]>\r\n");
      out.write("      <script src=\"https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js\"></script>\r\n");
      out.write("      <script src=\"https://oss.maxcdn.com/respond/1.4.2/respond.min.js\"></script>\r\n");
      out.write("    <![endif]-->\r\n");
      out.write("    <script\r\n");
      out.write("  src=\"https://code.jquery.com/jquery-3.2.1.min.js\"\r\n");
      out.write("  integrity=\"sha256-hwg4gsxgFZhOsEEamdOYGBf13FyQuiTwlAQgxVSNgt4=\"\r\n");
      out.write("  crossorigin=\"anonymous\"></script> \r\n");
      out.write("<script src=\"http://canvasjs.com/assets/script/canvasjs.min.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("arr = ");
      out.print((JSONObject)request.getAttribute("obj"));
      out.write(";\r\n");
      out.write("\r\n");
      out.write(" function graphRender() {\r\n");
      out.write("   //document.getElementById(\"chartContainer\").innerHTML = \"\";\r\n");
      out.write("    d = {\r\n");
      out.write("        title:{\r\n");
      out.write("          text: \"Count of user reviews\"              \r\n");
      out.write("        },\r\n");
      out.write("        data: [              \r\n");
      out.write("        {\r\n");
      out.write("          // Change type to \"doughnut\", \"line\", \"splineArea\", etc.\r\n");
      out.write("          type: \"column\",\r\n");
      out.write("          dataPoints: [\r\n");
      out.write("          ]\r\n");
      out.write("        }\r\n");
      out.write("        ]\r\n");
      out.write("      };\r\n");
      out.write("     for(i in arr[\"count\"]){\r\n");
      out.write("       console.log(arr[\"count\"][i]);\r\n");
      out.write("       var tmp = {};\r\n");
      out.write("       tmp[\"label\"] = i;\r\n");
      out.write("       tmp[\"y\"] = parseFloat(arr[\"count\"][i]);\r\n");
      out.write("       d.data[0].dataPoints.push(tmp);\r\n");
      out.write("     }\r\n");
      out.write("     chart = new CanvasJS.Chart(\"chartContainer\", d);\r\n");
      out.write("     \r\n");
      out.write("    chart.render();\r\n");
      out.write("  }\r\n");
      out.write("  </script>\r\n");
      out.write("  </head>\r\n");
      out.write("\r\n");
      out.write("  <body >\r\n");
      out.write("\r\n");
      out.write("    <div class=\"container\">\r\n");
      out.write("      <div class=\"header clearfix\">\r\n");
      out.write("        <nav>\r\n");
      out.write("          <ul class=\"nav nav-pills pull-right\">\r\n");
      out.write("            <li role=\"presentation\" class=\"active\"><a href=\"/Struts2Starter/\">Home</a></li>\r\n");
      out.write("            <li role=\"presentation\"><a href=\"advancedtrends.jsp\">Advanced Trends</a></li>\r\n");
      out.write("            <li role=\"presentation\"><a href=\"#\">Number of tuples</a></li>\r\n");
      out.write("          </ul>\r\n");
      out.write("        </nav>\r\n");
      out.write("        <h3 class=\"text-muted\"><a href =\"/Struts2Starter/\">Locality Guide</a></h3>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"row\" style=\"margin-top: 20px;\">\r\n");
      out.write("          <div class=\"col-lg-12\">\r\n");
      out.write("            <form class=\"text-center form-inline\" action=\"getTutorial\">  \r\n");
      out.write("                <div class=\"form-group\">\r\n");
      out.write("                  <input type=\"text\" placeholder=\" FIND Bars,Restaurants,Hotels\" class=\"form-control\" id=\"searchRestaurant\" name=\"place\">\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"form-group\">\r\n");
      out.write("                  <input type=\"text\" class=\"form-control\" id=\"searchLocation\" placeholder=\" CITY \" name=\"city\">\r\n");
      out.write("                </div>\r\n");
      out.write("              <input style=\"padding: 10px 15px 10px 15px;background-color: #cb202d;border-radius: 5px;color: white; font-weight: bold;border:2px solid #cb202d\" type=\"submit\" value=\"Search\">       \r\n");
      out.write("            </form>\r\n");
      out.write("          </div>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("      </div><!-- end of header -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("      ");
JSONArray array = (JSONArray)request.getAttribute("jsonarray");
JSONObject temp = array.getJSONObject(0);
String reviewing_since=(String)temp.get("review_using").toString();
String compliments=(String)temp.get("compliments").toString();
String fans=(String)temp.get("fans").toString();
String useful=(String)temp.get("useful").toString();
String cool=(String)temp.get("cool").toString();
String funny=(String)temp.get("funny").toString();
String review_count=(String)temp.get("review_count").toString();
String avg_stars=(String)temp.get("avg_stars").toString();
String name=(String)temp.get("name").toString();

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <div class=\"row marketing fix\">\r\n");
      out.write("        <div class=\"col-lg-12\">\r\n");
      out.write("          <div id=\"chartContainer\" style=\"height: 300px; width: 100%;\"></div>\r\n");
      out.write("\r\n");
      out.write("            <div class=\"well\">\r\n");
      out.write("              <div class=\"media\">\r\n");
      out.write("                <a class=\"pull-left\" href=\"#\">\r\n");
      out.write("                <img class=\"media-object\" src=\"images/user.png\" style=\"width:50px\">\r\n");
      out.write("              </a>\r\n");
      out.write("              <div class=\"media-body\">\r\n");
      out.write("                <h4 class=\"media-heading\">");
      out.print(name);
      out.write("</h4>\r\n");
      out.write("\r\n");
      out.write("                  <table class=\"col-md-12 table-bordered table-striped table-condensed cf\">\r\n");
      out.write("                    <thead >\r\n");
      out.write("                      <tr>\r\n");
      out.write("                        <th>Rating</th>\r\n");
      out.write("                        <th>Count</th>\r\n");
      out.write("                      </tr>\r\n");
      out.write("                    </thead>\r\n");
      out.write("                    <tbody>\r\n");
      out.write("\r\n");
      out.write("                      ");
      JSONObject obj=(JSONObject)request.getAttribute("obj");
                            int[] count=(int[])obj.get("count");
                            
      out.write("\r\n");
      out.write("                            ");

                            for(int i=1 ;i<count.length;i++){
                              int val=count[i];
                              
      out.write("\r\n");
      out.write("                              <tr>\r\n");
      out.write("                                <td >");
      out.print((i));
      out.write(" stars</td>\r\n");
      out.write("                                <td >");
      out.print(val);
      out.write("</td>\r\n");
      out.write("                              </tr>\r\n");
      out.write("                            ");
 
                            }
                      
      out.write("\r\n");
      out.write("                      \r\n");
      out.write("                      </tbody>\r\n");
      out.write("                  </table>\r\n");
      out.write("                  <br>\r\n");
      out.write("\r\n");
      out.write("                  <ul class=\"list-inline list-unstyled\">\r\n");
      out.write("                    <li><span><i class=\"glyphicon glyphicon-calendar\"></i>Reviewing since: ");
      out.print(reviewing_since);
      out.write("</span></li>\r\n");
      out.write("                        <li>|</li>\r\n");
      out.write("                        <span>Compliments : ");
      out.print(compliments );
      out.write("</span>\r\n");
      out.write("                        <li>|</li>\r\n");
      out.write("                        <span>Fans : ");
      out.print(fans );
      out.write("</span>\r\n");
      out.write("                        <li>|</li>\r\n");
      out.write("                        <span>Useful :");
      out.print(useful );
      out.write("</span>\r\n");
      out.write("                        <li>|</li>\r\n");
      out.write("                        <span>Cool : ");
      out.print(cool );
      out.write("</span>\r\n");
      out.write("                        <li>|</li>\r\n");
      out.write("                        <span> Funny : ");
      out.print(funny );
      out.write("</span>\r\n");
      out.write("                        <li>|</li>\r\n");
      out.write("                        <span>Reviews : ");
      out.print(review_count );
      out.write("</span>\r\n");
      out.write("                        <li>|</li>\r\n");
      out.write("                        <span>Average stars : ");
      out.print(avg_stars );
      out.write("</span>\r\n");
      out.write("                        <li>|</li>\r\n");
      out.write("                  </ul>\r\n");
      out.write("               </div>\r\n");
      out.write("            </div>\r\n");
      out.write("          </div>\r\n");
      out.write("\r\n");
      out.write("        </div>\r\n");
      out.write("      </div>\r\n");
      out.write("\r\n");
      out.write("      <footer class=\"footer\">\r\n");
      out.write("        <p>© 2015 Company, Inc.</p>\r\n");
      out.write("      </footer>\r\n");
      out.write("\r\n");
      out.write("    </div> <!-- /container -->\r\n");
      out.write("\t    <script\r\n");
      out.write("  src=\"https://code.jquery.com/jquery-2.2.4.min.js\"\r\n");
      out.write("  integrity=\"sha256-BbhdlvQf/xTY9gja0Dq3HiwQF8LaCRTXxZKRutelT44=\"\r\n");
      out.write("  crossorigin=\"anonymous\"></script>\r\n");
      out.write("    <script type=\"text/javascript\">\r\n");
      out.write("    graphRender();\r\n");
      out.write("    </script>\r\n");
      out.write("\r\n");
      out.write("    <!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->\r\n");
      out.write("    <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js\"></script>\r\n");
      out.write("    <script src=\"http://getbootstrap.com/assets/js/ie10-viewport-bug-workaround.js\"></script>\r\n");
      out.write("  </body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
