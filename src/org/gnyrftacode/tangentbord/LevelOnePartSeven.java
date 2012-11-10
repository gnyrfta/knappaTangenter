package org.gnyrftacode.tangentbord;

public class LevelOnePartSeven {

public void initiate(){
	MainWindow.clearTextFields();
	MainWindow.setInstructionOne("Övriga bokstäver tas med det finger som ligger närmast. \nÅ och Ä tas med höger lillfinger et.c.");
	MainWindow.setInstructionTwo(" Försök skriva detta:");
	MainWindow.setTextToCopy("nu kan vi använda alla bokstäverna med korrekt fingersättning");  
	MainWindow.done.setActionCommand("levelTwoPartOne");
	MainWindow.textToCopy.setVisible(true);
	MainWindow.wordOne.setVisible(true);
	MainWindow.wordOne.requestFocus();
	MainWindow.part=7;
	MainWindow.level=1;


}
//Set new Action command -> LevelOnePartTwo
	//check if the typing is correct
	//display a new text
	//display new instructions.
	//clear textfield

//Continue with the instructions used by MediaMänniskan.

}


