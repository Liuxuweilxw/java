import java.util.Calendar;

public class DateDemo_3 {
    public static void main(String[] args){
        function();

    }
    public static void function(){
        Calendar cal=Calendar.getInstance();
        cal.set(2000,2,1);
        cal.add(Calendar.DAY_OF_MONTH,-1);
        int day=cal.get(Calendar.DAY_OF_MONTH);
        System.out.println(day);
    }
}
