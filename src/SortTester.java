import java.util.Arrays;

public class SortTester
{
  public static void main(String[] args)
  {
    /* --- SELECTION SORT --- */
    int[] arr1 = {3, 86, -20, 14, 40, 19, -4, 100, 89, 13, 54, 12, 77, -5, 0, 6}; 
    Sort.selectionSort(arr1);
    System.out.println(Arrays.toString(arr1));
 
    /* --- INSERTION SORT --- */ 
    int[] arr2 = {3, 86, -20, 14, 40, 19, -4, 100, 89, 13, 54, 12, 77, -5, 0, 6};    
    Sort.insertionSort(arr2);
    System.out.println(Arrays.toString(arr2));

    int[] arr3 = {77, -5, -4, 100, 12, 6, 89, 13, 0, 54, 3, 86, -20, 14, 40, 19};
    Sort.selectionSort(arr3);
    System.out.println(Arrays.toString(arr3));
    int[] arr4 = {77, -5, -4, 100, 12, 6, 89, 13, 0, 54, 3, 86, -20, 14, 40, 19};
    Sort.insertionSort(arr4);
    System.out.println(Arrays.toString(arr4));

    int[] arr5 = {100, 89, 86, 77, 54, 40, 19, 14, 13, 12, 6, 3, 0, -4, -5, -20};
    Sort.selectionSort(arr5);
    System.out.println(Arrays.toString(arr5));
    int[] arr6 = {100, 89, 86, 77, 54, 40, 19, 14, 13, 12, 6, 3, 0, -4, -5, -20};
    Sort.insertionSort(arr6);
    System.out.println(Arrays.toString(arr6));

    int[] arr7 = {-5, -20, 0, -4, 3, 13, 6, 12, 14, 40, 19, 54, 77, 89, 100, 86};
    Sort.selectionSort(arr7);
    System.out.println(Arrays.toString(arr7));
    int[] arr8 = {-5, -20, 0, -4, 3, 13, 6, 12, 14, 40, 19, 54, 77, 89, 100, 86};
    Sort.insertionSort(arr8);
    System.out.println(Arrays.toString(arr8));

    int[] arr9 = {-20, -5, -4, 0, 3, 6, 12, 13, 14, 19, 40, 54, 77, 86, 89, 100};
    Sort.selectionSort(arr9);
    System.out.println(Arrays.toString(arr9));
    int[] arr10 = {-20, -5, -4, 0, 3, 6, 12, 13, 14, 19, 40, 54, 77, 86, 89, 100};
    Sort.insertionSort(arr10);
    System.out.println(Arrays.toString(arr10));

    int[] arr11 = {1, 3, 5, 7, 9, 11, 12, 14, 16, 18, 20, 22, 24, 26, 28, 30, 32, 34};
    Sort.selectionSort(arr11);
    System.out.println(Arrays.toString(arr11));
    int[] arr12 = {1, 3, 5, 7, 9, 11, 12, 14, 16, 18, 20, 22, 24, 26, 28, 30, 32, 34};
    Sort.insertionSort(arr12);
    System.out.println(Arrays.toString(arr12));

    int[] arr13 = {-7, 4, 54, 6, -1, 0, 22, 56, 44, 78, 3, 4, 7458, 864, 23, 99, 100};
    Sort.selectionSort(arr13);
    System.out.println(Arrays.toString(arr13));
    int[] arr14 = {-7, 4, 54, 6, -1, 0, 22, 56, 44, 78, 3, 4, 7458, 864, 23, 99, 100};
    Sort.insertionSort(arr14);
    System.out.println(Arrays.toString(arr14));

    int[] arr15 = {1000, 900, 800, 700, 600, 500, 400, 300, 200, 100, 0};
    Sort.selectionSort(arr15);
    System.out.println(Arrays.toString(arr15));
    int[] arr16 = {1000, 900, 800, 700, 600, 500, 400, 300, 200, 100, 0};
    Sort.insertionSort(arr16);
    System.out.println(Arrays.toString(arr16));

  }
}
