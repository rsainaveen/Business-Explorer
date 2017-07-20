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


public class TutorialClas
{
	private String place;
	private String city;
	private JSONArray jsonarray = new JSONArray();
public String execute()
{
	HttpServletRequest request = ServletActionContext.getRequest();
	int k = 0;
	int Count_tuples=0;
	try{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@oracle.cise.ufl.edu:1521:orcl","naveen","Sai0508r");
		Statement st=con.createStatement();
		System.out.println("connected to the server");
		String countQuery = "select sum(num_rows) from(select table_name, num_rows from user_tables)";
		ResultSet rss = st.executeQuery(countQuery);
		while(rss.next()) { Count_tuples = (int)(rss.getInt(1)); }
		String sql="select name,categories,stars,full_address,business_id  from business where UPPER(city)=UPPER('"+city+"') and UPPER(categories) like UPPER('%"+place+"%')";
		ResultSet rs=st.executeQuery(sql);
	    TreeSet<use> set = new TreeSet<use>();
		while(rs.next())
		{
		    String name = (String) rs.getString(1);
		    String categories = (String)rs.getString(2);
		    float rating = (float) rs.getFloat(3);
		    String full_address = (String) rs.getString(4);
		    String id = (String) rs.getString(5);
			set.add(new use(categories,name,rating,full_address,id));
		}
		
	    Iterator<use> it = set.iterator();
	    while(it.hasNext())
	    {
	    	k++;
	    	JSONObject tem =new JSONObject();
	    	use temp = it.next();
	    	System.out.println(temp.name+" "+place+" "+temp.rating+" "+temp.address);
	    	tem.put("name", temp.name);
	    	tem.put("place", place);
	    	tem.put("rating", temp.rating);
	    	tem.put("address", temp.address);
	    	tem.put("id",temp.id);
	    	jsonarray.put(tem);
	    }
		System.out.println("printed the response");
		}
		catch(Exception e){
			System.out.println(e);
		}
    request.setAttribute("num",k );
    request.setAttribute("array", jsonarray);
	request.setAttribute("place",place);
	request.setAttribute("city", city);
	request.setAttribute("CountofTuples",Count_tuples);
	if(k==0) return "failure";
	return "success";
}
public String getPlace() {
	return place;
}


public void setPlace(String place) {
	this.place = place;
}


public String getCity() {
	return city;
}


public void setCity(String city) {
	this.city = city;
}
}
class use implements Comparable<use>
{
	float rating;
	String categories;
	String address;
	String name;
	String id;
	public use(String categories,String name,float rating,String address,String id)
	{
		this.rating = rating;
		this.categories = categories;
		this.address = address;
		this.name = name;
		this.id = id;
	}
	public int compareTo(use x) 
	{
		if(rating<x.rating) return 1;
		if(rating==x.rating) return 0;
		return -1;
	}
	public String toString()
	{
		return categories+" "+name+" "+rating+" "+address+" "+id;
	}
	
}
