package Utilities;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import org.apache.commons.lang3.StringEscapeUtils;
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
				temp = new ContactUs(rs.getInt(1),StringEscapeUtils.escapeHtml4(rs.getString(2)),StringEscapeUtils.escapeHtml4(rs.getString(3)), StringEscapeUtils.escapeHtml4(rs.getString(4)), StringEscapeUtils.escapeHtml4(rs.getString(5)), StringEscapeUtils.escapeHtml4(rs.getString(6)));
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
				job.put("name", StringEscapeUtils.escapeHtml4(rs.getString(2)));
				job.put("email", StringEscapeUtils.escapeHtml4(rs.getString(3)));
				job.put("message", StringEscapeUtils.escapeHtml4(rs.getString(4)));
				job.put("dateTime", StringEscapeUtils.escapeHtml4(rs.getString(5)));
				job.put("ipAddress", StringEscapeUtils.escapeHtml4(rs.getString(6)));
				

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
