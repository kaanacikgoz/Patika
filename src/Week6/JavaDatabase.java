package Week6;

import java.sql.*;

public class JavaDatabase {

    private static final String DB_URL = "jdbc:postgresql://localhost:5432/university";
    private static final String DB_USER = "postgres";
    private static final String DB_PASSWORD = "1234"; //It's not real password.

    public static void main(String[] args) {

        run();
    }

    static void run() {
        try {
            Connection connection = DriverManager.getConnection(DB_URL,DB_USER,DB_PASSWORD);
            Statement statement = connection.createStatement();

            statement.executeUpdate(createTable());
            statement.executeUpdate(insertData());

            ResultSet resultSet = statement.executeQuery(readData());
            while (resultSet.next()) {
                System.out.println("Name: "+resultSet.getString("name"));
                System.out.println("Position: "+resultSet.getString("position"));
                System.out.println("Salary: "+resultSet.getDouble("salary"));
                System.out.println("----------------------");
            }
            statement.close();
            connection.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    static String createTable() {
        return "CREATE TABLE employees (" +
                "id SERIAL PRIMARY KEY," +
                "name VARCHAR(50) NOT NULL," +
                "position VARCHAR(75) NOT NULL," +
                "salary INTEGER NOT NULL)";
    }

    static String insertData() {
        return "INSERT INTO employees (name, position, salary) " +
                "VALUES " +
                "('Kaan', 'Backend Developer', 30000), " +
                "('Sarp', 'Product Engineer', 40000), " +
                "('Erkin', 'Full Stack Engineer', 35000), " +
                "('Volkan', 'IOS Developer', 37500), " +
                "('Hakan', 'Frontend Developer', 27500)";
    }

    static String readData() {
        return "SELECT * FROM employees";
    }

}
