import java.util.ArrayList;

public class Sort
{
  // Part A.  Which Sort is Which?
  public static void selectionSort(int[] elements)
  {
    int count = 0;
    for (int j = 0; j < elements.length - 1; j++)
    {
      int minIndex = j;
      for (int k = j + 1; k < elements.length; k++)
      {
        count++;
        if (elements[k] < elements[minIndex])
        {
          minIndex = k;
        }
      }
      int temp = elements[j];
      elements[j] = elements[minIndex];
      elements[minIndex] = temp;
    }
    System.out.println("Selection sort, number of iterations: " + count);
  }

  // Part A.  Which Sort is Which?
  public static void insertionSort(int[] elements)
  {
    int count = 0;
    for (int j = 1; j < elements.length; j++)
    {

      int temp = elements[j];
      int possibleIndex = j;
      while (possibleIndex > 0 && temp < elements[possibleIndex - 1])
      {
        count++;
        elements[possibleIndex] = elements[possibleIndex - 1];
        possibleIndex--;
      }
      elements[possibleIndex] = temp;
    }
    System.out.println("Insertion sort, number of iterations: " + count);
  }
  
  // Part C.  Sorting a 1000-word list!
  public static void selectionSortWordList(ArrayList<String> words)
  {
    int count = 0;
    for (int i = 0; i < words.size() - 1; i++)
    {
      int minIndex = i;
      for (int x = i + 1; x < words.size(); x++)
      {
        count++;
        if (words.get(x).compareTo(words.get(minIndex)) < 0)
        {
          minIndex = x;
        }
      }
      String temp = words.get(i);
      words.set(i, words.get(minIndex));
      words.set(minIndex, temp);
    }
    System.out.println("Selection sort, number of iterations: " + count);
  }

  // Part C.  Sorting a 1000-word list!
  public static void insertionSortWordList(ArrayList<String> words)
  {    
    int count = 0;
    for (int i = 1; i < words.size(); i++)
    {
      String temp = words.get(i);
      int possIndex = i;
      while (possIndex > 0 && temp.compareTo(words.get(possIndex - 1)) < 0)
      {
        count++;
        words.set(possIndex, words.get(possIndex - 1));
        possIndex--;
      }
      words.set(possIndex, temp);
    }
    System.out.println("Insertion sort: number of iterations: " + count);
  }
}