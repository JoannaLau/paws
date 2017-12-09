package Models;

public class SchoolProgram {
	
	private int SPID;
	private int institutionID;
	private int programID;
	private int levelID;
	private String educLevel;
	private String institution;
	private String level;
	private String programName;
	private String dateAdded;
	private String nextSurveySched;
	private String pendingReports;
	private String nextSurveyType;
	private String degreeName;
	private String dateAddedWord;
	private String surveyDate;
	private String lapseDate;
	private String currentDecision;
	private String decisionBy;
	private String lastSurveyDate;
	private String validUntil;
	
	
	
	/*SPID int(11) 
	programID int(11) 
	institutionID int(11) 
	accLevel varchar(45) 
	dateAdded varchar(20) 
	nextSurveySched varchar(45) 
	pendingReports varchar(45) 
	nextSurveyType varchar(45) 
	degreeName varchar(45) 
	levelID int(1)
	
	*/
	
	public SchoolProgram(String institution, String degreeName, String educLevel, String boardApprovalDate)
	{
		super();
		this.institution = institution;
		this.degreeName = degreeName;
		this.educLevel = educLevel;
		this.lastSurveyDate = boardApprovalDate;
	}
	
	public SchoolProgram(int surveyID, String institution, String degreeName, String educLevel, String boardApprovalDate)
	{
		super();
		this.SPID = surveyID;
		this.institution = institution;
		this.degreeName = degreeName;
		this.educLevel = educLevel;
		this.lastSurveyDate = boardApprovalDate;
	}
	
	public SchoolProgram(int institutionID, String institution, String programName, String degreeName, String dateAdded, String educLevel)
	{
		super();
		this.institutionID = institutionID;
		this.institution = institution;
		this.programName = programName;
		this.degreeName = degreeName;
		this.dateAdded = dateAdded;
		this.educLevel = educLevel;
		
	}
	
	public SchoolProgram(String institution, int programID, String programName, String degreeName, String dateAdded, String educLevel)
	{
		super();
		this.institution = institution;
		this.programID = programID;
		this.programName = programName;
		this.degreeName = degreeName;
		this.dateAdded = dateAdded;
		this.educLevel = educLevel;
		
	}

	
	public SchoolProgram(int SPID, int programID, int institutionID, String accLevel,
			String dateAdded, String nextSurveySched, String pendingReports, 
			String nextSurveyType, String degreeName, int levelID, String validUntil)
	{
		super();
		this.SPID = SPID;
		this.programID = programID;
		this.institutionID = institutionID;
		this.level = accLevel;
		this.dateAdded = dateAdded;
		this.nextSurveySched = nextSurveySched;
		this.pendingReports = pendingReports;
		this.nextSurveyType = nextSurveyType;
		this.degreeName = degreeName;
		this.levelID = levelID;
		this.validUntil = validUntil;
		
	}
	
	
	public SchoolProgram(int sPID, String institution, String level, String date_added, String next_survey_sched,
			String pending_reports, String next_survey_type, String degree_name) {
		super();
		this.SPID = sPID;
		this.institution = institution;
		this.level = level;
		this.dateAdded = date_added;
		this.nextSurveySched = formatDate(next_survey_sched);
		this.pendingReports = pending_reports;
		this.nextSurveyType = next_survey_type;
		this.dateAddedWord = formatDate(date_added);
		this.degreeName = degree_name;
		
	}
	
	public SchoolProgram(){
		
	}
	
	
	
	
	public String getEducLevel() {
		return educLevel;
	}


	public void setEducLevel(String educLevel) {
		this.educLevel = educLevel;
	}


	public String getProgramName() {
		return programName;
	}


	public void setProgramName(String programName) {
		this.programName = programName;
	}


	public int getLevelID() {
		return levelID;
	}


	public void setLevelID(int levelID) {
		this.levelID = levelID;
	}


	public String getValidUntil() {
		return validUntil;
	}


	public void setValidUntil(String validUntil) {
		this.validUntil = validUntil;
	}


	public int getInstitutionID() {
		return institutionID;
	}


	public void setInstitutionID(int institutionID) {
		this.institutionID = institutionID;
	}


	public int getProgramID() {
		return programID;
	}


	public void setProgramID(int programID) {
		this.programID = programID;
	}


	public String getLastSurveyDate() {
		return lastSurveyDate;
	}

	public void setLastSurveyDate(String lastSurveyDate) {
		this.lastSurveyDate = formatDate(lastSurveyDate);
	}
	
	private static String formatDate(String date){
		String format = "NA";
		String month = "";
		String day;
		String year;
		System.out.println(date+"date of next sruv sched");

		if(date==null||date.equals("NA")||date.equals(" ")||date.equals("")){}
		else{
		String[] parts = date.split("-");
		System.out.println("pogiako"+ date);
		if(parts[1].equals("01")){
			month = "Jan";
		}else if(parts[1].equals("02")){
			month = "Feb";
		}else if(parts[1].equals("03")){
			month = "Mar";
		}else if(parts[1].equals("04")){
			month = "Apr";
		}else if(parts[1].equals("05")){
			month = "May";
		}else if(parts[1].equals("06")){
			month = "Jun";
		}else if(parts[1].equals("07")){
			month = "Jul";
		}else if(parts[1].equals("08")){
			month = "Aug";
		}else if(parts[1].equals("09")){
			month = "Sep";
		}else if(parts[1].equals("10")){
			month = "Oct";
		}else if(parts[1].equals("11")){
			month = "Nov";
		}else if(parts[1].equals("12")){
			month = "Dec";
		}
		year = parts[0];

//		parts = parts[1].split(",");
		day = parts[2];
		
		format = year + " " + month + " "+ day;
		}
		return format;
	}

	public int getSPID() {
		return SPID;
	}

	public void setSPID(int sPID) {
		SPID = sPID;
	}

	public String getInstitution() {
		return institution;
	}

	public void setInstitution(String institution) {
		this.institution = institution;
	}

	public String getLevel() {
		return level;
	}

	public void setLevel(String level) {
		this.level = level;
	}

	public String getDateAdded() {
		return dateAdded;
	}

	public void setDateAdded(String dateAdded) {
		this.dateAdded = dateAdded;
	}

	public String getNextSurveySched() {
		return nextSurveySched;
	}

	public void setNextSurveySched(String nextSurveySched) {
		this.nextSurveySched = nextSurveySched;
	}

	public String getPendingReports() {
		return pendingReports;
	}

	public void setPendingReports(String pendingReports) {
		this.pendingReports = pendingReports;
	}

	public String getNextSurveyType() {
		return nextSurveyType;
	}

	public void setNextSurveyType(String nextSurveyType) {
		this.nextSurveyType = nextSurveyType;
	}

	public String getDegreeName() {
		return degreeName;
	}

	public void setDegreeName(String degreeName) {
		this.degreeName = degreeName;
	}

	public String getDateAddedWord() {
		return dateAddedWord;
	}

	public void setDateAddedWord(String dateAddedWord) {
		this.dateAddedWord = dateAddedWord;
	}

	public String getSurveyDate() {
		return surveyDate;
	}

	public void setSurveyDate(String surveyDate) {
		this.surveyDate = surveyDate;
	}

	public String getLapseDate() {
		return lapseDate;
	}

	public void setLapseDate(String lapseDate) {
		this.lapseDate = lapseDate;
	}

	public String getCurrentDecision() {
		return currentDecision;
	}

	public void setCurrentDecision(String currentDecision) {
		this.currentDecision = currentDecision;
	}

	public String getDecisionBy() {
		return decisionBy;
	}

	public void setDecisionBy(String decisionBy) {
		this.decisionBy = decisionBy;
	}
	
	
}
