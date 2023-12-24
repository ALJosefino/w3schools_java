
package ifelse;

import java.util.Scanner;

public class Ifelse {

    public static void main(String[] args) {
        
        Scanner kb = new Scanner(System.in);
        
        System.out.println("Type a number to x: ");
        
        int x = kb.nextInt();
        
        System.out.println("Type a number to y: ");
        
        int y = kb.nextInt();
    
        if (x > y) {
        
            System.out.println("x is greater than y");

        } else {
        
        System.out.println("y is greater than x");
        
        }

        
    }
    
}
