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
public class Item {
private String itemName;
private String itemDescription;

/**
 * Creates a new item; this can be miscellaneous object or something specific to main objective
 * @param itemName Name of item
 * @param itemDescription Description of item
 */
public Item(String itemName, String itemDescription){
    this.itemName = itemName;
    this.itemDescription = itemDescription;
}

    /**
     * Gets the name of the item
     * @return value assigned to itemName
     */
    public String getItemName() {
        return itemName;
    }

    /**
     * Gets the description of the item
     * @return value assigned to itemDescription
     */
    public String getItemDescription() {
        return itemDescription;
    }



}
