/*
 * This class has the methods to create a calendar.
 */
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;


public class calendar{
	//This method is for the screens class. It returns a string that tells how many days left.
	public static String  untilDate(String nameOfClass) {
		LocalDate today = LocalDate.now();
		LocalDate examDate = APDatatbase.examMap.get(nameOfClass).getDate();
		long daysLeft = ChronoUnit.DAYS.between(today, examDate);
		return "Days until exam: " + daysLeft;
	}
	//This method is to return days left.
	public static long  daysLeftnumber(String nameOfClass) {
		LocalDate today = LocalDate.now();
		LocalDate examDate = APDatatbase.examMap.get(nameOfClass).getDate();
		long daysLeft = ChronoUnit.DAYS.between(today, examDate);
		return daysLeft;
	}
	
}
