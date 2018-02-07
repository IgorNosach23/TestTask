import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Collection;
import java.util.Collections;
import java.util.TreeSet;

public class Test {

    //Write a program to find all distinct words from a text file. 
    // Ignore chars like[;.,/-;:] and ignore case sensitivity.
    public static void main(String[] args) throws IOException {
        String[] words = getFilteredArrayWordsFromFile("pathToFile", "[.,/-;:]");
        
        //Get unique words to ignore case sensitivity.
        TreeSet<String> treeSet = new TreeSet<>((e, r) -> (e).compareToIgnoreCase(r));
        Collections.addAll(treeSet, words);
    }

    private static String[] getFilteredArrayWordsFromFile(String pathToFile, String regex) throws IOException {
        String[] allWords = new String(Files.readAllBytes(Paths.get(pathToFile)))
                .replaceAll(regex, "")
                .split(" ");
        return allWords.length > 0 ? allWords : new String[]{"Array is empty"};
    }

    //Write a generic method that takes an array of objects and a collection, and puts all objects in the array into the collection.
    private static <T> void fromArrayToCollection(T[] a, Collection<T> c) {
        Collections.addAll(c, a);
    }
}

