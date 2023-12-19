
package typecast;

public class TypeCast {

    public static void main(String[] args) {
    
    byte myByte = 127;    
    short myShort = 32767;
    int myInt = 21474;
    long myLong = 922337203;
    
    float myFloat = myShort / myByte;
    double myDouble = myLong / myInt;

    
    System.out.println(myFloat);
    System.out.println(myDouble); 
  }

}
   
