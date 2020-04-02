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
    String string;
    public void MaxChar(String string){
        char max = 'A';
        for(int i =0; i<string.length(); i++){
            if(string.charAt(i) > max)
                   max = string.charAt(i);
        }
        System.out.print("Max Char is :" +max);
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
