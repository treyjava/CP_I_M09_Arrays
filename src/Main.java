import java.util.Random;

public class Main
{
    public static void main(String[] args) {
        Random gen = new Random();


        String[] names = {"Bob", "Carol", "Ted", "Alice" }; // The [] make it an ARRAY
        System.out.println(names.length);

        System.out.println(names[0]);  // 0 = Bob  1 = Carol  2 = Ted  ...

        for (int i = 0; i < names.length; i++)  //  It starts at 0, and adds up until it reaches the length of names
            System.out.printf("%8s", names[i]); // The s stands for String. 8 means 8 character fields are allowed

        int[] scores = new int[100];
        for (int i = 0; i < scores.length; i++)  // Starting at 0, it will go through all the scores
            scores[i] = 0;  // Sets all the data points to 0

        for (int i = 0; i < scores.length; i++)
            System.out.printf("%4d", scores[i]); // The d stands for Digit, aka Integer. 4 means 4 character fields are allowed

        int[] values = new int[100];

        for (int i = 0; i < values.length; i++) {
            values[i] = gen.nextInt(100) + 1;  // Set all to 1 to 100
        }

        System.out.println("\n\n");


        for (int i = 0; i < values.length; i++)
            System.out.printf("%4d", values[i]);

        // Array Algorithms
        // Sum
        int sum = 0;
        double average = 0;
        for (int i = 0; i < values.length; i++)
            sum += values[i]; // Adds each value to the sum until it runs out of values

        System.out.println("\nThe sum of values is " + sum);
        average = (double) sum / values.length; // A double is a floating point number. The (double) declares it a double
        System.out.printf("The average is %5.2f", average); // Divides the sum by the number of values. 5 characters allowed, with 2 decimals allowed


        // Min Max Algorithm
        int min = values[0];
        int max = values[0];

        for (int i = 0; i < values.length; i++) {
            if (values[i] < min) // If it is less than the previous minimum, it becomes the new minimum
                min = values[i]; // Save the new min
            if (values[i] > max) // If it is greater than the previous maximum, it becomes the new maximum
                max = values[i]; // Save the new max
        }
        System.out.println("\nMinimum is " + min);
        System.out.println("Maximum is " + max);

        // Search algorithms
        //Find Any or Find All
        int target = 53;
        boolean found = false;
        for (int i = 0; i < values.length; i++) {
            if (values[i] == target) {
                System.out.println("Found at " + i); // "i" is the index
                found = true;
            }
        }
        if (!found)
            System.out.println("Value is not in the array ");


        //Find first
        found = false;
        for (int i = 0; i < values.length; i++) {
            if (values[i] == target) {
                System.out.println("Find First found at " + i); // "i" is the index
                found = true;
                break;
            }
        }
        if(!found)
            System.out.println("Value is not in the array ");

        //Find last
        found = false;
        for (int i = values.length - 1; i >= 0; i--) {
            if (values[i] == target)
            {
                System.out.println("Find L2ast found at " + i); // "i" is the index
                found = true;
                break;
            }
        }
        if(!found)
            System.out.println("Value is not in the array ");
    }
}