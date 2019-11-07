import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.Iterator;
import java.io.IOException;

public class DuplicateRemover {
    private Set < String > uniqueWords;

    public void remove(String dataFile) throws FileNotFoundException {
        String words;

        Scanner scnr = new Scanner(new File(dataFile));

        uniqueWords = new HashSet<String>();

        while (scnr.hasNext()) {
            words = scnr.next();

            uniqueWords.add(words);
        }
        scnr.close();
    }
    public void write(String outputFile) throws IOException{
        File key;

        FileWriter fiW = null;

        key = new File(outputFile);

        if (!key.exists()){
            key.createNewFile();
        }
        fiW = new FileWriter(key);

        Iterator iter = uniqueWords.iterator();


        while (iter.hasNext()){
            String s = (String)iter.next();
            fiW.write(s + "\n");
        }
        fiW.close();
        System.out.println("done");

    }

}
