package org.gnyrftacode.tangentbord;

public class LevelOnePartTwo {

public void initiate(){
	MainWindow.clearTextFields();
	MainWindow.setInstructionTwo("<html><br><br>Lägg höger pekfinger på 'J', höger långfinger på 'K'," +
				"höger ringfinger på 'L' och höger lillfinger på 'Ö'.");
	MainWindow.setTextToCopy("JKLÖ");  
	MainWindow.done.setActionCommand("levelOnePartThree");
	MainWindow.part=2;
}
//Set new Action command -> LevelOnePartTwo
	//check if the typing is correct
	//display a new text
	//display new instructions.
	//clear textfield

}
