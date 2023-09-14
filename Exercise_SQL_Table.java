package MySQL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Exercise_SQL_Table {
    public static void main(String[] args) {

            try {
                Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/newdb", "root", "asdasd123");
                Statement statement = connection.createStatement();
                statement.execute("select * from student");
            }catch (SQLException e){
                e.getMessage();
            }

    }
    }




