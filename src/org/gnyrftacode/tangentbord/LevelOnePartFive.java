package org.gnyrftacode.tangentbord;

public class LevelOnePartFive {

public void initiate(){
	MainWindow.clearTextFields();
	MainWindow.setInstructionOne("För övriga bokstäver använder vi helt enkelt det finger som är närmast.");
	MainWindow.setInstructionTwo("Exempelvis kan du använda höger pekfinger för bokstäverna " +"H,N,U och Y.\n Försök skriva dessa ord: ");
	MainWindow.setTextToCopy("hyfs huka hylla hymn jul skul ful sula ull");  
	MainWindow.done.setActionCommand("levelOnePartSix");
	MainWindow.textToCopy.setVisible(true);
	MainWindow.wordOne.setVisible(true);
	MainWindow.wordOne.requestFocus();
	MainWindow.part=5;

}
//Set new Action command -> LevelOnePartTwo
	//check if the typing is correct
	//display a new text
	//display new instructions.
	//clear textfield

//Continue with the instructions used by MediaMänniskan.

}
