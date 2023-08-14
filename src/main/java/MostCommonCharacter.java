
import java.util.*;


public class MostCommonCharacter {
    /**
     * Find the most common character in str.
     * You could use a HashMap that maps a Character key to an Int value to represent how many times a Character has
     * been spotted.
     * @param str A String.
     * @return the most common character within str.
     */
    public char recurringChar(String str) {

        // first, create our HashMap
        Map<Character, Integer> map = new HashMap<>();

        // properly loads values into Map object

        for (char letter : str.toCharArray()) {
            if (map.containsKey(letter)) {
                int prev = map.get(letter);

                map.put(letter, prev+1);
            } else {
                map.put(letter, 1);
            }
        }



        // find max value so we can match it during iteration

        int maxOccurrence = Collections.max(map.values());


        for (Character ch : map.keySet()) {
            if (map.get(ch) == maxOccurrence) return ch;
        }

        // should never be reached due to for loop. Added for compilation purposes
        return str.charAt(0);
    }
        
}
