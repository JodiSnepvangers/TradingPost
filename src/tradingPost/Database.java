package tradingPost;

import java.sql.*;

public class Database {
	Private details = new Private();
	Connection con;

	public Database() {

		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection(details.getServer(), details.getUser(), details.getPass());
		} catch (Exception e) {
			System.out.println(e);
		}

	}

	public String getStats(int i) {

		String result = "";
		try {
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("select * from Items where id = " + i);
			while (rs.next())
				result = rs.getString(1) + " " + rs.getString(2) + " " + rs.getString(3) + " " + rs.getString(4) + " "
						+ rs.getString(5) + " " + rs.getString(6) + " " + rs.getString(7) + " " + rs.getString(8) + " "
						+ rs.getString(9) + " " + rs.getString(10) + " " + rs.getString(11);

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;

	}
	
	public int getSize(){
		int size = 0;
		
		try {
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("select count(*) from Items");
			while (rs.next())
				size = rs.getInt(1);

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
		return size;
	}

}
