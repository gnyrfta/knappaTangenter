package org.gnyrftacode.tangentbord;

import java.awt.Dimension;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;




public class MainWindow extends JPanel implements ActionListener {
	
	static JLabel instructionOne;
	static JLabel instructionTwo;
	static JLabel textToCopy;
	
	public static JLabel buttonImage;
	static JTextField wordOne;
	static JTextField wordTwo;
	static JTextField wordThree;
	static JTextField wordFour;
	static JTextField wordFive;
	static JTextField wordSix;
	static JTextField wordSeven;
	static JTextField wordEight;
	static JTextField wordNine;
	
	public static JButton done;
	public static JButton back;
	static JButton exit;
	
	public static int level = 1;
	public static int part = 1;
	
	public static void createAndShowGUI(){
		String s = "Program för att lära sig skriva på tangentbordet.";
		JFrame frame = new JFrame(s);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JComponent newContentPane = new MainWindow();
		Color c = new Color(255,255,153);
		newContentPane.setBackground(c);
		frame.setContentPane(newContentPane);
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		frame.setSize(new Dimension(screenSize.width,screenSize.height));
		frame.setVisible(true);
		
	}	
	public MainWindow(){
		super (new GridBagLayout());
		GridBagLayout gridbag = (GridBagLayout)getLayout();
		GridBagConstraints c = new GridBagConstraints();
		
		
		
		instructionOne = new JLabel("<html><br><br>Klicka med vänster musknapp på STARTA-knappen för att starta programmet.");
		instructionOne.setFont(new Font("Verdana",Font.PLAIN,18));
		c.gridx = 0;
		c.gridy = 0;
		gridbag.setConstraints(instructionOne,c);
		add(instructionOne,c);
		
		instructionTwo = new JLabel("");
		instructionTwo.setFont(new Font("Verdana",Font.PLAIN,18));
		c.gridx = 0;
		c.gridy = 1;
		gridbag.setConstraints(instructionTwo,c);
		add(instructionTwo,c);
		
		/*JSeparator sepOne = new JSeparator();
		c.gridx = 0;
		c.gridy = 2;
		gridbag.setConstraints(sepOne,c);
		add(sepOne,c);
		*/
		textToCopy = new JLabel("<html><br>Den här texten ska skrivas i rutan nedanför.<br><br>");
		textToCopy.setFont(new Font ("Serif", Font.PLAIN, 18));
		c.gridx = 0;
		c.gridy = 2;
		gridbag.setConstraints(textToCopy,c);
		textToCopy.setVisible(false);
		add(textToCopy,c);
		
		wordOne = new JTextField("");
		c.gridx = 0;
		c.gridy = 3;
		gridbag.setConstraints(wordOne,c);
		wordOne.setPreferredSize(new Dimension(420,24));
		wordOne.setVisible(false);
		add(wordOne,c);
		
		/*wordTwo= new JTextField("");
		c.gridx = 1;
		c.gridy = 3;
		gridbag.setConstraints(wordTwo,c);
		wordTwo.setPreferredSize(new Dimension(120,24));
		add(wordTwo,c);
		
		wordThree = new JTextField("");
		c.gridx = 2;
		c.gridy = 3;
		gridbag.setConstraints(wordThree,c);
		wordThree.setPreferredSize(new Dimension(120,24));
		add(wordThree,c);
		
		wordFour = new JTextField("");
		c.gridx = 0;
		c.gridy = 4;
		gridbag.setConstraints(wordFour,c);
		wordFour.setPreferredSize(new Dimension(120,24));		
		add(wordFour,c);
		
		wordFive = new JTextField("");
		c.gridx = 1;
		c.gridy = 4;
		gridbag.setConstraints(wordFive,c);
		wordFive.setPreferredSize(new Dimension(120,24));		
		add(wordFive,c);
		
		wordSix = new JTextField("");
		c.gridx = 2;
		c.gridy = 4;
		gridbag.setConstraints(wordSix,c);
		wordSix.setPreferredSize(new Dimension(120,24));		
		add(wordSix,c);
		
		wordSeven = new JTextField("");
		c.gridx = 0;
		c.gridy = 5;
		gridbag.setConstraints(wordSeven,c);
		wordSeven.setPreferredSize(new Dimension(120,24));		
		add(wordSeven,c);
		
		wordEight = new JTextField("");
		c.gridx = 1;
		c.gridy = 5;
		gridbag.setConstraints(wordEight,c);
		wordEight.setPreferredSize(new Dimension(120,24));		
		add(wordEight,c);
		
		wordNine = new JTextField("");
		c.gridx = 2;
		c.gridy = 5;
		gridbag.setConstraints(wordNine,c);
		wordNine.setPreferredSize(new Dimension(120,24));		
		add(wordNine,c);*/
		
		back = new JButton("Bakåt");
		c.gridx = 0;
		c.gridy = 5;
		gridbag.setConstraints(back,c);
		back.addActionListener(this);
		back.setActionCommand("back");
		back.setVisible(false);
		add(back,c);
		
		done = new JButton("<html><b>STARTA</b>");
		c.gridx = 0;
		c.gridy = 4;
		gridbag.setConstraints(done,c);
		done.addActionListener(this);
		done.setActionCommand("go");
		add(done,c);
		
		try{
		ClassLoader cl = this.getClass().getClassLoader();
		
		Icon buttonIcon = new ImageIcon(cl.getResource("images/tangentknapp.png"));
		buttonImage = new JLabel(buttonIcon);
		c.gridx = 0;
		c.gridy = 0;
		gridbag.setConstraints(buttonImage,c);
		buttonImage.setVisible(false);
		add(buttonImage,c);
		} 
		catch (Exception e){}
		//getRootPane().setDefaultButton(done);

	}
	

	public static void clearTextFields(){
		wordOne.setText("");
		/*wordTwo.setText("");
		wordThree.setText("");
		wordFour.setText("");
		wordFive.setText("");
		wordSix.setText("");
		wordSeven.setText("");
		wordEight.setText("");
		wordNine.setText("");*/
	}
	public static void setInstructionOne(String instruction){
		String newString = "<html><br><br>"+instruction+"<br><br>";
		instructionOne.setText(newString);
	}
	public static void setInstructionTwo(String instruction){
		instructionTwo.setText(instruction);
	}
	public static void setTextToCopy(String instruction){
		textToCopy.setText(instruction);
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()instanceof JButton) {
			if ("go".equals(e.getActionCommand())){
				System.out.println("go");
				LevelOnePartZero lopz = new LevelOnePartZero();
				lopz.initiate();
			}
			if ("back".equals(e.getActionCommand())){
				System.out.println("level: "+level);
				System.out.println("part: "+part);
				if (level == 1){
					if (part == 0){
						MainWindow.setInstructionTwo("Du kan ju inte backa nu, du har ju precis börjat! Fortsätt nu...");
					}
					if (part == 1){
						LevelOnePartZero lopz = new LevelOnePartZero();
						lopz.initiate();
					}
					if (part == 2){
						LevelOnePartOne lopo = new LevelOnePartOne();
						lopo.initiate();
					}
					if (part == 3){
						LevelOnePartTwo lopo = new LevelOnePartTwo();
						lopo.initiate();
					}
					if (part == 4){
						LevelOnePartThree lopo = new LevelOnePartThree();
						lopo.initiate();
					}
					if (part == 5){
						LevelOnePartFour lopo = new LevelOnePartFour();
						lopo.initiate();
					}
					if (part == 6){
						LevelOnePartFive lopo = new LevelOnePartFive();
						lopo.initiate();
					}
					if (part == 7){
						LevelOnePartSix lopo = new LevelOnePartSix();
						lopo.initiate();
					}

				}
				if (level == 2){
					if (part == 1){
						LevelOnePartSeven lops = new LevelOnePartSeven();
						lops.initiate();
					}
					if (part == 2){
						LevelTwoPartOne lops = new LevelTwoPartOne();
						lops.initiate();
					}
					if (part == 3){
						LevelTwoPartTwo lops = new LevelTwoPartTwo();
						lops.initiate();
					}
					if (part == 4){
						LevelTwoPartThree lops = new LevelTwoPartThree();
						lops.initiate();
					}
					if (part == 5){
						LevelTwoPartFour lops = new LevelTwoPartFour();
						lops.initiate();
					}
					if (part == 6){
						LevelTwoPartFive lops = new LevelTwoPartFive();
						lops.initiate();
					}
					if (part == 7){
						LevelTwoPartSix lops = new LevelTwoPartSix();
						lops.initiate();
					}
					if (part == 8){
						LevelTwoPartSeven lops = new LevelTwoPartSeven();
						lops.initiate();
					}

				}
			}
			if ("levelOnePartOne".equals(e.getActionCommand())){
				LevelOnePartOne lopo = new LevelOnePartOne();
				lopo.initiate();
			}
			if ("levelOnePartTwo".equals(e.getActionCommand())){
				LevelOnePartTwo lopt = new LevelOnePartTwo();
				lopt.initiate();
			}
			if ("levelOnePartThree".equals(e.getActionCommand())){
				LevelOnePartThree lopth = new LevelOnePartThree();
				lopth.initiate();
			}
			if ("levelOnePartFour".equals(e.getActionCommand())){
				LevelOnePartFour lopf = new LevelOnePartFour();
				lopf.initiate();
			}
			if ("levelOnePartFive".equals(e.getActionCommand())){
				LevelOnePartFive lopf = new LevelOnePartFive();
				lopf.initiate();
			}
			if ("levelOnePartSix".equals(e.getActionCommand())){
				LevelOnePartSix lops = new LevelOnePartSix();
				lops.initiate();
			}
			if ("levelOnePartSeven".equals(e.getActionCommand())){
				LevelOnePartSeven lops = new LevelOnePartSeven();
				lops.initiate();
			}
			//Level 2
			if ("levelTwoPartOne".equals(e.getActionCommand())){
				LevelTwoPartOne ltpo = new LevelTwoPartOne();
				ltpo.initiate();
			}
			if ("levelTwoPartTwo".equals(e.getActionCommand())){
				LevelTwoPartTwo ltpt = new LevelTwoPartTwo();
				ltpt.initiate();
			}
			if ("levelTwoPartThree".equals(e.getActionCommand())){
				LevelTwoPartThree ltpt = new LevelTwoPartThree();
				ltpt.initiate();
			}
			if ("levelTwoPartFour".equals(e.getActionCommand())){
				LevelTwoPartFour ltpf = new LevelTwoPartFour();
				ltpf.initiate();
			}
			if ("levelTwoPartFive".equals(e.getActionCommand())){
				LevelTwoPartFive ltpf = new LevelTwoPartFive();
				ltpf.initiate();
			}
			if ("levelTwoPartSix".equals(e.getActionCommand())){
				LevelTwoPartSix ltps = new LevelTwoPartSix();
				ltps.initiate();
			}
			if ("levelTwoPartSeven".equals(e.getActionCommand())){
				LevelTwoPartSeven ltps = new LevelTwoPartSeven();
				ltps.initiate();
			}
			if ("levelTwoPartEight".equals(e.getActionCommand())){
				LevelTwoPartEight ltpe = new LevelTwoPartEight();
				ltpe.initiate();
			}
			if ("exit".equals(e.getActionCommand())){
				System.exit(0);
			}
		}
	}
	public static void main(String[] args) {
		javax.swing.SwingUtilities.invokeLater(new Runnable(){
			public void run(){
				createAndShowGUI();
				System.out.println("Main is running.");
			}
		});
	}
		
}
