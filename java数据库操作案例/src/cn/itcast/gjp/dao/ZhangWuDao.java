package cn.itcast.gjp.dao;
/*
    实现对数据表gjp_zhangwu数据增删改查操作
    用dbutils工具类完成 ，类成员创建QueryRunner对象，指定数据源
 */
import cn.itcast.gjp.domain.ZhangWu;
import cn.itcast.gjp.tools.JDBCUtils;
import javafx.beans.binding.ObjectBinding;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import java.sql.SQLException;
import java.util.List;

public class ZhangWuDao {
    private QueryRunner qr=new QueryRunner(JDBCUtils.getDataSource());
    /*
    由业务层调用 向数据库中添加账务
     */
    public int addZhangWu(ZhangWu zw){
        try{
            String sql = "INSERT INTO gjp_zhangwu (flname,money,zhanghu,createtime,description) VALUES(?,?,?,?,?)";
            Object[] params={zw.getFlname(),zw.getMoney(),zw.getZhanghu(),zw.getCreatetime(),zw.getDescription()};
            int i=qr.update(sql,params);
            return i;
        }catch (SQLException se ){
            System.out.println(se);
            throw new RuntimeException("数据添加失败");
        }

    }
    /*
    由业务层调用 修改指定ID 的账务数据
     */
    public int editZhanagWu(ZhangWu zw){
        try{
            String sql="UPDATE gjp_zhangwu SET flname=?,money=?,zhanghu=?,createtime=?,description=? WHERE zwid=?";
            Object[] params={zw.getFlname(),zw.getMoney(),zw.getZhanghu(),zw.getCreatetime(),zw.getDescription(),zw.getZwid()};
            int i=qr.update(sql,params);
            return i;
        }catch (SQLException se ){
            System.out.println(se);
            throw new RuntimeException("数据添加失败");
        }
    }
    public int deleteZhangWu(int ID){
        try{
            String sql="DELETE FROM gjp_zhangwu WHERE zwid=?";
            Object[] params={ID};
            int i=qr.update(sql,params);
            return i;
        }catch (SQLException se ){
            System.out.println(se);
            throw new RuntimeException("数据删除失败");
        }
    }
    /*
    查询所有
    由业务层调用
     */
    public List<ZhangWu> selectAll(){
        try {
            String sql="SELECT * FROM gjp_zhangwu";
            List<ZhangWu> list=qr.query(sql,new BeanListHandler<>(ZhangWu.class));
            return list;
        }catch (SQLException se){
            System.out.println(se);
            throw new RuntimeException("查询所有账务失败");
        }
    }

    /*
    条件查询
     */
    public List<ZhangWu> select(String startDate,String endDate){
        try {
            String sql="SELECT * FROM gjp_zhangwu WHERE createtime BETWEEN ? AND ?";
            Object[] params={startDate,endDate};
            List<ZhangWu> list=qr.query(sql,new BeanListHandler<>(ZhangWu.class),params);
            return list;
        }catch (SQLException se){
            System.out.println(se);
            throw new RuntimeException("查询所有账务失败");
        }
    }
}
