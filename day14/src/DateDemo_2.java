import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class DateDemo_2 {
    public static void main(String[] args) throws Exception{
        function();
    }
    public static void function() throws Exception{
        System.out.println("请输入出生日期，格式为yyyy-MM-dd");
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        Date birthdaydate=sdf.parse(new Scanner(System.in).next());

        Date todaydate=new Date();

        long birthsecond=birthdaydate.getTime();
        long todaysecond=todaydate.getTime();

        long second=todaysecond-birthsecond;
        if(second<0){
            System.out.println("你还没出生");
        }else{
            System.out.println(second/24/60/60/1000);
        }
    }
}
