package DateDemo;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateToString
{
    public static void main(String[] args) throws ParseException {

        String str = "11/02/2023"; //dd/MM/yyyy
        System.out.println(str);
        SimpleDateFormat sd = new SimpleDateFormat("dd/MM/yyyy");
        Date date = sd.parse(str);
        System.out.println(date);
    }
}
