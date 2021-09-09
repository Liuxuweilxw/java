package cn.itcast.gjp.view;

import cn.itcast.gjp.controller.ZhangWuController;
import cn.itcast.gjp.domain.ZhangWu;

import java.util.List;
import java.util.Scanner;

/*
    视图层
    用户看到和操作的界面
    数据传递给Controller层
    成员位置 创建Controller对象
 */
public class MainView {
    private ZhangWuController controller=new ZhangWuController();
    /*
    实现界面
    接收用户输入
    根据数据调用不同方法
     */
    public void run(){
        Scanner sc=new Scanner(System.in);
        while (true){
            System.out.println("================管家婆家庭记账软件================");
            System.out.println("1.添加账务  2.编辑账务  3.删除帐务  4.查询账务  5.退出系统");
            System.out.print("请输入要操作的功能序号[1-5]:");
            int choose=sc.nextInt();
            switch (choose){
                case 1:
                    addZhangWu();
                    break;
                case 2:
                   editZahngWu();
                    break;
                case 3:
                    //删除帐务
                    deleteZhangWu();
                    break;
                case 4:
                    //查询账务
                    selectZhangWu();
                    break;
                case 5:
                    //退出系统
                    System.exit(0);
                    break;
                default:
                    System.out.println("输入错误");
            }
        }
    }

    /*
       1 添加账务
     */
    public void addZhangWu(){
        System.out.println("选择的添加账务功能，请输入以下内容");
        Scanner sc=new Scanner(System.in);
        System.out.print("输入分类名称：");
        String flname=sc.next();
        System.out.print("余额：");
        double money=sc.nextDouble();
        System.out.print("账户：");
        String zhanghu=sc.next();
        System.out.print("输入创建时间 XXXX-XX-XX：");
        String createtime=sc.next();
        System.out.print("描述：");
        String description =sc.next();

        ZhangWu zw=new ZhangWu(0,flname,money,zhanghu,createtime,description);
        int i=controller.addZhangWu(zw);
        System.out.println("数据添加成功:"+i);

    }

    /*
    2 修改账户
     */
    public void editZahngWu(){
        selectAll();
        System.out.println("选择的修改账务功能，请输入以下内容");
        Scanner sc=new Scanner(System.in);
        System.out.print("账户ID：");
        int ID=sc.nextInt();
        System.out.print("输入分类名称：");
        String flname=sc.next();
        System.out.print("余额：");
        double money=sc.nextDouble();
        System.out.print("账户：");
        String zhanghu=sc.next();
        System.out.print("输入创建时间 XXXX-XX-XX：");
        String createtime=sc.next();
        System.out.print("描述：");
        String description =sc.next();

        ZhangWu zw=new ZhangWu(ID,flname,money,zhanghu,createtime,description);
        int i=controller.editZhangWu(zw);
        System.out.println("数据添加成功:"+i);
    }

    /*
    3 删除账务
     */
    public void deleteZhangWu(){
        selectAll();
        System.out.println("选择的删除账务功能，请输入以下内容");
        Scanner sc=new Scanner(System.in);
        System.out.print("账户ID：");
        int ID=sc.nextInt();
        System.out.print("确认删除请按1，取消删除请按其他键：");
        int flag=sc.nextInt();
        if(flag==1){
            int i=controller.deleteZhangWu(ID);
            System.out.println("数据删除成功:"+i);
        }else{
            return;
        }
    }
    /*
        4 定义方法selectZhangWu()
        显示查询的方式 1 所有查询 2  条件查询
        接收用户选择
     */
    public void selectZhangWu(){
        System.out.println("1. 查询所有   2. 条件查询");
        Scanner sc=new Scanner(System.in);
        int selectChoose=sc.nextInt();
        switch(selectChoose){
            case 1:
                //所有查询
                selectAll();
                break;
            case 2:
                //条件查询
                select();
                break;
        }
    }
    /*
        查询所有
     */
    public void selectAll(){
         //4.1 调用控制层 查询所有
        List<ZhangWu> list=controller.selectAll();
        System.out.println("ID\t类别\t金额\t账户\t时间\t\t说明");
        for(ZhangWu zw: list){
            System.out.println(zw.getZwid()+"\t"+zw.getFlname()+"\t"+zw.getMoney()+"\t"+
                    zw.getZhanghu()+"\t"+zw.getCreatetime()+"\t"+zw.getDescription());
        }
    }

    /*
        条件查询
     */
    /*
        4.2 定义方法 实现条件查询账务数据
        提供用户的输入日期 ，开始日期结束日期
        将两个日期传递到controller层
        调用controller的方法 传递日期参数
        获取controller结果集并打印
         4调用controller层的方法 传递日期 获取查询结果
     */
    public void select(){
        System.out.println("选择条件查询输入日期 日期格式为XXXX-XX-XX");
        Scanner sc=new Scanner(System.in);
        System.out.print("请输入开始日期：");
        String startDate=sc.nextLine();
        System.out.print("请输入结束日期：");
        String endDate=sc.nextLine();
        controller.select(startDate,endDate);

        List<ZhangWu> list=controller.select(startDate,endDate);
        for(ZhangWu zw:list){
            System.out.println(zw.getZwid()+"\t"+zw.getFlname()+"\t"+zw.getZhanghu()+"\t"+
                    zw.getMoney()+"\t"+zw.getCreatetime()+"\t"+zw.getDescription());
        }
    }


}
