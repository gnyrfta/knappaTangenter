package org.gnyrftacode.tangentbord;

public class LevelOnePartOne {

public void initiate(){
	MainWindow.clearTextFields();
	MainWindow.setInstructionOne("<html><br><br>L�gg v�nster pekfinger p� 'F', v�nster l�ngfinger p� 'D'," +
				" v�nster ringfinger p� 'S' och v�nster lillfinger p� 'A'. ");
	MainWindow.setInstructionTwo("");
	MainWindow.setTextToCopy("");  
	MainWindow.done.setActionCommand("levelOnePartTwo");
	MainWindow.done.setText("Forts�tt");
	MainWindow.back.setVisible(true);
	MainWindow.part=1;
	
}
//Set new Action command -> LevelOnePartTwo
	//check if the typing is correct
	//display a new text
	//display new instructions.
	//clear textfield

}
