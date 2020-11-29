package packt.java9.by.example.ch03.bubble;

import packt.java9.by.example.ch03.SortableCollection;

import java.util.ArrayList;

public class ArrayListSortableCollection implements SortableCollection {
    final private ArrayList actualNames;

    ArrayListSortableCollection(ArrayList actualNames) {
        this.actualNames = actualNames;
    }

    @Override
    public Object get( int i ) {
        return actualNames.get(i);
    }

    @Override
    public int size() {
        return actualNames.size();
    }
}
