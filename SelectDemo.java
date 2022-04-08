import java.sql.*;
import java.util.*;
class SelectDemo
    {
	public static void main(String args[])
	{
	try
	{
	Class.forName("oracle.jdbc.driver.OracleDriver");
	System.out.println("Driver Loaded Succesfull");
	Connection con=DriverManager.getConnection("jdbc:oracle:thin:@ntsocietyserver:1521:oralbrce","IPC86","IPC86");
	System.out.println("Connection Succesfull");
	Scanner s=new Scanner(System.in);
	System.out.println("Enter your employee id");
	int empno=s.nextInt();
	Statement sct=con.createStatement();
	String sql="select *from emp";
	ResultSet rs=sct.executeQuery(sql);
	boolean result=false;
	while(rs.next())
	{
	if(empno==rs.getInt(1))
	{
	System.out.println("You are a valid user");
	System.out.println("Hello "+rs.getString(2));
	result=true;
	break;
	}
	}
	if(result==false)
	{
	System.out.println("Invalid User");
	}
	}
	catch(Exception e)
	{
	System.out.println(e);
	}
	}
    }
		
	