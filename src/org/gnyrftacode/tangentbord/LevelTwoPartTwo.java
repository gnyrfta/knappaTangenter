package org.gnyrftacode.tangentbord;

public class LevelTwoPartTwo {

public void initiate(){
	MainWindow.clearTextFields();
	MainWindow.setInstructionOne("Punkt och kommatecken kan tas med lång, resp. ringfingret på höger hand.");
	MainWindow.setInstructionTwo(" Nu kan vi bygga fullständiga meningar. Skriv detta:  ");
	MainWindow.setTextToCopy("På tronen satt katten, vad den funderade på vet jag ej.");  
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


