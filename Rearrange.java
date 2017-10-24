
/**
 * Write a description of class Rearrange here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Rearrange{
    private String str;

    public Rearrange(String str){
        this.str = str;
    }

    public String alphabetize(){
        String newStr = "";
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        for (int i = 0; i < 26; i++){
            String currentLetter = alphabet.substring(i, i + 1);
            int pos = str.indexOf(currentLetter);
            while (pos > -1){
                newStr += currentLetter;
                pos = str.indexOf(currentLetter, pos + 1);
            }
        }
        return newStr;
    }
    
    public String reverse(){
        String backwards = "";
        for (int i = str.length(); i > 0; i--){
            backwards += str.substring(i - 1, i);
        }
        return backwards;
    }
}
