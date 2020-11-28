/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appproject;

import java.util.ArrayList;

/**
 * Daniel Fuentes
 * @author dfuen01
 */

public class Player extends Person {
    /**
     * ArrayList that keeps track of decisions made by player
     */
    private ArrayList<Integer> playerPath = new ArrayList<>();
    /**
     * Player inventory; capacity of 6 items
     */
    private Item[] playerInventory = new Item[6];
    /**
     * Keeps track of items in inventory
     */
    private int itemCounter = 0;
    
    /**
     * Creates a new player; inherits from the Person class
     */
    public Player(){
        super();
        
    }
    

    
    /**
     * Adds a the decision made by a player into an ArrayList to keep track of decisions made by player
     * @param num Decision made by player
     */
    public void addToPlayerPath(int num){
        playerPath.add(num);
    }
    
    /**
     * Relating to MAIN FUNCTIONALITY 5: Adds items into player's inventory; has a capacity of 6 objects
     * @param itemName An item object
     */
    public void addToPlayerInventory(Item itemName){
        //Method will be written soon
        //Check if inventory is first full
        if(itemCounter != 6){
        //Check where in the inventory there is available space and fill it, then leave the for loop
        //To prevent the other empty spaces from being filled
        for(int i = 0; i < playerInventory.length; ++i){
            if(playerInventory[i] == null){
             playerInventory[i] = itemName;
             itemCounter = itemCounter + 1;
             break;
               
            }
            
        }
        
        }
        else if(itemCounter == 6){
            System.out.println("Inventory is full");
        }
    
    
    
    }
    

    
    //This method returns the player's inventory and all of its items
    /**
     * Gets the player's current inventory
     * @return The item array assigned to playerInventory
     */
    public Item [] getPlayerInventory(){
        return playerInventory;
    }
}
