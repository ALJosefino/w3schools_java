
package javawhileloop;

import java.util.Scanner;

public class Javawhileloop {

    public static void main(String[] args) {
        
        Scanner kb = new Scanner(System.in);
        
        int x = kb.nextInt();
        
        int y = kb.nextInt();
        
        while (x > y) {
  
            --x;
            
            System.out.println(" x = " + x + "; y = " + y + ";");
            
                      }
        
    }
    
}
