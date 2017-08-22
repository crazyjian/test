import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;


public class Test {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		System.out.println("请输入时间，格式如（yyyy-MM-dd）");
		String dateString = input.next();
		SimpleDateFormat sdf = new SimpleDateFormat("yyy-MM-dd");
		Date date = sdf.parse(dateString);
		System.out.println(date);
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		System.out.println(calendar.get(Calendar.DAY_OF_WEEK));
	}

}
