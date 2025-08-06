package homework_01.task_02;


public class MyThread1 extends Thread{
    private long counter;

    public void run() {
      counter=  Task2.countFilteredArray(Task2.numbers,0,Task2.numbers.length/2);
    }
    public long getCounter(){
        return counter;
    }
}
