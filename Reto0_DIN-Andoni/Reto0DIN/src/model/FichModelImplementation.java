/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ResourceBundle;


/**
 * This class implements the model interface to take the getGreeting Method.
 * Its one of the 2 classes who is called by the Model Factory
 * It is connect to the Fich Properties
 * @author Enaitz Izagirre
 */
public class FichModelImplementation implements Model{

    private ResourceBundle configFile;
    private String greeting;
    
     /**
     * This method get the greeting from the BDA then to return 
     * @return Returns the String Greeting from the Fich Properties
     */
    @Override
    public String getGreeting() {    
       configFile = ResourceBundle.getBundle("properties.fich");
       greeting = configFile.getString("Saludo");
         return greeting;
    }
    
    
    
  

   
    
}
