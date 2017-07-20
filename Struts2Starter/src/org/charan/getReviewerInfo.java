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

public class getReviewerInfo {
	HttpServletRequest request = ServletActionContext.getRequest();
	String id = request.getParameter("user_id");
	JSONArray jsonarray = new JSONArray();
	JSONObject obj=new JSONObject();
	int[] count=new int[6];
	public String getInfo(){
	try{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@oracle.cise.ufl.edu:1521:orcl","naveen","Sai0508r");
		Statement st=con.createStatement();
		String sql="select nvl(compliments_plain,0)+nvl(compliments_cute,0)+nvl(compliments_writer,0)+nvl(compliments_note,0)+nvl(compliments_hot,0)+nvl(compliments_cool,0)+nvl(compliments_profile,0)+nvl(compliments_more,0)+nvl(compliments_list,0)+nvl(compliments_photos,0)+nvl(compliments_funny,0)as compliments,reviewing_since,REVIEW_COUNT,fans,VOTES_COOL,VOTES_FUNNY,VOTES_USEFUL,AVERAGE_STARS,name from reviewer where user_id='"+id+"'";
		ResultSet rs=st.executeQuery(sql);
		while(rs.next()){
		String review_using=(String)rs.getString(2);
		JSONObject json =new JSONObject();
		json.put("review_using", review_using);
		String review_count=(String)rs.getString(3);
		json.put("review_count", review_count);
		int fans=(int) rs.getInt(4);
		json.put("fans", fans);
		float avg_stars=(float)rs.getFloat(8);
		String rate=String.format("%.2f", avg_stars);
		json.put("avg_stars", rate);
		String name=(String)rs.getString(9);
		if(name==null) json.put("name", "Not Found in the Database");
		else json.put("name", name);
		System.out.println(name+" Fans:"+fans);
		int votes_cool=(int)rs.getInt(5);
		json.put("cool", votes_cool);
		int votes_funny=(int)rs.getInt(6);
		json.put("funny", votes_funny);
		int votes_useful=(int)rs.getInt(7);
		json.put("useful", votes_useful);
		int compliments=(int)rs.getInt(1);
		json.put("compliments",compliments);
		jsonarray.put(json);
		}
		
		//Getting ratings for plotting bar graph of user.
	
		for(int i=0;i<count.length;i++) count[i]=0;
		Connection con1=DriverManager.getConnection("jdbc:oracle:thin:@oracle.cise.ufl.edu:1521:orcl","aravi","Manunitedatz9");
		Statement st1=con1.createStatement();
		String sql1="select stars from reviews where user_id='"+id+"'";
		ResultSet rs1 = st.executeQuery(sql1);
		while(rs1.next()){
			float stars=(float)rs1.getFloat(1);
			System.out.println("stars: "+stars);
			int star=Math.round(stars);
			count[star]++;
		}
		obj.put("count", count);
		for(int i=1;i<count.length;i++)
			System.out.print(count[i]);
		
	}catch(Exception e){
		System.out.println(e);
	
		
}
	request.setAttribute("jsonarray", jsonarray);
	request.setAttribute("obj", obj);

	return "success";
	}
}
