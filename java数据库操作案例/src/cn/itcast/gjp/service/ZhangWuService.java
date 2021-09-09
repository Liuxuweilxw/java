package cn.itcast.gjp.service;

import cn.itcast.gjp.dao.ZhangWuDao;
import cn.itcast.gjp.domain.ZhangWu;

import java.util.List;

/*
    业务层类
    接收上一层 控制层controller的数据
    经过计算 传递给dao层 操作数据库
    调用dao层中的类 类成员位置 创建Dao类的对象
 */
public class ZhangWuService {
    private ZhangWuDao dao=new ZhangWuDao();

    /*
    调用Dao层 添加账务
     */
    public int addZhangWu(ZhangWu zw){
        return dao.addZhangWu(zw);
    }
    /*
    调用Dao层 修改账务
     */
    public int editZhangWu(ZhangWu zw){
        return dao.editZhanagWu(zw);
    }
    public int deleteZhangWu(int ID){
        return dao.deleteZhangWu(ID);
    }
    /*
    查询所有
    由控制层调用
    调用dao层
     */
    public List<ZhangWu> selectAll(){
        List<ZhangWu> list= dao.selectAll();
        return list;
    }

    /*
    条件查询
     */
    public List<ZhangWu> select(String starDate,String endDate){
        return dao.select(starDate,endDate);
    }

}
