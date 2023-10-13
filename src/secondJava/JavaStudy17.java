package secondJava;
import java. util. *;

public class JavaStudy17 {
    public static void main(String[] args) {

        // 선택적 구구단 생성기
        //입력 받는 단을 제외하고 출!!
        Scanner sc = new Scanner(System.in);
        int passNum = sc.nextInt(); // 출력 제외 할 구구단수 값


        //구구단!!!!!
        for (int i = 2; i <= 9; i++) { //구구단 첫번쨰 수
            if (i == passNum) {
                continue;
            }
            for (int j = 2; j <= 9; j++) {// 구구단 두번쨰 수
                System.out.println(i + "곱하기" + j + "는" + (i * j) + "입니다.");
            }
        }
    }
}