/*
 * This class has all the information for each AP Class.
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.time.LocalDate;
import java.util.*;
public class APDatatbase{
	static {
	    new arrays(); 
	}
	//This has a HashMap which contains all the information like the name, date, difficulty, topics, percentage
	
	public static Map<String, APExam> examMap = new HashMap<>();
	static {
		examMap.put("ap biology", new APExamInfo(
			"AP Biology", LocalDate.of(2025, 5, 5), "Difficult", arrays.apBiostr, arrays.apBioInt
			));
		examMap.put("ap chemistry", new APExamInfo(
				"AP Chemistry", LocalDate.of(2025, 5, 6), "Difficult",  arrays.apChemstr, 
				arrays.apChemInt
				));
		examMap.put("ap enviornmental science", new APExamInfo(
				"AP Enviornmental Science", LocalDate.of(2025, 5, 13), "Moderate", arrays.apEnvstr, 
				arrays.apEnvInt
				));
		examMap.put("ap physics c: mechanics", new APExamInfo(
				"AP Physics C: Mechanics", LocalDate.of(2025, 5, 14), "Difficult", arrays.apPhy3str, 
				arrays.apPhy3Int
				));
		examMap.put("ap physics c: electricity and magnetism", new APExamInfo(
				"AP Physics C: Electricity and Magnetism", LocalDate.of(2025, 5, 15), "Difficult", arrays.apPhy4str, 
				arrays.apPhy4Int
				));
		examMap.put("ap physics 1", new APExamInfo(
				"AP Physics 1: Algebra-Based", LocalDate.of(2025, 5, 16), "Difficult",arrays.apPhy1str,
				arrays.apPhy1Int
				));
		examMap.put("ap physics 2", new APExamInfo(
				"AP Physics 2: Algebra-Based", LocalDate.of(2025, 5, 13), "Moderate", arrays.apPhy2str,
				arrays.apPhy2Int
				));
		examMap.put("ap english literature and composition", new APExamInfo(
				"AP English Literature and Composition", LocalDate.of(2025, 5, 7), "Moderate", arrays.apEngLitstr, 
				arrays.apEngLitInt
				));
		examMap.put("ap calculus ab", new APExamInfo(
				"AP Calculus AB", LocalDate.of(2025, 5, 12), "Difficult", arrays.apCalcABstr, 
				arrays.apCalcABInt
				));
		examMap.put("ap calculus bc", new APExamInfo(
				"AP Calculus BC", LocalDate.of(2025, 5, 12), "Difficult", arrays.apCalcBCstr, 
				arrays.apCalcBCInt
				));
		examMap.put("ap statistics", new APExamInfo(
				"AP Statistics", LocalDate.of(2025, 5, 8), "Moderate", arrays.apStatstr, 
				arrays.apStatInt
				));

		examMap.put("ap language", new APExamInfo(
				"AP English Language", LocalDate.of(2025, 5, 14), "Moderate", arrays.apLangstr, 
				arrays.apLangInt
				));

}
}
