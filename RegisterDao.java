import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class RegisterDao {
	private String dburl="jdbc:mysql://localhost:3306/liabrary";//database + location
	private String dbuname="root";
	private String dbpassword ="";
	private String dbdriver ="com.mysql.cj.jdbc.Driver";
	
	public void loadDriver(String dbDriver) {
		try {
			Class.forName(dbDriver);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public Connection getConnection() {
		Connection con = null;
		try {
			con = DriverManager.getConnection(dburl,dbuname,dbpassword);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return con;
		
	}
	public String insert(Member member) {
		loadDriver("com.mysql.cj.jdbc.Driver");
		Connection con = getConnection();
		String result = "<div style='color:blue'>Data enterd successfully..</div>";
		String sql = "insert into liabrary values(?,?,?,?,?,?,?,?,?,?,?,?)";//table entry
		
		try {
			PreparedStatement ps =con.prepareStatement(sql);
			
			ps.setString(1, member.getBname());
			ps.setString(2, member.getAuther());
			ps.setString(3, member.getBdep());
			ps.setString(4, member.getPublisher());
			ps.setString(5, member.getVolume());
			ps.setString(6, member.getBprice());
			ps.setString(7, member.getStudname());
			ps.setString(8, member.getIdcard());
			ps.setString(9, member.getDueamt());
			ps.setString(10, member.getFineamt());
			ps.setString(11, member.getBooksIssued());
			ps.setString(12, member.getBooksReturned());
			
			ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			result = "Data not enterd";
		}
		return result;

	}
}
