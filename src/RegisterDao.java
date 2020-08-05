import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class RegisterDao 
{
	 //static Connection con = null;
	// static String databaseName="userdb";
	 String dburl="jdbc:mysql://localhost:3306/userdb";
	
	 String dbuname = "root";
	 String dbpassword = "alif01748";
	 String dbdriver = "com.mysql.cj.jdbc.Driver";
	 public void loadDriver(String dbDriver) 
	{ 
		try 
		{
		Class.forName(dbDriver);
		} catch (ClassNotFoundException e)
		
		{	//TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public Connection getConnection()
	
	{
		 Connection con=null;
		try 
		{
			con=DriverManager.getConnection(dburl, dbuname, dbpassword);
		}
		catch (SQLException e)
		{	//TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return con;
		
	
		}
		
	public String insert (Member member)
		{
			loadDriver(dbdriver);
			Connection con=getConnection();
			String result = "data enteMemberred successfully";
			String sql ="INSERT INTO `userdb`. `member` (`uname`,`password`,`email`,`phone`) VALUES (?,?,?,?)";
			try 
			{
				PreparedStatement ps=con.prepareStatement(sql);
				ps.setString(1, member.getUname());
				ps.setString(2, member.getPassword());
				ps.setString(3, member.getEmail());
				ps.setString(4, member.getPhone());
				ps.executeUpdate();
			}
			catch (SQLException e)
			{	//TODO Auto-generated catch block
				e.printStackTrace();
				result = "data not entered";
			}
			return result;
		}
	}


