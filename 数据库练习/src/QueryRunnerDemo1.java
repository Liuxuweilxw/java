import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.ArrayHandler;
import org.apache.commons.dbutils.handlers.ArrayListHandler;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class QueryRunnerDemo1 {
    private static Connection con=JDBCUtilsConfig.getConnection();
    public static void main(String[] args) throws SQLException {
        //arrayHandler();
        //arrayListHandler();
//        beanHandler();
        beanListHandler();
    }
    public static void arrayHandler() throws SQLException {
        QueryRunner qr= new QueryRunner();
        String sql="SELECT * FROM sort";
        Object[] result=qr.query(con,sql,new ArrayHandler());
        for(Object obj:result)
        {
            System.out.print(obj+"\t");
        }
    }
    public static void arrayListHandler() throws SQLException {
        QueryRunner qr= new QueryRunner();
        String sql="SELECT * FROM sort";
        List<Object[]> ob=qr.query(con,sql,new ArrayListHandler());
        for(Object[] obj: ob){
            for(Object objs:obj){
                System.out.print(objs+"\t");
            }
            System.out.println();
        }
    }

    public static void beanHandler() throws SQLException {
        QueryRunner qr=new QueryRunner();
        String sql="SELECT * FROM sort";
        sort s=qr.query(con,sql,new BeanHandler<sort>(sort.class));
        System.out.println(s);
    }
    public static void beanListHandler() throws SQLException {
        QueryRunner qr=new QueryRunner();
        String sql="SELECT * FROM sort";
        List<sort> list=qr.query(con,sql,new BeanListHandler<sort>(sort.class));
        for(sort s : list){
            System.out.println(s);
        }
    }
}
