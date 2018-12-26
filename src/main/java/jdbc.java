import java.sql.*;

public class jdbc {
    public static void main (String[] args) throws SQLException, ClassNotFoundException{
        String url = "jdbc:mysql://localhost:3306/zachet";
        String userName = "root";
        String password = "root";
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection connection = DriverManager.getConnection(url, userName, password);
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM users");
            while (resultSet.next()) {
                //System.out.println(resultSet.getString(2));
                System.out.println(resultSet.getInt("id_user") + " : " + resultSet.getString("name"));
            }
            resultSet.close();
            statement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
