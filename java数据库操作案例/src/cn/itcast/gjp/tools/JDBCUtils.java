package cn.itcast.gjp.tools;

import org.apache.commons.dbcp2.BasicDataSource;
import javax.sql.DataSource;
import java.io.IOException;
import java.io.InputStream;
import java.sql.DriverManager;
import java.util.Properties;

public class JDBCUtils {
        private static BasicDataSource dataSource=new BasicDataSource();
        private static String className;
        private static String url;
        private static String username;
        private static String password;

        static{
            try{
                readProperties();
            }catch(Exception ex){
                throw new RuntimeException("数据库链接失败");
            }
            dataSource.setDriverClassName(className);
            dataSource.setUrl(url);
            dataSource.setUsername(username);
            dataSource.setPassword(password);
            dataSource.setInitialSize(10);
            dataSource.setMaxIdle(5);
            dataSource.setMinIdle(1);
        }

    private static void readProperties() throws IOException {
        InputStream in= JDBCUtils.class.getClassLoader().getResourceAsStream("database.properties");
        Properties pro=new Properties();
        pro.load(in);
        className=pro.getProperty("className");
        url=pro.getProperty("url");
        username=pro.getProperty("username");
        password=pro.getProperty("password");
    }
        public static DataSource getDataSource(){
            return dataSource;
        }
    }

