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
public class Game {
    /**
     * The prompt of a specific scene
     */
    private String scene;
    /**
     * The available choices for the player at a specific scene
     */
    private String[] choicesForScene;
    /**
     * The location of the scene; this changes depending on where the player is within the game's map
     */
    private String location;
    /**
     * The player who is currently playing the game
     */
    private Player mainPlay;
    /**
     * The current monster of the game
     */
    private Monster mainMonster;
    
    
    /**
     * Creates a new game with a new monster, using the player's information
     * @param mainPlayer The stats of the player who is currently playing the game
     * @param mon The stats of the monster, who appears through parts of the game
     */
    public Game(Player mainPlayer, Monster mon){
       mainPlay = mainPlayer; 
       mainMonster = mon;
    }
    
    /**
     * MAIN FUNCTIONALITY 1: This method runs through plot of the game, changing its course throughout the if statement tree depending on choices made by the player
     * 
     * @param num The player's choice; each number corresponds to a different event in game
     */
    public void gamePlot(int num){
        //This is a test to make sure there can be progression
        //Although originally the plan was to use a switch tree, I had to instead use
        //a if statement tree because using a switch statement would mean instantiating
        //a new String[] for the new choices of each prompt in each case with unique names, which would lead to too many
        //String[] to keep track of
        if(num == 0){
            scene = "In the distant future,\n"
                    + "The people who once lived on Earth "
                    +"completely depleted Earth of its "
                    + "resources and were forced to migrate "
                    + "to another planet. "
                    + "In order to maintain the general public, "
                    + "the government commissions trips to "
                    + "exoplanets to recover resources from them.\n"
                    + "...\n"
                    + "You are an engineer aboard a cargo spaceship "
                    + "on its way back to the home planet "
                    + "after returning from a planet that was "
                    + "outside of the route, after a brief period of turbulence.";
            String [] choices = {"1: Continue"};
            choicesForScene = choices;

        }
        
        else if(num == 1){
            location = "Power Room";
                 scene = "You are currently performing"
                         + " some general maintance in the power room"
                         + "when you receive a distress call from the command room:\n"
                         + "\n"
                         + "Captain Stans: \"May I have everyone's attention please."
                         + "There has been a situation involving the scavengers of the ship."
                         + "Everyone could possibly be in danger. Please report to the"
                         + "command room immediately for further instructions.\""
                         + "\n"
                         + "\n"
                         + "While you leave the room, you notice the door of "
                         + "power room has a slow response to the keypad: ";
          String[] choices = {"2: Fix the door and then leave to the command room", "5: Leave the room"}; 
           choicesForScene = choices;    
        }
        
        else if(num == 2){
        Item multiTool = new Item("Multi-tool stick", "Good for fixing stuff!");
        mainPlay.addToPlayerInventory(multiTool);
        location = "Cabin 4";
         scene = "After fixing the door, you take your multi-tool stick and"
                 + " walk into the quiet hallway leading to"
                 + " the Common room. Something is"
                 + " definitely off.\n"
                 + "...\n"
                 + "As you approach Cabin 4, you are\n"
                 + "greeted by your cabin mate, Ezra:\n"
                 + "\n"
                 + "Ezra: \"Hey "
                 + mainPlay.getName()
                 + ", you heard that distress call?\n"
                 + "What do you think he meant about that?\"\n"
                 + "\n"
                 + "Ezra follows behind you as you lead the way "
                 + "to the stairs leading to the Command Room. "
                 + "Suddenly, both of you and Ezra are startled by the creaking sound "
                 + "coming from the Common room all the way down the hall. The scare prompts "
                 + "you and Ezra to go up the stairs with urgency.";
          String[] choices = {"3: Continue"}; 
           choicesForScene = choices;
        }
        
        else if(num == 3){
        location = "Command Room";
        scene = "As you enter the Command Room, you see Captain Stans "
                + "with his head down on a table at the center of room. "
                + "He quickly reacts to the sound of shuffling feet:\n"
                + "\n"
                + "Ezra: \"Sir, we heard your distress call. What the heck happened?\""
                + "\n"
                +"\n"
                + "Captain Stans: \"To be honest if you two, I'm not really sure. "
                + "There was an incident that occurred following the return the scavengers "
                + "Palmer and Blair. Upon boarding the ship, Palmer were rogue and killed the "
                + "crew members involved with returning the resources. That guy must've been a psycho "
                + "who some how sneaked into the ship.\""
                + "\n"
                + "\n"
                + "Suddenly the conversation is interrupted by the frantic entrance of Michelle, a fellow "
                + "crew member, who proceeds to lock the sliding door via the keypad and fall to the ground "
                + "sounding like she's out of breath.\n"
                + "\n"
                + "Ezra: \"What's wrong Michelle, are you alright?\""
                + "\n"
                + "\n"
                + "Michelle: \"There's... there's someone.. SOMETHING out there...\""
                + "\n"
                + "\n"
                + "Michelle begins to bawl.";
        
        String[] choices = {"4: Continue"};
        choicesForScene = choices;
        }
        
        else if(num == 4){
            location = "Command Room";
            scene = "Captain Stans: \"What's wrong? What did you see out there? Where is Parker and Stiles?\""
                    + "\n"
                    + "\n"
                    + "Michelle: \"They... they were killed by something that looked like Palmer. He lunged towards "
                    + "Parker and shape-shifted into a hideous creature.\""
                    + "\n"
                    + "\n"
                    + "Ezra: \"Wait, what are you saying? Are you saying what you saw wasn't Palmer?\""
                    + "\n"
                    + "\n"
                    + "Michelle: \"I don't know what the heck IT was, but I am certain IT wasn't anything human.\""
                    + "\n"
                    + "\n"
                    + "Captain Stans: \"Wait so you're saying that that Shifter looked human. If that's the case, "
                    + "how do we know you are not the Shifter in disguise.\""
                    + "\n"
                    + "\n"
                    + "Ezra: \"Hey yeah, how do we know you won't kill us?\""
                    + "\n"
                    + "\n"
                    + "Michelle: \"Are you kidding me! How could you pin me the awful deaths of Parker and Stiles."
                    + " I barely survived out there and now I am being falsely accused!\"";
            String[] choices ={"6: Stand up for Michelle", "9: Side with Stans and Ezra"};
            choicesForScene = choices;
        }
        
        else if(num == 5){
            location = "Cabin 4";
                 scene = "You"
                 + " walk into the quiet hallway leading to"
                 + " the Common room. Something is"
                 + " definitely off.\n"
                 + "...\n"
                 + "As you approach Cabin 4, you are\n"
                 + "greeted by your cabin mate, Ezra:\n"
                 + "\n"
                 + "Ezra: \"Hey "
                 + mainPlay.getName()
                 + ", you heard that distress call?\n"
                 + "What do you think he meant about that?\"\n"
                 + "\n"
                 + "Ezra follows behind you as you lead the way"
                 + "into the stairs leading to the Command Room. "
                         + "\n"
                         + "\n"
                         + "Ezra: \"Hey man, really gotta fix the door of our cabin --\""
                 + " Suddenly, both of you and Ezra are startled by the creaking sound"
                 + " coming from the Common room all the way down the hall.";
           String[] choices = {"3: Continue"}; 
           choicesForScene = choices;
           
        }
        
        else if(num == 6){
          location = "Command Room";  
          scene = mainPlay.getName()+ ": Hey guys back off, she's clearly been through something traumatic."
                  + "\n"
                  + "\n"
                  + "Captain Stans: \"You're buying her story?\""
                  + "\n"
                  + "\n"
                  + "Ezra: \"I can't believe you're siding with her. She could easily being that Shifter thing. If I get the "
                  + "slighest hint that she's that thing, I'm gonna kill her.\""
                  + "\n"
                  + "\n"
                  + "Captain Stans: \"Whatever then, but I'll also keep a close eye on her. By any means we have to discuss a plan."
                  + " We can't risk taking this ship back to the home planet, so I say we send a rescue signal to base to have "
                  + "someone come rescue us. We can use the escape pods to leave the ship and be extracted by the rescue team.\""
                  + "\n"
                  + "\n"
                  + "Ezra: \"Alright then, let's just go to the escape pods!\""
                  + "\n"
                  + "\n"
                  + "Captain Stans:\"It's not that easy, we need 3 keycards from superiors of the ship. I have one of the keycards, but"
                  + " my two navigators were one of the first victims. Someone has to go back out there to find the other two keycards.\"";
                  String[] choices = {"8: Volunteer to find the keycards"};
                  choicesForScene = choices;
        }
        
        else if(num == 9){
            location = "Command Room";
                 scene = mainPlay.getName()+ ": How can we really know. I suggest we keep an eye on her!"
                  + "\n"
                  + "\n"
                  + "Ezra: \"Agreed.\""
                  + "\n"
                  + "\n"
                  + "Captain Stans: \"Well by any means, we have to discuss a plan."
                  + " We can't risk taking this ship back to the home planet, so I say we send a rescue signal to base to have "
                  + "someone come rescue us. We can use the escape pods to leave the ship and be extracted by the rescue team.\""
                  + "\n"
                  + "\n"
                  + "Ezra: \"Alright then, let's just go to the escape pods!\""
                  + "\n"
                  + "\n"
                  + "Captain Stans:\"It's not that easy, we need 3 keycards from superiors of the ship. I have one of the keycards, but"
                  + " my two navigators were one of the first victims. Someone has to go back out there to find the other two keycards.\"";
                 String[] choices = {"7: Volunteer to find the keycards"};
                 choicesForScene = choices;
            
        }
        else if(num == 7){
         location = "Command Room";
         scene = mainPlay.getName()+ ": \"I'll do it. I'll try to get back hear as quickly as possible\""
                 + "\n"
                 + "\n"
                 + "Ezra: \"Yeah, hopefully in one piece!\""
                 + "\n"
                 + "\n"
                 + "Captain Stans: \"Just be careful out there. Radio in if you run into any danger. We will keep an eye on Michelle.\"";
         String[] choices = {"10: Leave Command Room"};
         choicesForScene = choices;
            
        }
        else if(num == 8){
         location = "Command Room"; 
         Item michelleKey = new Item("Michelle's Key to her cabin", "This opens Michelle and Parker's cabin");
                  scene = mainPlay.getName()+ ": \"I'll do it. I'll try to get back hear as quickly as possible\""
                 + "Ezra: \"Yeah, hopefully in one piece!\""
                          + "\n"
                          + "\n"
                 + "Captain Stans: \"Just be careful out there. Radio in if you run into any danger. We will keep an eye on Michelle.\""
                          + "\n"
                          + "\n"
                          + "Before you leave, Michelle pulls you aside."
                          + "\n"
                          + "\n"
                          + "Michelle: \"Hey, thanks for sticking up for me back there. Listen, you'll need to protect yourself "
                          + "from the Shifter. Here is the key to my cabin: I have a blaster in there that should give you some type of "
                          + "of defense.\"";
        mainPlay.addToPlayerInventory(michelleKey);
         String[] choices = {"11: Leave Command Room"};
         choicesForScene = choices;
        }
        else if(num == 10){
            location = "Hallway before Cabins";
            scene = "You stand before the hallway that leads to the cabins.";
            String[] choices = {"13: Walk towards cabins"};
            choicesForScene = choices;
            
        }
        
        else if(num == 11){
            location = "Hallway before Cabins";
            scene = "You stand before the hallway that leads to the cabins.";
            String[] choices = {"12: Go unlock Michelle's Cabin"};
            choicesForScene = choices;   
        }
        
        else if(num == 12){
            location = "Cabin 4";
             Weapon blaster = new Weapon("Michelle's Blaster", "Obtained from Michelle's Room; Damage: 20", 20);
             mainPlay.addToPlayerInventory(blaster);
             scene = "You unlock Michelle's cabin and find the blaster. As you leave the cabin, you see that "
                     + "your cabin door is having the same problem as the door in the Power Room.";
             String[] choices = {"14: Fix cabin door", "27: Continue searching for key cards"};
             choicesForScene = choices;
        }
        
        else if(num == 13){
            location = "Hallway";
            scene = "As you walk past your cabin, you see that "
                     + "your cabin door is having the same problem as the door in the Power Room.";
            String[] choices = {"14: Fix cabin door", "17: Continue searching for key cards"};
            choicesForScene = choices;
        }
        
        //Path when door is fixed and you have obtained Michelle's blaster
        else if(num == 14){
          location = "Common Room";
          scene = "After fixing the door to the cabin, you walk into the empty Common Room."
                  + " Usually this room would be occupied by at least one person. There is a piercing silence"
                  + " within the room, despite knowing the something is among it.";
          String[] choices = {"15: Search for keycard in Kitchen", "16: Search for keycard in Lab/Workshop","18: Search for keycard in Opening Hatch"};
          choicesForScene = choices;
        }
        
        //Have blaster, but don't fix cabin door
                else if(num == 27){
          location = "Common Room";
          scene = "You walk into the empty Common Room."
                  + " Usually this room would be occupied by at least one person. There is a piercing silence"
                  + " within the room, despite knowing the something is among it.";
          String[] choices = {"15: Search for keycard in Kitchen", "16: Search for keycard in Lab/Workshop","18: Search for keycard in Opening Hatch"};
          choicesForScene = choices;
        }
        
        //Options that lead to Kitchen (DEAD ENDS)(NOT FIXED DOOR)
        else if(num == 15){
            location = "Kitchen";
            scene = "The kitchen is still abundantly full. It's such a waste to have to leave it all."
                    + " On the floor near the fridge, there is a pile of clothes, that seem to have belonged to a "
                    + "crew member.";
            String[] choices = {"17: Return to Common Room"};
            choicesForScene = choices;
        }
        
        //FIXED DOOR
        else if(num == 14){
            location = "Kitchen";
            scene = "The kitchen is still abundantly full. It's such a waste to have to leave it all."
                    + " On the floor near the fridge, there is a pile of clothes, that seem to have belonged to a "
                    + "crew member.";
            String[] choices = {"14: Return to Common Room"};
            choicesForScene = choices;
        }
        
        //Options that lead to opening hatch (DEAD END) (FIXED DOOR)
        else if(num == 18){
            location = "Door that leads to opening hatch";
            scene = "The door that leads to the opening hatch is locked; one needs administrative permission to enter.";
            String[] choices = {"14: Return to Common Room"};
            choicesForScene = choices;
            
        }
        
        //NOT FIXED DOOR
        else if(num == 20){
            location = "Door that leads to opening hatch";
            scene = "The door that leads to the opening hatch is locked; one needs administrative permission to enter.";
            String[] choices = {"17: Return to Common Room"};
            choicesForScene = choices;     
        }
        
        //Path when door is not fixed
        else if(num == 17){
            location = "Common Room";
        scene = "You walk into the empty Common Room."
                  + " Usually this room would be occupied by at least one person. There is a piercing silence"
                  + " within the room, despite knowing the something is among it."; 
        String[] choices = {"15: Search for keycard in Kitchen", "19: Search for keycard in Lab/Workshop", "20: Search for keycard in Opening Hatch"};
        choicesForScene = choices;
        }
        
        //FIXED DOOR, MICHELLE'S GUN
        else if (num == 16){
        location = "Lab/Workshop";
        Item keycard1 = new Item("Keycard 1", "Grants access to places on the ship that require administrative permission");
        mainPlay.addToPlayerInventory(keycard1);
        scene = "You walk into the Lab and find one keycard scattered around a pile a clothing. Suddenly, "
                + "a grotesque creature, which resembles a gargoyle, appears behind you and begins to approach you. You can either"
                + " lock yourself in the decontamination chamber or attack the Shifter";
  
        String[] choices = {"22: Shoot the Shifter with Blaster", "24: Head for the decontamination chamber"};
        choicesForScene = choices;
                
        }
        
        //Shoot with blaster(BEST ENDING)
        else if(num == 22){
            location = "Lab/Workshop";
         mainMonster.setHealth(mainMonster.getHealth() - 20);
         String mainMonsterHealth = Integer.toString(mainMonster.getHealth());
         scene = "Shifter's health: "+ mainMonsterHealth + "\n"
                 + "\n"
                 + "The Shifter is hurt and springs away into a panel in the ceiling.";
         String[] choices = {"26: Return to Common Room"};
         choicesForScene = choices;
        }
        
        //ENDING WITH BLASTER BUT WRONG CHOICE MADE (OK ENDING)
        else if(num == 24){
                    location = "Lab/Workshop";
         mainPlay.setHealth(mainPlay.getHealth()-mainMonster.damageWithClaws());
         scene = "Shifter's health: "+ mainMonster.getHealth() + "\n"
                 + "\n"
                 + "The Shifter lunges towards you and scratches you on your way into the decontamination chamber. It quikcly springs away into a panel in the ceiling";
         String[] choices = {"28: Return to Common Room"};
         choicesForScene = choices;    
            
        }
        
        //ENDING WITH NO BLASTER (WORST ENDING)
        else if(num == 25){
            location = "Lab/Workshop";
            mainPlay.setHealth(mainPlay.getHealth()-mainMonster.damageWithClaws());
            scene = " Shifter's Health: " + mainMonster.getHealth()
                    + "\n"
                    + "\n"
                    + "The Shifter lunges towards you and scratches you on your way into the decontamination chamber. It takes the keycard before springing away into "
                    + "panel in the ceiling. The Shifter has left you wounded and at a disadvantage without a keycard.";
            String[] choices = {"27: Return to Common Room"};
            choicesForScene = choices;
        }
        
        //NO BLASTER, NO KEYCARD IN POSSESSION
        else if (num == 19){
            location = "Lab/Workshop";
            scene = "You walk into the Lab and find one keycard scattered around a pile a clothing. Before you can grab the keycard, "
                + "a grotesque creature, which resembles a gargoyle, appears behind you and begins to approach you. You can either"
                + " lock yourself in the decontamination chamber or attack the Shifter";
            String[] choices = {"25: Run to the decontamination chamber"};
            choicesForScene = choices;
        }
        
         //ENDING SCREENS
        else if(num == 26){
          scene = "YOU WON"
                  + "\n"
                  + "\n"
                  + "You had the best ending in the demo."; 
          String[] choices = {};
          choicesForScene = choices;
        }
        
                //WORST ENDING OF DEMO
        else if(num == 27){
          scene = "YOU LOST"
                  + "\n"
                  + "\n"
                  + "You had the worst ending in the demo.";
                 String[] choices = {};
          choicesForScene = choices;
        }
        
                //BEST ENDING OF DEMO
        else if(num == 28){
          scene = "YOU WON"
                  + "\n"
                  + "\n"
                  + "You had the second best ending in the demo.";  
        String[] choices = {};
          choicesForScene = choices;
        }
        
    }
    
    /**
     * Gets the scene at current point in the plot
     * @return the value assigned to scene
     */
    public String getScene(){
        return scene;
    }
    
    /**
     * Gets the choices for the scene at the current point in the plot
     * @return the value assigned to choicesForScene
     */
    public String[] getChoicesForScene(){
        return choicesForScene;
    }
    
    /**
     * Gets the location of the scene at the current point in the plot
     * @return the value assigned to getLocation
     */
    public String getLocation(){
        return location;
    }
    

        
    
}
