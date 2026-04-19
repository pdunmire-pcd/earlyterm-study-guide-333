import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Practice {
    /**
     * Returns the difference between the largest and smallest integer in an array.
     * 
     * @param nums a non-empty, non-null array of numbers
     * @return the difference between the largest and smallest number
     */
    public static int maxDiff(int[] nums) {
        int max = nums[0];
        int min = nums[0];
        for (int i = 1; i < nums.length; i++) {
            int num = nums[i];
            if (num > max) {
                max = num;
            } else if (num < min) {
                min = num;
            }}
        return max - min;
    }

    public static String longestWord(ArrayList<String> words, char letter){
        String longWord = "";
        for (String word : words){
            if (word.startsWith(String.valueOf(letter)) && word.length() > longWord.length()) {
                longWord = word;
            }
        }

        return longWord;
    }

    public static int countWords(HashSet<String> words, int lengthOne, int lengthTwo){
        int wordCount = 0;
        for (String word : words) {
            if ( word.length() >= lengthOne && word.length() <= lengthTwo){
                wordCount++;
            }}
            return wordCount;
    }

    public static int countDifference(HashMap<String, Integer> words){
        int odd = 0;
        int even = 0;
        for (int word : words.values()) {
            if(word % 2 == 0){
                even++;
            }else {
                odd++;
            }
        } return odd - even;
    }

    public static int secondLargest(HashMap<Integer, String> lengths) {
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        for (int key : lengths.keySet()){
            if (key > max){
                secondMax = max;
                max = key;
            } else if ( key > secondMax) {
                secondMax = key;
            }
        }

        return secondMax;

    }

    // For each method you are only required to implement it for one of the data
    // structures. But use a different data structure for each method. For example,
    // do maxDiff with an array, the next question with a Set, etc.
}
