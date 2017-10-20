
/**
 * Write a description of class HiddenWordRunner here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HiddenWordRunner{
   public static void main(){
       HiddenWord puzzle = new HiddenWord("HARPS");
       System.out.println(puzzle.getHint("AAAAA"));
       System.out.println(puzzle.getHint("HELLO"));
       System.out.println(puzzle.getHint("HEART"));
       System.out.println(puzzle.getHint("HARMS"));
       System.out.println(puzzle.getHint("HARPS"));
    }
}
