package homework_01.task_01;
//Дан диапазон чисел: от 1 до 2_000_000 включительно.
//        Задача: найти, сколько чисел из этого диапазона делятся нацело на 21 и при этом содержат цифру 3.
//Решить данную задачу в один поток.


import java.util.Arrays;

public class Task1 {



    public static void main(String[] args) {

       int[] numbers = new int[2_000_000];
       long counter;

        for (int i = 1; i < numbers.length; i++) {
            numbers[i] = i + 1;
        }

            counter = Arrays.stream(numbers)
                    .filter(i -> i % 21 == 0)
                    .filter(i -> String.valueOf(i).contains("3"))
                    .count();

        System.out.println(counter + " чисел из диапазона делятся нацело на 21 и при этом содержат цифру 3");
    }

}
