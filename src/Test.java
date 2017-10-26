import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.TreeSet;

public class Test {

    public static void main(String[] args) throws IOException {
    //Write a program to find all distinct words from a text file. Ignore chars like[;.,/-;:] and ignore case sensitivity.
        String allWords [] = new String(Files.readAllBytes(Paths.get("{PATH}")))
            .replaceAll("[.,/-;:]", "")
            .split(" ");
        
        //Get unique words to ignore case sensitivity. 
        
        TreeSet<String> treeSet = new TreeSet() {
            
            @Override
            public Comparator comparator() {
                
                return (e, r) -> ((String) e).compareToIgnoreCase((String) r);
                
            }
        };
        Collections.addAll(treeSet, allWords);
    }

//Write a generic method that takes an array of objects and a collection, and puts all objects in the array into the collection.
    static <T> void fromArrayToCollection(T[] a, Collection<T> c) {
        
        Collections.addAll(c, a);
        
    }


}

