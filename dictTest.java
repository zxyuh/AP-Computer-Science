import java.util.Dictionary;

public class dictTest {
    public static void main(String[] args) {
        WordList word = new WordList();

        word.setWord("hello");
        //System.out.println(word.getWord());
        if(word.isWord()){
            System.out.println("THIS IS A WORD!");
        } else if (!word.isWord()){
            System.out.println("NOT A WORD!");
        }
    }
}
