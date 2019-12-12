import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
public class Hangman
{   
    public static void currentState(String a, int b){
        for (int i=0; i < a.length(); i ++)
                    System.out.print(a.substring(i,i+1) + " " ); // this loops through each letter of the current state of the word and adds a space between each letter.
            System.out.print("\n"); // new line 
        if (b>=1) {
                      System.out.println("----|");
                      System.out.println("|   o");
                    }
        if (b>=2)
         System.out.print("|  \\");
        if (b>=3)
           System.out.print("|");
        if (b>=4)
           System.out.println("/");  // you have use \\ for a backslash to appear in output.
        if(b>=5)
         System.out.println("|  / \\");
                   System.out.print("\n");
        
    }
    public static void main(String [] args){
        
        //String [] word_list = {"monocle", "Montreal", "gnat", "extrapolate", "pyknic", "pernicious", "aberrant", "mimp", "mellifluous", "superfluous", "nomenclature", "lexicon", "altercate", "pronouncement", "Mindy", "Gichael", "Ciovanni", "mailchute", "bignonia", "ignoramus", "idly nice","boondoggle"};
    
        ArrayList<String> words = new ArrayList(18);
       
    words.add("montreal");
    words.add("extrapolate");
    words.add("pernicious");
    words.add("aberrant");
    words.add("mellifluous");
    words.add("superfluous");
    words.add("nomenclature");
    words.add("lexicon");
    words.add("altercate");
    words.add("pronouncement");
    words.add("mindy");
    words.add("Gichael");
    words.add("Ciovanni");
    words.add("mailchute");
    words.add("bignonia");
    words.add("ignoramus");
    words.add("idlynice");
    words.add("boondoggle");
       
        int correct_guesses = 0;
        int incorrect_guesses = 0;
        boolean correct_guess = false;
        boolean letterFound = false;
        boolean repeat = false;
        
        int a = (int)(Math.random()*18);
        String letterGuess = "";
        String blankWord = "";
        String guessedLetters = "";
        String word = words.get(a);
        
        System.out.println("This word has "+word.length()+" letters. You are allowed to be wrong 5 times.");
        
        Scanner guess = new Scanner(System.in);
        
        
        for(int i=0; i<word.length();i++){ //making word same length as underline
            blankWord += "_";
            
        }
        while(correct_guesses!=word.length()){ 
                    System.out.println("PLEASE just enter one character");
                   letterGuess = guess.nextLine();
                    
                
            
                letterGuess = letterGuess.toLowerCase();
                
                repeat = false;
                letterFound = false;
                if(guessedLetters.indexOf(letterGuess)!=-1){ //if it's already guessed then repeat = true, print out repeat
                        
                        repeat = true;
                    }
                guessedLetters += letterGuess;
                for (int i=0; i < blankWord.length(); i++)  { //cycle through each letter in the word        

                    if(word.charAt(i)==letterGuess.charAt(0)){
                    blankWord = blankWord.substring(0,i) + letterGuess + blankWord.substring(i+1);
                    letterFound = true;
                }
                }
            
           
                   if(repeat){
                       
                        System.out.println("You have already guessed that letter.");
                        
                    }
                   else if(letterFound){
                       System.out.println("You got a letter");
                       correct_guesses++;
                       
                    }
                   else{
                       System.out.println("Sorry, that letter is not in the word.");
                       incorrect_guesses++;
                    }
                     
                    Hangman.currentState(blankWord, incorrect_guesses);
                    
                       
                    if(word.equals(blankWord) || incorrect_guesses==5)
                        break;
                    }
                    if(incorrect_guesses==5)
                    System.out.println("You failed. The word was "+word+".");
                    if(incorrect_guesses<5)
                    System.out.println("Congratulations you did it!");
                    }
                    }
                            
        
        
    
              
            
            
        
    

