import java.util.Scanner;

public class Shopp_1 {
    public static void main(String[] args){
        String[] brand={"MacBook pro","ThinkPad"};
        double[] price={9996.55,4534.54};
        double[] size={13.3,15.6};
        int[] count={0,0};
        while(true){
            int choose=chooseFunction();
            switch(choose){
                case 1:
                show(brand,price,size,count);
                break;
    
                case 2:
                fix(brand,count);
                break;
    
                case 3:
                return;
    
                default:
                System.out.println("没有这个功能");         
            }
        }   
    }
    public static int  chooseFunction(){
        System.out.println("========商品库存管理系统=======");
        System.out.println("     1: 查看商品库存信息       ");
        System.out.println("     2：修改商品库存信息       ");
        System.out.println("     3：     退出              ");
        System.out.println("      请输入序号进行选择       ");
        Scanner scan=new Scanner(System.in);
        int sca=scan.nextInt();
        return sca;
    }
    public static void show(String[] brand,double[] price,double[] size,int[] count){
        System.out.println("=====商品库存目录=====");
        System.out.print("brand"+"  ");
        for(int i=0;i<brand.length;i++){
            System.out.print(brand[i]+"  ");
        }
        System.out.println();
        System.out.print("price"+"  ");
        for(int i=0;i<price.length;i++){
            System.out.print(price[i]+"    ");
        }
        System.out.println();
        System.out.print("size"+"   ");
        for(int i=0;i<size.length;i++){
            System.out.print(size[i]+"  ");
        }
        System.out.println();
        System.out.print("count"+"   ");
        for(int i=0;i<count.length;i++){
            System.out.print(count[i]+"    ");
        }
        System.out.println();
    }
    public static void fix(String[] brand,int[] count){
        Scanner scan=new Scanner(System.in);
        System.out.println("请输入你想要修改的商品序号：");
        int index=scan.nextInt();
        System.out.println("请输入"+brand[index]+"的库存数量：");
        int cou=scan.nextInt();
        count[index]=cou;
        System.out.println();
        System.out.println("修改成功");
    }

}