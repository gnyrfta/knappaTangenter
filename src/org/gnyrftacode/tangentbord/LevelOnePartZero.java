package org.gnyrftacode.tangentbord;

public class LevelOnePartZero {

public void initiate(){
	MainWindow.clearTextFields();
	MainWindow.setInstructionOne("F�rst ska vi l�ra oss r�tt fingers�ttning!");
	MainWindow.setTextToCopy(" ");  
	MainWindow.setInstructionTwo("F�r att forts�tta, klicka 'forts�tt', f�r att backa klicka 'bak�t'.");
	MainWindow.done.setActionCommand("levelOnePartOne");
	MainWindow.done.setText("Forts�tt");
	MainWindow.back.setVisible(true);
	MainWindow.part=0;
	
}
//Set new Action command -> LevelOnePartTwo
	//check if the typing is correct
	//display a new text
	//display new instructions.
	//clear textfield

}
