package packt.java9.by.example.ch03.bubble;

import packt.java9.by.example.ch03.*;
import java.util.Comparator;

public class BubbleSort implements Sort {
    @Override
    public void sort(SortableCollection collection) {
        int n = collection.size();
        while (n > 1) {
            for (int j = 0; j < n - 1; j++) {
                if (comparator.compare(collection.get(j),
                            collection.get(j + 1)) > 0) {
                    swapper.swap(j, j + 1);
                }
            }
        }
    }

    private Comparator comparator = null;

    @Override
    public void setComparator(Comparator comparator) {
        this.comparator = comparator;
    }

    private Swapper swapper = null;

    @Override
    public void setSwapper(Swapper swapper) {
        this.swapper = swapper;
    }
}
