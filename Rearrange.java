
/**
 * Write a description of class Rearrange here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Rearrange{
    private String str;

    public Rearrange(String str){
        str = this.str;
    }

    public String alphabetize(){
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        String newStr = str.substring(0,1);
        for (int i = 0; i < str.length(); i++){
            String sub1 = str.substring(i, i + 1);
            String sub2 = str.substring(i + 1, i + 2);
            if (sub1.compareTo(sub2) > 0){
                newStr = sub2 + newStr;
            }
            else {
                newStr += sub2;
            }
        }
        return newStr;
    }
}
