package eu.anifantakis.jokeslib;

/**
 * A class tha provides random joke Strings via its static method "getRandomJoke"
 */
public final class Joker {

    private static String[] jokes = {
            // Jokes Source: http://www.short-funny.com/
            "Can a kangaroo jump higher than a house?" +"\n" + "Of course, a house doesn't jump at all",
            "Anton, do you think I'm a bad mother?" + "\n" + "My name is Paul.",
            "My dog used to chase people on a bike a lot. It got so bad, finally I had to take his bike away",
            "What is the difference between a snowman and a snowwoman?" + "\n" + "Snowballs",
            "My relationship is like an iPad. I don't have an iPad.",
            "I am nobody. Nobody is perfect. I am perfect.",
            "I'm not lazy. I'm just naturally a very relaxed person.",
            "I'm standing outside. In other words, I'm outstanding.",
            "Stressed is just desserts spelled backwards.",
            "He who wakes up early, yawns all day long.",
            "Dogs have beloved masters. Cats have waiting staff.",
            "I've been single for so many years I believe I will soon become an album.",
            "I had loads to do today. Ah well, so now I have loads to do tomorrow.",
            "All my life I thought air was for free. That was until I bought a bag of crisps.",
            "Of course you're not fat. Just grab a couple of chairs and come sit with us.",
            "Where do pencils spend their vacations?" + "\n" + "In Pencilvania.",
            "What did 0 say to 8?" + "\n" + "Hey, nice belt!"
    };

    /**
     * This class should not be instantiated
     */
    private Joker(){}

    /**
     * Method that generates a random integer number for a given range
     * @param min Minimum number in range
     * @param max Maximum number in range
     * @return integer number between min and max range
     */
    private static int getRandomNumberInRange(int min, int max){
        return (int)(Math.random() * (max-min) + min);
    }

    /**
     * This method fetches randomly one of the available jokes
     * @return String containing a random joke
     */
    public static String getRandomJoke(){
        return jokes[getRandomNumberInRange(0, jokes.length-1)];
    }
}
