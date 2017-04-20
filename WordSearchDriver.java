/* CS5112 Programming Assignment
 * 10111778 - Kieran McMahon
 * 11139323 - Kevin Murphy
 * 16068858 - Cynthia Alarcon
 */

public class WordSearchDriver {
    public static void main(String[] args){
        String word = "/0";
        char toPlace = ' ';
        WordSearch wordSearch1 = new WordSearch("WordsList.txt", 25, 5, 10);
        wordSearch1.generateWordSearchPuzzle();             //Instance created based on the WordsList text file which contains the 1000 most popular
        wordSearch1.showWordSearchPuzzle();                 //words in the English language.
        
        WordSearch wordSearch2 = new WordSearch(new String[] {"list","java","project","solve","problem","direct","collect","butter","member","before","dream","world"});
        wordSearch2.generateWordSearchPuzzle();             //Demostrates the contructor that allow the user to pass a literal array of Strings 
        wordSearch2.showWordSearchPuzzle();                 //puzzle is generated based on this collection.
        
        WordSearch wordSearch3 = new WordSearch("countries.txt", 10, 2, 15);
        wordSearch3.generateWordSearchPuzzle();             //Instance using a different text file to the 1st, text file contains 
        wordSearch3.showWordSearchPuzzle();                 //a list of country names.
                                                                 
    }   
}

