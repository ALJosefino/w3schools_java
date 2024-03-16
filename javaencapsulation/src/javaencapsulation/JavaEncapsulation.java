
package javaencapsulation;

public class JavaEncapsulation {

    public static void main(String[] args) {
        
        Person myObj = new Person();
    
        myObj.name = "John";  // error
    
        System.out.println(myObj.name); // error 
        
    }
    
}