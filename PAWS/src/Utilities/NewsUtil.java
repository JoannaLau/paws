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

import Models.News;



public class NewsUtil {

	
	private DBUtil db;

	
	public NewsUtil(){
		db = new DBUtil();
	}
	
	
	
	
	
	public void addNews(String title, String content){
		try{
			Connection conn = db.getConnection();

			PreparedStatement ps = conn.prepareStatement("INSERT INTO `news` (`title`, `content`) VALUES (?, ?)");
			ps.setString(1, title);
			ps.setString(2, content);
			ps.executeUpdate();			
		} catch (Exception e){
			System.out.println("Error in NewsUtil:addNews()");
			e.printStackTrace();	
		}
	}
	
	
	
	
	
}
