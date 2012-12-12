package org.gnyrftacode.tangentbord;

public class LevelOnePartZero {

public void initiate(){
	MainWindow.clearTextFields();
	MainWindow.setInstructionOne("Först ska vi lära oss rätt fingersättning!");
	MainWindow.setTextToCopy(" ");  
	MainWindow.setInstructionTwo("För att fortsätta, klicka 'fortsätt', för att backa klicka 'bakåt'.");
	MainWindow.done.setActionCommand("levelOnePartOne");
	MainWindow.done.setText("Fortsätt");
	MainWindow.back.setVisible(true);
	MainWindow.part=0;
	
}
//Set new Action command -> LevelOnePartTwo
	//check if the typing is correct
	//display a new text
	//display new instructions.
	//clear textfield

}
