/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rasmus
 */
public class Change {
    
    private char fromCharacter; 
    private char toCharacter; 
    
    
    public Change (char fromCharacter, char toCharater){
        this.fromCharacter = fromCharacter; 
        this.toCharacter = toCharater; 
        
        
    }
    
    
    public String change(String characterString){
        String changedWord = characterString.replace(fromCharacter, toCharacter);
        
        
        return changedWord; 
    }
    
    
    
    
    
}
