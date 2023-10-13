package secondJava;

public class JavaStudy11 {
    public static void main(String[] args) {
        // 조건문
        boolean flag = true;

        if (flag) {
            System.out.println("flag 값은 true 입니다."); // flag 값은 true 입니다. 출력
        }
        System.out.println("------------------------");


        // 조건문 with else if
        int number = 2;

        if (number == 1) {
            System.out.println("number 값은 1 입니다."); // 미출력
        } else if (number == 2) {
            System.out.println("number 값은 2 입니다."); // number 값은 2 입니다. 출력
        } else {
            System.out.println("number 값은 모르는 값입니다."); // 미출력
        }
        System.out.println("------------------------");


        // 조건문 with else if
        int number1 = 2;

        if (number1 == 1) {
            System.out.println("number 값은 1 입니다."); // 미출력
        } else if (number1 == 2) {
            System.out.println("number 값은 2 입니다."); // number 값은 2 입니다. 출력
        } else {
            System.out.println("number 값은 모르는 값입니다."); // 미출력
        }
        System.out.println("------------------------");



        // 중첩 조건문
        boolean flag1 = true;
        int number2 = 2;

        if (flag1) {
            if (number2 == 1) {
                System.out.println("flag 값은 true, number 값은 1 입니다."); // 미출력
            } else if (number2 == 2) {
                System.out.println("flag 값은 true, number 값은 2 입니다."); // flag 값은 true, number 값은 2 입니다. 출력
            }
        } else {
            if (number2 == 1) {
                System.out.println("flag 값은 false, number 값은 1 입니다."); // 미출력
            } else if (number2 == 2) {
                System.out.println("flag 값은 false, number 값은 2 입니다."); // 미출력
            }
        }
    }
}