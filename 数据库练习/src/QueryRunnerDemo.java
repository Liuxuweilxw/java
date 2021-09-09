import org.apache.commons.dbutils.DbUtils;
import org.apache.commons.dbutils.QueryRunner;

import java.sql.Connection;
import java.sql.SQLException;

public class QueryRunnerDemo {
    private static Connection con=JDBCUtilsConfig.getConnection();
    public static void main(String[] args) throws SQLException {
       insert();

    }
    public static void insert() throws SQLException {
        QueryRunner qr=new QueryRunner();
        String sql="INSERT INTO sort(sname,sprice,sdesc) VALUE(?,?,?)";
        Object[] param={"体育用品",289.4,"购买体育用品"};
        int row =qr.update(con,sql,param);
        System.out.println(row);
        DbUtils.closeQuietly(con);
    }

}
