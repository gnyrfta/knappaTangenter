package org.gnyrftacode.tangentbord;

public class LevelTwoPartTwo {

public void initiate(){
	MainWindow.clearTextFields();
	MainWindow.setInstructionOne("Punkt och kommatecken kan tas med lång, resp. ringfingret på höger hand.");
	MainWindow.setInstructionTwo(" Nu kan vi bygga fullständiga meningar. Skriv detta:  ");
	MainWindow.setTextToCopy("Ett grönsaksland bort satt katten och funderade, vad den funderade på undrade den, men katter funkar så.");  
	MainWindow.done.setActionCommand("levelTwoPartThree");
	MainWindow.textToCopy.setVisible(true);
	MainWindow.wordOne.setVisible(true);
	MainWindow.wordOne.requestFocus();
	MainWindow.part=2;


}
//Set new Action command -> LevelOnePartTwo
	//check if the typing is correct
	//display a new text
	//display new instructions.
	//clear textfield

//Continue with the instructions used by MediaMänniskan.

}


