/*
* EggsApp.java
* @author: Ata Turkoglu & Idil Zehra Tatar
* Date: 14/02/2023
*/

import javax.swing.JOptionPane;
public class EggsApp{
    public static void main(String args[]){
        //Declare variables
        int egg, box, remainder;

        //Declare objects 
        Eggs myEggs;

        //Create objects
        myEggs = new Eggs();

        //Input 
        egg = Integer.parseInt(JOptionPane.showInputDialog(null,"Enter number of eggs: "));
        myEggs.setEgg(egg);

        //Process
        myEggs.computeBox();
        myEggs.computeRemainder();

        //Output
        box = myEggs.getBox();
        remainder = myEggs.getRemainder();

        JOptionPane.showMessageDialog(null,"John need "+box+" boxes. With this boxes "+remainder+" eggs will be leftover.");
    }
}