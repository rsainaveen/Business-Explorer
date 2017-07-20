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


public class getTop10BusinessName {
	public String getInfo(){
		HttpServletRequest request = ServletActionContext.getRequest();
		JSONArray jsonarray=new JSONArray();
		try{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@oracle.cise.ufl.edu:1521:orcl","naveen","Sai0508r");
		Statement st=con.createStatement();
		String sql="select * from(select business.name,r.business_id,r.count from (select reviews.business_id,count(*) as count from reviews group by reviews.business_id)r,business where r.business_id=business.business_id order by r.count desc) where rownum<11";
		ResultSet rs=st.executeQuery(sql);
		while(rs.next()){
			JSONObject obj=new JSONObject();
			String name=(String)rs.getString(1);
			String id=(String)rs.getString(2);
			obj.put("name",name);
			obj.put("id",id);
			jsonarray.put(obj);
			System.out.println("name: "+name);
		}
		}
		catch(Exception e){
			System.out.println(e);
		}
		request.setAttribute("jsonarray",jsonarray);
		
		return "success";
	}
	

}
