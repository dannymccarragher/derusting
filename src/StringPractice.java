import java.util.ArrayList;

public class StringPractice {
  public static void main(String[] args) {
    // Create a string with at least 5 characters and assign it to a variable

    String string = "JavaScript";

    // Find the length of the string

    int stringLen = string.length();

    // Concatenate (add) two strings together and reassign the result

    String result = string.concat("Java");


    

    // Find the value of the character at index 3

    result.charAt(3);

    // Check whether the string contains a given substring (i.e. does the string have "abc" in it?)

    result.contains("Scr");

    // Iterate over the characters of the string, printing each one on a separate line

    for(int i = 0; i < stringLen; i++){
      char ch = string.charAt(i);
      System.out.println(ch);
    }
    

    // Create an ArrayList of Strings and assign it to a variable
    ArrayList<String> list = new ArrayList<>();

    // Add multiple strings to the List (OK to do one-by-one)

    list.add("First");
    list.add("Second");
    list.add("Third");

    // Join all of the strings in the list together into a single string separated by commas
    // Use a built-in method to achieve this instead of using a loop
    String joinResult = String.join(",", list);

    System.out.println(joinResult);
    // Check whether two strings are equal

    /*
     * Reminder!
     * 
     * When comparing objects in Java we typically want to use .equals, NOT ==.
     * 
     * We use == when comparing primitives (e.g. int or char).
     */
  }
}
