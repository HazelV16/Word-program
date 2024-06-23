import java.util.ArrayList;
import java.util.Collections;

public class WordList extends ArrayList<String> {
    private static final ArrayList<String> theWordList = new ArrayList<>();

    public void sortAlpha() {
        Collections.sort(theWordList);
    }

    public void sortByLength() {
        theWordList.sort(new WordListComparator());
    }

    /**
     * Adds a word to this wordlist
     *
     * @param s the word to add
     */
    public void addWord(String s) {
        theWordList.add(s);
    }

    /**
     * Gets the first word of this WordList,
     *
     * @return the first word of the list, or "-" if the list is empty
     */
    public String getFirst() {
        if (!theWordList.isEmpty()) {
            return theWordList.get(0);
        } else {
            return "-";
        }
    }

    /**
     * Gets the last word of this WordList,
     *
     * @return the last word of the list, or "-" if the list is empty
     */
    public String getLast() {
        if (!theWordList.isEmpty()) {
            return theWordList.get(size() - 1);
        } else {
            return "-";
        }
    }

    /**
     * @return a String representation of this WordList
     */
    public String toString() {
        return theWordList.toString();
    }

    /**
     * @return the number of elements in this WordList
     */
    public int size() {
        return theWordList.size();
    }

    public double getAvgLength() {
        if (theWordList.isEmpty()) {
            return 0.0;
        }
        int sumLength = 0;
        for (String i : theWordList) {
            sumLength += i.length();
        }
        return (double) sumLength / size();
    }

}
