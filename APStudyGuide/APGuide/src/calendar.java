import java.time.LocalDate;
import java.time.temporal.ChronoUnit;


public class calendar{
	
	public static String  untilDate(String nameOfClass) {
		LocalDate today = LocalDate.now();
		LocalDate examDate = APDatatbase.examMap.get(nameOfClass).getDate();
		long daysLeft = ChronoUnit.DAYS.between(today, examDate);
		return "Days until exam: " + daysLeft;
	}
	public static long  daysLeftnumber(String nameOfClass) {
		LocalDate today = LocalDate.now();
		LocalDate examDate = APDatatbase.examMap.get(nameOfClass).getDate();
		long daysLeft = ChronoUnit.DAYS.between(today, examDate);
		return daysLeft;
	}
	
}
