public class Array {
    public static void arrayDemo() {

        // I've created a variable and specified that it will be an array
        // that contains 5 values of type int total.
        int[] myArray = new int[5];

        // Here I'm giving a value to each compartment within the array.
        myArray[0] = 0;
        myArray[1] = 1;
        myArray[2] = 17;
        myArray[3] = 42;
        myArray[4] = 6;

        // I've initialize an array, myOtherArray and populated it with
        // values all in one line.
        int[] myOtherArray = {0, 1, 17, 42, 6};

        // To print the third element, I want to do:
        System.out.println(myArray[2]);

        // Here's an array of Strings
        String[] stringArray = {"Apple", "Banana", "Orange"};

        // To print the size of the array, I can run this line of code.
        System.out.println(stringArray.length);

    }
}
