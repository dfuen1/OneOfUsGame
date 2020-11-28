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
public class Person {
  
    private String name;
    private int health;
    /**
     * Returns the current state of being of a person, depending on health
     */
    private String stateOfBeing;

    public Person() {
        health = 100;
        stateOfBeing = "GOOD";

    }

    /**
     * Gets the name of person
     * @return name of person
     */
    public String getName() {
        return name;
    }
    
    /**
     * Sets the name of person 
     * @param name the new name of person
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets health of person
     * @return value of health
     */
    public int getHealth() {
        return health;
    }
    
    /**
     * Sets the health of the person
     * @param health The new amount of health a person has 
     */

    public void setHealth(int health) {
        this.health = health;
    }

    /**
     * This changes the person's state of being depending on their level of health
     */
    private void setStateOfBeing() {
        if (health < 80) {
            stateOfBeing = "OK";
        }

        if (health < 50) {
            stateOfBeing = "BAD";
        }

    }


    
}
