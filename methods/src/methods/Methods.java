
package methods;

import java.util.Scanner;

public class Methods {
   
    static void myMethod() {
    
        System.out.println("I just got executed!");
        
        System.out.println("A method without parameters");
        
    }

    public static Integer AnotherMethod(int a, int b) {
    
        int soma = a + b;
        
        return soma;
    
    }
       
    public static void main(String[] args) {
   
        
        myMethod();
        
        Scanner kb = new Scanner(System.in);
        
        int aa, bb;
        
        aa = kb.nextInt();
        
        bb = kb.nextInt();
        
        int soma = AnotherMethod(aa, bb);
        
        System.out.println(soma);99
        
  }

    
}
