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
public class Monster extends Person {
    
    /**
     * Creates a new monster; inherits from the Person class
     */
    public Monster(){
        super();
    }
    
    /**
     * Returns the damage dealt by an attack made by the monster
     * @return the value of 45
     */
    public int damageWithClaws(){
        return 45;
    }
    
}
