/*
 * This class contains the arrays for the topics and percentages
 */

import java.util.ArrayList;
//Has the information for each of the class 
public class arrays {

    static ArrayList<Integer> apBioInt = new ArrayList<>();
    static ArrayList<String> apBiostr = new ArrayList<>();
    static ArrayList<Integer> apChemInt = new ArrayList<>();
    static ArrayList<String> apChemstr = new ArrayList<>();
    static ArrayList<Integer> apEnvInt = new ArrayList<>();
    static ArrayList<String> apEnvstr = new ArrayList<>();
    static ArrayList<Integer> apPhy3Int = new ArrayList<>();
    static ArrayList<String> apPhy3str = new ArrayList<>();
    static ArrayList<Integer> apPhy4Int = new ArrayList<>();
    static ArrayList<String> apPhy4str = new ArrayList<>();
    static ArrayList<Integer> apPhy1Int = new ArrayList<>();
    static ArrayList<String> apPhy1str = new ArrayList<>();
    static ArrayList<Integer> apPhy2Int = new ArrayList<>();
    static ArrayList<String> apPhy2str = new ArrayList<>();
    static ArrayList<Integer> apEngLitInt = new ArrayList<>();
    static ArrayList<String> apEngLitstr = new ArrayList<>();
    static ArrayList<Integer> apCalcABInt = new ArrayList<>();
    static ArrayList<String> apCalcABstr = new ArrayList<>();
    static ArrayList<Integer> apCalcBCInt = new ArrayList<>();
    static ArrayList<String> apCalcBCstr = new ArrayList<>();
    static ArrayList<Integer> apStatInt = new ArrayList<>();
    static ArrayList<String> apStatstr = new ArrayList<>();
    static ArrayList<Integer> apLangInt = new ArrayList<>();
    static ArrayList<String> apLangstr = new ArrayList<>();
    public arrays() {
        apBioInt.add(10);
        apBioInt.add(1);
        apBioInt.add(14);
        apBioInt.add(13);
        apBioInt.add(10);
        apBioInt.add(14);
        apBioInt.add(17);
        apBioInt.add(13);
        apBiostr.add("Chemsitry of Life");
        apBiostr.add("Cell Structure and Function");
        apBiostr.add("Cellular Energetics");
        apBiostr.add("Cell Cimmunication and Cell Cycle");
        apBiostr.add("Heredity");
        apBiostr.add("Gene Expression and Regulation");
        apBiostr.add("Natural Selection");
        apBiostr.add("Ecology");
        apChemstr.add("Atomic Structure and Properties");
        apChemstr.add("Compound Structure and Properties");
        apChemstr.add("Properties of Substances and Mixtures");
        apChemstr.add("Chemical Reactions");
        apChemstr.add("Kinetics");
        apChemstr.add("Thermochemistry");
        apChemstr.add("Equilibrium");
        apChemstr.add("Acids and Bases");
        apChemstr.add("Thermodynamics and Electrochemistry");
        apChemInt.add(8);
        apChemInt.add(8);
        apChemInt.add(20);
        apChemInt.add(8);
        apChemInt.add(8);
        apChemInt.add(8);
        apChemInt.add(8);
        apChemInt.add(13);
        apChemInt.add(8);
        apEnvInt.add(7);
        apEnvInt.add(7);
        apEnvInt.add(13);
        apEnvInt.add(13);
        apEnvInt.add(13);
        apEnvInt.add(13);
        apEnvInt.add(9);
        apEnvInt.add(9);
        apEnvInt.add(17);
        apEnvstr.add("The Living World: Ecosystems");
        apEnvstr.add("Populations");
        apEnvstr.add("Earth Systems and Resources");
        apEnvstr.add("Land and Water Use");
        apEnvstr.add("Energy Resources and Consumption");
        apEnvstr.add("Atmospheric Pollution");
        apEnvstr.add("Aquatic and Terrestrial Pollution");
        apEnvstr.add("Global Change");
        apPhy3str.add("Force and Translational Dynamics");
        apPhy3str.add("Work, Energy, and Power");
        apPhy3str.add("Linear Momentum");
        apPhy3str.add("Torque and Rotational Dynamics");
        apPhy3str.add("Energy and Momentum of Rotating Systems");
        apPhy3str.add("Oscillations");
        apPhy3Int.add(13);
        apPhy3Int.add(23);
        apPhy3Int.add(20);
        apPhy3Int.add(15);
        apPhy3Int.add(13);
        apPhy3Int.add(13);
        apPhy3Int.add(13);
        apPhy4str.add("Electric Charges, Fields, and Gauss's Law");
        apPhy4str.add("Electric Potential");
        apPhy4str.add("Conductors and Capacitors");
        apPhy4str.add("Electric Circuits");
        apPhy4str.add("Magnetic Fields and Electromagnetism");
        apPhy4str.add("Electromagnetic Induction");
        
        apPhy4Int.add(17);
        apPhy4Int.add(15);
        apPhy4Int.add(13);
        apPhy4Int.add(20);
        apPhy4Int.add(15);
        apPhy4Int.add(15);
        
    
        apPhy1str.add("Kinematics");
        apPhy1str.add("Force and Translational Dynamics");
        apPhy1str.add("Work, Energy, and Power");
        apPhy1str.add("Linear Momentum");
        apPhy1str.add("Torque and Rotational Dynamics");
        apPhy1str.add("Energy and Momentum of Rotating Systems");
        apPhy1str.add("Oscillations");
        apPhy1str.add("Fluids");
        
        apPhy1Int.add(13);
        apPhy1Int.add(21);
        apPhy1Int.add(21);
        apPhy1Int.add(13);
        apPhy1Int.add(13);
        apPhy1Int.add(7);
        apPhy1Int.add(7);
        apPhy1Int.add(13);

        apPhy2str.add("Thermodynamics");
        apPhy2str.add("Electric Force, Field, and Potential");
        apPhy2str.add("Electric Circuits");
        apPhy2str.add("Magnetism and Electromagnetism");
        apPhy2str.add("Geometric Optics");
        apPhy2str.add("Waves, Sound, and Physics Optics");
        apPhy2str.add("Modern Physics");
        
        apPhy2Int.add(17);
        apPhy2Int.add(17);
        apPhy2Int.add(17);
        apPhy2Int.add(14);
        apPhy2Int.add(14);
        apPhy2Int.add(14);
        apPhy2Int.add(14);
        

        apEngLitstr.add("Short Fiction 1");
        apEngLitstr.add("Poetry 1");
        apEngLitstr.add("Longer Fiction or Drama 1");
        apEngLitstr.add("Short Fiction 2");
        apEngLitstr.add("Poetry 2");
        apEngLitstr.add("Longer Fiction or Drama 2");
        apEngLitstr.add("Short Fiction 3");
        apEngLitstr.add("Poetry 3");
        apEngLitstr.add("Longer Fiction or Drama 3");
        
        apEngLitInt.add(11);
        apEngLitInt.add(11);
        apEngLitInt.add(11);
        apEngLitInt.add(11);
        apEngLitInt.add(11);
        apEngLitInt.add(11);
        apEngLitInt.add(11);
        apEngLitInt.add(11);
        apEngLitInt.add(11);
        

        apCalcABstr.add("Limits and Continuity");
        apCalcABstr.add("Differentiation: Definition and Fundamental Properties");
        apCalcABstr.add("Differentiation: Composite, Implicit, and Inverse Function");
        apCalcABstr.add("Contextual Applications of Differentiation");
        apCalcABstr.add("Analytical Applications of Differentiation");
        apCalcABstr.add("Integration and Accumulation of Change");
        apCalcABstr.add("Differential Equation");
        apCalcABstr.add("Application of Integration");

        apCalcABInt.add(11);
        apCalcABInt.add(11);
        apCalcABInt.add(11);
        apCalcABInt.add(13);
        apCalcABInt.add(17);
        apCalcABInt.add(19);
        apCalcABInt.add(9);
        apCalcABInt.add(13);
        apCalcBCstr.add("Limits and Continuity");
        apCalcBCstr.add("Differentiation: Definition and Fundamental Properties");
        apCalcBCstr.add("Differentiation: Composite, Implicit, and Inverse Function");
        apCalcBCstr.add("Contextual Applications of Differentiation");
        apCalcBCstr.add("Analytical Applications of Differentiation");
        apCalcBCstr.add("Integration and Accumulation of Change");
        apCalcBCstr.add("Differential Equation");
        apCalcBCstr.add("Application of Integration");
        apCalcBCstr.add("Parametric Equations, Polar Coordinates, and Vector-Valued Functions");
        apCalcBCstr.add("Infinite Sequences and Series");

        apCalcBCInt.add(6);
        apCalcBCInt.add(6);
        apCalcBCInt.add(6);
        apCalcBCInt.add(8);
        apCalcBCInt.add(10);
        apCalcBCInt.add(19);
        apCalcBCInt.add(8);
        apCalcBCInt.add(8);
        apCalcBCInt.add(12);
        apCalcBCInt.add(18);
        apStatstr.add("Exploring One-Variable Data");
        apStatstr.add("Exploring Two-Variable Data");
        apStatstr.add("Collecting Data");
        apStatstr.add("Probability, Random Variables, and Probability Distributions");
        apStatstr.add("Inference for Categorical Data: Proportions");
        apStatstr.add("Inference for Quantitative Data: Means");
        apStatstr.add("Inference for Categorical Data: Chi-Square");
        apStatstr.add("Inference for Quantitative Data: Slopes");

        apStatInt.add(23);
        apStatInt.add(7);
        apStatInt.add(12);
        apStatInt.add(10);
        apStatInt.add(8);
        apStatInt.add(12);
        apStatInt.add(18);
        apStatInt.add(5);


        apLangstr.add("Reading: 23–25 Reading questions & 20–22 Writing questions");
        apLangstr.add("Free Response: Synthesis, Rhetorical Analysis, Argument");

        apLangInt.add(45);
        apLangInt.add(55);
    }
}
















