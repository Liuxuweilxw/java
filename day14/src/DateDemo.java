import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo {
    public static void main(String[] args){
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy年MM月dd日HH点mm分钟ss秒");
        String str=sdf.format(new Date());
        System.out.println(str);
    }
}
