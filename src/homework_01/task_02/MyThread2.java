package homework_01.task_02;


public class MyThread1 extends Thread{
    public void run() {
       Task2.countFilteredArray(Task2.numbers,0,Task2.numbers.length/2);
    }
}
