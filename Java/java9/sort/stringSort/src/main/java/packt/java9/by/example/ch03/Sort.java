package packt.java9.by.example.ch03;

import java.util.Comparator;

public interface Sort {
    void sort(SortableCollection collection);
    void setSwapper(Swapper swap);
    void setComparator(Comparator compare);
}
