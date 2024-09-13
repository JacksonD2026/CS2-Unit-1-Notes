// Java programs are defined in a CLASS
// the class name (Main) must match the FILE name (Main.java)
// curly brackets define the start & end of a section
public class Main {

   // The main method is what runs when you press RUN
   public static void main(String []args) {
      // Below is a print STATEMENT (instruction/command)
      // Java statements end in a semicolon
      System.out.println("Hello World");
      
      // print will output on the same line
      // println will enter to the next line after printing
      System.out.print("apcs");
      System.out.println(" is fun");

      // DECLARE VARIABLES
      int students;
      boolean isRaining; // camelCase for multi-word names
      double cash;

      // ASSIGN VALUES to the variables
      students = 8;
      cash = 5.00;
      isRaining = false; // false is "off", or 0

      // INSTANTIATE or INITIALIZE (declare + assign in one line)
      int numClasses = 9;
      double gpa = 3.4;
      boolean isSnowy = false;

      // ARITHMETIC operators

      System.out.println(2 + 3);
      System.out.println(2 - 3);
      System.out.println(2 * 3);
      System.out.println(2.00 / 3.00); //If number is an int (1,2,3) it will come out as an int instead (0)

      System.out.println(2 == 3); //returns false
      System.out.println(2 != 3); //returns true

      // % operator returns the remainder after divison
      System.out.println(17234232%3);
     

      // COMPOUND ASSIGNMENT (shortcuts)
      int score = 0 ;

      //long way to increase score by 1
      score = score + 1;
      System.out.println(score);

      // Shortcut edition
      score += 5;
      System.out.println(score);
      
      //only effects score by one
      score++;
      System.out.println(score);

      // there are shortcuts for multiplication and division too 
      score/=3;
      System.out.println(score);

      score*=732;
      System.out.println(score); 





   }
}
