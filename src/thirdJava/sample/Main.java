package thirdJava.sample;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();

        // 메서드 호출 : main.getClass()
        System.out.println("main.getClass() = " + main.getNumber());
        System.out.println("main.getClass() = " + main.getNumber());
        System.out.println("main.getClass() = " + main.getNumber());
    }

    public int getNumber() {
        //해당 메서드가 실행될 떄 마다 독립적인 값을 저장하고 관리합니다.
        //이 지역변수는 메서드 내부에서 정의될 떄 생성된다.
        //이 메서드가 종료될 떄 소멸된다.
        int number = 1; // 지역 변수 <-> 전역변수
        number += 1;
        return number; // 메서드 종료되면 지역변수 제거됨
    }
}
