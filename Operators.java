import java.util.Random;

public class Operators {
    public static void operationsDemo() {
        // Most programming languages including Java make use of basic operations
        // through operators that will be reviewed here.

        // Normally, we can represent any math we do in the same way we would write
        // an equation in mathematics.  Below will be the basic operations.
        int addition = 5 + 10;
        int subtraction = 10 - 5;
        int division = 10 / 2;
        int multiplication = 5 * 2;
        int everything = 6 + 2 / 2 - 10 * 2;

        // Here, if we print out the value of everything, we'll see that Java respects
        // the order of operations (PEMDAS), so everything = -13.
        System.out.println(everything);

        // To get everything to be read from left to write, we would use parentheses.
        int newEverything = (6 + 2) / (2 - 10) * 2;
        System.out.println(newEverything); // -2
    }
    public static void comparisonDemo() {
        // There are times when we need to compare pieces of information in order
        // to make informed decisions within our program.
        // This can be done through Relational Operators.

        // These are the relational operators we can use:
        // ==, !=, >, >=, <, <=

        // Here, I have no idea what a equals, similar to situations with user input.
        int a = new Random().nextInt(5);

        // Comparisons will allow me to perform different actions depending on the
        // value of a.  Feedback on the results of the comparison will then be given to us
        // in Boolean form.
        boolean result = a < 10; // result = false because a is a number between 0-4
        result = a == 2; //result either true or false depending on value of a.
        System.out.println(a);

        // Play with the code below to get a sense of each of the operators and how they work.
        // The if statement will be covered in a different file.  For now, just read this
        // the same as you would human logic.  If _comparison_, then _result_.

        if (a == 3)
            System.out.println("a equals 3");
        if (a != 3)
            System.out.println("a not equal to 3");
        if (a > 3)
            System.out.println("a greater than 3");
        if (a >= 3)
            System.out.println("a greater than or equal to 3");
        if (a < 3)
            System.out.println("a less than 3");
        if (a <= 3)
            System.out.println("a less than or equal to 3");
    }

    public static void andOrDemo() {
        // Our programs can get as complicated as we want it to get.  And Or allows us
        // to add complexities to our if statements through tables of comparison.

        // The And operator checks to make sure that all conditions listed turn out to be true.
        // It would follow the same logic as human logic such as, if I am hungry, and I have bread,
        // and I have ham, then I will make a ham sandwich.  Here's an example of what code might look like.
        if (3 == 3 && 5 != 10) {
            System.out.println("Both statements above are true.");
        }
        // In this case, because both conditions 3==3, 5!=10 are both true, we printed our statement.
        // Here's a table for the And operator logic concerning 2 conditions.
        // |Condition 1|Condition 2|Result|
        // |    True   |   True    | True |
        // |    True   |   False   | False|
        // |    False  |   True    | False|
        // |    False  |   False   | False|

        // The Or operator checks to see if only one of these conditions listed is true.
        // Here's how an or operator might look using human logic.  If I have some dinner refrigerated or
        // I have a sandwich sitting in the fridge, then I won't bother preparing a snack, I'll just eat that.
        // Here's an example now in code.
        if (3 != 3 || 5 == 5) {
            System.out.println("Only one statement is true.");
        }
        // Because the Or operator is used, only one of the conditions 3!=3, 5==5
        // had to be true.  So we still executed our print statement.

        // Here's a table for the Or operator logic concerning 2 conditions.
        // |Condition 1|Condition 2|Result|
        // |    True   |   True    | True |
        // |    True   |   False   | True |
        // |    False  |   True    | True |
        // |    False  |   False   | False|

        // As we grow more experienced, we can mix our And Or operators to come up with
        // more advanced conditional checks.  Here's one example below
        if (3!=4 && 5==6 || 5!=5) {
            System.out.println("Wow!  This condition turned out being False!");
        }
        // That's a difficult condition to take in.  In this case, remember that
        // the order of operations is your friend.  In other words, break up the problem
        // and the compiler will read code from left to right, prioritizing parenthesis,
        // which we do not have here.
        // 3!=4 && 5==6 || 5!=5 breaks down to True && False || False.
        // Now let's read left to right, so (True && False) || False
        // False || False.  Based on our table, we get False as our final result here.

        // Here we've gone very quickly over the and or operators.  Try challenging yourself
        // until you fully get the hang of the logic.  For example, what happens in this case?
        // !(a == 5 || b == 10).  Can you simplify this equation logically by breaking down the problem?
        // Hint: Make a table based on all the results and see what happens!
    }
}
