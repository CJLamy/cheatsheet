public class Return {
    public void operationsDemo() {
        // The return statement can be used as a great way of organizing
        // your code and making it more readable for users.
        // Imagine that you're working in an assembly line and you're tasked
        // with putting together a car.  Instead of having one person put together
        // the entire car, it's far more efficient to break down the tasks and let
        // different people handle different jobs.  For example, one person can
        // put together the sheets of metal that goes into a car door and another person
        // can install the door onto the car.  As a result, we can say that person X
        // is handed together door components and he returns a door, which we can then
        // pass on to Person Y, who takes in the door and returns it installed onto the car.
        int myAnswer = add(15, 7);
        System.out.println(myAnswer);
    }

    public int add(int a, int b) {
        int answer = a + b;
        return answer;
    }
}
