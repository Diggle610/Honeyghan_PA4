import java.io.FileNotFoundException;

import java.io.IOException;

public class Application {
    public static void main(String[] args) throws IOException {

        DuplicateCounter dup = new DuplicateCounter();

        dup.count("problem2.txt");

        dup.write("unique_word_counts.txt");
    }
}