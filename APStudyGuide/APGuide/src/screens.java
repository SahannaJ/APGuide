import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class screens extends JFrame{
	private static final long serialVersionUID = 1L;
	CardLayout cardLayout;
	JPanel cardPanel;
	JPanel examListScreen;
	int classNumberFinal;
	ArrayList<JTextField> classFields = new ArrayList<>();
	ArrayList<String> classes = new ArrayList<>();
	public screens() {
		setTitle("AP Exam Guide");
		setSize(1000, 1000);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		cardLayout = new CardLayout();
		cardPanel = new JPanel(cardLayout);
		
		
		
		JPanel firstScreen = new JPanel();
		firstScreen.setLayout(null);
		
		JLabel welcomeLabel = new JLabel ("AP Exam Guide");
		welcomeLabel.setBounds(100,30, 200, 30);
		welcomeLabel.setFont(new Font("SansSerif", Font.BOLD, 24));
		firstScreen.add(welcomeLabel);
		
		JLabel classnumber = new JLabel ("How many AP Classes are you taking");
		classnumber.setBounds(80,80, 200, 30);
		classnumber.setFont(new Font("SansSerif", Font.PLAIN, 24));
		firstScreen.add(classnumber);
		
		JButton nextButton = new JButton("Next");
		nextButton.setBounds(100,140,100,30);
		firstScreen.add(nextButton);
		
		JTextField classesNumber = new JTextField(" ");
		classesNumber.setBounds(310,80, 200, 30);
		classesNumber.setFont(new Font("SansSerif", Font.PLAIN, 18));
		firstScreen.add(classesNumber);
		
		JPanel examListScreen = new JPanel();
		examListScreen.setLayout(null);
		
		nextButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			try {
				String userInput = classesNumber.getText().trim();
				
				classNumberFinal = Integer.parseInt(userInput);
				
				
			
			for( int i = 0; i< classNumberFinal; i++) {
				
				JLabel classNumber = new JLabel("What AP Class are you taking?");
				classNumber.setBounds(80,230 + i*20, 400, 30);
				classNumber.setFont(new Font("SansSerif", Font.PLAIN, 18));
				firstScreen.add(classNumber);
				
				JTextField classNumberText = new JTextField();
				classNumberText.setBounds(340,230+i*20, 400, 30);
				classNumberText.setFont(new Font("SansSerif", Font.PLAIN, 18));
				firstScreen.add(classNumberText);
				classFields.add(classNumberText);
			}
			JButton nextSecondButton = new JButton("Next");
			nextSecondButton.setBounds(100,500,100,30);
			firstScreen.add(nextSecondButton);
			
			nextSecondButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e ) {
					classes.clear();
					examListScreen.removeAll();
					JLabel header = new JLabel("your AP Classes:");
					examListScreen.add(header);
					
					
					for( int i = 0; i< classFields.size(); i++) {
						String className = classFields.get(i).getText().trim();
						if(!className.isEmpty()) {
							classes.add(className);
							
							JButton classLabel = new JButton(className);
							classLabel.setBounds(500,100 + i*40, 200, 30);
							classLabel.setFont(new Font("SansSerif", Font.BOLD, 24));
							examListScreen.add(classLabel);
						}
						
				}
					
			cardLayout.show(cardPanel, "secondScreen");
			examListScreen.revalidate();
			examListScreen.repaint();
				}
			});
				

			firstScreen.revalidate();
			firstScreen.repaint();
		} catch (NumberFormatException ex) {
			JOptionPane.showMessageDialog(null,  "Please enter a valid number");
		}


			}
		
		
			
		});
		
		
		cardPanel.add(firstScreen, "home");
		cardPanel.add(examListScreen, "secondScreen");
		add(cardPanel);
		setVisible(true);
		
	}
}
