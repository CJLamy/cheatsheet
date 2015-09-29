public class ControlFlow {
    public static void theIf() {
        // The if statement grants our programs versatility.  There will come
        // situations when we need to make specific decisions or run specific pieces
        // of code depending on specific variables, or preconditions.  In the example
        // below, we are choosing whether we should turn the heater based on the existing
        // temperature.  By adjusting our temperature, temp, we'll see that we can determine
        // whether or not our heater will be on.
        boolean turnHeaterOn = false;

        int temp = 65;

        if (temp < 70) {
            turnHeaterOn = true;
        }
        System.out.println(turnHeaterOn);
    }
    public static void elseIf() {
        // So the example above shows us a part of what might determine whether our
        // heater activates depending on preconditions.  What if we also want to choose
        // if our airconditioning should turn on as well though?
        // The else and else if statements allow us to add a level of versatility to our
        // program that makes it all possible.
        boolean turnHeaterOn = false;
        boolean turnAirConditionOn = false;

        int temp = 72;

        if (temp < 70) { // We do our first check
            turnHeaterOn = true;
            turnAirConditionOn = false;
        } else if (temp > 75) { // If the first check is false, then we do this check
            turnHeaterOn = false;
            turnAirConditionOn = true;
        } else { // If all checks are false, then we'll default to this code
            turnHeaterOn = false;
            turnAirConditionOn = false;
        }
        // Note: The moment any condition turns out being true, the code will stop
        // running and checking any of the other conditions (the else statements).
        System.out.println("Is the heater on? -- " + turnHeaterOn);
        System.out.println("Is the airconditioner on? -- " + turnAirConditionOn);

        // As you can see, we've now run code that ensures no machine will be unecessarily
        // on, and we've also written code that will determine which machine should turn on
        // in which situation.
    }

    public static void switchStatement() {
        // Often we'll deal with cases that can be represented through state.  For example,
        // Many fans will allow you to adjust the speed of the fan blades.  In this case,
        // the different settings are represented by fan speed 1, 2, and 3.
        // The switch case allows us to represent that logic in order to make our code look
        // cleaner and as a result, easier to read.
        int fanSetting = 2;
        switch (fanSetting) { // I specify what variable will act as my controller.
            case 1: // In the case fanSetting == 1
                System.out.println("It's a storm in here!  Fan setting at maximum.");
                break;
            case 2: // if fanSetting == 2
                System.out.println("Fan set to a medium setting.");
                break;
            case 3: // if fanSetting == 3
                System.out.println("Is there a breeze in here?  Fan setting at minimum.");
                break;
            default:
                System.out.println("Are you sure that you have an appropriate setting?");
                break;
        }
        // Here's something to think about.  Within these cases, we see this alien
        // 'break'.  Play with the code and see what the break statement does in this
        // context.  What happens if we forget to add a break in one of these cases?
    }
}
