package org.gnyrftacode.tangentbord;

public class LevelTwoPartTwo {

public void initiate(){
	MainWindow.clearTextFields();
	MainWindow.setInstructionOne("Punkt och kommatecken kan tas med l�ng, resp. ringfingret p� h�ger hand.");
	MainWindow.setInstructionTwo(" Nu kan vi bygga fullst�ndiga meningar. Skriv detta:  ");
	MainWindow.setTextToCopy("P� tronen satt katten, vad den funderade p� vet jag ej.");  
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

//Continue with the instructions used by MediaM�nniskan.

}


