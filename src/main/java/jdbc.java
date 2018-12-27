import javax.net.ssl.SSLException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;


public class jdbc {
    public static void main (String[] args) throws SQLException, ClassNotFoundException {
        List<Columns> columns = new ArrayList<Columns>();
        String url = "jdbc:mysql://localhost:3306/zachet?serverTimezone=UTC";
        String userName = "root";
        String password = "root";
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection connection = DriverManager.getConnection(url, userName, password);
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM users");
            while (resultSet.next()) {
                columns.add(new Columns(resultSet.getInt("id_user"), resultSet.getString("name")));
            }
            resultSet.close();
            statement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        for (Columns column: columns) {
            System.out.println(column.toString());
        }
    }
}
