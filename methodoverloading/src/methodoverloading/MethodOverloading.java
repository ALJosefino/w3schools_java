package methodoverloading;
        
import java.util.Scanner;

    public class MethodOverloading {
    
                static int plusMethodInt(int x, int y) {
        
            return x + y;
        
        }

        static double plusMethodDouble(double x, double y) {
  
            return x + y;
        
        }

        
    public static void main(String[] args) {
          
              
        Scanner kb = new Scanner(System.in);
        
        int a = kb.nextInt();
        
        int b = kb.nextInt();
        
        int myNum1 = plusMethodInt(a, b);
 
 
        double c = kb.nextDouble();
        
        double d = kb.nextDouble();
        
        double myNum2 = plusMethodDouble(c, d);
  
        System.out.println("int: " + myNum1);
  
        System.out.println("double: " + myNum2);

    }


    }
