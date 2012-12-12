package org.gnyrftacode.tangentbord;

public class LevelOnePartOne {

public void initiate(){
	MainWindow.clearTextFields();
	MainWindow.setInstructionOne("<html><br><br>Lägg vänster pekfinger på 'F', vänster långfinger på 'D'," +
				" vänster ringfinger på 'S' och vänster lillfinger på 'A'. ");
	MainWindow.setInstructionTwo("");
	MainWindow.setTextToCopy("");  
	MainWindow.done.setActionCommand("levelOnePartTwo");
	MainWindow.done.setText("Fortsätt");
	MainWindow.back.setVisible(true);
	MainWindow.part=1;
	
}
//Set new Action command -> LevelOnePartTwo
	//check if the typing is correct
	//display a new text
	//display new instructions.
	//clear textfield

}
