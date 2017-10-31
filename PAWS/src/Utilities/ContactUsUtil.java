package Utilities;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import org.json.JSONArray;
import org.json.JSONObject;

import com.mysql.jdbc.Connection;

import Models.ContactUs;

public class ContactUsUtil
{
	private DBUtilWeb db;

	
	public ContactUsUtil(){
		db = new DBUtilWeb();
	}
		
	public ArrayList<ContactUs> getAllContactUs(){
		ArrayList<ContactUs> contactUs = new ArrayList<ContactUs>();
		ContactUs temp = new ContactUs();
		try{
			Connection conn = db.getConnection();
			PreparedStatement ps = conn.prepareStatement("SELECT * FROM `contactus` ORDER BY `contactID`");
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()){
				temp = new ContactUs(rs.getInt(1),rs.getString(2),rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6));
				contactUs.add(temp);
			}
			db.cutPort();
		} catch (Exception e){
			System.out.println("Error in NewsUtil:getAllNews()");
			e.printStackTrace();
		}
		
	    return contactUs;
	}
	


	public JSONArray getAllResponsesJSON(){
		JSONArray jArray = new JSONArray();
		JSONObject job = new JSONObject();
		
		try{
			Connection conn = db.getConnection();
			PreparedStatement ps = conn.prepareStatement("SELECT * FROM `contactus` ORDER BY `contactID`");
					
			ResultSet rs = ps.executeQuery();
			while(rs.next()){
				
				job = new JSONObject();
				job.put("name", rs.getString(2));
				job.put("email", rs.getString(3));
				job.put("message", rs.getString(4));
				job.put("dateTime", rs.getString(5));
				job.put("ipAddress", rs.getString(6));
				

				jArray.put(job);
				
			}
			db.cutPort();
		} catch (Exception e){
			System.out.println("Error in InstitutionsUtil:getAllInstitutionsJSON()");
			e.printStackTrace();
		}
		
		return jArray;
	}
			
}
