package org.gnyrftacode.tangentbord;

public class LevelOnePartFour {

public void initiate(){
	MainWindow.clearTextFields();
	MainWindow.setInstructionOne("Placera markören (blinkande sak) i textfältet \n nedanför genom att vänsterklicka i fältet");
	MainWindow.setInstructionTwo("Använd fingersättningen du just övat för att skriva dessa ord i textfältet:");
	MainWindow.setTextToCopy("dass fasa kasa sak sal dal öl föl");  
	MainWindow.done.setActionCommand("levelOnePartFive");
	MainWindow.textToCopy.setVisible(true);
	MainWindow.wordOne.setVisible(true);
	MainWindow.wordOne.requestFocus();
	MainWindow.part=4;
}
//Set new Action command -> LevelOnePartTwo
	//check if the typing is correct
	//display a new text
	//display new instructions.
	//clear textfield

//Continue with the instructions used by MediaMänniskan.

}
