package fiveJava.stat.sleep;

public class Main {
    public static void main(String[] args) {
        Runnable task = () -> {
            try {
                //1) 예외처리 필수
                // -interrupㅅ() 을 만나면 다시 실행되기 떄문에
                // -InterruptedException이 발생할 수 있어요.
                // (2) 특정 쓰레드 지목 불가 Thread.sleep(2000);
                Thread.sleep(2000);// TIMED_WATING(주어진 시간동안 기다리는 상태)
                // 객체.메서드();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("task : " + Thread.currentThread().getName());
        };

        Thread thread = new Thread(task, "Thread");
        thread.start();

        try {
            thread.sleep(1000);
            System.out.println("sleep(1000) : " + Thread.currentThread().getName());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
