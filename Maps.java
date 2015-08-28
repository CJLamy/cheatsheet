import java.util.HashMap;
import java.util.ArrayList;

public class Maps {
    public static void mapBasicDemo() {
        // Here's the full javadocs to the HashMap Class.
        // You can see all of the methods you can use and take advantage of.
        // http://docs.oracle.com/javase/7/docs/api/java/util/HashMap.html

        // Creating a variable that will keep track of cities within each country.
        HashMap<String, String> originalCityTracker = new HashMap<String, String>();

        // Here, I specify that my keys are the country and that my values
        // are the cities within that country.
        originalCityTracker.put("France", "Paris");
        originalCityTracker.put("England", "London");
        originalCityTracker.put("United States", "Washington DC");
        originalCityTracker.put("Germany", "Berlin");

        // Here's how I can print out all the animals I have so far.
        System.out.println(originalCityTracker);

        // Wait though, each country has more than one city...
        originalCityTracker.put("France", "Nantes");
        // Now if I want to see the cities in France, I can do:
        System.out.println(originalCityTracker.get("France"));
        // I'll see that I only get one city.  HashMaps can only have one value
        // associated with each key.  Good news is there are ways around this
        // shown in mapAdvancedDemo.
    }

    //  By thinking creatively and mixing together all of these different
    //  Classes and means of storing data, we can come up with an infinite
    //  number of ways to solve problems and effectively organize information.
    public static void mapAdvancedDemo() {
        HashMap<String, ArrayList<String>> goodCityTracker =
                            new HashMap<String, ArrayList<String>>();
        // Now, my key points to values that are a List of cities.
        // Sadly, a side effect is that it's now a little trickier to add cities.
        // First I need to make sure each country points to an
        // ArrayList I can add to.
        goodCityTracker.put("France", new ArrayList<String>());
        goodCityTracker.put("England", new ArrayList<String>());
        goodCityTracker.put("United States", new ArrayList<String>());
        goodCityTracker.put("Germany", new ArrayList<String>());

        // Now I can retrieve that ArrayList and freely add to it.
        goodCityTracker.get("France").add("Paris");
        goodCityTracker.get("France").add("Nantes");
        goodCityTracker.get("England").add("London");

        // Now if I want to see France's cities specifically:
        System.out.println(goodCityTracker.get("France"));

    }
}
