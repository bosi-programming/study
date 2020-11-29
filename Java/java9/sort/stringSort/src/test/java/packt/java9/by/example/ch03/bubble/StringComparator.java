package packt.java9.by.example.ch03.bubble;

import java.util.Comparator;

public class StringComparator implements Comparator {
    @Override
    public int compare(Object first, Object second) {
        final String f = (String) first;
        final String s = (String) second;
        return f.compareTo(s);
    }
}
