package lab04_04;
/**
 * @author 2016112105 박선희
 * @date 20.04.09
 * @using 퍼싸드 패턴
 */
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.text.DecimalFormat;
import java.text.MessageFormat;

/** Specifies basic formatting for dates, integers, money, and people */
public class BasicFormat {
	/**
	 * Formats a date
	 * 
	 * @param date any object<Date>
	 * @return format date d MMM yyyy
	 */
	public static String formatDate(Date date) {
	    SimpleDateFormat dateFormat = new SimpleDateFormat("d MMM yyyy");
		return dateFormat.format(date);
	}

	/**
	 * Formats a date
	 * 
	 * @param year  Full integral value of the year, e.g. 1945, 2008
	 * @param month Zero-based month index, e.g. 0 is January, 6 is July
	 * @param day   One-based day of the month
	 */
	public static String formatDate(int year, int month, int day) {
		return day + " " + month +"월 "+ year;
	}
	/**
	 * Formats a long
	 * 
	 * @param number 
	 * @return checking "," every thousand digits
	 */
	public static String formatLong(long number) {
		DecimalFormat intFormat = new DecimalFormat("#,###");
		return intFormat.format(number);
	}
	/**
	 * Formats a money
	 * 
	 * @param amount 
	 * @return ${amount}
	 */
	public static String formatMoney(double amount) {
	    DecimalFormat dollarFormat = new DecimalFormat("$ #,##0.##");
		return dollarFormat.format(amount);
	}
	/**
	 * Formats a person format
	 * 
	 * @param firstName
	 * @param lastName
	 * @param userName
	 * @return firstName, lastName [userName]
	 */
	public static String formatPerson(String firstName, String lastName, String userName) {
		return firstName +", " + lastName + " [" + userName +"]";
	}
}
