package secondJava;

public class JavaStudy02 {
    public static void main(String[] args) {
        // 사칙연산 : +, -, *, /, %
        System.out.println(4 + 2); //6
        System.out.println(4 - 2); //2
        System.out.println(4 * 2); //8
        System.out.println(4 / 2); //2
        System.out.println(5 / 2); //2
        System.out.println(2 / 4); //0
        System.out.println(4 % 2); //0
        System.out.println(5 % 2); //1
        System.out.println("----------------------------------"); //1

        // 우선순위 연산
        System.out.println(2 + 2 * 2); //6 (*먼저)
        System.out.println((2 + 2) * 2); //8 (+먼저)
        System.out.println(2 + (2 * 2)); //6 (*먼저)
        System.out.println("----------------------------------"); //1

        //변수를 이용한 연산
        int a = 20;
        int b = 10;
        int c;

        //덧샘
        c = a + b;
        System.out.println(a + b);//30

        c = a - b;
        System.out.println(a - b);//10

        c = a * b;
        System.out.println(a * b);//200

        c = a / b;
        System.out.println(a / b);//2

        c = a % b;
        System.out.println(a % b);//0
    }
}