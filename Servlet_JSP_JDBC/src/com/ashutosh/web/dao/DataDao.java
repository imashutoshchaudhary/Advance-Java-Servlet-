package com.ashutosh.web.dao;

import java.sql.*;
import com.ashutosh.web.Data;

public class DataDao {
	
	public Data getData(int gid) {
		Data a = new Data();
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3307/mario","root","ashu");
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("select * from gadgets where gid=" + gid);
			if (rs.next()) {
				a.setGid(rs.getInt("gid"));
				a.setGname(rs.getString("gname"));
				a.setPrice(rs.getInt("price"));
			}
		}
		catch (Exception e){
			System.out.print(e);
		}
		
		return a;
	}

}
