package ice4;

/**
 * This class +++Insert Description Here+++
 *
 * @author Ankur Savsani
 */
public class TestMethodes {
    
    String str;
    char ch;
    
    public void CharOucc(String str, char ch){
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                 count++;
            }
        } 
         System.out.println("Count is :" +count);
    }
    char chr;
    public void BigChar(char chr){
        int val = chr;
        System.out.print("Value is :" +val);
    }
    
    String str1;
    char ch1;
    public boolean CharExists(String str1, char ch1){
    
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) == ch1) {
                 return true;
            }           
        }    
        return false;
    }
    
}
