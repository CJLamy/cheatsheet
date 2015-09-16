public class Iteration {
    // Often, you'll want to perform a set of repetitive actions on a chunk of
    // information.  Java lets us iterate through this set of information
    // through a set of tools, of which we'll be exploring loops specifically.
    public static void forLoop() {
        // In this case, we have the raw score results of students.
        // In a test they took with 67 questions, we have recorded
        // how many they got correct.
        int[] testScores = {57, 65, 53, 34};

        // Our goal is to go through each score and convert that score into
        // a percentage score.
        // The overall flow of the code goes as follows.
        // 1) Initially, create a variable, i, and set it to 0. -> 2
        // 2) if i < testScores.length, then step 3.  Otherwise, Step 5
        // 3) execute the body of code below. -> 4
        // 4) Once done executing the body, increment i by 1. -> 2.
        // 5) We're out of the loop!
        for (int i = 0; i < testScores.length; i++) {
            System.out.println("Test Score initially " + testScores[i]);
            testScores[i] = (testScores[i] * 100) / 67;
            System.out.println("Test Score now " + testScores[i]);
            System.out.println("==================");
        }
    }
    public static void whileLoop() {
        // When thinking about the while loop, you can think of it as a stripped
        // down for loop.  Where the for loop asked us to initialize variables,
        // write our termination condition, and what variables we want to change
        // at each step before we write out the body, the while loop will
        // only ask up to write out the termination condition at the very beginning,
        // with everything else being done within the body of the loop.
        // Here's the same code as the for loop written in while loop form.
        int[] testScores = {57, 65, 53, 34};
        int i = 0;
        while (i < testScores.length) {
            System.out.println("Test Score initially " + testScores[i]);
            testScores[i] = (testScores[i] * 100) / 67;
            System.out.println("Test Score now " + testScores[i]);
            System.out.println("==================");
            i++;
        }
    }
}
