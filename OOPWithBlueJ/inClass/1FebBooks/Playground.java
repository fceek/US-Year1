public class Playground
{

    public Playground() {
        
    }

    public void helloName(String name) {
        System.out.println("Hello " + name + "!");
    }
    
    public void makeOutWord(String bracket, String content) {
        System.out.println(bracket.substring(0,2) + content + bracket.substring(2));
    }
    
    public void firstHalf(String word) {
        System.out.println(word.substring(0,word.length() / 2));
    }
    
    public void nonStart(String word1, String word2) {
        System.out.println(word1.substring(1) + word2.substring(1));
    }
    
    public void theEnd(String stick, boolean isFront) {
        if (isFront) System.out.println(stick.substring(0,1));
            else System.out.println(stick.substring(stick.length()-1));
    }
    
    public boolean endCheck(String candidate) {
        if (candidate.substring(candidate.length()-2).equals("ly")) return true;
            else return false;
    }
}
