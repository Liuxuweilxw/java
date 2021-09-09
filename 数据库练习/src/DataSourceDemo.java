import org.apache.commons.dbcp2.BasicDataSource;

import java.sql.Connection;
import java.sql.SQLException;

public class DataSourceDemo {
    public static void main(String[] args){
        BasicDataSource dataSource=new BasicDataSource();
        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/mydatabase?serverTimezone=GMT%2B8");
        dataSource.setUsername("root");
        dataSource.setPassword("980125");
        try{
            Connection con=dataSource.getConnection();
            System.out.println(con);
        }catch(SQLException se){
            System.out.println(se);
            throw new RuntimeException("数据库连接失败");
        }

    }
}
