package seminar_6CW;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class cw_one {
      // 1.Создайте HashSet, заполните его следующими числами: {1, 2, 30000, 2, 4,
      // 5000, 6, 3}. Распечатайте содержимое данного множества.
      // 2.Создайте LinkedHashSet, заполните его следующими числами: {1, 2, 30000, 2, 4,
      // 5000, 6, 3}. Распечатайте содержимое данного множества.  
   public static void main(String[] args) {
      HashSet<Integer> set = new HashSet<>(Arrays.asList(1, 2, 30000, 2, 4, 5000, 6, 3));
      System.out.println(set);

      LinkedHashSet<Integer> lin = new LinkedHashSet<>(Arrays.asList(1, 2, 30000, 2, 4, 5000, 6, 3));
      System.out.println(lin);
      
      TreeSet<Integer> treeSet = new TreeSet<>(Comparator.reverseOrder());
      treeSet.add(1);
      treeSet.add(2);
      treeSet.add(30000);
      treeSet.add(2);
      treeSet.add(4);
      treeSet.add(5000);
      treeSet.add(6);
      treeSet.add(3);
      
      System.out.println(treeSet);
   }

}