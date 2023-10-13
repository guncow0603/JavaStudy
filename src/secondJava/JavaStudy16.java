package secondJava;

public class JavaStudy16 {
    public static void main(String[] args) {

        // while 문
        int number = 0;
        //~하는 동안
        while(number < 3) {// number < 3 인 동안~~
            number++; //2
            System.out.println(number + "출력");
        }
        System.out.println("-----------------------");



        // do-while 문
        int number1 = 4;
        do {
            //이 로직을 먼저 수행하겠다!!
            System.out.println(number + "출력");
        } while(number1 < 3); // 연산을 한번 수행 후 조건문 체크
        System.out.println("-----------------------");




        //break(깨부수다)명령
        //가장 가까운 블록의 for문 또는 while, whitch문을 중간!
        int number2 = 0;
        while(number2 < 3){
            number2++;
            if(number2 ==2){
                break;
            }
            System.out.println(number2 + "출력!!");
        }
        System.out.println("-----------------------");


        // break 명령 범위
        for (int i = 0; i < 10; i++) {
            System.out.println("i: " + i);
            if (i == 2) {
                break; // i 가 2일때 가장 바깥 반복문이 종료됩니다.
            }
            for (int j = 0; j < 10; j++) {
                System.out.println("j: " + j);
                if (j == 2) {
                    break; // j 가 2일때 가장 안쪽 반복문이 종료됩니다.
                }
            }
        }
        System.out.println("-----------------------");


        // continue 명령

        int number3 = 0;
        while(number3 < 3) {
            number3++;
            if (number3 == 2) {
                continue;  // 2일때 반복 패스
            }
            System.out.println(number3 + "출력");
        }
    }
}