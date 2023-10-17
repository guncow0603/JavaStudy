package fiveJava.deamon;

public class Main {
    public static void main(String[] args) {
        Runnable demon = () -> {
            for (int i = 0; i < 1000000; i++) {
                System.out.println(i+" 번쨰 demon");
            }
        };

        //우선순위가 낮다! -> 상대적으로 다른 쓰레드에 비해, 리소스를 작게 할당받는다.
        Thread thread = new Thread(demon);
        thread.setDaemon(true);

        thread.start();

        for (int i = 0; i < 100; i++) {
            System.out.println(i+ "번째 task");
        }
    }
}
