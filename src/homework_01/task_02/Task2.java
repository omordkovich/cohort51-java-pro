package homework_01.task_02;
//Дан диапазон чисел: от 1 до 2_000_000 включительно.
//Задача: найти, сколько чисел из этого диапазона делятся нацело на 21 и при этом содержат цифру 3.
//Решить данную задачу в два потока, разделив между потоками заданный диапазон чисел пополам.


import java.util.Arrays;

public class Task2 {
    public static int[] numbers = new int[2_000_000];
    public static synchronized long countFilteredArray(int[] array, int begin, int end){

       return Arrays.stream(array,begin,end)
                .filter(i -> i % 21 == 0)
                .filter(i -> String.valueOf(i).contains("3"))
                .count();
    }
    public static void main(String[] args) {
        for (int i = 1; i < numbers.length; i++) {
            numbers[i] = i + 1;
        }
        MyThread1 myThread1 = new MyThread1();
        MyThread2 myThread2 = new MyThread2();

        myThread1.start();
        myThread2.start();

        try {
            myThread1.join();
            myThread2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        long totalCounter = myThread2.getCounter() + myThread1.getCounter();
        System.out.println(totalCounter+ " чисел из диапазона делятся нацело на 21 и при этом содержат цифру 3");
    }
}
