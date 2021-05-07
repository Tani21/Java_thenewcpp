package project;

import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.*;



class MyConnect 
{
	static Connection getMyConnection()
	{
		Connection cn=null;
		try {
			//Type 1- JDBC ODBC Bridge
			/*Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			 // or
			DriverManager.registerDriver(new sun.jdbc.odbc.JdbcOdbcDriver());
			Connection con = DriverManager.getConnection("jdbc:odbc:MyLogin", "", ""); */

			//Type 4 - for MySql
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			DriverManager.registerDriver(new com.mysql.jdbc.Driver());
			String dbURL="jdbc:mysql://localhost:3306/oktested?user=root&password=23212001";
			cn = DriverManager.getConnection(dbURL); 

			
			//Type 4- Thin driver with Oracle
			/*DriverManager.registerDriver(new oracle.jdbc.OracleDriver());
			String dbURL = "jdbc:oracle:thin:@localhost:1521:XE";
			String username = "upes";
			String password = "upes123";
			cn = DriverManager.getConnection(dbURL, username, password);*/
      			
		} 
		catch (Exception e) 
		{
			System.out.println("Error"+e);
			e.printStackTrace();
			// TODO: handle exception
		}
		
		return cn;
	}

}
public class DatabaseExample
{
	public static void main(String arg[])
	{
		//System.out.println(MyConnect.getMyConnection());
		try
		{
		Connection con=MyConnect.getMyConnection();
		System.out.println(con);
		
		/*
		Two Types of Queries - Insert, Update, Delete   2nd type - Select commond
		
		Two Types of statement - Statement , PreparedStatement
		differnece 
		1. con.createStatement() --> Statement
		   con.prepareStatement("Query") ----> PreparedStatement
		2. psmt.setXXX(position of question mark, data type of column);
		3. psmt.execute(), executeQuery(), executeUpdate()
		   stmt.execute("Query"), executeQuery("Query"), executeUpdate("Query")
		   
		   stmt.excuteUpdate("insert into emp1 values("+"'"+id+"','"+name+"')");
		
		*/
		///////////////////////////////////////////////////////////////////////////////////////////
		String addname= "addname";
		String lastname = "addnameend";
		int addid = 14;
		PreparedStatement psmt=con.prepareStatement("insert into emp values(?,?,?)");
		psmt.setInt(1,addid);
		psmt.setString(2,addname);
		psmt.setString(3, lastname);
		int res=psmt.executeUpdate();
		System.out.println(res+" records affected");  

		Statement stmt=con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,  
                     ResultSet.CONCUR_UPDATABLE);
		System.out.println("ID		Name");
		ResultSet rs = stmt.executeQuery("Select * from emp");
		rs.absolute(14);
		while(rs.previous())
		{
			
			System.out.println(rs.getInt(1)+"	"+rs.getString(2));
		}
		
		//////////////////////////////////////////////////////////////////////////////
		//String newname= "Updatedname";
		//String lastnewname= "Updatedlastname";
		
		psmt=con.prepareStatement("update emp set firstname=? where empid=?");
		psmt.setString(1,"Updatename");
		//psmt.setString(2,lastnewname);
		psmt.setInt(2, 14);
		res=psmt.executeUpdate();
		System.out.println(res+" records affected");  

		stmt=con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,  
                     ResultSet.CONCUR_UPDATABLE);
		rs=stmt.executeQuery("Select * from emp");
		System.out.println("ID		Name");
		
		rs.absolute(14);
		while(rs.previous())
		{
			
			System.out.println(rs.getInt(1)+"	"+rs.getString(2));
		}
		
		
		/////////////////////////////////////////////////////////////
		int id=14;
		//String name="tanishka";
		//String lastname = "vaswani";

		psmt=con.prepareStatement("delete from emp where empid=?");

		psmt.setInt(1,id);
		//psmt.setString(2,name);
		//psmt.setString(3, lastname);
		res=psmt.executeUpdate();
		//psmt.setInt(1,i);
		//psmt.setString(2,n);
		//int res1=psmt.executeUpdate();
		System.out.println(res+" records affected");  

		stmt=con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,  
                     ResultSet.CONCUR_UPDATABLE);
		//stmt.executeUpdate("insert into emp1 values("+"'"+id+"','"+name+"')");
		rs=stmt.executeQuery("Select * from emp");
		
		System.out.println("ID		Name");
		rs.absolute(14);
		while(rs.previous())
		{
			
			System.out.println(rs.getInt(1)+"	"+rs.getString(2));
		}
		////////////////////////////////////////////////////////
		
		con.close();  
		}
		
		
		catch(Exception e)		
		{
			e.printStackTrace();
		}
		
		
	}
}


