package seminar_6CW;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Random;
import java.util.Set;

public class cw_two {

   //Заполнить список рандомными значениями. Написать метод,
   // который выдаст процент уникальных чисел в данном списке.
   // Для вычисления процента используйте формулу
   // Процент уникальных чисел  = количество уникальных чисел * 100 / общее количество чисел в массиве
   public static void main(String[] args) {
      LinkedList<Integer> userList = fillArr();
      Set<Integer> unique = unique(userList);
      //процент уникальных чисел
      double res = (unique.size()*100.0)/userList.size();
      System.out.println(res);
   }

   public static LinkedList<Integer> fillArr() {
      Random rnd = new Random();
      LinkedList<Integer> userArray = new LinkedList<>();
      for (int i = 0; i < 130; i++) {
         userArray.add(rnd.nextInt(101));
      }
      return userArray;
   }

   public static Set <Integer> unique (LinkedList<Integer> userList) {
      return new HashSet <Integer> (userList);     
   }
}
