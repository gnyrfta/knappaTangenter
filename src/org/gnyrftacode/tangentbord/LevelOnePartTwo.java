package org.gnyrftacode.tangentbord;

public class LevelOnePartTwo {

public void initiate(){
	MainWindow.clearTextFields();
	MainWindow.setInstructionTwo("<html><br><br>L�gg h�ger pekfinger p� 'J', h�ger l�ngfinger p� 'K'," +
				"h�ger ringfinger p� 'L' och h�ger lillfinger p� '�'.");
	MainWindow.setTextToCopy("JKL�");  
	MainWindow.done.setActionCommand("levelOnePartThree");
	MainWindow.part=2;
}
//Set new Action command -> LevelOnePartTwo
	//check if the typing is correct
	//display a new text
	//display new instructions.
	//clear textfield

}
