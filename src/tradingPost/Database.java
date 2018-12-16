package tradingPost;

import java.sql.*;

public class Database {
	Private details = new Private();

	public Database() {

		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(details.getServer(), details.getUser(), details.getPass());
			// here sonoo is database name, root is username and password
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("select * from Types");
			while (rs.next())
				System.out.println(rs.getString(1));
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
