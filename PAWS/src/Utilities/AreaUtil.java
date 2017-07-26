package Utilities;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import org.json.JSONArray;
import org.json.JSONObject;

import com.mysql.jdbc.Connection;

import Models.Accreditation;
import Models.Accreditor;
import Models.Degree;
import Models.Work;

public class AreaUtil {
	private DBUtil db;
	public AreaUtil(){
		db = new DBUtil();
	}
	
	public JSONArray getAreasJSON(){
		JSONArray jArray = new JSONArray();
		JSONObject job = new JSONObject();
		
		try{
			Connection conn = db.getConnection();
			PreparedStatement ps = conn.prepareStatement("SELECT * FROM areas");
			ResultSet rs = ps.executeQuery();
			while(rs.next()){
				job = new JSONObject();
				job.put("name", rs.getString(1));
				job.put("areaID", rs.getInt(2));
				jArray.put(job);
				
			}
		} catch (Exception e){
			System.out.println("Error in AreaUtil:getAreasJSON()");
			e.printStackTrace();
		}
		
		return jArray;
	}
	
}