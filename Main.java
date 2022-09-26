import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
public class Main {
    /*Number Order
     * Create a program using an array:
     *
     * Ask user what number of elements would he sort from smallest to greatest?
     * Let user input the numbers.
     * Print result like this:
     * -7 0 14 29 347 438
     *
     * Decompose the program into methods.
     *
     */

    /* Main Function
    2. getUserArray
    4. printArrayOrder
    5. Prompt continue. If yes, go to #2, else exit
    */

    /* getUserArray
    1. Prompt user how many numbers they need to sort
    2. Let the user enter the numbers
     */

    /* arrayOrder
    1. Add number to sort
    2. increase index
    3. if index is greater than size, return order. Else, return to #1
     */


    // Method to get the user input with a custom prompt
    public static String getUserInput(String prompt) {
        print(prompt);
        Scanner scan = new Scanner(System.in);
        return scan.nextLine().trim().toLowerCase();
    }

    // Method to get the user input without a custom prompt
    public static String getUserInput() {
        return getUserInput("");
    }

    // Wrapper for printing to terminal
    public static void print(String toPrint) {
        System.out.print(toPrint);
    }

    // Calculate the sum of the array
    public static int arraySum(int[] array) {
        int sum = 0;
        for (int value : array) {
            sum += value;
        }
        return sum;
    }

    // Print the result (1 + 2 + 3 = 6)
    public static void printArrayOrder(int[] array) {
        int order = arraySum(array);
        for (int i = 0; i < array.length - 1; ++i) {
            Arrays.sort(array);
        }
        System.out.print(Arrays.toString(array));
        print(array[array.length - 1] + "\n");
    }

    // Initialize an array and add the user values in
    public static int[] getUserArray() {
        int arrayLength = Integer.parseInt(
                getUserInput("How many number to sort: ")
        );
        int[] numbers = new int[arrayLength];
        for (int i = 0; i < arrayLength; ++i) {
            numbers[i] = Integer.parseInt(
                    getUserInput("number " + (i + 1) + ": ")
            );
        }
        return numbers;

    }

    public static boolean toContinue() {
        String userInput = getUserInput("Do you want to continue? (Y/N)\n");
        return userInput.equalsIgnoreCase("Y");
    }

    public static void main(String[] args){
        printProgramName();
        do {
            int[] arr;
            arr = getUserArray();
            printArrayOrder(arr);
        } while (toContinue());
    }
}
