
/**
 * Write a description of class StringUtil here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class StringUtil{
    public static void main(){
        String go = "gogogo";
        System.out.println(go.replace("go", "gone"));
    }
    public static String apcsReplaceAll(String str, String oldStr, String newStr){
        String newString = str;
        int pos= str.indexOf(oldStr);
        while(pos >= 0){
            String start = newString.substring(0, pos);
            String end = newString.substring(pos + oldStr.length());
            newString = start + newStr + end;
            pos = newString.indexOf(oldStr, pos + newStr.length());
        }
        return newString;
    }
}
