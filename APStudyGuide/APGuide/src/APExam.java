/*
 * This class creates the parameters for the HashMap
 */

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
	//returns the name from the HashMap
	}
	public String getName() {
		return name;
	}
	//returns the date from the HashMap
	public LocalDate getDate() {
		return date;
	}
	//returns the difficulty from the HashMap
	public String getDifficulty() {
		return difficulty;
	}
	//returns the topics from the HashMap
	public List<String> getTopics() {
		return topics;
	}
	//returns the percentage from the HashMap
	public List<Integer> getPercentage() {
		return percentage;
	}
}