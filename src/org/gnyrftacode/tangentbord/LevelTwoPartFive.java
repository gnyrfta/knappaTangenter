
package org.gnyrftacode.tangentbord;

public class LevelTwoPartFive {

public void initiate(){
	MainWindow.clearTextFields();
	MainWindow.setInstructionOne("Nu kan du använda alla viktiga tecken på de flesta tangentbord.");
	MainWindow.buttonImage.setVisible(false);
	MainWindow.setInstructionTwo("Innan programmet är slut så ska du få öva på litet olika texter.");
	MainWindow.setTextToCopy("Skriv: Grattis! Kom ihåg att använda rätt fingersättning!");  
	MainWindow.done.setActionCommand("levelTwoPartSix");
	MainWindow.textToCopy.setVisible(true);
	MainWindow.wordOne.setVisible(true);
	MainWindow.wordOne.requestFocus();
	MainWindow.part=5;

}
//insert image icon of picture here.
//Continue with the instructions used by MediaMänniskan.

}


