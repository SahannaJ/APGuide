/*
 * This class has different methods to pull information to of the HashMap
*/


import java.time.LocalDate;
import java.util.*;

public class APExamInfo extends APExam {
	
	
	public APExamInfo(String name, LocalDate date, String difficulty, List<String> topic, List<Integer> percentage) {
		super( name, date, difficulty);
		this.topics = topic;
		this.percentage = percentage;
	}
	//Pulls the name out of the HashMap
	public static String InfoforName(String nameOfClass) {
		return "Name: " + APDatatbase.examMap.get(nameOfClass).getName();
		
	}
	//Pulls the Date out of the HashMap
	public static String  InfoforDate(String nameOfClass) {
		return "Date: " + APDatatbase.examMap.get(nameOfClass).getDate();
		
	}
	//Pulls the Difficulty out of the HashMap
	public static String InfoforDifficulty(String nameOfClass) {
		return "difficulty: " + APDatatbase.examMap.get(nameOfClass).getDifficulty();
		
		}
	//Builds a string which is used in the screens class to show the user what topics are on the AP exam and how often they come up.
	public static String InfoforTopics(String nameOfClass) {
		StringBuilder infoAboutTopics = new StringBuilder();
		String finalInfo;
		for(int i = 0; i< APDatatbase.examMap.get(nameOfClass).getTopics().size(); i++) {
			infoAboutTopics.append("Unit " + (i+1) + ": " + APDatatbase.examMap.get(nameOfClass).getTopics().get(i) + "\n" + "Percentage for Unit: " + APDatatbase.examMap.get(nameOfClass).getPercentage().get(i) + "\n");
			

	}
		finalInfo = infoAboutTopics.toString();
		return finalInfo;
	}
	//creates a way to make a study schedule for them based on the least difficult to most difficult
	public static String CalendarMaking(String nameOfClass) {
		List<String> modifiableTopics = new ArrayList<>(APDatatbase.examMap.get(nameOfClass).getTopics());
		List<Integer> modifiablePercentages = new ArrayList<>(APDatatbase.examMap.get(nameOfClass).getPercentage());
		for (int i = 0; i < APDatatbase.examMap.get(nameOfClass).getTopics().size()- 1; i++) {
            for (int j = 0; j < APDatatbase.examMap.get(nameOfClass).getTopics().size() - 1; j++) {
                if (modifiablePercentages.get(j) < modifiablePercentages.get(j+1)) { 
                	int temp = modifiablePercentages.get(j);
                    String temp1 = modifiableTopics.get(j);
                    modifiablePercentages.set(j, modifiablePercentages.get(j+1));
                    modifiableTopics.set(j, modifiableTopics.get(j+1));

                    modifiablePercentages.set(j+1, temp);
                    modifiableTopics.set(j+1, temp1);
                }
            }
        }
		Queue<String> UnitsInOrder = new LinkedList<>(modifiableTopics);
		StringBuilder makingTheCalendar = new StringBuilder();
		String finalcalendar;
		long countdown = calendar.daysLeftnumber(nameOfClass);
		 int unitCount = UnitsInOrder.size();
		 for (int day = 0; day < countdown; day++) {
			    String currentUnit;

			    if (!UnitsInOrder.isEmpty()) {
			        currentUnit = UnitsInOrder.poll();
			        if (APDatatbase.examMap.get(nameOfClass).getPercentage().get(day) > 20) {
			            UnitsInOrder.add(currentUnit);
			        }
			    } else {
			        currentUnit = "Any Unit";
			    }

			    makingTheCalendar.append("Day " + (day + 1) + ": Review " + currentUnit + "\n");
			}
		finalcalendar = makingTheCalendar.toString();
		return finalcalendar;
	}
		
}
