public class Shopp{
    public static void main(String[] args){
        //输出表格的固定数据
        System.out.println("-----------商品库存清单----------");
        System.out.println("品牌型号    尺寸    价格    库存数");
        //定义表格中的数据变量 
        //品牌型号，string 尺寸，double 数量，int
        String macBrand="MacBookAir";
        double macSize=13.3;
        double macPrice=6988.88;
        int macCount=5;

        String thinkBrand="ThinkPad";
        double thinkSize=14;
        double thinkPrice=5999.99;
        int thinkCount=10;

        String ausuBrand="AUSU";
        double ausuSize=15.6;
        double ausuPrice=4999.5;
        int ausuCount=18;

        System.out.println(macBrand+"  "+macSize+"   "+macPrice+"    "+macCount);
        System.out.println(thinkBrand+"    "+thinkSize+"   "+thinkPrice+"    "+thinkCount);
        System.out.println(ausuBrand+"        "+ausuSize+"   "+ausuPrice+"     "+ausuCount);
    }
}