//count frequncy of string 

import java.util.*;


public class Question_3 {

    public static void main(String[] args) {
        String str = "answersaaww";

        Map<Character,Integer> frequencyCount = new HashMap<>();


        for (char c : str.toCharArray()) {

            frequencyCount.put(c, frequencyCount.getOrDefault(c, 0)+1);
            
        }
    }
}
