package org.gnyrftacode.tangentbord;

public class LevelOnePartFive {

public void initiate(){
	MainWindow.clearTextFields();
	MainWindow.setInstructionOne("F�r �vriga bokst�ver anv�nder vi helt enkelt det finger som �r n�rmast.");
	MainWindow.setInstructionTwo("Exempelvis kan du anv�nda h�ger pekfinger f�r bokst�verna " +"H,N,U och Y.\n F�rs�k skriva dessa ord: ");
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

//Continue with the instructions used by MediaM�nniskan.

}
