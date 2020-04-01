package ice4;

/**
 * This class +++Insert Description Here+++
 *
 * @author Ankur Savsani
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        TestMethodes ob1 = new TestMethodes();
        
        ob1.CharOucc("AnkurSavsani", 'a');
        ob1.BigChar('a');
        ob1.CharExists("Savsani", 'a');
        ob1.CharExists("Ankur", 'z'); 
    }

}
