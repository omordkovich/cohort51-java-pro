package lesson_01.task_02;

public class MyThread extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 1_000_000; i++) {
            Task2.incrementCounter();
        }
    }
}
