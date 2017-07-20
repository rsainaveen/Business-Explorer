package org.charan;

import java.io.*;
import java.sql.*;
import java.util.*;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class BusinessInfo 
{
//  HashMap<String,String> map = (HashMap)request1.getAttribute(map);
	public String getInfo()
	{
		String closed = "UNAVAILABLE";
		HttpServletRequest request = ServletActionContext.getRequest();
		String id = request.getParameter("id");
		int k = 0;
		JSONObject ob = new JSONObject();
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@oracle.cise.ufl.edu:1521:orcl","naveen","Sai0508r");
			
			Statement st=con.createStatement();
			System.out.println("connected to the server");
			String sql = "select * from business where business_id="+"'"+id+"'";
			ResultSet rs=st.executeQuery(sql);
			while(rs.next())
			{
			 System.out.println("comming here");
			 String Business_Name = (String) rs.getString(24);	
			 ob.put("Business_Name", Business_Name);
			 ob.put("Business_id", id);
			 String address = (String) rs.getString(45);
			 ob.put("address", address);
			 int review_count = (int) rs.getInt(37);
			 ob.put("review_count", review_count);
			 float rating = (float) rs.getFloat(62);
			 ob.put("rating", rating);
			 String Mon_open = (String) rs.getString(23);
			 String Mon_closed = (String) rs.getString(71);
			 if(Mon_open==null) ob.put("Mon",closed);
			 else ob.put("Mon",Mon_open+" "+Mon_closed);
			 String Tues_open = (String) rs.getString(19);
			 String Tues_closed = (String) rs.getString(73);
			 if(Tues_open==null) ob.put("Tues",closed);
			 else ob.put("Tues", Tues_open+" "+Tues_closed);
			 String Wed_open = (String) rs.getString(88);
			 String Wed_closed = (String) rs.getString(56);
			 if(Wed_open==null) ob.put("Wed",closed);
			 else ob.put("Wed",Wed_open+" "+Wed_closed);
			 String Thur_open = (String) rs.getString(4);
			 String Thur_closed = (String) rs.getString(46);
			 if(Thur_open==null) ob.put("Thur",closed); 
			 else ob.put("Thur", Thur_open+" "+Thur_closed);
			 String Fri_open = (String) rs.getString(9);
			 String Fri_closed = (String) rs.getString(41);
			 if(Fri_open==null) ob.put("Fri", closed);
			 else ob.put("Fri", Fri_open+" "+Fri_closed);
			 String Sat_open = (String) rs.getString(52);
			 String Sat_closed = (String) rs.getString(74);
			 if(Sat_open==null) ob.put("Sat", closed);
			 else ob.put("Sat", Sat_open+" "+Sat_closed);
			 String Sun_open = (String) rs.getString(77);
			 String Sun_closed = (String) rs.getString(82);
			 if(Sun_open==null) ob.put("Sun", closed);
			 else ob.put("Sun", Sun_open+" "+Sun_closed);
			 String veg = (String) rs.getString(87);
			 if(veg==null) ob.put("Vegetarian", "NO");
			 else ob.put("Vegetarain", "YES");
			 String wifi = (String) rs.getString(52);
			 if(wifi==null) ob.put("wifi", "NO");
			 else ob.put("wifi", "YES");
			 String Reservations = (String) rs.getString(51);
			 if(Reservations==null) ob.put("Reservations", "NO");
			 else ob.put("Reservations", "YES");
			 String Parking = (String) rs.getString(43);
			 if(Parking==null) ob.put("Parking", "NO");
			 else ob.put("Parking", "YES");
			 String groups = (String) rs.getString(93);
			 if(groups==null) ob.put("groups", "NO");
			 else ob.put("groups", "YES");
			}
			request.setAttribute("ob", ob);
	       }
		catch(Exception ex) { System.out.println("error");}
		
	
	return "successInfo";
	}	
   
}
