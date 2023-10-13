package firstJava;

public class JavaStudy3 {

    public static void main(String[] args) {
        // 형 변환 예제 : 변수의 타입을 바꾸는 방법
        // 문자열 -> 숫자
        // 정수 -> 실수
        // 실수 -> 정수


        // double형 or float형 -> int
        // 실수 -> 정수(0.xxxx -> 0)
        double doubleNumber = 10.101010;
        float floatNumber = 10.1010f;

        //변환(int)
        int intNumber;
        intNumber = (int)doubleNumber; // double -> int
        System.out.println("Double Type => " + doubleNumber);
        System.out.println("Int Type =>  " + intNumber);

        System.out.println("");
        int Number = (int)floatNumber; // float -> int
        System.out.println("Float Type => " + floatNumber);
        System.out.println("Int Type =>  " + intNumber);



        //정수 -> 실수
        int intNumber1 = 10;

        double doubleNumber1 = (double)intNumber1;
        float floatNumber1 = (float)intNumber1;

        System.out.println("");
        System.out.println("intNumber1 => " + intNumber1);
        System.out.println("doubleNumber1 => " + doubleNumber1);
        System.out.println("floatNumber1 => " + floatNumber1);


    }
}
