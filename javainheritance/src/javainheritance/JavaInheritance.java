
package javainheritance;

public class JavaInheritance {

    class Car extends Vehicle {
  
        private final String modelName = "Mustang";    // Car attribute
  
  
        public static void main(String[] args) {

    // Create a myCar object
        
    Car myCar = new Car();

    // Call the honk() method (from the Vehicle class) on the myCar object
    myCar.honk();

    // Display the value of the brand attribute (from the Vehicle class) and the value of the modelName from the Car class
    System.out.println(myCar.brand + " " + myCar.modelName);
  }
        private String brand;

        private void honk() {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }
    }
    
}
