import java.util.*;
public class APDatatbase{
	public static Map<String, APExam> examMap = new HashMap<>();
	static {
		examMap.put("ap biology", new APExamInfo(
			"AP Biology", "May 5th", "Difficult", List.of("Chemsitry of Life", "Cell Structure and Function","Cellular Energetics", "Cell Cimmunication and Cell Cycle", "Heredity","Gene Expression and Regulation", "Natural Selection", "Ecology"), List.of(10,11,14,13,10,14,17,13)
			));
		examMap.put("ap chemistry", new APExamInfo(
				"AP Chemistry", "May 6th", "Difficult", List.of("Atomic Structure and Properties", 
						"Compound Structure and Properties","Properties of Substances and Mixtures", 
						"Chemical Reactions", "Kinetics","Thermochemistry", "Equilibrium", "Acids and Bases", "Thermodynamics and Electrochemistry"), 
				List.of(8,8,20,8,8,8,8,13,8)
				));
		examMap.put("ap enviornmental science", new APExamInfo(
				"AP Enviornmental Science", "May 13th", "Moderate", List.of("The Living World: Ecosystems", 
						"The Living World: Biodiversity","Populations", 
						"Earth Systems and Resources", "Land and Water Use","Energy Resources and Consumption", 
						"Atmospheric Pollution", "Aquatic and Terrestrial Pollution", "Global Change"), 
				List.of(7,7,13,13,13,13,9,9,17)
				));
		examMap.put("ap physics c: mechanics", new APExamInfo(
				"AP Physics C: Mechanics", "May 14th", "Difficult", List.of("Kinematics", 
						"Force and Translational Dynamics","Work, Energy, and Power", 
						"Linear Momentum", "Torque and Rotational Dynamics","Energy and Momentum of Rotating Systems", 
						"Oscillations"), 
				List.of(13,23,20,15,13,13,13)
				));
		examMap.put("ap physics c: electricity and magnetism", new APExamInfo(
				"AP Physics C: Electricity and Magnetism", "May 15th", "Difficult", List.of("Electric Charges, Fields, and Gauss's Law", 
						"Electric Potential","Conductors and Capacitors", 
						"Electric Circuits", "Magnetic Fields and ELectromagnetism","Electromagnetic Induction" 
						), 
				List.of(17,15,13,20,15,15)
				));
		examMap.put("ap physics 1", new APExamInfo(
				"AP Physics 1: Algebra-Based", "May 16th", "Difficult", List.of("Kinematics", 
						"Force and Translational Dynamics","Work, Energy, and Power", 
						"Linear Momentum", "Torque and Rotational Dynamics","Energy and Momentum of Rotating Systems", 
						"Oscillations", "Fluids"),
				List.of(13,21,21,13,13,7,7,13)
				));
		examMap.put("ap physics 2", new APExamInfo(
				"AP Physics 2: Algebra-Based", "May 13th", "Moderate", List.of("Thermodynamics", 
						"Electric Force, Field, and Potential","Electric Circuits", 
						"Magnetism and Electromagnetism", "Geometric Optics","Waves, Sound, and Physics Optics", 
						"Modern Physics"),
				List.of(17,17,17,14,14,14,14)
				));
		examMap.put("ap english literature and composition", new APExamInfo(
				"AP English Literature and Composition", "May 7th", "Moderate", List.of("Short Fiction 1", 
						"Poetry 1","Longer Fiction or Drama 1", 
						"Short Fiction 2", "Poetry 2","Longer Fiction or Drama 2", 
						"Short Fiction 3", "Poetry 3", "Longer Fiction or Drama 3"), 
				List.of(11,11,11,11,11,11,11,11,11)
				));
		examMap.put("ap calculus ab", new APExamInfo(
				"AP Calculus AB", "May 12th", "Difficult", List.of("Limits and Continuity", 
						"Differentiation: Definition and Fundamental Properties","Differentiation: Composite, Implicit, and Inverse Function", 
						"Contextual Applications of Differentiation", "Analytical Applications of Differentiation","Integration adn Accumulation of Change", 
						"Differential Equation", "Application of Integration"), 
				List.of(11,11,11,13,17,19,9,13)
				));
		examMap.put("ap calculus bc", new APExamInfo(
				"AP Calculus BC", "May 12th", "Difficult", List.of("Limits and Continuity", 
						"Differentiation: Definition and Fundamental Properties","Differentiation: Composite, Implicit, and Inverse Function", 
						"Contextual Applications of Differentiation", "Analytical Applications of Differentiation","Integration adn Accumulation of Change", 
						"Differential Equation", "Application of Integration", "Parametric Equations, Polar Coordinates, and Vection-Valued Functions", "Infinite Sequences and Series"), 
				List.of(6,6,6,8,10,19,8,8,12,18)
				));
}
}
