package app;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import db.DB;

public class App {
	private static DateFormat sdf;

	public static void main(String[] args) {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Connection conn = null;
		PreparedStatement st = null;

		try {
			conn = DB.getConnection();

			st = conn.prepareStatement(
					"INSERT INTO seller "
					+ "(Name, Email, BirthDate, BaseSalary, DepartmentId) "
					+ "VALUES "
					+ "(?, ?, ?, ?, ?)");
			st.setString(1, "a Gomes");
			st.setString(2, "agomes@gmail.com");
			st.setDate(3, new java.sql.Date(sdf.parse("08/02/2023").getTime()));
			st.setDouble(4, 10000.00);
			st.setInt(5, 4);

			int rowsAffected = st.executeUpdate();

			System.out.println("Done! Rows affected " + rowsAffected);

		} 
		catch (SQLException e) {
			e.printStackTrace();
		}
		catch (ParseException e) {
			e.printStackTrace();
		}
		finally {
			DB.closeStatement(st);
			DB.closeConnection();
		}
	}
}
