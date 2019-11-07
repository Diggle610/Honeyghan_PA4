import java.io.FileNotFoundException;
import java.io.IOException;

public class Application {
    public static void main (String args[]) throws IOException{
        DuplicateRemover dup = new DuplicateRemover();

        dup.remove("problem1.txt");
        dup.write("unique_words.txt");
    }
}
