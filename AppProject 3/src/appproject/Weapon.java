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
public class Weapon extends Item {
    private int damagePoints;
    
    /**
     * Creates a new weapon; this class inherits from the Item class
     * @param weaponName Name of weapon
     * @param weaponDescription Description of weapon
     * @param damagePoints Amount of damage the weapon deals
     */
    public Weapon(String weaponName, String weaponDescription, int damagePoints){
        super(weaponName, weaponDescription);
        this.damagePoints = damagePoints;
        
    }

    /**
     * Gets the amount of damage dealt by weapon
     * @return value of damagePoints
     */
    public int getDamagePoints() {
        return damagePoints;
    }

    
    /**
     * Sets the amount of damage dealt by weapon
     * @param damagePoints the amount of damagePoints the weapon will have
     */
    public void setDamagePoints(int damagePoints) {
        this.damagePoints = damagePoints;
    }
    
    
    
}
