/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.15
 * Generated at: 2017-07-21 09:45:19 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class sidebar_jsp extends org.apache.jasper.runtime.HttpJspBase
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
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<aside class=\"sidebar\">\r\n");
      out.write("\t<img id =\"bg\" src=\"assets/bg.jpg\">\r\n");
      out.write("\t<div class=\"sidebar-container\">\r\n");
      out.write("\t\t<div class=\"sidebar-header\">\r\n");
      out.write("\t\t\t<div class=\"brand\">\r\n");
      out.write("\t\t\t\t<div class=\"logo\"> <img src=\"assets/logo.png\" style=\"width:42px;height:42px; opacity:1\"> </div>\r\n");
      out.write("\t\t\t\tPAASCU \r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<nav class=\"menu\">\r\n");
      out.write("\t\t\t<ul class=\"nav metismenu\" id=\"sidebar-menu\">\r\n");
      out.write("\t\t\t\t<li id=\"dashboard\">\r\n");
      out.write("\t\t\t\t\t<a id = \"adashboard\" href=\"index.html\" onclick=\"javascript:setActiveDash()\"> <i class=\"fa fa-home\"></i> Dashboard </a>\r\n");
      out.write("\t\t\t\t<li id=\"survey\">\r\n");
      out.write("\t\t\t\t\t<a id=\"asurvey\" href=\"survey.jsp\" onclick=\"javascript:setActiveSched()\"> <i class=\"fa fa-table\"></i> Survey Schedule </a>\r\n");
      out.write("\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t<li id=\"addSurvey\">\r\n");
      out.write("\t\t\t\t\t<a href=\"AddSurvey\" onclick=\"javascript:setActiveSurvey()\"> <i class=\"fa fa-pencil-square-o\"></i> Add New Survey </a>\r\n");
      out.write("\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t<li id=\"database\">\r\n");
      out.write("\t\t\t\t\t<a href=\"#demo\" data-toggle=\"collapse\" onclick=\"javascript:setActiveDatabase()\"> <i class=\"fa fa-file-text-o\"></i> Database <i class=\"fa arrow\"></i> </a>\r\n");
      out.write("\t\t\t\t\t<ul id=\"demo\" class=\"collapse\">\r\n");
      out.write("\t\t\t\t\t\t<li id=\"accreditors\"> <a href=\"Accreditors\" onclick=\"javascript:setActiveAccreditors()\">\r\n");
      out.write("\t\t\t\t\t\t\tAccreditors\r\n");
      out.write("\t\t\t\t\t\t\t</a> \r\n");
      out.write("\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t<li id=\"institutions\"> <a href=\"Institutions\" onclick=\"javascript:setActiveInstitutions()\">\r\n");
      out.write("\t\t\t\t\t\t\tInstitutions\r\n");
      out.write("\t\t\t\t\t\t\t</a> \r\n");
      out.write("\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t<li id=\"schoolSystems\"> <a href=\"SchoolSystems\" onclick=\"javascript:setActiveSchoolSystem()\">\r\n");
      out.write("\t\t\t\t\t\t\tSchool Systems\r\n");
      out.write("\t\t\t\t\t\t\t</a> \r\n");
      out.write("\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t<li id=\"programs\"> <a href=\"Programs\" onclick=\"javascript:setActivePrograms()\">\r\n");
      out.write("\t\t\t\t\t\t\tPrograms\r\n");
      out.write("\t\t\t\t\t\t\t</a> \r\n");
      out.write("\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t<li id=\"reports\">\r\n");
      out.write("\t\t\t\t\t<a href=\"#demo3\" data-toggle=\"collapse\" > <i class=\"fa fa-bar-chart\"></i> Reports <i class=\"fa arrow\"></i> </a>\r\n");
      out.write("\t\t\t\t\t<ul id=\"demo3\" class=\"collapse\">\r\n");
      out.write("\t\t\t\t\t\t<li> <a href=\"reportGA.html\" onclick=\"javascript:setActiveGAawardees()\">GA Awardees</a> </li>\r\n");
      out.write("\t\t\t\t\t\t<li> <a href=\"reportHistory.html\" onclick=\"javascript:setActiveHistory()\">History</a> </li>\r\n");
      out.write("\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t<a href=\"notifications.jsp\" onclick=\"javascript:setActiveNotif()\">\r\n");
      out.write("\t\t\t\t\t\t<i class=\"fa fa-bell-o\"></i> Notifications \r\n");
      out.write("\t\t\t\t\t\t<p style=\"width:15px; height:17px;text-align:center; border-radius:10px; font-family: Verdana; font-size:10px;float:right; background-color:red; color:white;\">10</p>\r\n");
      out.write("\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t  <li id=\"news\">\r\n");
      out.write("\t\t\t\t\t<a href=\"#demo5\" data-toggle=\"collapse\" > <i class=\"fa fa-file-text-o\"></i> News <i class=\"fa arrow\"></i> </a>\r\n");
      out.write("\t\t\t\t\t<ul id=\"demo5\" class=\"collapse\">\r\n");
      out.write("\t\t\t\t\t\t<li id=\"addNews\"> <a href=\"addNews.jsp\" >\r\n");
      out.write("\t\t\t\t\t\t\tAdd News\r\n");
      out.write("\t\t\t\t\t\t\t</a> \r\n");
      out.write("\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t<li id=\"viewNews\"> <a href=\"viewNews.jsp\" >\r\n");
      out.write("\t\t\t\t\t\t\tView News\r\n");
      out.write("\t\t\t\t\t\t\t</a> \r\n");
      out.write("\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("                \r\n");
      out.write("      \t\t\t<li id=\"docuGeneration\">\r\n");
      out.write("\t\t\t\t\t<a href=\"#demo4\" data-toggle=\"collapse\" onclick=\"javascript:setActiveDatabase()\"> <i class=\"fa fa-file-text-o\"></i> Document Generation <i class=\"fa arrow\"></i> </a>\r\n");
      out.write("\t\t\t\t\t<ul id=\"demo4\" class=\"collapse\">\r\n");
      out.write("\t\t\t\t\t\t<li id=\"invitation\"> <a href=\"InvitationLetter\" onclick=\"javascript:setActiveAccreditors()\">\r\n");
      out.write("\t\t\t\t\t\t\tInvitation\r\n");
      out.write("\t\t\t\t\t\t\t</a> \r\n");
      out.write("\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t<li id=\"confirmation\"> <a href=\"ConfirmationLetter\" onclick=\"javascript:setActiveInstitutions()\">\r\n");
      out.write("\t\t\t\t\t\t\tConfirmation Letter\r\n");
      out.write("\t\t\t\t\t\t\t</a> \r\n");
      out.write("\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t<li id=\"thankYouAfter\"> <a href=\"SchoolSystems\" onclick=\"javascript:setActiveSchoolSystem()\">\r\n");
      out.write("\t\t\t\t\t\t\tThank You (after visit)\r\n");
      out.write("\t\t\t\t\t\t\t</a> \r\n");
      out.write("\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t\t<li id=\"permission\"> <a href=\"Programs\" onclick=\"javascript:setActivePrograms()\">\r\n");
      out.write("\t\t\t\t\t\t\tPermission\r\n");
      out.write("\t\t\t\t\t\t\t</a> \r\n");
      out.write("\t\t\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\t</ul>\r\n");
      out.write("\t\t\t\t</li>\r\n");
      out.write("                \r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("\t\t</nav>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<footer class=\"sidebar-footer\"></footer>\r\n");
      out.write("</aside>\r\n");
      out.write("<!-- \r\n");
      out.write("<script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("var clicked = 0;\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("function setActiveDash(){\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\tlocalStorage.setItem(\"clicked\", 1);\r\n");
      out.write("\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("function setActiveDatabase(){\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\tlocalStorage.setItem(\"clicked\", 11);\r\n");
      out.write("\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("function setActiveSched(){\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\tlocalStorage.setItem(\"clicked\", 2);\r\n");
      out.write("\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("function setActiveSurvey(){\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\tlocalStorage.setItem(\"clicked\", 3);\r\n");
      out.write("\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("function setActiveAccreditors(){\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\tlocalStorage.setItem(\"clicked\", 11);\r\n");
      out.write("\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("function setActiveInstitutions(){\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\tlocalStorage.setItem(\"clicked\", 11);\r\n");
      out.write("\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("function setActiveSchoolSystem(){\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\tlocalStorage.setItem(\"clicked\", 11);\r\n");
      out.write("\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("function setActivePrograms(){\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\tlocalStorage.setItem(\"clicked\", 11);\r\n");
      out.write("\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("function setActiveGAawardees(){\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\tlocalStorage.setItem(\"clicked\", 8);\r\n");
      out.write("\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("function setActiveHistory(){\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\tlocalStorage.setItem(\"clicked\", 9);\r\n");
      out.write("\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("function setActiveNotif(){\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\tlocalStorage.setItem(\"clicked\", 10);\r\n");
      out.write("\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<script>\r\n");
      out.write("\r\n");
      out.write("$(document).ready(function() {\r\n");
      out.write("\t\r\n");
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("\tvar click = localStorage.getItem(\"clicked\");\r\n");
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("\tif(click== 1){\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tdocument.getElementById(\"dashboard\").className = \"active\";\r\n");
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("\t}else if(click==2){\r\n");
      out.write("\t\tdocument.getElementById(\"survey\").className = \"active\";\t\t\r\n");
      out.write("\t} else if(click ==3){\r\n");
      out.write("\t\tdocument.getElementById(\"addSurvey\").className = \"active\";\r\n");
      out.write("\t} else if(click ==4){\r\n");
      out.write("\t\tdocument.getElementById(\"accreditors\").className = \"active\";\r\n");
      out.write("\t} else if(click ==5){\r\n");
      out.write("\t\tdocument.getElementById(\"institutions\").className = \"active\";\r\n");
      out.write("\t}else if(click ==6){\r\n");
      out.write("\t\tdocument.getElementById(\"schoolSystems\").className = \"active\";\r\n");
      out.write("\t}else if(click ==7){\r\n");
      out.write("\t\tdocument.getElementById(\"programs\").className = \"active\";\r\n");
      out.write("\t}else if(click ==11){\r\n");
      out.write("\t\tdocument.getElementById(\"demo\").className = \"collapse in\";\r\n");
      out.write("\t\tdocument.getElementById(\"demo\").setAttribute(\"style\", \"height: auto;\");\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\t});\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</script> -->\r\n");
      out.write("\r\n");
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
