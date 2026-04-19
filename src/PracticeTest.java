import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class PracticeTest {

    // maxDiff
    @Test
    void testMaxDiffPositiveAndNegative() {
        // Arrange
        int[] numbers = {8, -2, 9, -5};

        // Act
        int actual = Practice.maxDiff(numbers);

        // Assert
        // Largest: 9, Smallest: -5, Difference: 9 - -5 = 14
        assertEquals(14, actual);
    }
     
    @Test
    void allSameNumbers() {
        //Arrange
        int[] numbers = {9,9,9,9};
        // Act
        int actual = Practice.maxDiff(numbers);
        // Assert
        // Largest: 9, Smallest: 9, Difference: 9 - 9 = 0
        assertEquals(0, actual);
    }

    @Test
    void singleElement() {
        //Arrange
        int[] numbers = {5};
        // Act
        int actual = Practice.maxDiff(numbers);
        // Assert
        // Largest: 5, Smallest: 5, Difference: 5 - 5 = 0
        assertEquals(0, actual);
    }
    

    // longestWord()

    @Test
    void normalCase() {
        //Arrange
        ArrayList<String> words = new ArrayList<>(Arrays.asList("car", "carpenter", "couch", "tools", "tablepool"));
        //Act
        String actual = Practice.longestWord(words, 'c');
        //Assert
        assertEquals("carpenter", actual);
    }

    @Test
    void nonStartingWithTheSpecifiedLetter () {
        //Arrange
        ArrayList<String> words = new ArrayList<>(Arrays.asList("car", "carpenter", "couch", "tools", "tablepool"));
        //Act
        String actual = Practice.longestWord(words, 'p');
        //Assert
        assertEquals("", actual);
    }

    //countWords()
    @Test
    void normalCaseReturnsAccurateWordCount() {
        //Arrange
        HashSet<String> words = new HashSet<>(Arrays.asList("cat", "combination", "carpet", "purse", "couch"));
        //Act
        int actual = Practice.countWords(words, 3, 5);
        //Assert
        assertEquals(3, actual);
    }

    @Test
    void noWordsBetweenLengths() {
        //Arrange
        HashSet<String> words = new HashSet<>(Arrays.asList("cat", "combination", "carpet", "purse", "couch"));
        //Act
        int actual = Practice.countWords(words, 7, 9);
        //Assert
        assertEquals(0, actual);
    }

    //countDifference()
    @Test
    void normalCaseWithMixOfOddAndEven() {
        //Arrange
        HashMap<String, Integer> words = new HashMap<>();
        words.put("cat", 3);
        words.put("combination", 11);
        words.put("carpet", 6);
        words.put("purse", 5);
        words.put("couch", 5);
        //Act
        int actual = Practice.countDifference(words);
        //Assert
        assertEquals(3, actual);
    }

    @Test 
    void allEvenNumbers(){
        //Arrange
        HashMap<String, Integer> words = new HashMap<>();
        words.put("cats", 4);
        words.put("comb", 4);
        words.put("carpet", 6);
        words.put("flower", 6);
        words.put("book", 4);
        //Act
        int actual = Practice.countDifference(words);
        //Assert
        assertEquals(-5, actual);
    }

    @Test 
    void allOddNumbers(){
        //Arrange
        HashMap<String, Integer> words = new HashMap<>();
        words.put("cat", 3);
        words.put("combination", 11);
        words.put("car", 3);
        words.put("peony", 5);
        words.put("blanket", 7);
        //Act
        int actual = Practice.countDifference(words);
        //Assert
        assertEquals(5, actual);
    }
    

    //secondLargest()
    @Test 
    void normalCaseToSeeIfItGetsExpectedResult(){
        //Arrange
        HashMap<Integer, String> lengths = new HashMap<>();
        lengths.put(3, "cat");
        lengths.put(11, "combination");
        lengths.put(4, "cart");
        lengths.put(5, "peony");
        lengths.put(7, "blanket");

        //Act
    int actual = Practice.secondLargest(lengths);
    //Assert
    assertEquals(7, actual);
    }

    @Test
    void allNumbersTheSame (){
        //Arrange
        HashMap<Integer, String> lengths = new HashMap<>();
        lengths.put(3, "cat");
        lengths.put(5, "carts");

        //Act
    int actual = Practice.secondLargest(lengths);
    //Assert
    assertEquals(3, actual);
    
    }

    @Test
    void negativeKeys(){
        //Arrange
        HashMap<Integer, String> lengths = new HashMap<>();
        lengths.put(-1, "cat");
        lengths.put(-3,"car");
        lengths.put(-5, "pillow");

        //Act
        int actual = Practice.secondLargest(lengths);

        //Assert
        assertEquals(-3, actual);
    }
     
}


