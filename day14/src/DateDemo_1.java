import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo_1 {
    public static void main(String[] args) throws Exception{
        function();
    }

    public static void function() throws Exception {
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        Date date=sdf.parse("1995-09-01");
        System.out.println(date);
    }
}
