package lesson_01.task_01;

public class MyThread2 implements Runnable{

    @Override
    public void run() {
        for (int i = 10_000; i < 10_010; i++) {
            //
            System.out.println(Thread.currentThread().getName()+ " - " + i );

            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
    }
}
