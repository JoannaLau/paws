/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.44
 * Generated at: 2017-07-30 09:59:57 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class addSchoolSystem_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1498989697559L));
    _jspx_dependants.put("jar:file:/C:/Users/Joanna%20Lau/Desktop/THESIS/paws/.metadata/.plugins/org.eclipse.wst.server.core/tmp1/wtpwebapps/PAWS/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153356282000L));
  }

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
      out.write("        \r\n");
      out.write("    \r\n");
      out.write("<!doctype html>\r\n");
      out.write("<html class=\"no-js\" lang=\"en\">\r\n");
      out.write(" <head>\r\n");
      out.write("\t<!-- IMPORTS -->\r\n");
      out.write("    <script src='js/jquery.min.js'></script>\r\n");
      out.write("<!--     <script src='js/jquery-ui.min.js'></script> -->\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/bootstrap.css\">\r\n");
      out.write("    <script src=\"js/bootstrap.min.js\"></script>\r\n");
      out.write("    <link rel=\"apple-touch-icon\" href=\"apple-touch-icon.png\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/vendor.css\">\r\n");
      out.write("<!--     <link href='fullcalendar.css' rel='stylesheet' /> -->\r\n");
      out.write("<!--     <link href='calendar/fullcalendar.print.css' rel='stylesheet' media='print' /> -->\r\n");
      out.write("<!-- \t<script src='calendar/lib/moment.min.js'></script> -->\r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"chosen/chosen.css\">\r\n");
      out.write(" \t<script src=\"chosen/chosen.jquery.js\" type=\"text/javascript\"></script>\r\n");
      out.write("\t<link rel=\"stylesheet\" type=\"text/css\" href=\"css/jquery.dataTables.min.css\">\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("<!--  \t<link title=\"timeline-styles\" rel=\"stylesheet\" href=\"css/timeline.css\"> -->\r\n");
      out.write(" \t<script src=\"js/bootstrap-datepicker.min.js\"></script>\r\n");
      out.write(" \t<link rel=\"stylesheet\" href=\"css/bootstrap-datepicker.css\">\r\n");
      out.write("<!-- \t<link title=\"timeline-styles\" rel=\"stylesheet\" href=\"css/datepicker.css\"> -->\r\n");
      out.write("\t<!-- END IMPORTS -->\r\n");
      out.write("        <!-- Theme initialization -->\r\n");
      out.write("        <script>\r\n");
      out.write("            var themeSettings = (localStorage.getItem('themeSettings')) ? JSON.parse(localStorage.getItem('themeSettings')) :\r\n");
      out.write("            {};\r\n");
      out.write("            var themeName = themeSettings.themeName || '';\r\n");
      out.write("            if (themeName)\r\n");
      out.write("            {\r\n");
      out.write("                document.write('<link rel=\"stylesheet\" id=\"theme-style\" href=\"css/app-' + themeName + '.css\">');\r\n");
      out.write("            }\r\n");
      out.write("            else\r\n");
      out.write("            {\r\n");
      out.write("                document.write('<link rel=\"stylesheet\" id=\"theme-style\" href=\"css/app.css\">');\r\n");
      out.write("            }\r\n");
      out.write("            </script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<script>\r\n");
      out.write("\r\n");
      out.write("\t$(document).ready(function() {\r\n");
      out.write("\t\t$('#activeopen').collapse(\"show\");\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t $('#datepicker').datepicker({\r\n");
      out.write("\t\t        format: \"yyyy-mm-dd\",\r\n");
      out.write("\t\t        autoclose: true,\r\n");
      out.write("\t\t    });\r\n");
      out.write("\t\t \r\n");
      out.write("\t\t/* initialize the external events\r\n");
      out.write("\t\t-----------------------------------------------------------------*/\r\n");
      out.write("\r\n");
      out.write("\t\t$('#external-events .fc-event').each(function() {\r\n");
      out.write("\r\n");
      out.write("\t\t\t// store data so the calendar knows to render an event upon drop\r\n");
      out.write("\t\t\t$(this).data('event', {\r\n");
      out.write("\t\t\t\ttitle: $.trim($(this).text()), // use the element's text as the event title\r\n");
      out.write("\t\t\t\tstick: true // maintain when user navigates (see docs on the renderEvent method)\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\r\n");
      out.write("\t\t\t// make the event draggable using jQuery UI\r\n");
      out.write("\t\t\t$(this).draggable({\r\n");
      out.write("\t\t\t\tzIndex: 999,\r\n");
      out.write("\t\t\t\trevert: true,      // will cause the event to go back to its\r\n");
      out.write("\t\t\t\trevertDuration: 0  //  original position after the drag\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\r\n");
      out.write("\t\t});\r\n");
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t$('#calendar').fullCalendar({\r\n");
      out.write("\t\t\theader: {\r\n");
      out.write("\t\t\t\tleft: 'prev,next today',\r\n");
      out.write("\t\t\t\tcenter: 'title',\r\n");
      out.write("\t\t\t\tright: 'month,basicWeek,basicDay'\r\n");
      out.write("\t\t\t},\r\n");
      out.write("\t\t\tdefaultDate: '2016-09-12',\r\n");
      out.write("\t\t\tnavLinks: true, // can click day/week names to navigate views\r\n");
      out.write("\t\t\teditable: true,\r\n");
      out.write("\t\t\tdroppable: true, // this allows things to be dropped onto the calendar\r\n");
      out.write("\t\t\tdrop: function() {\r\n");
      out.write("\t\t\t\t\t$(this).remove();\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t,\r\n");
      out.write("\t\t\teventDrop: function(event, delta, revertFunc) {\r\n");
      out.write("\t\t        alert(event.title + \" was dropped on \" + event.start.format());\r\n");
      out.write("\t\t    },\r\n");
      out.write("\t\t    eventReceive: function(event) {\r\n");
      out.write("\t\t        alert(event.title + \" was dropped on \" + event.start.format());\r\n");
      out.write("\t\t    },\r\n");
      out.write("\t\t    eventRender: function(event, element) {\r\n");
      out.write("\t            element.append( \"<a class='closeon'> Delete</a>\" );\r\n");
      out.write("\t            element.find(\".closeon\").click(function() {\r\n");
      out.write("\t            \talert(event.title + \" was removed.\");\r\n");
      out.write("\t               $('#calendar').fullCalendar('removeEvents',event._id);\r\n");
      out.write("\t            });\r\n");
      out.write("\t        },\r\n");
      out.write("\r\n");
      out.write("\t\t\teventLimit: true, // allow \"more\" link when too many events\r\n");
      out.write("\t\t\tevents: [\r\n");
      out.write("\t\t\t\t{\r\n");
      out.write("\t\t\t\t\ttitle: 'All Day Event',\r\n");
      out.write("\t\t\t\t\tstart: '2016-09-01'\r\n");
      out.write("\t\t\t\t},\r\n");
      out.write("\t\t\t\t{\r\n");
      out.write("\t\t\t\t\ttitle: 'Conference',\r\n");
      out.write("\t\t\t\t\tstart: '2016-09-11'\r\n");
      out.write("\t\t\t\t},\r\n");
      out.write("\t\t\t\t{\r\n");
      out.write("\t\t\t\t\ttitle: 'Meeting',\r\n");
      out.write("\t\t\t\t\tstart: '2016-09-12T10:30:00',\r\n");
      out.write("\t\t\t\t\tend: '2016-09-12T12:30:00'\r\n");
      out.write("\t\t\t\t},\r\n");
      out.write("\t\t\t\t{\r\n");
      out.write("\t\t\t\t\ttitle: 'Lunch',\r\n");
      out.write("\t\t\t\t\tstart: '2016-09-12T12:00:00'\r\n");
      out.write("\t\t\t\t},\r\n");
      out.write("\t\t\t\t{\r\n");
      out.write("\t\t\t\t\ttitle: 'Meeting',\r\n");
      out.write("\t\t\t\t\tstart: '2016-09-12T14:30:00'\r\n");
      out.write("\t\t\t\t},\r\n");
      out.write("\t\t\t\t{\r\n");
      out.write("\t\t\t\t\ttitle: 'Happy Hour',\r\n");
      out.write("\t\t\t\t\tstart: '2016-09-12T17:30:00'\r\n");
      out.write("\t\t\t\t},\r\n");
      out.write("\t\t\t\t{\r\n");
      out.write("\t\t\t\t\ttitle: 'Dinner',\r\n");
      out.write("\t\t\t\t\tstart: '2016-09-12T20:00:00'\r\n");
      out.write("\t\t\t\t},\r\n");
      out.write("\t\t\t\t{\r\n");
      out.write("\t\t\t\t\ttitle: 'Birthday Party',\r\n");
      out.write("\t\t\t\t\tstart: '2016-09-13T07:00:00'\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t]\r\n");
      out.write("\t\t});\r\n");
      out.write("\t\t\r\n");
      out.write("\t});\r\n");
      out.write("\t\r\n");
      out.write("\t\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("function addAlert(asd){\r\n");
      out.write("\t$('#section').append('<div class=\"alert alert-success\"><a href=\"#\" class=\"close\" data-dismiss=\"alert\" aria-label=\"close\">&times;</a><strong>Success!</strong> Successfully added survey called: '+asd +'.</div> <br>');\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("function addProp(){\r\n");
      out.write("\t$(\"#progBar\").html(\"<div class='progress-bar progress-bar-success' role='progressbar' style='width:33%' id='progDetails'>1. Details</div><div class='progress-bar progress-bar-success progress-bar-striped' role='progressbar' style='width:33%' id='progProponents'>2. Proponents </div>\");\r\n");
      out.write("\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("function addDet(){\r\n");
      out.write("\t$(\"#progBar\").html(\"<div class='progress-bar progress-bar-success progress-bar-striped' role='progressbar' style='width:33%' id='progDetails'>1. Details</div>\");\r\n");
      out.write("\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("function addSure(){\r\n");
      out.write("\t$(\"#progBar\").html(\"<div class='progress-bar progress-bar-success' role='progressbar' style='width:33%' id='progDetails'>1. Details</div><div class='progress-bar progress-bar-success' role='progressbar' style='width:33%' id='progProponents'>2. Proponents </div><div class='progress-bar progress-bar-success progress-bar-striped' role='progressbar' style='width:33%' id='progProponents'>3. Final </div>\");\r\n");
      out.write("\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("function changeDetails(){\r\n");
      out.write("\t$(\"#progProponents\").className = \"progress-bar progress-bar-success progress-bar-striped\";\r\n");
      out.write("\t$(\"#progDetails\").className = \"progress-bar progress-bar-success\";\r\n");
      out.write("\t$(\"#progSure\").className = \"progress-bar progress-bar-success\";\r\n");
      out.write("}\r\n");
      out.write("</script>\r\n");
      out.write("<style>\r\n");
      out.write("\r\n");
      out.write("\tbody {\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tfont-family: \"Lucida Grande\",Helvetica,Arial,Verdana,sans-serif;\r\n");
      out.write("\t\tfont-size: 14px;\r\n");
      out.write("\t}\r\n");
      out.write("\r\n");
      out.write("\t#calendar {\r\n");
      out.write("\t\tmax-width: 900px;\r\n");
      out.write("\t\tmargin: -35px auto;\r\n");
      out.write("\t\tpadding: 10px;\r\n");
      out.write("background: rgba(255,255,255,1);\r\n");
      out.write("background: -moz-linear-gradient(45deg, rgba(255,255,255,1) 0%, rgba(246,246,246,1) 47%, rgba(237,237,237,1) 100%);\r\n");
      out.write("background: -webkit-gradient(left bottom, right top, color-stop(0%, rgba(255,255,255,1)), color-stop(47%, rgba(246,246,246,1)), color-stop(100%, rgba(237,237,237,1)));\r\n");
      out.write("background: -webkit-linear-gradient(45deg, rgba(255,255,255,1) 0%, rgba(246,246,246,1) 47%, rgba(237,237,237,1) 100%);\r\n");
      out.write("background: -o-linear-gradient(45deg, rgba(255,255,255,1) 0%, rgba(246,246,246,1) 47%, rgba(237,237,237,1) 100%);\r\n");
      out.write("background: -ms-linear-gradient(45deg, rgba(255,255,255,1) 0%, rgba(246,246,246,1) 47%, rgba(237,237,237,1) 100%);\r\n");
      out.write("background: linear-gradient(45deg, rgba(255,255,255,1) 0%, rgba(246,246,246,1) 47%, rgba(237,237,237,1) 100%);\r\n");
      out.write("filter: progid:DXImageTransform.Microsoft.gradient( startColorstr='#ffffff', endColorstr='#ededed', GradientType=1 );\t\r\n");
      out.write("\t box-shadow: 1px 2px 5px #C0C0C0;\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\t.fc-day-number{\r\n");
      out.write("\t\tcolor: black;\r\n");
      out.write("\t}\r\n");
      out.write("\t\r\n");
      out.write("\t#bg{\r\n");
      out.write("\theight: 640px;\r\n");
      out.write("\tposition:fixed;\r\n");
      out.write("\t}\r\n");
      out.write("\r\n");
      out.write("</style>\r\n");
      out.write("    </head>\r\n");
      out.write("\r\n");
      out.write("    <body>\r\n");
      out.write("    \t \r\n");
      out.write("        <div class=\"main-wrapper\">\r\n");
      out.write("      \t\t\t\t\r\n");
      out.write("        \t\t\t\r\n");
      out.write("      \t\t\t</div>\r\n");
      out.write("      \t\t\t\r\n");
      out.write("    \t\t\r\n");
      out.write("\r\n");
      out.write("  \t\r\n");
      out.write("\t\t\t\r\n");
      out.write("            <div class=\"app\" id=\"app\">\r\n");
      out.write("                <header class=\"header\">\r\n");
      out.write("                    <div class=\"header-block header-block-collapse hidden-lg-up\"> <button class=\"collapse-btn\" id=\"sidebar-collapse-btn\">\r\n");
      out.write("    \t\t\t<i class=\"fa fa-bars\"></i>\r\n");
      out.write("    \t\t</button> </div>\r\n");
      out.write("                    <div class=\"header-block header-block-search hidden-sm-down\">\r\n");
      out.write("                        <form role=\"search\">\r\n");
      out.write("                            <div class=\"input-container\"> <i class=\"fa fa-search\"></i> <input type=\"search\" placeholder=\"Search\">\r\n");
      out.write("                                <div class=\"underline\"></div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </form>\r\n");
      out.write("                    </div>\r\n");
      out.write("\t\t\t\t\t <div style=\"margin-left:-150px;\">\r\n");
      out.write("\t\t\t\t\t \t\r\n");
      out.write("  \t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t </div>\r\n");
      out.write("                    \r\n");
      out.write("                    <div class=\"header-block header-block-nav\">\r\n");
      out.write("                        <ul class=\"nav-profile\">\r\n");
      out.write("                            <li class=\"notifications new\">\r\n");
      out.write("                                <a href=\"\" data-toggle=\"dropdown\"> <i class=\"fa fa-bell-o\"></i> <sup>\r\n");
      out.write("    \t\t\t      <span class=\"counter\">1</span>\r\n");
      out.write("    \t\t\t    </sup> </a>\r\n");
      out.write("                                <div class=\"dropdown-menu notifications-dropdown-menu\">\r\n");
      out.write("                                    <ul class=\"notifications-container\">\r\n");
      out.write("                                        <li>\r\n");
      out.write("                                            <a href=\"\" class=\"notification-item\">\r\n");
      out.write("                                                <div class=\"img-col\">\r\n");
      out.write("                                                    <div class=\"img\" style=\"background-image: url('assets/faces/marcos,nelson.jpg')\"></div>\r\n");
      out.write("                                                </div>\r\n");
      out.write("                                                <div class=\"body-col\">\r\n");
      out.write("                                                    <p> <span class=\"accent\">Marcos, Nelson Phd</span> Achievement: <span class=\"accent\">Completed 100th survey</span>. </p>\r\n");
      out.write("                                                </div>\r\n");
      out.write("                                            </a>\r\n");
      out.write("                                        </li>\r\n");
      out.write("                                       \r\n");
      out.write("                                    </ul>\r\n");
      out.write("                                    <footer>\r\n");
      out.write("                                        <ul>\r\n");
      out.write("                                            <li> <a href=\"\">\r\n");
      out.write("    \t\t\t            View All\r\n");
      out.write("    \t\t\t          </a> </li>\r\n");
      out.write("                                        </ul>\r\n");
      out.write("                                    </footer>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </li>\r\n");
      out.write("                            \r\n");
      out.write("                        </ul>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </header>\r\n");
      out.write("                ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "sidebar.jsp", out, false);
      out.write("\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("                <div class=\"sidebar-overlay\" id=\"sidebar-overlay\"></div>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("                <article class=\"content dashboard-page\">\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t <div class=\"title-block\">\r\n");
      out.write("                        <h3 class=\"title\" style=\"float:left;\">\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"SchoolSystems\"> List of School Systems </a> > Add New Institution\r\n");
      out.write("\t\t\t\t\t\t</h3>\r\n");
      out.write("\t\t\t     </div>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t<section class=\"section\" id=\"section\">   \r\n");
      out.write("\t\t\t\t <div class=\"tab-content\">     \r\n");
      out.write("\t\t\t\t \t<div id=\"menu1\" class=\"tab-pane fade in active\">          \r\n");
      out.write("\t\t<form method=\"post\" action=\"AddSchoolSystem\" class=\"form\">\r\n");
      out.write("\t\t\t\t\t\t<div class=\"col-md-12\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"card card-block sameheight-item\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"title-block\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<h3 class=\"title\">\r\n");
      out.write("\t\t\t\t\t\t\tNew Institution Form\r\n");
      out.write("\t\t\t\t\t\t</h3> </div>\r\n");
      out.write("\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div style=\"width:48%; padding-right\"> <label class=\"control-label\">School System Name</label> \r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<input type=\"text\" class=\"form-control underlined\" style=\"width:90%;\"  placeholder=\"e.g. De La Salle\" name=\"ssName\"> </div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<br><br>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write(" \t\t\t\t\t\t\t\t\t\t\t<div style=\"width:48%; padding-right\"> <label class=\"control-label\">Membership Date</label>  \r\n");
      out.write(" \t\t\t\t\t\t\t\t\t\t\t<input type=\"text\" id=\"datepicker\" class=\"form-control underlined\" style=\"width:90%;\"  placeholder=\"e.g. 2017-01-01\" name=\"joinDate\"> </div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t<div class=\"col-md-12\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<hr>\r\n");
      out.write("<!-- \t\t\t\t\t\t\t\t\t<button type=\"button\" class=\"btn btn-success\" onclick=\"location.href = 'schoolProfile_sample.html'; alert('Successfully added Institutions! \\nYou may now add programs in this School System.')\" data-toggle=\"tab\" style=\"float:right; padding-right:15px;\"> -->\r\n");
      out.write("<!-- \t\t\t\t\t\t\t\t\tSubmit then add an Institutions \t\t\t\t\t\t -->\r\n");
      out.write("<!-- \t\t\t\t\t\t\t\t\t</button> -->\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<button type=\"submit\" class=\"btn btn-info\" onclick=\"alert('Successfully added a School System!');location.href = 'SchoolSystems';\"  style=\"float:right; padding-right:15px;\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\tSave\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</button>\r\n");
      out.write("\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</form>\r\n");
      out.write("        \t\t\t</div>\r\n");
      out.write("\t\t\t\t   </section>\r\n");
      out.write("\t\t\t\t   \r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t  \r\n");
      out.write("                </article>\r\n");
      out.write("             \r\n");
      out.write("             \r\n");
      out.write("        \t\t  \r\n");
      out.write("        <!-- Reference block for JS -->\r\n");
      out.write("        <div class=\"ref\" id=\"ref\">\r\n");
      out.write("            <div class=\"color-primary\"></div>\r\n");
      out.write("            <div class=\"chart\">\r\n");
      out.write("                <div class=\"color-primary\"></div>\r\n");
      out.write("                <div class=\"color-secondary\"></div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("       </div></div>\r\n");
      out.write("        <script src=\"js/app.js\"></script>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t</body>\r\n");
      out.write("\r\n");
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
