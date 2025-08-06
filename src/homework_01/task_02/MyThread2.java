package homework_01.task_02;


public class MyThread2 extends Thread{
    private long counter;

    public void run() {
      counter = Task2.countFilteredArray(Task2.numbers,Task2.numbers.length/2,Task2.numbers.length);
    }
    public long getCounter(){
        return counter;
    }
}
