package DateDemo;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo2 {
    public static void main(String[] args) {

        Date date = new Date();
        System.out.println(date);

        SimpleDateFormat sd = new SimpleDateFormat("EEEE yyyy/MM/dd");
        String dateStr = sd.format(date);
        System.out.println(dateStr);

        SimpleDateFormat sd0 = new SimpleDateFormat("dd-MMMM-yyyy");
        String dateStr0 = sd0.format(date);
        System.out.println(dateStr0);

        SimpleDateFormat sd1 = new SimpleDateFormat("dd|MMMM yy hh:mm");
        String dateStr1 = sd1.format(date);
        System.out.println(dateStr1);

        SimpleDateFormat sd2 = new SimpleDateFormat("EEEE yyyy/MM/dd");
        String dateStr2 = sd2.format(date);
        System.out.println(dateStr2);

        SimpleDateFormat sd3 = new SimpleDateFormat("dd-MM-yyyy | EE | hh:mm");
        String dateStr3 = sd3.format(date);
        System.out.println(dateStr3);

    }
}
