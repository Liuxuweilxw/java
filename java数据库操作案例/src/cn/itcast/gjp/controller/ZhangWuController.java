package cn.itcast.gjp.controller;

import cn.itcast.gjp.domain.ZhangWu;
import cn.itcast.gjp.service.ZhangWuService;

import java.util.List;

/*
    控制器层
    接收视图层的数据，数据据传递给service层
    成员位置 创建service对象

 */
public class ZhangWuController {
    private ZhangWuService service=new ZhangWuService();
    /*
    调用service 添加账务
     */
    public int addZhangWu(ZhangWu zw){
        return service.addZhangWu(zw);

    }

    /*
    调用service层 修改账务
     */
    public int editZhangWu(ZhangWu zw){
        return service.editZhangWu(zw);
    }
    public int deleteZhangWu(int ID){
        return service.deleteZhangWu(ID);
    }
    /*
    查询所有
    由视图层调用
    调用service
     */
    public List<ZhangWu> selectAll(){
        List<ZhangWu> list=service.selectAll();
        return list;
    }

    /*
    条件查询
     */
    public List<ZhangWu> select(String startDate,String endDate){
        return service.select(startDate,endDate);
    }

}

