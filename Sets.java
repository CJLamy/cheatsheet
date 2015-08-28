import java.util.HashSet;

public class Sets {
    public static void setDemo() {
        // Here's the full javadocs to the HashSet Class.
        // You can see all of the methods you can use and take advantage of.
        // http://docs.oracle.com/javase/7/docs/api/java/util/HashSet.html

        // Creating a variable that will keep track of all of my favorite animals.
        HashSet<String> favoriteAnimals = new HashSet<String>();

        favoriteAnimals.add("Cat");
        favoriteAnimals.add("Dog");
        favoriteAnimals.add("Cheetah");
        favoriteAnimals.add("Panda");
        favoriteAnimals.add("Parakeet");
        favoriteAnimals.add("Falcon");
        favoriteAnimals.add("Dodo");

        // Here's how I can print out all the animals I have so far.
        System.out.println(favoriteAnimals);

        // I'm starting to forget what I added and what I haven't added.
        // I'm going to accidentally add the panda again.
        favoriteAnimals.add("Panda");

        // Even though we've added panda twice, we'll see it's only shown once.
        // Sets are great at keeping track of data that you don't want repeats of.
        System.out.println(favoriteAnimals);

        // Since I've learned the dodo (bird) is now extinct, I'm going to remove it.
        favoriteAnimals.remove("Dodo");

        System.out.println(favoriteAnimals);
    }
}
