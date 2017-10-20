
/**
 * Write a description of class HiddenWord here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HiddenWord{
   String word;
   public HiddenWord(String str){
       word = str;
    }
   public String getHint(String guess){
       String hint = "";
       for (int i = 0; i  < guess.length(); i++){
           String currentLetter = guess.substring(i, i + 1);
           //Correct letter, correct place
           if (currentLetter.equals(word.substring(i, i + 1))){
               hint += currentLetter;
            }
           //Correct letter, wrong postition
           else if (word.indexOf(currentLetter) > -1){
               hint += "+";
            }
           //Letter not in the word
           else{
               hint += "*";
            }
        }
       return hint;
    }
}
