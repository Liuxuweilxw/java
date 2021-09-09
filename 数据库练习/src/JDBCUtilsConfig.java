import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class JDBCUtilsConfig {
    private static Connection con;
    private static String className;
    private static String url;
    private static String username;
    private static String password;

    static{
        try{
            readProperties();
            Class.forName(className);
            con= DriverManager.getConnection(url,username,password);
        }catch(Exception ex){
//            throw new RuntimeException("数据库链接失败");
        }
    }

    private static void readProperties() throws IOException {
        InputStream in= JDBCUtilsConfig.class.getClassLoader().getResourceAsStream("database.properties");
        Properties pro=new Properties();
        pro.load(in);
        className=pro.getProperty("className");
        url=pro.getProperty("url");
        username=pro.getProperty("username");
        password=pro.getProperty("password");
    }
    public static Connection getConnection(){
        return con;
    }

}
