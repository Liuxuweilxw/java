import java.util.ArrayList;
import java.util.Scanner;
//main程序
public class Shoppa_11 {
    public static void main(String[] args){
        ArrayList<FruitItem> arr=new ArrayList<FruitItem>();
        init(arr);                                              //初始化集合
        while(true){
            mainMenu();                                         //选择菜单
            int num =getnum();                                  //选择
            switch(num){
                case 1:
                    showShoppa(arr);                            //显示商品清单
                    break;
                case 2:
                    addItem(arr);                               //添加商品
                    break;
                case 3:
                    deleteItem(arr);                            //删除商品
                    break;
                case 4:                                         //修改商品
                    fixItem(arr);
                    break;
                case 5:
                    return;                                     //结束
                default:
                    System.out.println("没有此功能; 请重新输入");
                    System.out.println();
            }
        }
    }
//初始化集合
    public static void init(ArrayList<FruitItem> arr){
        FruitItem item=new FruitItem();
        item.ID=0001;
        item.name="桃酥";
        item.price=13.1;
        item.number =20;
        arr.add(item);
    }
//主菜单
    public static void  mainMenu(){
        System.out.println("=============欢迎光临ItCast超市=============");
        System.out.println("1：               货物清单                  ");
        System.out.println("2：               添加货物                  ");
        System.out.println("3：               删除货物                  ");
        System.out.println("4：               修改货物                  ");
        System.out.println("5：                 退出                    ");
        System.out.print("            请输入要操作的功能序号：");
    }
//获取客户选择信息
    public static int getnum(){
        Scanner sca=new Scanner(System.in);
        int num=sca.nextInt();
        return num;
    }
    //商品信息展示
    public static void showShoppa(ArrayList<FruitItem> arr){
        System.out.println("==================商品清单==================");
        System.out.println("商品ID        商品名        价格        数量 ");
        for(int i=0;i<arr.size();i++){
            FruitItem item =arr.get(i);
            System.out.println(item.ID+"             "+item.name+"          "+item.price+"        "+item.number);
        }
    }
    //添加商品
    public static void addItem(ArrayList<FruitItem> arr){
        FruitItem item=new FruitItem();
        Scanner sca=new Scanner(System.in);
        System.out.print("请输入您想要添加的商品ID(按-1结束添加)：");
        item.ID=sca.nextInt();
        if(item.ID!=-1){
            int tag=0;
            FruitItem item_1=new FruitItem();
            for(int i=0;i<arr.size();i++){
                item_1=arr.get(i);
                if(item_1.ID==item.ID){
                    tag=-1;
                    break;
                }
            }
            if(tag==-1){
                System.out.println("商品ID已存在，请重新输入");
                //System.out.print("继续添加请按1，结束添加请按-1:");
               // if(sca.nextInt()==1){
                    addItem(arr);
               /* }else{
                    System.out.println("添加过程已结束");
                    System.out.println();
                }*/

            }else{
                System.out.println();
                System.out.print("请输入您想要添加的商品名称：");
                item.name=sca.next();
                System.out.println();
                System.out.print("请输入该商品价格：");
                item.price=sca.nextDouble();
                System.out.println();
                System.out.print("请输入该商品数量：");
                item.number=sca.nextInt();

                arr.add(item);
                System.out.println("添加成功，您当前添加的商品信息如下所示");
                System.out.println("商品ID        商品名        价格        数量 ");
                System.out.println(item.ID+"             "+item.name+"          "+item.price+"        "+item.number);
                System.out.println();
                System.out.print("继续添加请按1，结束添加请按-1:");
                if(sca.nextInt()==1){
                    addItem(arr);
                }else{
                    System.out.println("添加过程已结束");
                    System.out.println();
                }
            }
        }else{
            System.out.println("添加过程已结束");
        }
    }

    public static void deleteItem(ArrayList<FruitItem> arr){
        System.out.print("请输入你想要删除的商品ID(按-1结束删除)：");
        Scanner sca=new Scanner(System.in);
        int deleteID=sca.nextInt();
        if(deleteID!=-1){
            int tag=-1;
            FruitItem item_1=new FruitItem();
            for(int i=0;i<arr.size();i++){
                item_1=arr.get(i);
                if(item_1.ID==deleteID){
                    tag=i;
                    break;
                }
            }
            if(tag==-1){
                System.out.println("无此商品，请重新输入");
               // System.out.print("继续删除请按1，结束删除请按-1:");
                //if(sca.nextInt()==1){
                    deleteItem(arr);
               /* }else{
                    System.out.println("删除过程已结束");
                    System.out.println();
                }*/
            }else{
                System.out.println("请确认您将要删除的商品信息，确认删除请按1，否则请按-1");
                System.out.println("商品ID        商品名        价格        数量 ");
                System.out.println(item_1.ID+"             "+item_1.name+"          "+item_1.price+"        "+item_1.number);
                if(sca.nextInt()==1){
                    arr.remove(tag);
                    System.out.println("该商品已经成功删除！");
                    System.out.print("继续删除请按1，结束删除请按-1:");
                    if(sca.nextInt()==1){
                        deleteItem(arr);
                    }else{
                        System.out.println("删除过程已结束");
                        System.out.println();
                    }
                }else{
                    System.out.println("删除过程已取消");
                    System.out.println();
                }
            }
        }else{
            System.out.println("删除过程已取消");
            System.out.println();
        }

    }
    public static void fixItem(ArrayList<FruitItem> arr){
        System.out.print("请输入您想要修改的商品ID(按-1结束修改)：");
        Scanner sca=new Scanner((System.in));
        int fixID=sca.nextInt();
        int tag=-1;
        if(fixID!=-1){
            FruitItem item_1=new FruitItem();
            for(int i=0;i<arr.size();i++){
                item_1=arr.get(i);
                if(item_1.ID==fixID){
                    tag=i;
                    break;
                }
            }
            if(tag==-1){
                System.out.println("无此商品，请重新输入");
               // System.out.print("继续修改请按1，结束修改请按-1:");
                //if(sca.nextInt()==1){
                    fixItem(arr);
               /* }else{
                    System.out.println("修改过程已结束");
                    System.out.println();
                }*/
            }else{
                System.out.println("请确认您将要修改的商品原信息，确认修改请按1，否则请按-1");
                System.out.println("商品ID        商品名        价格        数量 ");
                System.out.println(item_1.ID+"             "+item_1.name+"          "+item_1.price+"        "+item_1.number);
                if(sca.nextInt()==1){
                    System.out.print("请输入修改后的商品ID：");
                    fixID=sca.nextInt();
                    for(int i=0;i<arr.size();i++){
                        if(arr.get(i).ID==fixID && fixID!=arr.get(tag).ID){
                            tag=-1;
                            break;
                        }
                    }
                    if(tag==-1){
                        System.out.println("商品ID已存在，请重新输入");
                        //System.out.print("继续修改请按1，结束修改请按-1:");
                        //if(sca.nextInt()==1){
                            fixItem(arr);
                       /* }else{
                            System.out.println("修改过程已结束");
                            System.out.println();
                        }*/

                    }else{
                        item_1.ID=fixID;
                        System.out.println();
                        System.out.print("请输入修改后的商品名称：");
                        item_1.name=sca.next();
                        System.out.println();
                        System.out.print("请输入修改后的商品价格：");
                        item_1.price=sca.nextDouble();
                        System.out.println();
                        System.out.print("请输入修改后的商品数量：");
                        item_1.number=sca.nextInt();
                        System.out.println("修改成功，您当前添加的商品信息如下所示");
                        System.out.println("商品ID        商品名        价格        数量 ");
                        System.out.println(item_1.ID+"             "+item_1.name+"          "+item_1.price+"        "+item_1.number);

                        System.out.println();
                        System.out.print("继续修改请按1，结束修改请按-1:");
                        if(sca.nextInt()==1){
                            fixItem(arr);
                        }else{
                            System.out.println("修改过程已结束");
                            System.out.println();
                        }
                    }
                }else{
                    System.out.println("修改过程已结束");
                    System.out.println();
                }
            }

        }else{
            System.out.println("修改过程已结束");
            System.out.println();
        }
    }
}
