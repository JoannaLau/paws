<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix = "c" %>



<!doctype html>
<html class="no-js" lang="en">

    <head>
     	 <!-- IMPORTS -->
    <script src='js/jquery.min.js'></script>
	
    <script src='js/jquery-ui.min.js'></script>
    <link rel="stylesheet" href="css/bootstrap.css">
    <script src="js/bootstrap.min.js"></script>
    <link rel="apple-touch-icon" href="apple-touch-icon.png">
    <link rel="stylesheet" href="css/vendor.css">
   
	<link rel="stylesheet" type="text/css" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
	<link rel="stylesheet" type="text/css" href=" css/dataTables.bootstrap.min.css">
	<script src="js/jquery.dataTables.min.js"></script>
	<script src="js/dataTables.bootstrap.min.js"></script>
	
 	<link title="timeline-styles" rel="stylesheet" href="css/timeline.css">
 	
 	
 	 <script src="js/Chart.bundle.js"></script>
    <script src="js/utils.js"></script>
    <style>
    canvas {
        -moz-user-select: none;
        -webkit-user-select: none;
        -ms-user-select: none;
    }
    </style>
 	
	
	<!-- END IMPORTS -->
    	
    	
        <meta charset="utf-8">
        <meta http-equiv="x-ua-compatible" content="ie=edge">
        <title> PAASCU - Accreditation Schedule Manager </title>
        <meta name="description" content="">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="apple-touch-icon" href="apple-touch-icon.png">
        <!-- Place favicon.ico in the root directory -->
        <link rel="stylesheet" href="css/vendor.css">
        <!-- Theme initialization -->
        <script>
            var themeSettings = (localStorage.getItem('themeSettings')) ? JSON.parse(localStorage.getItem('themeSettings')) :
            {};
            var themeName = themeSettings.themeName || '';
            if (themeName)
            {
                document.write('<link rel="stylesheet" id="theme-style" href="css/app-' + themeName + '.css">');
            }
            else
            {
                document.write('<link rel="stylesheet" id="theme-style" href="css/app.css">');
            }
        </script>
		
        
        
      
        
        
        
    <script type="text/javascript" src="js/loader.js"></script>


        
        
        
<style>

	#contenthole{
		-webkit-box-shadow: 0px 4px 13px -4px rgba(0,0,0,0.5);
		-moz-box-shadow: 0px 4px 13px -4px rgba(0,0,0,0.5);
		box-shadow: 0px 4px 13px -4px rgba(0,0,0,0.5);
		padding:10px;
		background-color: #f8f8f8;
	}

	
	#smarttable th, #smarttable td {		
		text-align: left;
		overflow: hidden;
		text-overflow: ellipsis;
		white-space: nowrap;	}
		
	#smarttable th{
	
		color:#3c4731;
		font-size:110%;		}

	#smarttable td{
		padding:15px;
		padding-left:10px;
		border: none;
		color:#3c4731;		}


	#smarttable tr:nth-child(even){
		background-color:#e6f2da;}
	
	.container{
		width: 125%;
		overflow:hidden;
		display:block;
		height: 130px;
		z-index:-1;
		margin-left:-15px;}
		


	#bgvid{
		position:relative;
		top:-400px;
		margin-top:0px;
		width:115%	}

	body {		
		font-family: "Lucida Grande",Helvetica,Arial,Verdana,sans-serif;
		font-size: 14px;	}

	#calendar {
		max-width: 900px;
		margin: 0 auto;	}
		
	#bg{
		height: 640px;
		position:fixed;	}
	
	#main{
		position:relative;
		top:-290px;	}
	
	#pnum_danger,#pnum_info,#pnum_warning,#pnum_primary{
		font-size:75px; 
		text-align:center;
		margin-left: -2px;
		padding: 0;
		
		line-height:85px;	}
		
	#pnum_danger{
	color:#ff2b2b;	}
	
	#pnum_warning{
		color:#fe8832;	}
	
	#pnum_info{
		color:#5ecdf3;	}
	
	#pnum_primary{
		color:#85CE36;	}
	
	#psub{
		font-size:17px; 
		color:#bcbcbc;
		text-align:center;
		margin-top: 6px;
		padding: 0;
		line-height:20px;	}
	
	#bc {
		color:white;	}
	
	#bc:hover { 
		color:#85CE36;	}
	
	#welcome{
		position:relative;
		top:-65px;
		color:white;
		left:20px;
		font-family:Existence-Light;	}
		
	.h1{
		font-size:100%;	}
	
	@font-face {
		font-family: Existence-Light;
		src: url(fonts/Roboto-Thin.ttf);}
		
	@font-face {
		font-family: Existence-Medium;
		src: url(fonts/Roboto-Regular.ttf);	}
			
	#notifcard{
		-webkit-box-shadow: 0px 1px 5px 0px rgba(50, 50, 50, 0.58);
		-moz-box-shadow:    0px 1px 5px 0px rgba(50, 50, 50, 0.58);
		box-shadow:         0px 1px 5px 0px rgba(50, 50, 50, 0.58);
		width:87%;
		left:15px;	}
	
	#customheader{
		overflow:hidden;
		top:122px;  
		height:10px; 
		-webkit-box-shadow: 0px 2px 6px 2px rgba(50, 50, 50, 0.58);
		-moz-box-shadow:    0px 2px 6px 2px rgba(50, 50, 50, 0.58);
		box-shadow:         0px 2px 7px 2px rgba(50, 50, 50, 0.58); 
		font-family:Existence-Medium;
		color:#f4f4f4;
		font-size:90%;
		/* Permalink - use to edit and share this gradient: http://colorzilla.com/gradient-editor/#e2e2e2+0,dbdbdb+50,d1d1d1+51,fefefe+100;Grey+Gloss+%231 */
		background: rgb(226,226,226); /* Old browsers */
		background: -moz-linear-gradient(top,  rgba(226,226,226,1) 0%, rgba(219,219,219,1) 50%, rgba(209,209,209,1) 51%, rgba(254,254,254,1) 100%); /* FF3.6-15 */
		background: -webkit-linear-gradient(top,  rgba(226,226,226,1) 0%,rgba(219,219,219,1) 50%,rgba(209,209,209,1) 51%,rgba(254,254,254,1) 100%); /* Chrome10-25,Safari5.1-6 */
		background: linear-gradient(to bottom,  rgba(226,226,226,1) 0%,rgba(219,219,219,1) 50%,rgba(209,209,209,1) 51%,rgba(254,254,254,1) 100%); /* W3C, IE10+, FF16+, Chrome26+, Opera12+, Safari7+ */
		filter: progid:DXImageTransform.Microsoft.gradient( startColorstr='#e2e2e2', endColorstr='#fefefe',GradientType=0 ); /* IE6-9 */	}
	
	#customheader h2{
	color:black;	}
		
	#maincard{
		width:100%;
		padding:0px;
		background-color: #ffffff;
		top:-50px;
		margin-bottom: 10px;
		margin-top: 0px;
		height:700px;
		border-radius: 3px;
	   
		-webkit-box-shadow: 0px 9px 24px 0px rgba(0,0,0,0.75);
		-moz-box-shadow: 0px 9px 24px 0px rgba(0,0,0,0.75);
		box-shadow: 0px 9px 24px 0px rgba(0,0,0,0.75);	}
		
</style>



			

			

    </head>

    <body>
        <div class="main-wrapper">
            <div class="app" id="app">
               
                <jsp:include page="sidebar.jsp" />
				
                <div class="container">
	<video poster="assets/banner.jpg" id="bgvid"  playsinline autoplay muted loop>
  <!-- WCAG general accessibility recommendation is that media such as background video play through only once. Loop turned on for the purposes of illustration; if removed, the end of the video will fade in the same way created by pressing the "Pause" button  -->

<source src="assets/vid.mp4" type="video/mp4">
</video>
</div>
            <div id="welcome">
			<h1>Accreditor Infographics</h1>
			

                   
			</div>
	
                <article class="content dashboard-page"  >
                    <section class="section" style="position: relative; top:-135px; left:-25px; width:105%;" >
                       <div class="table-responsive" style="width:100%; float:right;" id="contenthole">
										
										<h2>Number of Accreditors Who Served Survey Visits</h2>
										
						
  <form method="post" action="AccreditorInfographics">				
					  
						<label>Start Year: </label> <select id="yearStartSelect" name ="yearStartSelect">
						
						</select>	
					
					
						<label> End Year: </label> <select id="yearEndSelect" name = "yearEndSelect">
						
						</select> 
							  &nbsp &nbsp <button type="submit" value="Submit">Filter</button>				     
								</form>			     
											     <br>
											     <table id="smarttable" class="table table-striped table-bordered table-hover">
                                                    <thead>
                                                      <tr>
                                                            <th>Year</th>
                                                            <th>Grade School</th>
                                                            <th>High School</th>
                                                             <th>Basic Education</th>
                                                            <th>Tertiary</th>
                                                            <th>Graduate</th>
                                                            <th>Medical</th>
                                                              <th>CECSTE</th>
                                                             <th>Total</th>
                                                            
                                                        
                                                        </tr>
                                                    </thead>
                                                    <tbody id = "tableInstitutions">
													
													 <c:forEach items="${SurveyCountList}" var="count" >
														<tr>
															<td> <c:out value="${count.getYear()}"/> 
															<td> <c:out value="${count.getGradeSchool()}"/> </td>
															<td> <c:out value="${count.getHighSchool()}"/> </td>
															<td> <c:out value="${count.getBasicEd()}"/> </td>
															<td> <c:out value="${count.getTertiary()}"/> </td>
															<td> <c:out value="${count.getGraduate()}"/> </td>
															<td> <c:out value="${count.getMedical()}"/> </td>
															<td> <c:out value="${count.getCecste()}"/> </td>
															<td> <c:out value="${count.getTotal()}"/> </td>
															
															
														</tr>
													</c:forEach>
														
                                                    </tbody>
                                                </table>
        
       
        <br>
        
        
        	
										<h2>Type of Visits</h2>
											   
											     <br>
											     <table id="smarttable" class="table table-striped table-bordered table-hover">
                                                    <thead>
                                                      <tr>
                                                            <th>Year</th>
                                                            <th>Preliminary</th>
                                                            <th>Formal</th>
                                                            <th>Resurvey</th>
                                                            <th>Interim/Consultancy</th>
                                                             <th>Total</th>
                                                    
                                                            
                                                        
                                                        </tr>
                                                    </thead>
                                                    <tbody id = "tableInstitutions">
													
													 <c:forEach items="${TypeCountList}" var="count2" >
														<tr>
															<td> <c:out value="${count2.getYear()}"/> 
															<td> <c:out value="${count2.getPreliminary()}"/> </td>
															<td> <c:out value="${count2.getFormal()}"/> </td>
															<td> <c:out value="${count2.getResurvey()}"/> </td>
															<td> <c:out value="${count2.getInterim()}"/> </td>
															<td> <c:out value="${count2.getTotal()}"/> </td>
														
															
															
														</tr>
													</c:forEach>
														
                                                    </tbody>
                                                </table>
 
        
        <br>
        

        <center>             
                           
                           
      
<canvas id="canvas"></canvas>
<br>

<canvas id="canvas2"></canvas>

            <!--       <div id="chart_div2" style="width: 900px; height: 500px"></div>
                            -->
                           
                           
               </center>              
                           
                           
                                            </div>
                             
                    </section>
                </article>
             
             </div></div>
        <!-- Reference block for JS -->
        <div class="ref" id="ref">
            <div class="color-primary"></div>
            <div class="chart">
                <div class="color-primary"></div>
                <div class="color-secondary"></div>
            </div>
        </div>
          
        <script src="js/app.js"></script>
		
		
    </body>
    
    
    
    
    
    
    
    
    <script>
    $(document).ready ( function(){
    	var max = new Date().getFullYear();
        var min = max - 30;
        select = document.getElementById('yearStartSelect');

    for (var i = min; i<=max; i++){
    	console.log(i);
        var opt = document.createElement('option');
        opt.value = i;
        opt.innerHTML = i;
        select.appendChild(opt);
    }

    select.value = new Date().getFullYear();
    	
    });
    </script>
    
    
    
     <script>
    $(document).ready ( function(){
    	var max = new Date().getFullYear();
        var min = max - 30;
        select = document.getElementById('yearEndSelect');

    for (var i = min; i<=max; i++){
    	console.log(i);
        var opt = document.createElement('option');
        opt.value = i;
        opt.innerHTML = i;
        select.appendChild(opt);
    }

    select.value = new Date().getFullYear();
    	
    });
    </script>
    
    
    
    
    
    
    
    
       <script type="text/javascript">
   

		var YearBar = new Array();
		var GradeSchoolBar = new Array();
		var HighSchoolBar = new Array();
		var BasicBar = new Array();
		var TertiaryBar = new Array();
		var GradSchoolBar = new Array();
		var MedBar = new Array();
		var CECSTE = new Array();
		
		

		
		 <c:forEach items="${SurveyCountList}" var="count" >

		 
		 
		 YearBar.push("${count.getYear()}");
		 GradeSchoolBar.push(parseInt("${count.getGradeSchool()}"));
		 HighSchoolBar.push(parseInt("${count.getHighSchool()}"));
		 BasicBar.push(parseInt("${count.getBasicEd()}"));
		 TertiaryBar.push(parseInt("${count.getTertiary()}"));
		 GradSchoolBar.push(parseInt("${count.getGraduate()}"));
		 MedBar.push(parseInt("${count.getMedical()}"));
		 CECSTE.push(parseInt("${count.getCecste()}"));
		 
	
		 
		 </c:forEach>
		
		
		
		

		
		
		 var CombinedBarNames = new Array();
	        CombinedBarNames = ['Grade School', 'High School', 'Basic Education', 'Tertiary', 'Graduate School', 'Medical School', 'CECSTE'];
	        

			var CombinedBar = new Array();
			CombinedBar = [GradeSchoolBar, HighSchoolBar, BasicBar, TertiaryBar, GradSchoolBar, MedBar, CECSTE];
			   

      
      
			
			  var color = Chart.helpers.color;
		        var RED = color(window.chartColors.red).alpha(0.5).rgbString();
		        var BLUE = color(window.chartColors.blue).alpha(0.5).rgbString();
		        var YELLOW = color(window.chartColors.yellow).alpha(0.5).rgbString();
		        var GREEN = color(window.chartColors.green).alpha(0.5).rgbString();
		        var ORANGE = color(window.chartColors.orange).alpha(0.5).rgbString();
		        var PURPLE = color(window.chartColors.purple).alpha(0.5).rgbString();
		        var GREY = color(window.chartColors.grey).alpha(0.5).rgbString();


		        var colors = new Array();
		        colors = [RED, BLUE, YELLOW, GREEN, ORANGE, PURPLE, GREY];


		        var barChartData = {
		            labels: YearBar
		        };

		        function load1() {
		            var ctx1 = document.getElementById("canvas").getContext("2d");
		            window.myBar = new Chart(ctx1, {
		                type: 'bar',
		                data: barChartData,
		                options: {
		                    responsive: true,
		                    legend: {
		                        position: 'top',
		                    },
		                    title: {
		                        display: true,
		                        text: 'Number of Accreditors Who Served Survey Visits'
		                    }
		                }
		            });

		            for (var x = 0; x < CombinedBar.length; x++){
		                addData(myBar, CombinedBarNames[x], colors[x], CombinedBar[x]);
		            }


		              console.log(CombinedBar[x]);

		        };
		        
		        
		        
		        
		        
		        
		        
		        
		        
		        
		        
		        
		        
		        
		        
		    	var Year2 = new Array();
				
				var Preliminary = new Array();
				var Formal = new Array();
				var Resurvey = new Array();
				var Interim = new Array();
			
				
			
				
				 <c:forEach items="${TypeCountList}" var="count2" >	 
				 
				 Year2.push("${count2.getYear()}");
				 Preliminary.push(parseInt("${count2.getPreliminary()}"));
				 Formal.push(parseInt("${count2.getFormal()}"));
				 Resurvey.push(parseInt("${count2.getResurvey()}"));
				 Interim.push(parseInt("${count2.getInterim()}"));
			
				 </c:forEach>
				

				var CombinedBarNames2 = new Array();
				CombinedBarNames2 = ['Preliminary', 'Formal', 'Resurvey', 'Interim/Consultancy'];		

				var CombinedBar2 = new Array();
				CombinedBar2 = [Preliminary, Formal, Resurvey, Interim];
				   

			        var colors2 = new Array();
			        colors2 = [GREEN, ORANGE];


			        var barChartData2 = {
			            labels: Year2
			        };

			        function load2() {
			            var ctx2 = document.getElementById("canvas2").getContext("2d");
			            window.myBar = new Chart(ctx2, {
			                type: 'bar',
			                data: barChartData2,
			                options: {
			                    responsive: true,
			                    legend: {
			                        position: 'top',
			                    },
			                    title: {
			                        display: true,
			                        text: 'Types of Visits'
			                    }
			                }
			            });

			            for (var x = 0; x < CombinedBar2.length; x++){
			                addData(myBar, CombinedBarNames2[x], colors2[x], CombinedBar2[x]);
			            }


			        };
		        
		        
		        
		        
		        
		        
			        window.onload = function() {
			        	
			        	
			        	
			        	load1();
			        	load2();
			        }
		        
		        
		        
		        
		        

		        function getRandomColor() {
		            var letters = '0123456789ABCDEF'.split('');
		            var color = '#';
		            for (var i = 0; i < 6; i++ ) {
		                color += letters[Math.floor(Math.random() * 16)];
		            }
		            return color;
		        }

		        function addData(chart, label, color, data) {
		            chart.data.datasets.push({
		                label: label,
		                backgroundColor: color,
		                data: data
		                });
		            chart.update();
		        }

			
			
			
			
			
			
    </script>
        
    
    
    

       <script type="text/javascript">

	

		
		
		

       

      
    </script>
 
    
    
    
    
    
<script>
	j$ = jQuery.noConflict();
	j$(document).ready( function () {
		var contactTable = j$('[id$="smarttable"]').DataTable({
			order: [[0, 'asc']],
			
		});

	});

			</script>
			
    
    
    
    
    
     
    
    
    
    

</html>