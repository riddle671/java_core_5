package Homework2;

import java.util.Arrays;
import java.util.Locale;

public class Homework2 {
    public static void main(String[] args) {
        //Задача 1
       // String hi = "                Hello ";
      //  String world = " WoRld!";
       // char newLine = '\n';

      //  String result = hi.trim() + world.toLowerCase() + newLine;
       // {

      //      System.out.println(result.repeat(3));
      //  }

        //Задача 2

      //  for (int i = 1; i < 100; i++) {
      //      System.out.println(i + "a ");
     //   }
      //  System.out.println();

        //Задача 3
        Hedgehog hgg = new Hedgehog(1000, 15);
        Bull bll = new Bull(10, "grey");

            System.out.println(hgg.speed +" "+ hgg.numberofneedles);
            System.out.println(bll.color +" "+ bll.hornlength);


            hgg.setNumberofneedles(666);
            System.out.println(hgg.numberofneedles);

            int abc = hgg.getNumberofneedles();
            System.out.println(abc);


        // Задание №2: Дан массив единиц, произвольной длины. Создать цикл, который заменяет каждый
        // нечетный элемент на 0;
        // Например, дано: [1,1,1,1,1]
        // Ожидаемый результат: [0,1,0,1,0]
        // Подсказка: прочитай про операнд "%".

        int[] array = {1, 1, 1, 1, 1};
        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0) {
                array[i] = 0;
            }
        }
        System.out.println(Arrays.toString(array));
        }
        


        }






