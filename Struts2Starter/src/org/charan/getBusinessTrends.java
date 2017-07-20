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

public class getBusinessTrends {
	public String getInfo(){
		HttpServletRequest request = ServletActionContext.getRequest();
		String name = request.getParameter("name");
		JSONArray jsonarray=new JSONArray();
		
		try{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@oracle.cise.ufl.edu:1521:orcl","naveen","Sai0508r");
		Statement st=con.createStatement();
		String sql="select avg(R.rating),r.year from (select reviews.business_id,reviews.stars as rating,TO_CHAR(reviews.REVIEW_DATE, 'MM') as year,business.name from reviews,business where business.business_id=reviews.BUSINESS_ID and Upper(business.name)=upper('"+name+"'))R group by r.year order by r.year";
		ResultSet rs=st.executeQuery(sql);
		while(rs.next()){
			JSONObject obj=new JSONObject();
			String Year=(String)rs.getString(2);
			float avg_rat=(float)rs.getFloat(1);
			String rate=String.format("%.2f", avg_rat);
			//double stars = (double) Math.round(rating * 100) / 100;
			obj.put("year", "20"+Year);
			obj.put("rating", rate);
			System.out.println(Year+" "+rate);
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
