package lesson_02.homework;

public class Task1 {

    private static int counter;
    public static synchronized void incrementCounter(){
        counter++;
    }

    public static void main(String[] args) {
        singleThreadSolution();
        counter= 0;
        twoThreadsSolution();
        
    }

    private static void twoThreadsSolution() {
    MyThread thread = new MyThread(1,2_000_000);
    thread.start();
        try {
            thread.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println(counter);
    }

      private static void singleThreadSolution() {

        MyThread thread1 = new MyThread(1, 1_000_000);
          MyThread thread2 = new MyThread(1_000_001, 2_000_000);

          thread1.start();
          thread2.start();

          try {
              thread1.join();
              thread2.join();

          } catch (InterruptedException e) {
              throw new RuntimeException(e);
          }
          System.out.println(counter);
    }


}
