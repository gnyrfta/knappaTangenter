package org.gnyrftacode.tangentbord;

public class LevelOnePartFour {

public void initiate(){
	MainWindow.clearTextFields();
	MainWindow.setInstructionOne("Placera mark�ren (blinkande sak) i textf�ltet \n nedanf�r genom att v�nsterklicka i f�ltet");
	MainWindow.setInstructionTwo("Anv�nd fingers�ttningen du just �vat f�r att skriva dessa ord i textf�ltet:");
	MainWindow.setTextToCopy("dass fasa kasa sak sal dal �l f�l");  
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

//Continue with the instructions used by MediaM�nniskan.

}
