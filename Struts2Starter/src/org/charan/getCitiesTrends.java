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

public class getCitiesTrends {
	public String getInfo(){
		HttpServletRequest request = ServletActionContext.getRequest();
		String name = request.getParameter("name");
		JSONArray jsonarray=new JSONArray();
		
		try{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@oracle.cise.ufl.edu:1521:orcl","naveen","Sai0508r");
		Statement st=con.createStatement();
		String sql="select * from (select avg(reviews.stars) as avg_rating,business.city from business,reviews where upper(business.name)=upper('"+name+"') and business.business_id=reviews.business_id group by business.city order by avg_rating asc) where rownum<11";
		ResultSet rs=st.executeQuery(sql);
		while(rs.next()){
			JSONObject obj=new JSONObject();
			String city=(String)rs.getString(2);
			float avg_rat=(float)rs.getFloat(1);
			String rate=String.format("%.2f", avg_rat);
			//double stars = (double) Math.round(rating * 100) / 100;
			obj.put("city", city);
			obj.put("rating", rate);
			System.out.println(city+" "+rate);
			jsonarray.put(obj);
		}
		
		
		
	}
	catch(Exception e){
		System.out.println(e);
	}
	request.setAttribute("jsonarray",jsonarray);
	
	return "success";
}
}

