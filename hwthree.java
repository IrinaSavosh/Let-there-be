package seminar_6CW;

public class hwthree {

public static void main(String[] args) {
   StringBuilder sb = new StringBuilder("This is a test.");

   sb.delete(4, 7);
   System.out.println("После delete: " + sb);

   sb.deleteCharAt(0);
   System.out.println("После deleteCharAt: " + sb);
}
// public class hwthree {
//    Osporter/Сергей — Сегодня, в 21:49
// import java.util.ArrayList;
// import java.util.Arrays;
// import java.util.Collections;
// import java.util.Random;
// import java.util.Scanner;


// public class task3 {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in); // Объявляем Scanner
//         System.out.println("Введите строку: ");
//         String str = scanner.nextLine(); //читаем строку

//         char[] array = str.toCharArray();
//         // System.out.println(Arrays.toString(array));

//         int count = 0;
//         boolean Boolean = true;

//         for (int i = 0; i < array.length / 2; i++) {
//             if(array[i] == array[array.length - 1 - i])
//                 count++;
//             }

//         if(count == array.length / 2) {
//             System.out.println(Boolean);
//         } else {
//             System.out.println(!Boolean);
//         }
//     }
// }
}
