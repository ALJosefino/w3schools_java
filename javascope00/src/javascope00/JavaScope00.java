
package javascope00;

public class JavaScope00 {

    public static void main(String[] args) {
        
        
    // Code here CANNOT use x

    { 

      // This is a block

      // Code here CANNOT use x

      int x = 100;

      // Code here CAN use x
      
      System.out.println(x);

    } 

       // The block ends here

       // System.out.println(x); 
       
      // Code here CANNOT use x
        
    }
    
}