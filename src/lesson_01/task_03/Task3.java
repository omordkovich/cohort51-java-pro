package lesson_01.task_03;

public class Task3 {

    static int counter = 0;

    public static void main(String[] args) {

        MyThread myThread1 = new MyThread();
        MyThread myThread2 = new MyThread();

        myThread1.start();
        myThread2.start();

        for (int i = 0; i < 1_000_000; i++) {
            counter++;
        }

        // Попросить главный поток остановиться в этом месте
        // и дождаться завершения работы другого потока

        System.out.println("counter = "+ counter);

        // команда дождаться завершения потока myThread1
        try {
            myThread1.join();
            myThread2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
