/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appproject;

import BookClasses.FileChooser;
import BookClasses.Picture;
import BookClasses.Turtle;
import BookClasses.World;
import java.awt.Color;

/**
 *
 * @author dfuen01
 */
public class Map {
    private int mapHeight;
    private int mapWidth;
    private World mapWorld;
    private Picture mapBackground;
    //private Turtle playerIndicator;
    
    /**
     * Creates a new map of specific dimensions 
     * @param width Width of map window
     * @param height Height of map window
     */
    //This method is also supposed to use a turtle to indicate the player's location at a specific point,
    //but this did not end up being implemented
    public Map(int width, int height){
       mapWorld = new World(width, height);

        //Make a relative path for the map
        Picture pic = new Picture();
        mapWorld.setPicture(pic);
        
        //playerIndicator = new Turtle(mapWorld);
        //playerIndicator.setBodyColor(Color.white);

    }
    
    /**
     * Sets the background of the Map
     * @param mediaPath String relating to media path; where the file can be found in computer
     */
    public void setMapBackground(String mediaPath){
        mapBackground = new Picture(mediaPath);
        mapWorld.setPicture(mapBackground);
    }
    
    
}
