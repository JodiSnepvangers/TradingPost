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

	public int getid(int i) {
		int result = 0;
		try {
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("select id from Items where id = " + i);
			while (rs.next())
				result = rs.getInt(1);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}

	public String getType(int i) {
		String result = "";
		try {
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("select Type from Items where id = " + i);
			while (rs.next())
				result = rs.getString(1);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}

	public String getOwner(int i) {
		String result = "";
		try {
			Statement stmt = con.createStatement();
			ResultSet rs = stmt
					.executeQuery("select p.Name from Player as p join Items as i on p.id = i.owner where i.id = " + i);
			while (rs.next())
				result = rs.getString(1);
				
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(result == null){
			result = "This item isn't owned";
		}
		return result;
	}
	
	public String getRace(int i) {
		String result = "";
		try {
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("select RacePreferation from Items where id = " + i);
			while (rs.next())
				result = rs.getString(1);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}
	
	public String getMaterial(int i) {
		String result = "";
		try {
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("select Material from Items where id = " + i);
			while (rs.next())
				result = rs.getString(1);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}
	
	public String getName(int i) {
		String result = "";
		try {
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("select Name from Items where id = " + i);
			while (rs.next())
				result = rs.getString(1);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}
	
	public int getWeight(int i) {
		int result = 0;
		try {
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("select Weight from Items where id = " + i);
			while (rs.next())
				result = rs.getInt(1);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}
	
	public int getDamage(int i) {
		int result = 0;
		try {
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("select Damage from Items where id = " + i);
			while (rs.next())
				result = rs.getInt(1);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}
	
	public int getProtection(int i) {
		int result = 0;
		try {
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("select Protection from Items where id = " + i);
			while (rs.next())
				result = rs.getInt(1);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}
	
	public int getHealing(int i) {
		int result = 0;
		try {
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("select Healing from Items where id = " + i);
			while (rs.next())
				result = rs.getInt(1);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}
	
	public String getDescription(int i) {
		String result = "";
		try {
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("select Description from Items where id = " + i);
			while (rs.next())
				result = rs.getString(1);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}

	public int getSize() {
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
