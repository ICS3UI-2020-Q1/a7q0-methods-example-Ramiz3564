 import java.util.Scanner;
/**
 * method example file
 * @author Zach Ramirez 
 */
public class Main {

  
  //prints hello world to the screen
  public static void sayHello(){
    System.out.println("hello world!"); 
  } 

  //prints hello to a person 
  public static void sayHello(String name){
    System.out.println("Hello" + name);
  }
  
  
  //a method to calcute the area of a rectangle given the width and the length
  public static double areaOfRectangle( double length, double width){ 
    double area = width * length; 
    return area;  
  }
  
  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
   Scanner input = new Scanner(System.in); 
   System.out.println("Please enter a width"); 
   double width = input.nextDouble(); 
   System.out.println("Please enter a length"); 
   double length = input.nextDouble(); 
   //calculate the area using the input 
   double area = areaOfRectangle(width, length); 
   System.out.println(area);  

    
    //say hello world 
    sayHello(); 
  }
}
