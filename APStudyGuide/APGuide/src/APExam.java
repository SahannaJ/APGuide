import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class APExam {
	String name;
	LocalDate date;
	String difficulty;
	List<Integer> percentage;
	List<String> topics;

	Scanner scanner = new Scanner(System.in);
	public APExam(String name, LocalDate date, String difficulty) {
		this.name = name;
		this.date = date;
		this.difficulty = difficulty;
	}
	public String getName() {
		return name;
	}
	public LocalDate getDate() {
		return date;
	}
	public String getDifficulty() {
		return difficulty;
	}
	public List<String> getTopics() {
		return topics;
	}
	public List<Integer> getPercentage() {
		return percentage;
	}
}