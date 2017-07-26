<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!doctype html>
<html class="no-js" lang="en">

<head>
    	<script src='js/jquery.min.js'></script>
		<script src='js/jquery-ui.min.js'></script>
		<link rel="stylesheet" href="css/bootstrap.css">
		<link rel="stylesheet" href="chosen/chosen.css">
		<script src="chosen/chosen.jquery.js" type="text/javascript"></script>
		<script src="js/bootstrap.min.js"></script>
		<meta charset="utf-8">
		<meta http-equiv="x-ua-compatible" content="ie=edge">
		<title> PAASCU - Accreditation Schedule Manager </title>
		<meta name="description" content="">
		<meta name="viewport" content="width=device-width, initial-scale=1">
		<link rel="apple-touch-icon" href="apple-touch-icon.png">
		<!-- Place favicon.ico in the root directory -->
		<link rel="stylesheet" href="css/vendor.css">
		
      <script type="text/javascript" src="js/jspdf.min.js"></script>
      <script type="text/javascript" src="js/html2canvas.min.js"></script>
   	  <link type="text/css" rel="stylesheet" href="css/stylestest.css"/>
   	  <script type="text/javascript" src="js/headerfooter.js"></script>
   	  
		
		
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

      <script type="text/javascript">

          function genPDF() {

            var doc = new jsPDF()
            var suff = document.getElementById("suffix");
            var strsuff = suff.options[suff.selectedIndex].value;
            var deptdrop = document.getElementById("department-dropdown");
            var dept = deptdrop.options[deptdrop.selectedIndex].value;
            var areadrop = document.getElementById("area-dropdown");
            var area = areadrop.options[areadrop.selectedIndex].value;

            doc.setFontSize(12)
            doc.text(20, 55, textDate) 

            doc.setFontType("bold");
            var recipient = $('#recipient').val()
            recipient = strsuff + recipient;
            doc.text(20, 70, recipient)

            doc.setFontType("normal");
            var recipientpos = $('#recipientpos').val()
            doc.text(20, 75, recipientpos)
            var school = $('#school').val()
            doc.text(20, 80, school)
            var city = $('#city').val()
            city = city + " City"
            doc.text(20, 85, city)


            var invited = $('#invited').val()
            var surveyschool = $('#surveyschool').val()
            var schoolcity = $('#schoolcity').val()
            schoolcity = schoolcity + " City"
            var startdate = $('#fromdate').val()
            var todate = $('#todate').val()

            var signperson = $('#signperson').val()
            var signposition = $('#signposition').val()

            doc.text(20, 95, "Dear " + recipient)

            var paragraph="\nWe are in the process of forming a Committee for the Resurvey Visit of the "+dept+" of "+surveyschool+", "+schoolcity+". The visit has been scheduled on "+startdate+" to "+todate+".\n\nYou have been recommended to serve as Chairperson for the area of Faculty. The school's report and other relevant data will be sent to you as soon as we hear from you.\n\n\nSincerely yours,\n\n\n"+signperson+"\n"+signposition+""
            
            lines = doc.splitTextToSize(paragraph, 175) 

            doc.text(20, 100, lines)

            doc.addImage(imgHeader, 'JPEG', 0, 0, 210, 50)
            doc.addImage(imgFooter, 'JPEG', 0, 260, 210, 50)

            var filename = recipient + " Chairperson Letter " + todayDateInput + ".pdf";

            doc.save(filename);
          }
          
          

          function genPDFDB() {

            var doc = new jsPDF()

            doc.setFontSize(12)
            doc.text(20, 55, textDate) 

            doc.setFontType("bold");
            var recipient = $('#recepient1').val()
            doc.text(20, 70, recipient)

            doc.setFontType("normal");
            var recipientpos = $('#recepientpos1').val()
            doc.text(20, 75, recipientpos)
            var school = $('#school1').val()
            doc.text(20, 80, school)
            var city = $('#city1').val()
            city = city + " City"
            doc.text(20, 85, city)


             if($('#prog1').val())
           	  {
            	  var program = $('#prog1').val();
              }

              else if($('#dept1').val())
           	  {
            	  var program = $('#dept1').val();
              }
           	  
            
            var invited = $('#recepient-1').val()
            var surveyschool = $('#surveyschool1').val()
            var schoolcity = $('#schoolcity1').val()
            schoolcity = schoolcity + " City"
            var area = $('#area1').val()

            var from = $("#fromdate1").val().split("-");

            var startdate = new Date(from[0], from[1]-1, from[2]).getFormatDate().toString();
            
            var to = $("#todate1").val().split("-");

            var todate = new Date(to[0], to[1]-1, to[2]).getFormatDate().toString();

            var signperson = $('#signperson1').val()
            var signposition = $('#signposition1').val()

            doc.text(20, 95, "Dear " + recipient + ": ")

            var paragraph="\nWe are in the process of forming a Committee for the Resurvey Visit of the "+program+" of "+surveyschool+", "+schoolcity+". The visit has been scheduled on "+startdate+" to "+todate+".\n\nYou have been recommended to serve as Chairperson for the area of "+area+". The school's report and other relevant data will be sent to you as soon as we hear from you.\n\n\nSincerely yours,\n\n\n"+signperson+"\n"+signposition+""
            
            lines = doc.splitTextToSize(paragraph, 175) 

            doc.text(20, 100, lines)

            doc.addImage(imgHeader, 'JPEG', 0, 0, 210, 50)
            doc.addImage(imgFooter, 'JPEG', 0, 260, 210, 50)

            var filename = recipient + " Chairperson Letter " + todayDateInput + ".pdf";

            doc.save(filename);
          }

      </script>
      <script>
    
	    $(document).ready(function() {
			$('#institutionForm').chosen().change(function(){
				
				$('#divProgramForm').empty();
				
				document.getElementById("dept1").value = "";
				document.getElementById("prog1").value = "";
				
				var institutionID = $('#institutionForm').find(":selected").val();
				
				$.getJSON("InstitutionForInvitationLoader?institutionID=" + institutionID, function(data){
					   
					$.each(data, function (key, value) {
						  document.getElementById("surveyschool1").value = value.name;
							
						  document.getElementById("schoolcity1").value = value.city;
			    	});
					
	    		});
				$.getJSON("ProgramLoader?institutionID=" + institutionID, function(data){
				    
					if(data.length > 0) 
			    	{
					
						document.getElementById("divDept1").setAttribute("style", "visibility: hidden;");
						document.getElementById("divProg1").setAttribute("style", "visibility: visible;");
						
						var selectProgram = document.createElement("select");
						
						selectProgram.setAttribute("id", "programForm");
						
						 var option = document.createElement("option");
							option.text = "";
							option.value = "0";
							selectProgram.add(option);
						
						$.each(data, function (key, value){
							    var option = document.createElement("option");
								option.text = value.degreeName;
								option.value = value.SPID;
								selectProgram.add(option);
					    	});

						$('#programForm').trigger("chosen:updated");

						var labelProgramSelect = document.createElement("label");
						labelProgramSelect.innerHTML = "Programs: &nbsp;";
						
						document.getElementById("divProgramForm").appendChild(labelProgramSelect);

						document.getElementById("divProgramForm").appendChild(selectProgram);
						
						
			    	}
					else
					{
						document.getElementById("divDept1").setAttribute("style", "visibility: visible;");
						document.getElementById("divProg1").setAttribute("style", "visibility: hidden;");
						
					}
				});
			});
				
	    	
			$('#accreditorForm').chosen().change(function(){
				
				var accreditorID = $('#accreditorForm').find(":selected").val();
				
				$.getJSON("AccreditorForThankYouLoader?accreditorID=" + accreditorID, function(data){
					   
					$.each(data, function (key, value) {
					    var schoolFromLoader = value.name;
						var cityFromLoader = value.city;
					    var positionFromLoader = value.position;
						var placeFromLoader = value.placeOfPosition;
					
						document.getElementById("recepient1").value = $('#accreditorForm').find(":selected").text();
						document.getElementById("recepient-1").value = $('#accreditorForm').find(":selected").text();
						document.getElementById("recepientpos1").value = positionFromLoader + ", " + placeFromLoader;
						document.getElementById("school1").value = schoolFromLoader;
						document.getElementById("city1").value = cityFromLoader;
						
						
			    	});
				});
				
				
			});
			
			$('#areaForm').chosen().change(function(){
				
					document.getElementById("area1").value = $('#areaForm').find(":selected").text();
			});
			
			
			$(document.body).on('change', '#programForm', function(event) {
			    
				document.getElementById("prog1").value = $('#programForm').find(":selected").text();
			
			});
			
		    
		    getInstitutions();
		    getAccreditors();
		    getAreas();
		    
		});
	    
	    function getAreas(){
	    	//GETS ALL SYSTEMS FOR THE SELECT DROPDOWN
			var obj = document.getElementById('areaForm');
			
			$.getJSON("AreasLoader", function(data){
				
				var option = document.createElement("option");
				option.text = "";
				option.value = 0;
				obj.add(option);
				$.each(data, function (key, value){
					
					var option = document.createElement("option");
					option.text = value.name;
					option.value = value.areaID;
					obj.add(option);
					
				});	
				$('#areaForm').trigger("chosen:updated");
			});
			
		}
	    
	    
	    function getInstitutions(){
	    	//GETS ALL SYSTEMS FOR THE SELECT DROPDOWN
			var obj = document.getElementById('institutionForm');
			
			$.getJSON("InvitationInstitutionsLoader", function(data){
				
				var option = document.createElement("option");
				option.text = "";
				option.value = 0;
				obj.add(option);
				$.each(data, function (key, value){
					
					var option = document.createElement("option");
					option.text = value.institutionName + " - " + value.city + " - " + value.educLevel;
					option.value = value.institutionID;
					obj.add(option);
					
				});	
				$('#institutionForm').trigger("chosen:updated");
			});
			
		}
	    

	    function getAccreditors(){
	    	//GETS ALL SYSTEMS FOR THE SELECT DROPDOWN
			var obj = document.getElementById('accreditorForm');
			
			$.getJSON("InvitationAccreditorsLoader", function(data){
				
				var option = document.createElement("option");
				option.text = "";
				option.value = 0;
				obj.add(option);
				$.each(data, function (key, value){
					
					var option = document.createElement("option");
					option.text = value.accName;
					option.value = value.accID;
					obj.add(option);
					
				});	
				$('#accreditorForm').trigger("chosen:updated");
			});
			
		}
	    
	    Date.prototype.getFormatDate = function() {
	        var monthNames = [ "January", "February", "March", "April", "May", "June", 
	                           "July", "August", "September", "October", "November", "December" ];
	        return monthNames[this.getMonth()]+ ' ' + this.getDate() + ', '+this.getFullYear();
	        
	        
	    }
	
		</script>
      

    <style>
        .container {
            width: 125%;
            overflow: hidden;
            display: block;
            height: 130px;
            z-index: -1;
            margin-left: -15px;
        }
        #bgvid {
            position: relative;
            top: -400px;
            margin-top: 0px;
            width: 115%
        }
        body {
            font-family: "Lucida Grande", Helvetica, Arial, Verdana, sans-serif;
            font-size: 14px;
        }
        #calendar {
            max-width: 900px;
            margin: 0 auto;
        }
        #bg {
            height: 640px;
            position: fixed;
        }
        #main {
            position: relative;
            top: -290px;
        }
        #pnum_danger,
        #pnum_info,
        #pnum_warning,
        #pnum_primary {
            font-size: 75px;
            text-align: center;
            margin-left: -2px;
            padding: 0;
            line-height: 85px;
        }
        #pnum_danger {
            color: #5c5c5c;
            transition: all 0.5s ease;
        }
        #pnum_danger:hover {
            color: #ff2b2b;
            font-size: 100px;
            cursor: pointer;
        }
        #pnum_warning {
            color: #5c5c5c;
            transition: all 0.5s ease;
        }
        #pnum_warning:hover {
            font-size: 100px;
            cursor: pointer;
            color: #fe8832;
        }
        #pnum_info {
            color: #5c5c5c;
            transition: all 0.5s ease;
        }
        #pnum_info:hover {
            color: #5ecdf3;
            font-size: 100px;
            cursor: pointer;
        }
        #pnum_primary {
            color: #5c5c5c;
            transition: all 0.5s ease;
        }
        #pnum_primary:hover {
            color: #85CE36;
            font-size: 100px;
            cursor: pointer;
        }
        #psub {
            font-size: 17px;
            color: #bcbcbc;
            text-align: center;
            margin-top: 6px;
            padding: 0;
            line-height: 20px;
        }
        #bc {
            color: white;
        }
        #bc:hover {
            color: #85CE36;
        }
        #welcome {
            position: relative;
            top: -110px;
            color: white;
            left: 40px;
            font-family: Existence-Light;
        }
        .h1 {
            font-size: 100%;
        }
        @font-face {
            font-family: Existence-Light;
            src: url(fonts/Roboto-Thin.ttf);
        }
        #notifcard {
            -webkit-box-shadow: 0px 1px 5px 0px rgba(50, 50, 50, 0.58);
            -moz-box-shadow: 0px 1px 5px 0px rgba(50, 50, 50, 0.58);
            box-shadow: 0px 1px 5px 0px rgba(50, 50, 50, 0.58);
            width: 87%;
            left: 15px;
        }
        #maincard {
            width: 100%;
            padding: 0px;
            background-color: #ffffff;
            top: -50px;
            margin-bottom: 10px;
            margin-top: 0px;
            height: 700px;
            border-radius: 3px;
            -webkit-box-shadow: 0px 9px 24px 0px rgba(0, 0, 0, 0.75);
            -moz-box-shadow: 0px 9px 24px 0px rgba(0, 0, 0, 0.75);
            box-shadow: 0px 9px 24px 0px rgba(0, 0, 0, 0.75);
        }
    </style>

    <body>
        <div class="main-wrapper" style="z-index:1;">
            <div class="app" id="app">

                <jsp:include page="sidebar.jsp" />

                <div class="container">
                    <video poster="assets/banner.jpg" id="bgvid" playsinline autoplay muted loop>
                        <!-- WCAG general accessibility recommendation is that media such as background video play through only once. Loop turned on for the purposes of illustration; if removed, the end of the video will fade in the same way created by pressing the "Pause" button  -->

                        <source src="assets/vid.mp4" type="video/mp4">
                    </video>
                </div>
                <div id="welcome">
                    <h1>Create Chairperson Letter</h1>
                </div>
                <article class="content dashboard-page">
                    <ul class="nav nav-tabs" style="margin-top:-4cm;">
                        <li class="active"><a data-toggle="tab" href="#fromDB">From Database</a>
                        </li>
                        <li><a data-toggle="tab" href="#manualInput">Manual Input</a>
                        </li>
                    </ul>

                    <div class="tab-content">
                        <div id="fromDB" class="tab-pane fade in active">
                        <br>
                            <h3>Import From Database</h3>
                            
                            	<%-- <div class="form-group">
									<label for="accreditorForm">Accreditor: </label>
		                            <br>
		                            <select class="form-control underlined chosen-select" data-placeholder="Choose an Accreditor..." id="accreditorForm" style="background: transparent;">
	                         		    <option ></option>
									    
		                         		<c:forEach var="acc" items="${accreditors}">
									        <option value="${acc.getAccreditorID()}">${acc.getHonorifics()}. ${acc.getFirstName()} ${acc.getLastName()} </option>
									    </c:forEach> 
									</select> 
								</div> --%>
									<%-- <label for="institutionForm">Institution: </label>
		                            <br>
		                            <select class="form-control underlined chosen-select" data-placeholder="Choose an Institution..." id="institutionForm" style="background: transparent;">
		                         	       <option ></option>
									
		                         	    <c:forEach var="inst" items="${institutions}">
									        <option value="${inst.getInstitutionID()}">${inst.getName()} - ${inst.getCity()} - ${inst.getEducLevel()} </option>
									    </c:forEach>
									</select> --%>
								<div class="form-group" id = "divAccreditorForm">
									<label for="accreditorForm">Accreditor to be assigned as chairperson:</label>
									<select class="form-control underlined chosen-select" data-placeholder="Choose an Accreditor..." id="accreditorForm" style="background: transparent;">
									</select>
								</div>
								<div class="form-group" id = "divInstitutionForm">
									<label for="institutionForm">Institution to be surveyed:</label>
									<select class="form-control underlined chosen-select" data-placeholder="Choose an Institution..." id="institutionForm" style="background: transparent;">
									</select>
								</div>
								<div class="form-group" id="divProgramForm">
								</div>
								<div class="form-group" id = "divAreaForm">
									<label for="areaForm">Areas:</label>
									<select class="form-control underlined chosen-select" data-placeholder="Choose an Area..." id="areaForm" style="background: transparent;">
									</select>
								</div>
								<div class="form-group" id="divProgramForm">
									
								</div>
								<div class="form-group" id="textFields">
									<br>
									<br>
									<br>
									<h5>Edit Text Fields</h5>
									<hr>
																		
									<input style="width: 30%;" placeholder="Recepient" id="recepient1">	
									<br>						
									<input style="width: 30%;" placeholder="Recepient Position, Department/College" id="recepientpos1">							
									<br>
									<input style="width: 30%;" placeholder="Institution Name" id="school1">							
									<br>
									<input style="width: 30%;" placeholder="Institution City" id="city1">		
									<br><br>
									<p style="display: inline-block;">Dear &nbsp;</p><input style="width: 30%;" placeholder="Recepient" id="recepient-1"><p style="display: inline-block;">: &nbsp;</p>	
									<br>
									<br>
									<p style="display: inline-block;">We are in the process of forming a Committee for the Resurvey Visit of the &nbsp;</p>
									
									<div id="divDept1">
										<input style="width: 100%;" placeholder="Department" id="dept1">
									</div>
									<br>
									<div id="divProg1" style="visibility: hidden;">
										<input style="width: 100%;" placeholder="Program(s)" id="prog1">
									</div>
									<br>
									<br>
									<p style="display: inline-block;">&nbsp; of &nbsp;</p>
									<input style="width: 40%;" placeholder="Institution Name" id="surveyschool1">
									<p style="display: inline-block;">, &nbsp;</p>
									<input style="width: 20%;" placeholder="Institution City" id="schoolcity1">
									<p style="display: inline-block;">.</p>
									<br>
									<p style="display: inline-block;">&nbsp;The visit has been scheduled from &nbsp;</p>
									<input type="date" id="fromdate1" min=todayDateInput>
									<p style="display: inline-block;">&nbsp; to &nbsp;</p>
									<input type="date" id="todate1" min=todayDateInput>
									<p style="display: inline-block;">&nbsp; .</p>
									
									<br>
									<br>
									
									<p style="display: inline-block;">You have been recommended to serve as Chairperson for the area of &nbsp;</p>
									<input style="width: 20%;" placeholder="Area" id="area1">
									<p style="display: inline-block;">. The school's report and other relevant data will be sent to you as soon as we hear from you.</p>
									
									<br><br>
									<p style="display: inline-block;">Sincerely Yours,</p>
                                	<br>
	                            	
                                	<input type="text" id="signperson1" value="" placeholder="Signed by">
	                                <br>
	                                <input type="text" id="signposition1" value="" placeholder="Position">
	                                <br><br>
									
								
                             	<button class ="btn btn-info btn-sm" onclick="genPDFDB()">Download PDF</button>
                             	
									
								</div>
								
								
                               
							
							
                        </div>
                        <div id="manualInput" class="tab-pane fade">
                        	<br>
                            <h3>Manual Input</h3>

                            <label for="suffix">Suffix</label><br>
						    <select name="dropdown" id="suffix">
						        <option value="Mr. ">Mr.</option>
						        <option value="Ms. ">Ms.</option>
						        <option value="Fr. ">Fr.</option>
						        <option value="Dr. ">Dr.</option>
						        <option value="Dra. ">Dra.</option>
						    </select>
						
						    <br>
						    <input type="text" id="recipient" value="" placeholder="Recipient"><br>
						    <input type="text" id="recipientpos" value="" placeholder="Recipient Position"><br>
						    <input type="text" id="school" value="" placeholder="School"><br>
						    <input type="text" id="city" value="" placeholder="City"> City<br>
						
						    <label for="department-dropdown">Select Department</label><br>
						    <select name="department-dropdown" id="department-dropdown">
						        <option value="Elementary Education Program">Elementary</option>
						        <option value="Secondary Education Program">Secondary</option>
						        <option value="Integrated Basic Education Program">Integrated Basic Education</option>
						        <option value="Tertiary Education Program">Tertiary</option>
						        <option value="Graduate Education Program">Graduate</option>
						        <option value="Medical Education Program">Medical</option>
						        <option value="CECSTE Program">CECSTE</option>
						    </select>
						
						    <br>
						    <input type="text" id="surveyschool" value="" placeholder="Survey School"><br>
						    <input type="text" id="schoolcity" value="" placeholder="School City"> City<br><br>
						    <label for="fromdate" id="fromdatelabel"></label><br>
						    <input type="date" id="fromdate" min=todayDateInput><br><br>
						    <label for="todate" id="todatelabel"></label><br>
						    <input type="date" id="todate" min=todayDateInput><br><br>
						
						    <label for="area-dropdown">Select Area</label><br>
						    <select name="area-dropdown" id="area-dropdown">
						        <option value="University/College Community Involvement">University/College Community Involvement</option>
						        <option value="Faculty">Faculty</option>
						        <option value="Library">Library</option>
						        <option value="Physical Plant">Physical Plant</option>
						        <option value="Student Services">Student Services</option>
						        <option value="Administration">Administration</option>
						    </select>
						
						    <br><br>
						    <input type="text" id="signperson" value="" placeholder="Signed by"><br>
						    <input type="text" id="signposition" value="" placeholder="Position"><br><br>



                            <button class="btn btn-info btn-sm" onclick="genPDF()">Download PDF</button>
                            <!-- <input type="button" id="button" value="Submit"/> -->
	
                        </div>
                    </div>

                </article>
            </div>
        </div>
		<script type="text/javascript">
			var config = {
			  '.chosen-select'           : {},
			  '.chosen-select-deselect'  : {allow_single_deselect:true},
			  '.chosen-select-no-single' : {disable_search_threshold:10},
			  '.chosen-select-no-results': {no_results_text:'Oops, nothing found!'},
			  '.chosen-select-width'     : {width:"95%"}
			}
			for (var selector in config) {
			  $(selector).chosen(config[selector]);
			}
		</script>
    </body>

    <script type="text/javascript">
    
	    Date.prototype.getMonthName = function() {
	        var monthNames = [ "January", "February", "March", "April", "May", "June", 
	                           "July", "August", "September", "October", "November", "December" ];
	        return monthNames[this.getMonth()];
	    }
	
	
	    Date.prototype.getFormatDate = function() {
	        var monthNames = [ "January", "February", "March", "April", "May", "June", 
	                           "July", "August", "September", "October", "November", "December" ];
	        return this.getDate() + ' ' + monthNames[this.getMonth()]+ ' ' + +this.getFullYear();
	        
	        
	    }
    
    
        var today = new Date();
        var textDate = new Date().getFormatDate().toString();
        var dd = today.getDate();
        var mm = today.getMonth() + 1;

        var yyyy = today.getFullYear();
        if (dd < 10) {
            dd = '0' + dd;
        }
        if (mm < 10) {
            mm = '0' + mm;
        }
        var today = dd + '/' + mm + '/' + yyyy;
        var todayDateInput = yyyy + '-' + mm + '-' + dd;
        var textDateNum = today.toString();
      
        
        function testfunction() {
            window.alert($('#fromdate').val());
        }

       
    </script>

    <script>
        $('#button').click(function() {

            var doc = new jsPDF();

            var name = $('#name').val();

            doc.setFontSize(26);
            doc.setTextColor(92, 76, 76);

            doc.text(23, 81, name);
            doc.save('test.pdf');


        });
    </script>



    <!-- Reference block for JS -->
    <div class="ref" id="ref">
        <div class="color-primary"></div>
        <div class="chart">
            <div class="color-primary"></div>
            <div class="color-secondary"></div>
        </div>
    </div>
    <script src="js/app.js"></script>



</html>