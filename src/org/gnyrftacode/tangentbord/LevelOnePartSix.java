package org.gnyrftacode.tangentbord;

public class LevelOnePartSix  {

public void initiate(){
	MainWindow.clearTextFields();
	MainWindow.setInstructionOne("För att skriva R,T,G och V så kan du använda vänster pekfinger.");
	MainWindow.setInstructionTwo(" Försök skriva dessa ord: ");
	MainWindow.setTextToCopy("flyta skjul lus vördnad söt tös drös brös vurm ryta gyttra snattra");  
	MainWindow.done.setActionCommand("levelOnePartSeven");
	MainWindow.textToCopy.setVisible(true);
	MainWindow.wordOne.setVisible(true);
	MainWindow.wordOne.requestFocus();
	MainWindow.part=6;

}
//Set new Action command -> LevelOnePartTwo
	//check if the typing is correct
	//display a new text
	//display new instructions.
	//clear textfield

//Continue with the instructions used by MediaMänniskan.

}


