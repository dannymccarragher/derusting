public class NumberPractice {
  public static void main(String args[]) {
    // Create a float with a negative value and assign it to a variable

    float negativeFloat = -.05f;
    // Create an int with a positive value and assign it to a variable

    int num = 6;
    // Use the modulo % operator to find the remainder when the int is divided by 3

    int remainder = num % 3;
    // Use the modulo % operator to determine whether the number is even
    // (A number is even if it has a remainder of zero when divided by 2)
    // Use an if-else to print "Even" if the number is even and "Odd"
    // if the number is odd.

    if(num % 2 == 0){
      System.out.println("Even");
    } else{
      System.out.println("Odd");
    }

    // Divide the number by another number using integer division
    int divValue = num / 3 ;

    /*
     * Reminder!
     * 
     * When dividing ints, the result is rounded down.
     * Example: 
     * 7 / 3 = 2 when performing int division
     */

  }
}
