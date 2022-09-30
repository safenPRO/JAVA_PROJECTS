package projects;
import java.sql.*;

public class JDBC_Try3 {

	 private static final String QUERY = "select id,name,email,country,password from Users";

	    public static void main(String[] args) {

	        // using try-with-resources to avoid closing resources (boilerplate code)

	        // Step 1: Establishing a Connection
	        try (Connection connection = DriverManager
	            .getConnection("jdbc:mysql://localhost:3306/mysql_database?useSSL=false", "root", "root");

	            // Step 2:Create a statement using connection object
	            Statement stmt = connection.createStatement();

	            // Step 3: Execute the query or update query
	            ResultSet rs = stmt.executeQuery(QUERY)) {

	            // Step 4: Process the ResultSet object.
	            while (rs.next()) {
	                int id = rs.getInt("id");
	                String name = rs.getString("name");
	                String email = rs.getString("email");
	                String country = rs.getString("country");
	                String password = rs.getString("password");
	                System.out.println(id + "," + name + "," + email + "," + country + "," + password);
	            }
	        } catch (SQLException e) {
	            printSQLException(e);
	        }
	        // Step 4: try-with-resource statement will auto close the connection.
	    }

	    public static void printSQLException(SQLException ex) {
	        for (Throwable e: ex) {
	            if (e instanceof SQLException) {
	                e.printStackTrace(System.err);
	                System.err.println("SQLState: " + ((SQLException) e).getSQLState());
	                System.err.println("Error Code: " + ((SQLException) e).getErrorCode());
	                System.err.println("Message: " + e.getMessage());
	                Throwable t = ex.getCause();
	                while (t != null) {
	                    System.out.println("Cause: " + t);
	                    t = t.getCause();
	                }
	            }
	        }
	    }
	}