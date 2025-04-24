import java.util.*;

public class APExamInfo extends APExam {
	List<String> topics;
	int knowledge;
	List<Integer> percentage;
	public APExamInfo(String name, String date, String difficulty, List<String> topic, List<Integer> percentage) {
		super( name, date, difficulty);
		this.topics = topic;
		this.percentage = percentage;
	}
	public void Info() {
		System.out.println("Name: " + name);
		System.out.println("Date: " + date);
		System.out.println("difficulty: " + difficulty + "/5");
		for(int i = 0; i< topics.size(); i++) {
			System.out.println("Topic " + topics.get(i) + " Knowledge (Rank 1- 5): ");
			knowledge = scanner.nextInt();
		for(int x = 0; x< percentage.size(); i++) {
			System.out.println("Percentage for Unit " + x + percentage.get(x));
		}
		}
	}
}
