import java.util.Comparator;

public class WordListComparator implements Comparator<String> {
    @Override
    public int compare(String word1, String word2) {
        return word1.length() - word2.length();
    }

}



