
package javamodifiers00;

import static javamodifiers00.Main.myStaticMethod;

public class JavaModifiers00 {

        
         // Main method
  
    public static void main(String[ ] args) {
    
        myStaticMethod(); // Call the static method
    
    // myPublicMethod(); This would output an error
    
    Main myObj = new Main(); // Create an object of Main

    myObj.myPublicMethod(); // Call the public method
        
    }
    
}
