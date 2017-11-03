package Utilities;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.mysql.jdbc.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import org.json.JSONArray;
import org.json.JSONObject;


public class InfographicsUtil {
	private DBUtil db;
	
	public InfographicsUtil(){
			db = new DBUtil();
	}
	
	
	
	
	public int getInstitutionPragramCount(int educLevelID, int year, String status){

			int count =0;
		
		
		try{
			Connection conn = db.getConnection();
			PreparedStatement ps = conn.prepareStatement("SELECT COUNT(`SPID`) FROM `school-program` s, `institutions` i WHERE s.institutionID=i.institutionID AND s.levelID = ? AND YEAR(STR_TO_DATE(i.dateAdded, '%Y-%m-%d')) = ? AND i.status = ?");
			ps.setInt(1, educLevelID);
			ps.setInt(2, year);
			ps.setString(3, status);
			ResultSet rs = ps.executeQuery();
			while(rs.next()){				
				
				count = rs.getInt(1);
	
				
				
			}
		
		} catch (Exception e){
			System.out.println("Error in InfographicsUtil:getprogramCount()");
			e.printStackTrace();
		}
		
		return count;
	}
	
	
	
	public int getInstitutionCountByLevelAndYear(int educLevelID, int year, String status)
	{
		int count=0;
	
		
		
		try{
			Connection conn = db.getConnection();
			PreparedStatement ps = conn.prepareStatement("SELECT COUNT(`institutionID`) FROM `institutions` WHERE YEAR(STR_TO_DATE(`dateAdded`, '%Y-%m-%d')) = ? AND `educLevelID` = ? AND `status` = ?");
			ps.setInt(1, year);
			ps.setInt(2, educLevelID);
			ps.setString(3, status);
			ResultSet rs = ps.executeQuery();
			while(rs.next()){				
			
				count = rs.getInt(1);
	
				
				
			}
		} catch (Exception e){
			System.out.println("Error in InfographicsUtil:getInstitutionCount()");
			e.printStackTrace();
		}
		
		return count;
	}
	
	public int getFirstYearInstitutionAdded() {
		int year=0;

		
		try{
			Connection conn = db.getConnection();
			PreparedStatement ps = conn.prepareStatement("SELECT MIN(YEAR(STR_TO_DATE(`dateAdded`, '%Y-%m-%d'))) FROM institutions;");
			
			ResultSet rs = ps.executeQuery();
			while(rs.next()){					
			year = rs.getInt(1);	
			}
		} catch (Exception e){
			System.out.println("Error in InfographicsUtil:getyear");
			e.printStackTrace();
		}
		
	
	return year;
	
	}
	
	
	public int getLastYearInstitutionAdded() {
int year=0;

		
		try{
			Connection conn = db.getConnection();
			PreparedStatement ps = conn.prepareStatement("SELECT MAX(YEAR(STR_TO_DATE(`dateAdded`, '%Y-%m-%d'))) FROM institutions;");
			
			ResultSet rs = ps.executeQuery();
			while(rs.next()){					
			year = rs.getInt(1);	
			}
		} catch (Exception e){
			System.out.println("Error in InfographicsUtil:getyear");
			e.printStackTrace();
		}
		
	
	return year;
	
	}
	
	
	
	
	public int getSurveyVisitCount(int educLevelID, int year)
	{
		int count=0;
	
		try{
			Connection conn = db.getConnection();
			PreparedStatement ps = conn.prepareStatement("SELECT COUNT(`surveyID`) FROM surveys WHERE surveys.institutionID IN (SELECT institutionID from INSTITUTIONS WHERE educLevelID = ?) AND YEAR(STR_TO_DATE(`startDate`, '%Y-%m-%d')) = ?");
			ps.setInt(1, educLevelID);
			ps.setInt(2, year); 
			ResultSet rs = ps.executeQuery();
			while(rs.next()){				
			
				count = rs.getInt(1);
	
				
				
			}
		} catch (Exception e){
			System.out.println("Error in InfographicsUtil:getSurveyVisitCount()");
			e.printStackTrace();
		}
		
		return count;
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
