package src.test.com.java.sorts;


import org.junit.Assert;
import org.junit.Test;
import src.main.com.java.sorts.QuickSort;

import java.util.Arrays;

public class QuickSortTest {

  @Test
  public void quickSortTest() {
    QuickSort quickSort = new QuickSort();
    Integer[] unsortedInt = new Integer[]{0, 5, 9, 2, 1, 3, 4, 8, 6, 7};
    Integer[] sortedInt = new Integer[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
    System.out.println(Arrays.toString(quickSort.sort(unsortedInt)));

    Assert.assertArrayEquals(sortedInt, quickSort.sort(unsortedInt));

    Character[] unsortedChar = new Character[]{'f', 'h', 'c', 'a', 'b', 'd', 'g', 'e'};
    Character[] sortedChar = new Character[]{'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h'};
    System.out.println(Arrays.toString(quickSort.sort(unsortedChar)));

    Assert.assertArrayEquals(sortedChar, quickSort.sort(unsortedChar));
  }
}