package org.gnyrftacode.tangentbord;

public class LevelTwoPartOne {

public void initiate(){
	MainWindow.clearTextFields();
	MainWindow.setInstructionOne("Lillfingrarna sk�ter de b�da skift-tangenterna. Dessa markeras med upp�tpil. ");
	MainWindow.setInstructionTwo("H�ll nere en av dessa n�r du vill skriva stor bokstav. Skriv detta: ");
	MainWindow.setTextToCopy("Barcelona ligger i Spanien som �r ett land i Europa");  
	MainWindow.done.setActionCommand("levelTwoPartTwo");
	MainWindow.textToCopy.setVisible(true);
	MainWindow.wordOne.setVisible(true);
	MainWindow.wordOne.requestFocus();
	MainWindow.level=2;
	MainWindow.part=1;


}
//Set new Action command -> LevelOnePartTwo
	//check if the typing is correct
	//display a new text
	//display new instructions.
	//clear textfield

//Continue with the instructions used by MediaM�nniskan.

}


