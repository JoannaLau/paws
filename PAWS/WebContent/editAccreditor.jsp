<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<html class="no-js" lang="en">

<head>
	<!-- IMPORTS -->
    <script src='js/jquery.min.js'></script>
    <!--     <script src='js/jquery-ui.min.js'></script> -->
    <link rel="stylesheet" href="css/bootstrap.css">
    <script src="js/bootstrap.min.js"></script>
    <link rel="apple-touch-icon" href="apple-touch-icon.png">
    <link rel="stylesheet" href="css/vendor.css">
    <!--     <link href='fullcalendar.css' rel='stylesheet' /> -->
    <!--     <link href='calendar/fullcalendar.print.css' rel='stylesheet' media='print' /> -->
    <!-- 	<script src='calendar/lib/moment.min.js'></script> -->
    <link rel="stylesheet" href="chosen/chosen.css">
    <script src="chosen/chosen.jquery.js" type="text/javascript"></script>
    <link rel="stylesheet" type="text/css" href="css/jquery.dataTables.min.css">
    <!--  	<link title="timeline-styles" rel="stylesheet" href="css/timeline.css"> -->
    <script src="js/bootstrap-datepicker.min.js"></script>
    <link rel="stylesheet" href="css/bootstrap-datepicker.css">
    <!-- 	<link title="timeline-styles" rel="stylesheet" href="css/datepicker.css"> -->
    <!-- END IMPORTS -->
    <meta charset="utf-8">
    <meta http-equiv="x-ua-compatible" content="ie=edge">
    <title> PAASCU - Accreditation Schedule Manager </title>
    <meta name="description" content="">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="apple-touch-icon" href="apple-touch-icon.png">
    <!-- Place favicon.ico in the root directory -->
    <!-- Theme initialization -->
    <script>
        var themeSettings = (localStorage.getItem('themeSettings')) ? JSON.parse(localStorage.getItem('themeSettings')) : {};
        var themeName = themeSettings.themeName || '';
        if (themeName) {
            document.write('<link rel="stylesheet" id="theme-style" href="css/app-' + themeName + '.css">');
        } else {
            document.write('<link rel="stylesheet" id="theme-style" href="css/app.css">');
        }
    </script>
    <!--         <link href='fullcalendar.css' rel='stylesheet' /> -->
    <!-- <link href='calendar/fullcalendar.print.css' rel='stylesheet' media='print' /> -->
    <!-- <script src='calendar/lib/moment.min.js'></script> -->
    <!-- <script src='calendar/fullcalendar.min.js'></script> -->
    



<script>	
$(document).ready(function() {
	var institutionForm = document.getElementById('institutionFormWork');
	
	$.getJSON("InstitutionsLoader", function(data){
		$.each(data, function (key, value){
			var option = document.createElement("option");
			option.text = value.institutionName;
			option.value = value.institutionID;
			institutionForm.add(option);
			$('#institutionFormWork').trigger("chosen:updated");
		});	
	});

	var format = "MM dd, yyyy";
    $('#datepicker2').datepicker({
        format: "yyyy-mm-dd",
        autoclose: true,
    });
    $('#datepicker3').datepicker({
   	 format: "yyyy-mm-dd",
        autoclose: true,
    });

    $('#datepicker1').datepicker({
   	 format: "yyyy-mm-dd",
        autoclose: true,
    });
	
	$('#external-events .fc-event').each(function() {

		// store data so the calendar knows to render an event upon drop
		$(this).data('event', {
			title: $.trim($(this).text()), // use the element's text as the event title
			stick: true // maintain when user navigates (see docs on the renderEvent method)
		});

		// make the event draggable using jQuery UI
		$(this).draggable({
			zIndex: 999,
			revert: true,      // will cause the event to go back to its
			revertDuration: 0  //  original position after the drag
		});

	});

	
     
	var systemFormEdu = document.getElementById('systemFormEdu');
	var systemFormWork = document.getElementById('systemFormWork');


	var institutionFormEdu = document.getElementById('institutionFormEdu');
	var institutionFormWork = document.getElementById('institutionFormWork');
	
	//EVENT LISTENER FOR CHOOSING A SYSTEM, CHANGING THE INSTITUTIONS AND SHOWING WHAT'S UNDER THAT SYSTEM
	
	
	$('#systemFormWork').chosen().change(function(){
		$('#institutionFormWork').empty();
		$('#institutionFormWork').trigger("chosen:updated");

		var temp = document.createElement("option");
		temp.text = "";
		temp.value = 0;
		var systemID = $('#systemFormWork').find(":selected").val();	
		institutionFormWork.add(temp);
		$.getJSON("InstitutionsLoader?systemID=" + systemID, function(data){
			$.each(data, function (key, value){
				var option = document.createElement("option");
				option.text = value.institutionName;
				option.value = value.institutionID;
				institutionFormWork.add(option);
				$('#institutionFormWork').trigger("chosen:updated");
			});	
		});
	});
	
	$('#systemFormEdu').chosen().change(function(){
		$('#institutionFormEdu').empty();
		$('#institutionFormEdu').trigger("chosen:updated");

		var temp = document.createElement("option");
		temp.text = "";
		temp.value = 0;
		var systemID = $('#systemFormEdu').find(":selected").val();	
		institutionFormEdu.add(temp);
		$.getJSON("InstitutionsLoader?systemID=" + systemID, function(data){
			$.each(data, function (key, value){
				var option = document.createElement("option");
				option.text = value.institutionName;
				option.value = value.institutionID;
				institutionFormEdu.add(option);
				$('#institutionFormEdu').trigger("chosen:updated");
			});	
		});
	});
	
	$('#institutionFormEdu').chosen();
	$('#institutionFormWork').chosen();

	$(".chosen-select").trigger("chosen:updated");
	
	getSystems();
 	getDisciplines();
	getAreas();
	getHonorifics();
	getCountries();
	getCities();
		
	<c:forEach items="${accreditor.getWorks()}" var="work">
		var inst = "<c:out value="${work.getInstitution()}"/>";
		var pos = "<c:out value="${work.getPosition()}"/>";
		var placepos = "<c:out value="${work.getPlaceOfPosition()}"/>";
		var from = "<c:out value="${work.getDateEntered()}"/>";
		var to = "<c:out value="${work.getDateFinished()}"/>";
		var institutionID = "<c:out value="${work.getAccreditorID()}"/>";
		if(to == ""){
			var add = "<li class='list-group-item'>"+inst+"<ul class='list-group'><li class='list-group-item'>Position: " + pos + "</li><li class='list-group-item'>Place of Position: " + placepos + "</li><li class='list-group-item'>From " + from + " to present</li></ul></li>";

		}else{
			var add = "<li class='list-group-item'>"+inst+"<ul class='list-group'><li class='list-group-item'>Position: " + pos + "</li><li class='list-group-item'>Place of Position: " + placepos + "</li><li class='list-group-item'>From " + from + " to " + to + "</li></ul></li>";

		}

		var obj = {};
		obj.institutionID = institutionID;
		obj.pos = pos;
		obj.placepos = placepos;
		obj.from = from;
		obj.to = to;
		affObject.works.push(obj);
		$('#addedAffiliations').append(add);
		var lal = document.getElementById("affiliations");
		lal.scrollTop = lal.scrollHeight;
	</c:forEach>
	
	<c:forEach items="${accreditor.getDegrees()}" var="deg">
		var course = "<c:out value="${deg.getDegreeName()}"/>";
		var univ = "<c:out value="${deg.getInstitution()}"/>";
		var add = "<li class='list-group-item'>"+univ+"<ul class='list-group'><li class='list-group-item'>Course: " + course + "</li></ul></li>";
		
		var obj = {};
		obj.institutionID = "<c:out value="${deg.getInstitutionID()}"/>";
		obj.course = course;
		affObject.edu.push(obj);
		
		$('#addedAffiliations').append(add);
		var lal = document.getElementById("affiliations");
		lal.scrollTop = lal.scrollHeight;
	</c:forEach>

		
});
function getSystems(){
	//GETS ALL SYSTEMS FOR THE SELECT DROPDOWN
	var obj1 = document.getElementById('systemFormEdu');
	var obj2 = document.getElementById('systemFormWork');

	$.getJSON("SystemsLoader", function(data){
		var option = document.createElement("option");
		option.text = "";
		option.value = 0;
		
		var option1 = document.createElement("option");
		option1.text = "";
		option.value = 0;
		
		var option2 = document.createElement("option");
		option2.text = "";
		option2.value = 0;
		
		obj1.add(option1);
		obj2.add(option2);
		
		
		$.each(data, function (key, value){
			var option = document.createElement("option");
			option.text = value.systemName;
			option.value = value.systemID;
			
			var option1 = document.createElement("option");
			option1.text = value.systemName;
			option1.value = value.systemID;
			
			var option2 = document.createElement("option");
			option2.text = value.systemName;
			option2.value = value.systemID;
			
			obj1.add(option1);
			obj2.add(option2);
		});	
		$('#systemFormEdu').trigger("chosen:updated");
		$('#systemFormWork').trigger("chosen:updated");


	});
}

function getAreas() {
    //GETS ALL SYSTEMS FOR THE SELECT DROPDOWN
	var primary = document.getElementById("primaryArea");
    var secondary = document.getElementById("secondaryArea");
    var tertiary = document.getElementById("tertiaryArea");
   
    console.log(primary);
    <c:set var="acc" value="${accreditor}"/>
		var primaryID = "<c:out value="${acc.getPrimaryAreaID()}"/>";
		var secondaryID = "<c:out value="${acc.getSecondaryAreaID()}"/>";
		var tertiaryID = "<c:out value="${acc.getTertiaryAreaID()}"/>";
		
	$.getJSON("AreasLoader", function(data) {
       
        $.each(data, function(key, value) {
        	
        	
            var option1 = document.createElement("option");
            option1.text = value.name;
            option1.value = value.areaID;
            
            if(primaryID == value.areaID)
            option1.setAttribute("selected", true);
            
            var option2 = document.createElement("option");
            option2.text = value.name;
            option2.value = value.areaID;
            if(secondaryID == value.areaID)
                option2.setAttribute("selected", true);
            
            var option3 = document.createElement("option");
            option3.text = value.name;
            option3.value = value.areaID;

            if(tertiaryID == value.areaID)
                option3.setAttribute("selected", true);
           
            
            primary.appendChild(option1);
            secondary.appendChild(option2);
            tertiary.appendChild(option3);

        });

    });
}

function getHonorifics() {
    //GETS ALL SYSTEMS FOR THE SELECT DROPDOWN
		var honorifics = document.getElementById("honorificsSuggestions");
  
    $.getJSON("HonorificsLoader", function(data) {
       
        $.each(data, function(key, value) {
            var option1 = document.createElement("option");
            option1.text = value.honorifics;
           	 
            honorifics.appendChild(option1);

        });

    });
}

function getCountries() {
    //GETS ALL SYSTEMS FOR THE SELECT DROPDOWN
		var country = document.getElementById("countrySuggestions");
  
    $.getJSON("CountriesLoader", function(data) {
       
        $.each(data, function(key, value) {
            var option1 = document.createElement("option");
            option1.text = value.country;
           	 
            country.appendChild(option1);

        });

    });
}

function getCities() {
    //GETS ALL SYSTEMS FOR THE SELECT DROPDOWN
		var city = document.getElementById("citySuggestions");
  
    $.getJSON("CitiesLoader", function(data) {
       
        $.each(data, function(key, value) {
            var option1 = document.createElement("option");
            option1.text = value.city;
           	 
            city.appendChild(option1);

        });

    });
}
/* 
function getDisciplines() {
    //GETS ALL SYSTEMS FOR THE SELECT DROPDOWN

	var disciplineSelect = document.getElementById("disciplineSuggestions");

    $.getJSON("DisciplinesLoader", function(data) {
       
        $.each(data, function(key, value) {
            var option1 = document.createElement("option");
            option1.text = value.discipline;

            disciplineSelect.appendChild(option1);
            
         
        });

    });
} */


function getDisciplines(){
	//GETS ALL DISCIPLINES FOR THE SELECT DROPDOWN
	var discipline = "${acc.getDiscipline()}";
	
	var obj = document.getElementById('disciplineForm');	
	$.getJSON("DisciplineLoader", function(data){	
		var option = document.createElement("option");
		option.text = "";
		option.value = 0;
		obj.add(option);
	
		$.each(data, function (key, value){
		
			var option = document.createElement("option");
			option.text = value.disciplineName;
			option.value = value.disciplineID;
			if(option.text == discipline){
				option.selected = true;
			}
			obj.add(option);
		
		});	
		$('#disciplineForm').trigger("chosen:updated");
	});
	
}

function addProp(){
	$("#progBar").html("<div class='progress-bar progress-bar-success' role='progressbar' style='width:50%' id='progDetails'>1. Details</div><div class='progress-bar progress-bar-success progress-bar-striped' role='progressbar' style='width:50%' id='progProponents'>2. Affiliations </div>");
	$(".chosen-select").trigger("chosen:updated");
	 $(".chosen-container").each(function() {
	       $(this).attr('style', 'width: 100%');
	   });     
	 
}

function addDet(){
	$("#progBar").html("<div class='progress-bar progress-bar-success progress-bar-striped' role='progressbar' style='width:50%' id='progDetails'>1. Details</div>");

}

function changeDetails(){
	$("#progProponents").className = "progress-bar progress-bar-success progress-bar-striped";
	$("#progDetails").className = "progress-bar progress-bar-success";
	$("#progSure").className = "progress-bar progress-bar-success";
}

function saveAccreditor(){
	var id = "<c:out value='${accreditor.getAccreditorID()}'/>";

	$.ajax({
		url: 'SaveEditAccreditor?accreditorID=' + id + "&" + $('#accForm').serialize(),
		type: 'POST',
		async: false,
		dataType: 'json',
		data: {affObject: JSON.stringify(affObject)},
		success: function(result){
			
		}
	});
	alert('Accreditor successfully edited! Redirecting you to the accreditors page...')

	document.location.href = "Accreditors";
}
var affObject = {
		works: [],
		edu: []
};

function addAffiliation(){
	var inst = $('#institutionFormWork').find(":selected").text();
	var pos = $('#pastPosition').val();
	var placepos = $('#pastPlacePosition').val();
	var from = $('#datepicker2').val();
	var to = $('#datepicker3').val();
	var institutionID = $('#institutionFormWork').find(":selected").val();	
	if (to == ""){
		var add = "<li class='list-group-item'>"+inst+"<ul class='list-group'><li class='list-group-item'>Position: " + pos + "</li><li class='list-group-item'>Place of Position " + placepos + "</li><li class='list-group-item'>From " + from + " to present</li></ul></li>";

	}else{
		var add = "<li class='list-group-item'>"+inst+"<ul class='list-group'><li class='list-group-item'>Position: " + pos + "</li><li class='list-group-item'>Place of Position " + placepos + "</li><li class='list-group-item'>From " + from + " to " + to + "</li></ul></li>";

	}

	var obj = {};
	obj.institutionID = institutionID;
	obj.pos = pos;
	obj.placepos = placepos;
	obj.from = from;
	obj.to = to;
	affObject.works.push(obj);
	$('#addedAffiliations').append(add);
	var lal = document.getElementById("affiliations");
	lal.scrollTop = lal.scrollHeight;
	
	$('#pastPosition').val("");
	$('#pastPlacePosition').val("");
	
	$('#datepicker2').val("");
	$('#datepicker3').val("");

}

function addEducation(){
	var course = $('#courseName').val();
	var univ = $('#institutionFormEdu').find(":selected").text();
	var add = "<li class='list-group-item'>"+univ+"<ul class='list-group'><li class='list-group-item'>Course: " + course + "</li></ul></li>";
	
	var obj = {};
	obj.institutionID = $('#institutionFormEdu').find(":selected").val();
	obj.course = course;
	affObject.edu.push(obj);
	
	$('#addedAffiliations').append(add);
	var lal = document.getElementById("affiliations");
	lal.scrollTop = lal.scrollHeight;
	
	$('#courseName').val("");
}

function togglePresent(){
	$('#datepicker3').prop('disabled', function(i, v) { return !v; });

		
		
}
</script>
<style>

	body {
		
		font-family: "Lucida Grande",Helvetica,Arial,Verdana,sans-serif;
		font-size: 14px;
	}

	#calendar {
		max-width: 900px;
		margin: -35px auto;
		padding: 10px;
background: rgba(255,255,255,1);
background: -moz-linear-gradient(45deg, rgba(255,255,255,1) 0%, rgba(246,246,246,1) 47%, rgba(237,237,237,1) 100%);
background: -webkit-gradient(left bottom, right top, color-stop(0%, rgba(255,255,255,1)), color-stop(47%, rgba(246,246,246,1)), color-stop(100%, rgba(237,237,237,1)));
background: -webkit-linear-gradient(45deg, rgba(255,255,255,1) 0%, rgba(246,246,246,1) 47%, rgba(237,237,237,1) 100%);
background: -o-linear-gradient(45deg, rgba(255,255,255,1) 0%, rgba(246,246,246,1) 47%, rgba(237,237,237,1) 100%);
background: -ms-linear-gradient(45deg, rgba(255,255,255,1) 0%, rgba(246,246,246,1) 47%, rgba(237,237,237,1) 100%);
background: linear-gradient(45deg, rgba(255,255,255,1) 0%, rgba(246,246,246,1) 47%, rgba(237,237,237,1) 100%);
filter: progid:DXImageTransform.Microsoft.gradient( startColorstr='#ffffff', endColorstr='#ededed', GradientType=1 );	
	 box-shadow: 1px 2px 5px #C0C0C0;
	}
	
	.fc-day-number{
		color: black;
	}
	
	#bg{
	height: 640px;
	position:fixed;
	}
	#maincard{
	height:750px;
	}
	
	

</style>
    </head>

    <body>
    	 
        <div class="main-wrapper">
      				
        			
		</div>
                <div class="app" id="app">
                <header class="header">
                   
                </header>
                <jsp:include page="sidebar.jsp" />
				
                <div class="sidebar-overlay" id="sidebar-overlay"></div>
				<form id="accForm">

                <article class="content dashboard-page">
				
				 <div class="title-block">
                        <h3 class="title" style="float:left;">
							<a href="Accreditors"> List of Accreditors </a> > Edit Accreditor
						</h3>
			     </div>
				<div class="col-md-12"id="maincard" >
				<div class="card card-block sameheight-item"id="maincard">		
				 <section class="section" id="section">  
				 
				<div class="tab-content">     
				
				 	<div id="menu1" class="tab-pane fade in active">  
												
			<section class="section" id="section" style="height:450px;"> 		
			
				   	
      				<div class="form-group row">
      				<c:set var="acc" scope="session" value="${accreditor}"/>
      				
      				<div class="col-xs-2">
      					<label>Title:</label>
    					<input type="text" class="form-control underlined" id="surveyName" name="honorifics" value="${acc.getHonorifics()}" list="honorificsSuggestions">
                        <datalist id="honorificsSuggestions">
                        </datalist>
    
      				</div>
      				<div class="col-xs-5">
						<label>First Name:</label>
    					<input type="text" class="form-control underlined" id="surveyName" name="firstName" value="${acc.getFirstName()}">
    				</div>
    				<div class="col-xs-1">
						<label>M.I.:</label>
    					<input type="text" class="form-control underlined" id="surveyName" name="middleName" value="${acc.getMiddleName()}">
    				</div>
      				<div class="col-xs-4">
    					<label>Last Name:</label>
    					<input type="text" class="form-control underlined" id="surveyName" name="lastName" value="${acc.getLastName()}">
    				</div>
    				</div>
    				
    				<div class="form-group row">
    				<div class="col-xs-7">
						<label>Email:</label>
    					<input type="text" class="form-control underlined" id="surveyName" name="email" value="${acc.getEmail()}">
    				</div>
    				<div class="col-xs-5">
    					<label>Contact Number:</label>
    					<input type="number" class="form-control underlined" id="surveyName" name="contact" value="${acc.getContact()}">
    				</div>
    				</div>
    				<div class="form-group row">
    				<div class="col-xs-7">
						<label>Address:</label>
  						<input type="text" class="form-control underlined" id="surveyName" name="address" value="${acc.getAddress()}">
					</div>
					<div class="col-xs-5">
						<label>City:</label>
 						<input type="text" class="form-control underlined" id="surveyName" name="city" value="${acc.getCity()}" list="citySuggestions">
                        <datalist id="citySuggestions">
	                    </datalist></div>
  					</div>
					
					<div class="form-group row">
					
					<div class="col-xs-7">
						<label><b>Country:</b></label>
  						<input type="text" class="form-control underlined" id="surveyName" name="country" value="${acc.getCountry()}" list="countrySuggestions">
                        <datalist id="countrySuggestions">
	                    </datalist>
                    </div>
					
					<div class="col-xs-5">
						<label><b>Discipline/Specialization:</b></label>
  						<select class="form-control underlined chosen-select" data-placeholder="Choose a Discipline..." id="disciplineForm" style="background: transparent;" name="discipline">
						</select>
					</div>
					
    				
					
  					</div>
  					<div class="form-group row">
					
					<div class="col-xs-7">
						<label><b>Venue Trained:</b></label>
  						<input type="text" class="form-control underlined" id="surveyName" name="venue_trained" value="${acc.getVenueTrained()}">
					</div>
    				<div class="col-xs-5">
                       <label><b>Date Trained:</b>
                       </label>
                       <div class="input-daterange input-group">
                           <input type="text" class="form-control underlined" id="datepicker1" name="date_trained" value="${acc.getDateTrained()}"/>
                       </div>
                   </div>
					
  					</div>
					
					<div class="form-group row">
						<div class="col-xs-12">
							<label>Primary Survey Area:</label>
    					<select class="form-control underlined" name="primaryArea" id="primaryArea">
    						
  						</select>
						</div>
					</div>
					<div class="form-group row">
						<div class="col-xs-12">
							<label>Secondary Survey Area:</label>
    					<select class="form-control underlined" name="secondaryArea" id="secondaryArea">
    						
  						</select>
						</div>
					</div>
					
					<div class="form-group row">
						<div class="col-xs-12">
							<label>Tertiary Survey Area:</label>
    					<select class="form-control underlined" name="tertiaryArea" id="tertiaryArea">
    						
  						</select>
						</div>
					</div>
        				
        	
					<div class="form-group" style="float:right;top:25px;">
  						<button type="button" class="btn btn-success" onclick="addProp();"style="position:relative;top:35px; right:0px;" data-toggle="tab" href="#menu2">
  						Next Step
  						</button>
  						
					</div>
					
					
        			
					</section>
        			</div>
        			
        			
  					
  					<div id="menu2" class="tab-pane fade">
  					<section class="section" id="section2"> 
  					
    				<h3>Affiliations</h3>
    					<div style="width:30%; float:left;" class="card sameheight-item">
    					<div class="card-block" style="border-radius: 10px 10px 10px 10px;
							-moz-border-radius: 10px 10px 10px 10px;
							-webkit-border-radius: 10px 10px 10px 10px;
							border: 1px solid #b8b8b8;">
    					
    					<ul class="nav nav-tabs">
  							<li class="active"><a data-toggle="tab" href="#afi">Work</a></li>
  							<li><a data-toggle="tab" href="#edu">Education</a></li>
						</ul>
						<div class="tab-content" >
						<div id="afi" class="tab-pane fade in active">
    						<div class="form-group" ><br>
    							
		  						<label for="sel1">School System:</label><br>
		  						<select class="form-control underlined chosen-select" data-placeholder="Choose a System..." id="systemFormWork" style="background: transparent;"> 				
		  						</select>
							
		  						<label for="sel1">Institutions:</label>
		  						<select class="form-control underlined chosen-select" data-placeholder="Choose an Institution..." id="institutionFormWork" style="background: transparent;">
		  						</select>
							
    							<label>Position:</label>
    							<input type="text" class="form-control" id="pastPosition">
    							<label>Place of Position:</label>
    							<input type="text" class="form-control" id="pastPlacePosition">
    							
    							<label>From:</label>
    							<div class="input-daterange input-group">
    							<input type="text" class="form-control" id="datepicker2" />
								</div>
								<label>To:<input style="margin-left:100px;" type="checkbox" onclick="togglePresent()">Current?</label>
    							<div class="input-daterange input-group">
    							<input type="text" class="form-control" id="datepicker3" />
								</div>			
							</div>
							<div class="form-group">
    							<button type="button" class="btn btn-success" style="float:right;" onclick="addAffiliation();">Add</button>
							</div>
						</div>
						
						<div id="edu" class="tab-pane fade in">
							<div class="form-group" ><br>
    							<label for="sel1">School System:</label><br>
		  						<select class="form-control underlined chosen-select" data-placeholder="Choose a System..." id="systemFormEdu" style="background: transparent;"> 				
		  						</select>
							
		  						<label for="sel1">Institutions:</label>
		  						<select class="form-control underlined chosen-select" data-placeholder="Choose an Institution..." id="institutionFormEdu" style="background: transparent;">
		  						</select>
		  						
    							<label>Course:</label>
    							<input type="text" class="form-control" id="courseName">				
							</div>
							<div class="form-group">
    							<button type="button" class="btn btn-success" style="float:left;" onclick="addEducation();">Add</button>
							</div>
						</div>
						</div>
							
							<br><br>
							</div>
    					</div>
    					
    					<div style="width:69%; float:right; height: 418px; overflow:scroll;-webkit-box-shadow: inset 0px 1px 7px 1px rgba(0,0,0,0.41);
						-moz-box-shadow: inset 0px 1px 7px 1px rgba(0,0,0,0.41);
					box-shadow: inset 0px 1px 7px 1px rgba(0,0,0,0.41); padding:12px;" id="affiliations">
    						<ul id="addedAffiliations" class="list-group">
    						
  							
  							</ul>
    					</div>
    					
					
    				
    				
    				</section>
					
					<div id="navBut" style="position:absolute;top:570px;">
                        <hr style="position:absolute;">
                         <button type="button" class="btn btn-info" data-toggle="tab" href="#menu1">Back</button>
                         <br>
                         <button type="button" class="btn btn-success" onclick="saveAccreditor();" style="position:relative;top:35px; right:0px;">Submit</button>
                     </div>
    				
  					</div>
					
				
					
				   
        			</div>
				
				   </div>
				   </div>
        			
					
				  
                </article>
             </form>
             
        		  
        <!-- Reference block for JS -->
        <div class="ref" id="ref">
            <div class="color-primary"></div>
            <div class="chart">
                <div class="color-primary"></div>
                <div class="color-secondary"></div>
            </div>
        </div>
       </div></div>
        <script src="js/app.js"></script>
		
		
		</body>

</html>