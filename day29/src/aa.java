import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
    public class aa {
        public static void main(String[] args)throws ClassNotFoundException, SQLException {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/mydatabase?serverTimezone=GMT%2B8";
            String username="root";
            String password="980125";
            Connection con = DriverManager.getConnection(url, username, password);
            Statement stat = con.createStatement();
            int row = stat.executeUpdate
                    ("INSERT INTO sort(sname,sprice,sdesc) VALUES('汽车',50000,'哈哈哈哈')");
            System.out.println(row);
            stat.close();
            con.close();
        }
    }
