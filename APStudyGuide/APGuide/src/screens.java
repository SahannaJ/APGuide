import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class screens extends JFrame{
	
	private static final long serialVersionUID = 1L;
	CardLayout cardLayout;
	JPanel cardPanel;
	HashMap<String, JPanel> classPages = new HashMap<>();
	HashMap<String, JPanel> classSchedulePages = new HashMap<>();
	JPanel examListScreen = new JPanel();;
	int classNumberFinal;
	ArrayList<JTextField> classFields = new ArrayList<>();
	ArrayList<String> classes = new ArrayList<>();
	
	public void createSchedulePage(String className) {
	    if (!classSchedulePages.containsKey(className)) {
	        JPanel schedulePage = new JPanel();
	        schedulePage.setLayout(null);
	        schedulePage.setBackground(new Color(131, 179, 125));

	        JLabel header = new JLabel("Study Schedule for " + APDatatbase.examMap.get(className).getName());
	        header.setFont(new Font("SansSerif", Font.BOLD, 27));
	        header.setBounds(80, 40, 500, 40);
	        schedulePage.add(header);
	        
	        JTextArea makingCalendars = new JTextArea(APExamInfo.CalendarMaking(className));
	        makingCalendars.setFont(new Font("SansSerif", Font.PLAIN, 16));
	        makingCalendars.setBounds(100, 100, 700, 700);
	        makingCalendars.setBackground(new Color(131, 179, 125));
	        schedulePage.add(makingCalendars);
	        
	        
	        classSchedulePages.put(className, schedulePage);
	        cardPanel.add(schedulePage, className + "_schedule");
	    }
	}
	
	public screens() {
		setTitle("AP Exam Guide");
		setSize(1200, 1000);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		cardLayout = new CardLayout();
		cardPanel = new JPanel(cardLayout);
		
		
		
		JPanel firstScreen = new JPanel();
		firstScreen.setLayout(null);
		firstScreen.setBackground(new Color(128, 205, 250));
		
		JLabel welcomeLabel = new JLabel ("AP Exam Guide");
		welcomeLabel.setBounds(80,30, 500, 50);
		welcomeLabel.setFont(new Font("Monospaced", Font.BOLD, 36));
		firstScreen.add(welcomeLabel);
		
		JLabel classnumber = new JLabel ("How many AP Classes are you taking?");
		classnumber.setBounds(80,120, 500, 50);
		classnumber.setFont(new Font("Monospaced", Font.PLAIN, 20));
		firstScreen.add(classnumber);
		
		JButton nextButton = new JButton("Next");
		nextButton.setBounds(80,190,100,30);
		firstScreen.add(nextButton);
		animation.animateButton(nextButton);
		
		JTextField classesNumber = new JTextField(" ");
		classesNumber.setBounds(520,130, 200, 30);
		classesNumber.setFont(new Font("SansSerif", Font.PLAIN, 18));
		firstScreen.add(classesNumber);
		
		examListScreen.setLayout(null);
		examListScreen.setBackground(new Color(128, 205, 250));
		
		nextButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			try {
				String userInput = classesNumber.getText().trim();
				
				classNumberFinal = Integer.parseInt(userInput);
				
				
			
			for( int i = 0; i< classNumberFinal; i++) {
				
				JLabel classNumber = new JLabel("What AP Class are you taking?");
				classNumber.setBounds(80,250 + i*40, 400, 30);
				classNumber.setFont(new Font("SansSerif", Font.PLAIN, 18));
				firstScreen.add(classNumber);
				
				JTextField classNumberText = new JTextField();
				classNumberText.setBounds(340,250+i*40, 400, 30);
				classNumberText.setFont(new Font("SansSerif", Font.PLAIN, 18));
				firstScreen.add(classNumberText);
				classFields.add(classNumberText);
			}
			JButton nextSecondButton = new JButton("Next");
			nextSecondButton.setBounds(100,500,100,30);
			firstScreen.add(nextSecondButton);
			animation.animateButton(nextSecondButton);
			
			nextSecondButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e ) {

					classes.clear();
					examListScreen.removeAll();
					boolean allValid = true;
					
					for (int i = 0; i < classFields.size(); i++) {
						String className = classFields.get(i).getText().trim().toLowerCase();
					    APExam exam = APDatatbase.examMap.get(className);
					    
					    if (className.isEmpty() || exam == null || exam.name.equals(className)) {
					        allValid = false;
					        break;
					    }
					}

					if (!allValid) {
					    JOptionPane.showMessageDialog(null, "One or more classes are invalid. Please check your spelling.");
					    return; 
					}
					
					
					
					JLabel header = new JLabel("Your AP Classes:");
					header.setFont(new Font("SansSerif", Font.BOLD, 36));
					header.setBounds(80, 30, 400, 40);
					examListScreen.add(header);
					
					for( int i = 0; i< classFields.size(); i++) {
							String className = classFields.get(i).getText().trim().toLowerCase();
							classes.add(className);
							String actualName = APDatatbase.examMap.get(className).getName();
							JButton classLabel = new JButton(actualName);
							classLabel.setBounds(300,200 + i*90, 500, 70);
							classLabel.setFont(new Font("SansSerif", Font.BOLD, 24));
							classLabel.setOpaque(true);
							classLabel.setForeground(Color.WHITE);
							classLabel.setBackground(Color.BLACK);
							classLabel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
							animation.animateButton(classLabel);
							examListScreen.add(classLabel);
							
							classPages.put(className, new JPanel());
                            classPages.get(className).setLayout(null);
                            classPages.get(className).setBackground(new Color(131, 179, 125));
                    		
                            
                            JLabel classDetailsLabel = new JLabel(actualName);
                            classDetailsLabel.setBounds(80,40, 500, 50);
                            classDetailsLabel.setFont(new Font("Monospaced", Font.BOLD, 30));
                            classPages.get(className).add(classDetailsLabel);
                            
                            
                            JLabel dateOfActualClass = new JLabel(APExamInfo.InfoforDate(className));
                            dateOfActualClass.setBounds(80,100, 500, 50);
                            dateOfActualClass.setFont(new Font("Monospaced", Font.PLAIN, 20));
                            classPages.get(className).add(dateOfActualClass);
                            
                            JLabel difficulyOfActualClass = new JLabel(APExamInfo.InfoforDifficulty(className));
                            difficulyOfActualClass.setBounds(80,130, 500, 50);
                            difficulyOfActualClass.setFont(new Font("Monospaced", Font.PLAIN, 20));
                            classPages.get(className).add(difficulyOfActualClass);
                            
                            JLabel daysLeftOfActualClass = new JLabel(calendar.untilDate(className));
                            daysLeftOfActualClass.setBounds(80,160, 500, 50);
                            daysLeftOfActualClass.setFont(new Font("Monospaced", Font.PLAIN, 20));
                            classPages.get(className).add(daysLeftOfActualClass);
                            
                            JTextArea topicsArea = new JTextArea(APExamInfo.InfoforTopics(className));
                            topicsArea.setBackground(new Color(131, 179, 125));
                            topicsArea.setBounds(80, 200, 1000, 400);
                            topicsArea.setFont(new Font("Monospaced", Font.PLAIN, 16));
                            topicsArea.setLineWrap(true);
                            topicsArea.setWrapStyleWord(true);
                            topicsArea.setEditable(false);
                            classPages.get(className).add(topicsArea);
                            
                            JButton backToHome = new JButton("Back to Home");
                            backToHome.setBounds(80,600,100,50);
                            classPages.get(className).add(backToHome);
                            
                            JButton buildYourCalendar = new JButton("Build Your Calendar");
                            buildYourCalendar.setBounds(200,600,300,50);
                            classPages.get(className).add(buildYourCalendar);
                            buildYourCalendar.addActionListener(new ActionListener() {
                                public void actionPerformed(ActionEvent e) {
                                    createSchedulePage(className);
                                    cardLayout.show(cardPanel, className + "_schedule");
                                    cardPanel.revalidate();
                                    cardPanel.repaint();
                                }
                            });
                            backToHome.addActionListener(new ActionListener() {
                				public void actionPerformed(ActionEvent e ) {
                					cardLayout.show(cardPanel, "secondScreen");
									examListScreen.revalidate();
									examListScreen.repaint();
                				}
                				});
                            
                            
                            cardPanel.add(classPages.get(className), className);
                            
							classLabel.addActionListener(new ActionListener() {
								public void actionPerformed(ActionEvent e ) {
									cardLayout.show(cardPanel,className);
									cardPanel.revalidate();
									cardPanel.repaint();
									
								}
							
								
								
							});
							
						}
						
				
					
			
			examListScreen.revalidate();
			examListScreen.repaint();
			cardLayout.show(cardPanel, "secondScreen");
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


