public class ArrayPractice {
  public static void main(String[] args) {
    // Create an array of Strings of size 4

    String[] array = new String[4];

    // Set the value of the array at each index to be a different String
    // It's OK to do this one-by-one
    array[0] = "Danny";
    array[1] = "Programming";
    array[2] = "Green River College";
    array[3] = "Auburn Center";

    // Get the value of the array at index 2

    String index2 = array[2];

    System.out.println("Index 2 value is " + index2);

    // Get the length of the array

    int arrayLength = array.length;

    // Iterate over the array using a traditional for loop and print out each item
    for(int i = 0; i <= arrayLength - 1; i++){
      System.out.println(array[i]);;
    }

    // Iterate over the array using a for-each loop and print out each item

    for(String string : array){
      System.out.println(string);
    }

    /*
     * Reminder!
     * 
     * Arrays start at index 0
     */
  }
}
