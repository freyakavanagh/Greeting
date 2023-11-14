package org.example;

/**
 * Hello world!
 *
 */
public class App 
{

    public static String getGreeting(int timeOfDay) {

        String greeting;

        if (timeOfDay >= 5 && timeOfDay <= 12)
        {greeting = "Good morning!";
        } else if (timeOfDay >= 12 && timeOfDay <= 18) {
            greeting = "Good afternoon!";
        } else {
            greeting = "Good evening!";
        }

        return greeting;
    }

    public static void main( String[] args )
    {
        int timeOfDay = 21;

        System.out.println(getGreeting(timeOfDay));


    }

}
