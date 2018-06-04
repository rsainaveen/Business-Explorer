package org.charan;
import java.io.*;
import java.sql.*;
import java.sql.Date;
import java.util.*;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class getReviewInfo 
{
public String getInfo()
{
	HttpServletRequest request = ServletActionContext.getRequest();
	String id = request.getParameter("id");
	JSONArray jsonarray = new JSONArray();
	try{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con1=DriverManager.getConnection("jdbc:oracle:thin:@oracle.cise.ufl.edu:1521:orcl","naveen","");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@oracle.cise.ufl.edu:1521:orcl","aravi","");
		Statement st=con.createStatement();
		Statement st1=con1.createStatement();
		System.out.println(id);
		String sql="select * from reviews where business_id='"+id+"' order by stars desc";
		//String sql = "select r.*, reviewer.name from reviewer,(select * from reviews where business_id='"+id+"' order by votes_useful desc)r where r.user_id=reviewer.user_id";
		ResultSet rs = st.executeQuery(sql);
		int i=0;
		
		while (rs.next() && i<3)
		{
			String sql1="select reviewer.name from reviewer where user_id='"+(String) rs.getString(1)+"'";
			i++;
			ResultSet rs1=st1.executeQuery(sql1);
			JSONObject json =new JSONObject();
			while(rs1.next()){
			String name=(String) rs1.getString(1);
			json.put("name",name);
			System.out.println(name);
			}
			int useful=(int) rs.getInt(10);
			json.put("useful",useful);
			int cool=(int) rs.getInt(4);
			json.put("cool",cool);
			int funny=(int) rs.getInt(6);
			String text=(String) rs.getString(3);
			json.put("text", text);
			json.put("funny",funny);
			float stars=(float)rs.getFloat(7);
			json.put("stars",stars);
			Date date=(Date) rs.getDate(8);
			json.put("date",date);
			
			String user_id=(String) rs.getString(1);
			json.put("user_id", user_id);
			System.out.println(user_id);
			jsonarray.put(json);
		}
		request.setAttribute("jsonarray", jsonarray);
		//System.out.println(rs.getFetchSize());
				
	
	}
	catch(Exception e){
		System.out.println(e);
	
		
}
	return "success";
}
}
