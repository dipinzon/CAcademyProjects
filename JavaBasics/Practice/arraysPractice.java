package Practice;

import java.util.Arrays;

public class arraysPractice {

    public void simpleArray(String[] words) {
        // Print the words one per line 
        for (String word : words) {
            System.out.println(word);
        }
        System.out.println("");
        
        //Print words sorted in alphabetical order 
        Arrays.sort(words);
        for (int i = 0; i < words.length; i++) {
            System.out.println(words[i]);
        }

        System.out.println("");
        //Print unique words alphabetical
        Object[] words_unique = Arrays.stream(words).distinct().toArray();       
        for (int i = 0; i < words_unique.length; i++) {
                System.out.println(words_unique[i]);
        }

        System.out.println("");
        //Print unique words length
        for (int i = 0; i < words_unique.length; i++) {
                System.out.println(words_unique[i].toString().length());
        }

    }

}
