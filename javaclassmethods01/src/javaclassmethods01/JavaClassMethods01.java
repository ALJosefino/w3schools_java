
package javaclassmethods01;

import static javaclassmethods01.Main.myStaticMethod;


public class JavaClassMethods01 {

    
    
    
    public static void main(String[] args) {
        
        myStaticMethod(); // Call the static method
    
        // myPublicMethod(); This would compile an error

        Main myObj = new Main(); // Create an object of Main
    
        myObj.myPublicMethod(); // Call the public method on the object
        
    }
    
}
