package Sorts;

import java.util.Arrays;
import java.util.List;

final class SortUtils {
  static <T> boolean swap(T[] array, int index1, int index2) {
    T swap = array[index1];
    array[index1] = array[index2];
    array[index2] = swap;
    return true;
  }

  static <T extends Comparable<T>> boolean less(T first, T second) {
    return first.compareTo(second) < 0;
  }

  static <T extends Comparable<T>> boolean greater(T first, T second) {
    return first.compareTo(second) > 0;
  }

  static void print(List<?> toPrint) {
    toPrint.stream().map(Object::toString).map(str -> str + " ").forEach(System.out::print);

    System.out.println();
  }

  static void print(Object[] toPrint) {
    System.out.println(Arrays.toString(toPrint));
  }

  static <T extends Comparable<T>> void flip(T[] array, int left, int right) {
    while( left<= right) {
      swap(array, left++, right--);
    }
  }
}
