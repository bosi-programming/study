package packt.java9.by.example.ch03.bubble;

// ...imports deleted from print ...
public class BubbleSortTest {
    @Test
    public void canSortStrings() {
        ArrayList actualNames = new ArrayList(Arrays.asList("Johnson", "Wilson", "Wilkinson", "Abraham", "Dagobert"));
        ArrayList expectedResult = new ArrayList(
                Arrays.asList("Abraham", "Dagobert", "Johnson", "Wilkinson", "Wilson"));
        SortableCollection names = new ArrayListSortableCollection(actualNames);
        Sort sort = new BubbleSort();
        sort.setComparator(new StringComparator());
        sort.setSwapper(new ArrayListSwapper(actualNames));
        sort.sort(names);
        Assert.assertEquals(expectedResult, actualNames);
    }
}
