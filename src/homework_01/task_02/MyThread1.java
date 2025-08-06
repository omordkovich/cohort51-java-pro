package homework_01.task_02;


public class MyTread1 extends Thread{
    public void run() {
       Task2.countFilteredArray(Task2.numbers);
    }
}
