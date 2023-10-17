package fiveJava.thread;

public class Main {
    public static void main(String[] args) {
//        TestThread thread = new TestThread();
//        thread.start();
        Runnable run = new TestRunnable();
        Thread thread = new Thread(run); // 쓰레드 생성

        thread.start();
    }
}

