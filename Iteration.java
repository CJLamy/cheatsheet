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

    public static void breakAndContinue() {
        // While it's not necessary to know about the break and continue statements,
        // here's a function that uses both of these statements as well as an explanation
        // on what it does.  Experiment with the code so that you can see exactly what
        // the statements do!
        char[] breakfast = {'b', 'r', 'e', 'a', 'k', 'f', 'a', 's', 't'};

        // In our world, the letter k has been outlawed.  As a result, we have to
        // go through all words and sound the alarm for anything that has a k.
        // This character array containing the word breakfast will serve as our practice.
        for (int i = 0; i < breakfast.length; i++) {
            if (breakfast[i] == 'k') {
                System.out.println("Sound the alarm, we're in the danger zone!");
                break;
            } else {
                System.out.println("So far so good...");
            }
        }
        // You should notice that our code runs, but the moment we sound the alarm,
        // we're no longer printing out "So far so good...".  This is because the
        // break statement is effectively a panic button, ending the loop no matter
        // the progress you've made.
        System.out.println("\n");

        // In this loop, we'll go through and print out the new word without the 'k'
        // and also print the length of that word using the continue statement.
        String newWord = "";
        int counter = 0;
        for (int i = 0; i < breakfast.length; i++) {
            if (breakfast[i] == 'k') {
                continue; // Continue will tell our code to go back to the top (where we i++)
            }
            newWord += breakfast[i];
            counter++;
        }
        System.out.println(newWord + " is " + counter + " letters long.");
    }
}
