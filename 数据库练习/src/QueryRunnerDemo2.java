import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.ArrayListHandler;

import java.sql.SQLException;
import java.util.List;

public class QueryRunnerDemo2 {

    public static void main(String[] args)
    {
        //insert();
        select();
    }
    private static QueryRunner qr=new QueryRunner(JDBCUtils.getDataSource());
    public static void select(){
        String sql="SELECT * FROM sort";
        try{
            List<Object[]> list=qr.query(sql,new ArrayListHandler());
            for(Object[] objs:list){
                for(Object obj:objs){
                    System.out.print(obj+"\t");
                }
                System.out.println();
            }
        }catch (SQLException se){
            System.out.println(se);
            throw  new RuntimeException("数据查询失败");
        }


    }

    public static void insert(){
        String sql="INSERT INTO sort(sname,sprice,sdesc) VALUES(?,?,?)";
        Object[] params={"水果",100.12,"感受过"};
        try{
            int row=qr.update(sql,params);
            System.out.println(row);
        }catch(SQLException se){
            System.out.println(se);
            throw  new RuntimeException("数据添加失败");
        }
    }
}
