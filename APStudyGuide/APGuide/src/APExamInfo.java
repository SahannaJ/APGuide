import java.time.LocalDate;
import java.util.*;

public class APExamInfo extends APExam {
	
	
	public APExamInfo(String name, LocalDate date, String difficulty, List<String> topic, List<Integer> percentage) {
		super( name, date, difficulty);
		this.topics = topic;
		this.percentage = percentage;
	}
	
	public static String InfoforName(String nameOfClass) {
		return "Name: " + APDatatbase.examMap.get(nameOfClass).getName();
		
	}
	public static String  InfoforDate(String nameOfClass) {
		return "Date: " + APDatatbase.examMap.get(nameOfClass).getDate();
		
	}
	public static String InfoforDifficulty(String nameOfClass) {
		return "difficulty: " + APDatatbase.examMap.get(nameOfClass).getDifficulty();
		
		}
	public static String InfoforTopics(String nameOfClass) {
		StringBuilder infoAboutTopics = new StringBuilder();
		String finalInfo;
		for(int i = 0; i< APDatatbase.examMap.get(nameOfClass).getTopics().size(); i++) {
			infoAboutTopics.append("Unit " + (i+1) + ": " + APDatatbase.examMap.get(nameOfClass).getTopics().get(i) + "\n" + "Percentage for Unit: " + APDatatbase.examMap.get(nameOfClass).getPercentage().get(i) + "\n");
			

	}
		finalInfo = infoAboutTopics.toString();
		return finalInfo;
	}
		
}
