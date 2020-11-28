/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appproject;

/**
 * Daniel Fuentes
 * @author dfuen01
 */
public class AppProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //The program starts by creating a player object and passing that object into
        //the TitleScreen JFrame as an argument, which will eventually it into the
        //Game class and StoryFrame JFrame as an argument
        Player mainPlayer = new Player();  
        TitleScreen mainScreen = new TitleScreen(mainPlayer);
        //Set visible once mainPlayer is passed in
        mainScreen.setVisible(true);
        

        

        
    }
    

    
}
