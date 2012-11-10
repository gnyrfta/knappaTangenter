package org.gnyrftacode.tangentbord;

public class LevelTwoPartThree {

public void initiate(){
	MainWindow.clearTextFields();
	MainWindow.setInstructionOne("");
	MainWindow.buttonImage.setVisible(true);
	MainWindow.setInstructionTwo("Vissa knappar, som den ovan, har flera tecken. Shift ger tecknet uppe till vänster, i det här fallet ?");
	MainWindow.setTextToCopy("Skriv: Kan du hitta flera tecken som man måste använda skift för att använda?");  
	MainWindow.done.setActionCommand("levelTwoPartFour");
	MainWindow.textToCopy.setVisible(true);
	MainWindow.wordOne.setVisible(true);
	MainWindow.wordOne.requestFocus();
	MainWindow.part=3;


}
//insert image icon of picture here.
//Continue with the instructions used by MediaMänniskan.

}


