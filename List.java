import java.util.ArrayList;

public class List {
    public static void listDemo() {
        // Here's the full javadocs to the ArrayList Class.
        // You can see all of the methods you can use and take advantage of.
        // http://docs.oracle.com/javase/7/docs/api/java/util/ArrayList.html

        // I create my ArrayList Object so that I can later reference it.
        ArrayList<String> daysOfTheWeek = new ArrayList<String>();

        // I'm adding new Strings to myList here.
        daysOfTheWeek.add("Monday");
        daysOfTheWeek.add("Tuesday");
        daysOfTheWeek.add("Thursday");

        // I'm printing the size of myList to see how many elements are in it.
        System.out.println(daysOfTheWeek.size());

        // Because I forgot Wednesday is the third day, I'll inject it in there.
        // Note: Because position starts at 0, 2 marks the third location.
        daysOfTheWeek.add(2, "Wednesday");

        // I'm going to remove the fourth day because the government has determined
        // 3 day weeks to be most effective now.
        daysOfTheWeek.remove(3);

        // I want to print out the third day of the week and see what it is.
        System.out.println(daysOfTheWeek.get(2));

        daysOfTheWeek.add("Secret Day");

        // Oh no!  A person has added Secret Day.  I don't know quite where it is,
        // but I know it's in my list.  So I'll remove based on what I know.
        daysOfTheWeek.remove("Secret Day");
    }
}
