package grp2.team2;

import java.sql.*;
import java.sql.Connection;


public class FirstMaven{
	public static void main(String[] args) throws ClassNotFoundException,SQLException
	{
		Connection conn=null;
		Class.forName("oracle.jdbc.driver.OracleDriver");  //oracle db
		//Class.forName("com.mysql.jdbc.Driver");    //mysql db
		conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","system"); //where xe=our's oracle last name and system is my user name and password
	
		

		
		Statement st=conn.createStatement();
		st.execute("insert into student values(20,'Saloni',30,'BE','amt')");
		
		
		ResultSet rs=st.executeQuery("select * from student");
		
		while(rs.next())
		{
			System.out.print(rs.getInt(1)+"\t");
			System.out.print(rs.getString(2)+"\t");
			System.out.println(rs.getString(3)+"\t");
		}
			
			System.out.println("connected");
		}
	}


