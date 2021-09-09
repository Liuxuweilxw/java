import org.apache.commons.dbcp2.BasicDataSource;

import javax.sql.DataSource;

public class JDBCUtils {
    private static BasicDataSource dataSource=new BasicDataSource();
    static{
        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/mydatabase?serverTimezone=GMT%2B8");
        dataSource.setUsername("root");
        dataSource.setPassword("980125");

        dataSource.setInitialSize(10);

        dataSource.setMaxIdle(5);
        dataSource.setMinIdle(1);


    }
    public static DataSource getDataSource(){
        return dataSource;
    }
}
